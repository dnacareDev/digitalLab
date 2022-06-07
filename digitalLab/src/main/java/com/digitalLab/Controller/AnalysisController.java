package com.digitalLab.Controller;

import com.digitalLab.Entity.*;
import com.digitalLab.Service.*;

import com.digitalLab.Util.AuthUtil;
import com.digitalLab.Util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AnalysisController {

	@Autowired
	private PlanService planService;

	@Autowired
	private DivisionService divisionService;

	@Autowired
	private GeneticService geneticService;

	@Autowired
	private ReportService resportService;

	@Autowired
	private UserService userService;

	private static final String type = "analysis";

	// 분석 계획 등록 리스트
	@GetMapping("regist_analysis_list")
	public ModelAndView regist_analysis_list(ModelAndView mv) {

		mv.setViewName("regist_analysis/regist_analysis_list");
		return mv;
	}

	// 분석 계획 등록 신규 뷰
	@GetMapping("regist_analysis_add")
	public ModelAndView regist_analysis_add(ModelAndView mv) {

		mv.setViewName("regist_analysis/regist_analysis_add");
		return mv;
	}

	@PostMapping("regist_analysis_add")
	@ResponseBody
	public Map<String, Object> registAnalysis(@ModelAttribute Plan plan) {
		System.out.println(plan);
		Map<String, Object> result = null;
		result = planService.registPlan(plan);

		return result;
	}

	@PostMapping("regist_analysis_add/modify")
	@ResponseBody
	public int modifyPlan(@ModelAttribute Plan plan) {
		int result = -1;
		result = planService.modifyPlan(plan);
		return result;
	}

	@GetMapping("search-analysis")
	@ResponseBody
	public List<Plan> selectPlanList(@ModelAttribute PlanSearchParam param) {
		List<Plan> list = planService.selectPlanList(param);

		return list;
	}

	// 분석 계획 등록 간편 뷰
	@GetMapping("regist_analysis_easy_add")
	public ModelAndView regist_analysis_easy_add(ModelAndView mv) {

		DivisionSearchParam param = new DivisionSearchParam();
		Map<String, Object> result = divisionService.selectDivisionListByParents(param);

		mv.addObject("geneticList", geneticService.selectGeneticDepth(new Genetic()));
		mv.addObject("reportList", resportService.reportList("seed"));
		mv.addObject("result", result);
		mv.setViewName("regist_analysis/regist_analysis_add_easy");
		return mv;
	}

	@PostMapping("regist_analysis_easy_add")
	@ResponseBody
	public int registAnalysisEasy(@ModelAttribute PlanEasyParam plan) {
		int result = -1;
		result = planService.registPlanEasy(plan);
		return result;
	}

	@PostMapping("regist_analysis/modify-easy")
	@ResponseBody
	public int modifyAnalysisEasy(@ModelAttribute PlanEasyParam plan) {
		int result = -1;
		result = planService.modifyPlanEasy(plan);
		return result;
	}

	// 분석 계획 등록 템플릿 뷰
	@GetMapping("regist_analysis_template_add")
	public ModelAndView regist_analysis_template_add(ModelAndView mv) {

		mv.addObject("result", divisionService.selectDivisionListByParents(new DivisionSearchParam()));
		mv.addObject("geneticList", geneticService.selectGeneticDepth(new Genetic()));
		mv.addObject("reportList", resportService.reportList("seed"));
		mv.setViewName("regist_analysis/regist_analysis_add_template");
		return mv;
	}

	// 분석 계획 등록 템플릿
	@PostMapping("regist_analysis_template_add")
	@ResponseBody
	public int regist_analysis_template_add(Plan plan) {
		int result = -1;
		result = planService.registPlanTemplate(plan);
		return result;
	}

	// 분석 계획 등록 템플릿 수정
	@PostMapping("regist_analysis_template_update")
	@ResponseBody
	public int regist_analysis_template_update(Plan plan) {
		System.out.println("plan = " + plan);

		int result = -1;
		result = planService.updatePlanTemplate(plan);
		return result;
	}

	// 분석 계획 설정
	@GetMapping("analysis_plan_list")
	public ModelAndView analysis_plan_list(ModelAndView mv) {

		mv.setViewName("analysis_plan/analysis_plan_list");
		return mv;
	}

	// 분석 계획 설정 간편 뷰
	@GetMapping("analysis_plan_easy_add")
	public ModelAndView analysis_plan_easy_add(ModelAndView mv) {

		mv.setViewName("analysis_plan/analysis_plan_add_easy");
		return mv;
	}

	// 분석 계획 설정 템플릿 뷰
	@GetMapping("analysis_plan_template_add")
	public ModelAndView analysis_plan_template_add(ModelAndView mv) {

		mv.setViewName("analysis_plan/analysis_plan_add_template");
		return mv;
	}

	// 분석 계획 설정 상세정보
	@GetMapping("analysis_plan_modify")
	public ModelAndView analysis_plan_modify(ModelAndView mv) {

		mv.setViewName("analysis_plan/analysis_plan_modify");
		return mv;
	}

	// 결과 등록 리스트
	@GetMapping("regist_results_list")
	public ModelAndView regist_results_list(ModelAndView mv) {

		mv.setViewName("regist_results/regist_results_list");
		return mv;
	}

	@GetMapping("result/result-detail")
	public ModelAndView regist_result_detail(ModelAndView mv) {
		mv.setViewName("regist_results/regist_results_add");
		return mv;
	}

	// 데이터 검증 상세보기
	@GetMapping("example_modify")
	public ModelAndView example_modify(ModelAndView mv) {

		mv.setViewName("example/example_modify");
		return mv;
	}

	// 분석 계획 설정 detail
	@GetMapping("analysis_plan_list/plan-detail")
	public ModelAndView planDetail(@RequestParam int plan_id, @RequestParam int regist_type, ModelAndView mv) {

		Map<String, Object> result = planService.selectPlanById(plan_id, regist_type);
		System.out.println(result);
		mv.addObject("result", result);
		mv.addObject("reportList" , resportService.reportList("seed"));
		mv.addObject("userList", userService.userList(AuthUtil.sessionUser()));
		mv.setViewName(result.get("viewName").toString());
		return mv;
	}

	// 분석 계획 등록 detail
	@GetMapping("regist_analysis_list/plan-regist-detail")
	public ModelAndView registPlanDetail(@RequestParam int plan_id, @RequestParam int regist_type, ModelAndView mv) {

		SessionUtil.setPkId(plan_id,type);

		Map<String, Object> result = new HashMap<String , Object>();
				
		if(regist_type == 2) {
			result = planService.selectTemplate(plan_id);
		}else {
			result = planService.selectRegistPlanById(plan_id, regist_type);
		}
		mv.addObject("result", result);
		mv.setViewName(result.get("viewName").toString());
		return mv;
	}

	// 분석 계획 설정
	@PostMapping("analysis/plan-set")
	@ResponseBody
	public int setAnaliaysPlan(@ModelAttribute PlanSetParam plan) {
		int result = -1;
		result = planService.setAnalistPlan(plan);
		return result;
	}

	@PostMapping("analysis/plan-set-easy")
	@ResponseBody
	public int setAnaliaysPlanEasy(@ModelAttribute PlanSetEasyParam plan) {
		int result = -1;
		result = planService.setAnalysisPlanEasy(plan);
		return result;
	}

	@GetMapping("analysis/search/plan-method")
	@ResponseBody
	public Map<String, Object> selectPlanListByMethod(@RequestParam int method_id) {
		Map<String, Object> result = planService.selectPlanByMethod(method_id);
		return result;
	}

	@PostMapping("analysis/modify-plan-template")
	@ResponseBody
	public int modifyAnalysisPlanTemplate(PlanSetEasyParam plan){
		int result;

		result = planService.modifyAnalysisPlanTemplate(plan);

		return result;
	}
}