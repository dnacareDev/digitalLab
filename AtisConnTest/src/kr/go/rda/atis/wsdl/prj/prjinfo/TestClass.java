
package kr.go.rda.atis.wsdl.prj.prjinfo;


public class TestClass {

	public static void main(String[] args) {
		PrjDtlInfoProxy prjDtlInfo = new PrjDtlInfoProxy();
		PrjDtlInfoVo prjDtlInfoVo = new PrjDtlInfoVo();

		/*******************
		 * ���̵� �н����� �Էºκ�
		 ********************/
		prjDtlInfoVo.setSysId("");
		prjDtlInfoVo.setSysPwd("");
		prjDtlInfoVo.setFindRowPerPage(100); // �� ī��Ʈ
		prjDtlInfoVo.setFindPrtcpMpDicCode("");
		/*******************
		 * ���
		 ********************/
		prjDtlInfoVo = prjDtlInfo.getPrjDtlInfo(prjDtlInfoVo);
		System.out.println("====================");
		System.out.println("�޼����ڵ�=" + prjDtlInfoVo.getReaultFlag());
		System.out.println("�޼���=" + prjDtlInfoVo.getResultMsg());
		System.out.println("����Ʈ �� =" + prjDtlInfoVo.getTotalRow());

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



