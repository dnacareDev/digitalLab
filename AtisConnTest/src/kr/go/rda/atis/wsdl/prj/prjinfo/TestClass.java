
package kr.go.rda.atis.wsdl.prj.prjinfo;


public class TestClass {

	public static void main(String[] args) {
		PrjDtlInfoProxy prjDtlInfo = new PrjDtlInfoProxy();
		PrjDtlInfoVo prjDtlInfoVo = new PrjDtlInfoVo();

		/*******************
		 * 아이디 패스워드 입력부분
		 ********************/
		prjDtlInfoVo.setSysId("");
		prjDtlInfoVo.setSysPwd("");
		prjDtlInfoVo.setFindRowPerPage(100); // 뷰 카운트
		prjDtlInfoVo.setFindPrtcpMpDicCode("");
		/*******************
		 * 결과
		 ********************/
		prjDtlInfoVo = prjDtlInfo.getPrjDtlInfo(prjDtlInfoVo);
		System.out.println("====================");
		System.out.println("메세지코드=" + prjDtlInfoVo.getReaultFlag());
		System.out.println("메세지=" + prjDtlInfoVo.getResultMsg());
		System.out.println("리스트 수 =" + prjDtlInfoVo.getTotalRow());

		if (prjDtlInfoVo.getReaultFlag().equals("0")) {
			HashMap mp = new HashMap();
			System.out.println(prjDtlInfoVo.getPrjDtlInfoList().length);
			for (int i = 0; i < prjDtlInfoVo.getPrjDtlInfoList().length; i++) {
				System.out.println("==============getPrjInfoList" + i + "=" + prjDtlInfoVo.getPrjDtlInfoList()[i]);
//				if(1 == i){
//					mp.putAll((HashMap)prjDtlInfoVo.getPrjDtlInfoList()[i]) ;
//				}
				mp.put("prjList", prjDtlInfoVo.getPrjDtlInfoList());
			}
		}
	}

}



