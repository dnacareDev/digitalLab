/**
 * PrjInfoVo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.go.rda.atis.wsdl.prj.prjinfo;

public class PrjInfoVo  implements java.io.Serializable {
    private java.lang.String countControl;

    private java.lang.String dtlProgNm;

    private int findPage;

    private java.lang.String findPrjYrDtlNm;

    private java.lang.String findPrjYrDtlNo;

    private java.lang.String findPrjYrDtlRsprDicCode;

    private java.lang.String findPrjYrDtlRsprNm;

    private java.lang.String findPrjYrDtlYear;

    private java.lang.String findPrtcpMp;

    private java.lang.String findPrtcpMpDicCode;

    private int findRowPerPage;

    private java.lang.String korKywd;

    private java.lang.String mainRsprDeptNm;

    private java.lang.String mainRsprNm;

    private java.lang.String mainRsprTopDeptNm;

    private int pageNo;

    private java.lang.Object[] prjInfoList;

    private java.lang.String prjNm;

    private java.lang.String prjNo;

    private java.lang.String prjYrDtlNm;

    private java.lang.String prjYrDtlNo;

    private java.lang.String prjYrDtlRsprDicCode;

    private java.lang.String prjYrDtlRsprNm;

    private java.lang.String prjYrDtlYear;

    private java.lang.String prjYrNm;

    private java.lang.String prjYrNo;

    private java.lang.String prjYrRsprNm;

    private java.lang.String prtcpMpDicCodeList;

    private java.lang.String prtcpMpList;

    private java.lang.String rdaItemNm;

    private java.lang.String reaultFlag;

    private java.lang.String resultMsg;

    private java.lang.String rndPhaseNm;

    private java.lang.String rndcoTotAmt;

    private java.lang.String subProgNm;

    private java.lang.String sysId;

    private java.lang.String sysPwd;

    private java.lang.String totRschEndYear;

    private java.lang.String totRschStartYear;

    private int totalRow;

    private java.lang.String updateDt;

    public PrjInfoVo() {
    }

    public PrjInfoVo(
           java.lang.String countControl,
           java.lang.String dtlProgNm,
           int findPage,
           java.lang.String findPrjYrDtlNm,
           java.lang.String findPrjYrDtlNo,
           java.lang.String findPrjYrDtlRsprDicCode,
           java.lang.String findPrjYrDtlRsprNm,
           java.lang.String findPrjYrDtlYear,
           java.lang.String findPrtcpMp,
           java.lang.String findPrtcpMpDicCode,
           int findRowPerPage,
           java.lang.String korKywd,
           java.lang.String mainRsprDeptNm,
           java.lang.String mainRsprNm,
           java.lang.String mainRsprTopDeptNm,
           int pageNo,
           java.lang.Object[] prjInfoList,
           java.lang.String prjNm,
           java.lang.String prjNo,
           java.lang.String prjYrDtlNm,
           java.lang.String prjYrDtlNo,
           java.lang.String prjYrDtlRsprDicCode,
           java.lang.String prjYrDtlRsprNm,
           java.lang.String prjYrDtlYear,
           java.lang.String prjYrNm,
           java.lang.String prjYrNo,
           java.lang.String prjYrRsprNm,
           java.lang.String prtcpMpDicCodeList,
           java.lang.String prtcpMpList,
           java.lang.String rdaItemNm,
           java.lang.String reaultFlag,
           java.lang.String resultMsg,
           java.lang.String rndPhaseNm,
           java.lang.String rndcoTotAmt,
           java.lang.String subProgNm,
           java.lang.String sysId,
           java.lang.String sysPwd,
           java.lang.String totRschEndYear,
           java.lang.String totRschStartYear,
           int totalRow,
           java.lang.String updateDt) {
           this.countControl = countControl;
           this.dtlProgNm = dtlProgNm;
           this.findPage = findPage;
           this.findPrjYrDtlNm = findPrjYrDtlNm;
           this.findPrjYrDtlNo = findPrjYrDtlNo;
           this.findPrjYrDtlRsprDicCode = findPrjYrDtlRsprDicCode;
           this.findPrjYrDtlRsprNm = findPrjYrDtlRsprNm;
           this.findPrjYrDtlYear = findPrjYrDtlYear;
           this.findPrtcpMp = findPrtcpMp;
           this.findPrtcpMpDicCode = findPrtcpMpDicCode;
           this.findRowPerPage = findRowPerPage;
           this.korKywd = korKywd;
           this.mainRsprDeptNm = mainRsprDeptNm;
           this.mainRsprNm = mainRsprNm;
           this.mainRsprTopDeptNm = mainRsprTopDeptNm;
           this.pageNo = pageNo;
           this.prjInfoList = prjInfoList;
           this.prjNm = prjNm;
           this.prjNo = prjNo;
           this.prjYrDtlNm = prjYrDtlNm;
           this.prjYrDtlNo = prjYrDtlNo;
           this.prjYrDtlRsprDicCode = prjYrDtlRsprDicCode;
           this.prjYrDtlRsprNm = prjYrDtlRsprNm;
           this.prjYrDtlYear = prjYrDtlYear;
           this.prjYrNm = prjYrNm;
           this.prjYrNo = prjYrNo;
           this.prjYrRsprNm = prjYrRsprNm;
           this.prtcpMpDicCodeList = prtcpMpDicCodeList;
           this.prtcpMpList = prtcpMpList;
           this.rdaItemNm = rdaItemNm;
           this.reaultFlag = reaultFlag;
           this.resultMsg = resultMsg;
           this.rndPhaseNm = rndPhaseNm;
           this.rndcoTotAmt = rndcoTotAmt;
           this.subProgNm = subProgNm;
           this.sysId = sysId;
           this.sysPwd = sysPwd;
           this.totRschEndYear = totRschEndYear;
           this.totRschStartYear = totRschStartYear;
           this.totalRow = totalRow;
           this.updateDt = updateDt;
    }


    /**
     * Gets the countControl value for this PrjInfoVo.
     * 
     * @return countControl
     */
    public java.lang.String getCountControl() {
        return countControl;
    }


    /**
     * Sets the countControl value for this PrjInfoVo.
     * 
     * @param countControl
     */
    public void setCountControl(java.lang.String countControl) {
        this.countControl = countControl;
    }


    /**
     * Gets the dtlProgNm value for this PrjInfoVo.
     * 
     * @return dtlProgNm
     */
    public java.lang.String getDtlProgNm() {
        return dtlProgNm;
    }


    /**
     * Sets the dtlProgNm value for this PrjInfoVo.
     * 
     * @param dtlProgNm
     */
    public void setDtlProgNm(java.lang.String dtlProgNm) {
        this.dtlProgNm = dtlProgNm;
    }


    /**
     * Gets the findPage value for this PrjInfoVo.
     * 
     * @return findPage
     */
    public int getFindPage() {
        return findPage;
    }


    /**
     * Sets the findPage value for this PrjInfoVo.
     * 
     * @param findPage
     */
    public void setFindPage(int findPage) {
        this.findPage = findPage;
    }


    /**
     * Gets the findPrjYrDtlNm value for this PrjInfoVo.
     * 
     * @return findPrjYrDtlNm
     */
    public java.lang.String getFindPrjYrDtlNm() {
        return findPrjYrDtlNm;
    }


    /**
     * Sets the findPrjYrDtlNm value for this PrjInfoVo.
     * 
     * @param findPrjYrDtlNm
     */
    public void setFindPrjYrDtlNm(java.lang.String findPrjYrDtlNm) {
        this.findPrjYrDtlNm = findPrjYrDtlNm;
    }


    /**
     * Gets the findPrjYrDtlNo value for this PrjInfoVo.
     * 
     * @return findPrjYrDtlNo
     */
    public java.lang.String getFindPrjYrDtlNo() {
        return findPrjYrDtlNo;
    }


    /**
     * Sets the findPrjYrDtlNo value for this PrjInfoVo.
     * 
     * @param findPrjYrDtlNo
     */
    public void setFindPrjYrDtlNo(java.lang.String findPrjYrDtlNo) {
        this.findPrjYrDtlNo = findPrjYrDtlNo;
    }


    /**
     * Gets the findPrjYrDtlRsprDicCode value for this PrjInfoVo.
     * 
     * @return findPrjYrDtlRsprDicCode
     */
    public java.lang.String getFindPrjYrDtlRsprDicCode() {
        return findPrjYrDtlRsprDicCode;
    }


    /**
     * Sets the findPrjYrDtlRsprDicCode value for this PrjInfoVo.
     * 
     * @param findPrjYrDtlRsprDicCode
     */
    public void setFindPrjYrDtlRsprDicCode(java.lang.String findPrjYrDtlRsprDicCode) {
        this.findPrjYrDtlRsprDicCode = findPrjYrDtlRsprDicCode;
    }


    /**
     * Gets the findPrjYrDtlRsprNm value for this PrjInfoVo.
     * 
     * @return findPrjYrDtlRsprNm
     */
    public java.lang.String getFindPrjYrDtlRsprNm() {
        return findPrjYrDtlRsprNm;
    }


    /**
     * Sets the findPrjYrDtlRsprNm value for this PrjInfoVo.
     * 
     * @param findPrjYrDtlRsprNm
     */
    public void setFindPrjYrDtlRsprNm(java.lang.String findPrjYrDtlRsprNm) {
        this.findPrjYrDtlRsprNm = findPrjYrDtlRsprNm;
    }


    /**
     * Gets the findPrjYrDtlYear value for this PrjInfoVo.
     * 
     * @return findPrjYrDtlYear
     */
    public java.lang.String getFindPrjYrDtlYear() {
        return findPrjYrDtlYear;
    }


    /**
     * Sets the findPrjYrDtlYear value for this PrjInfoVo.
     * 
     * @param findPrjYrDtlYear
     */
    public void setFindPrjYrDtlYear(java.lang.String findPrjYrDtlYear) {
        this.findPrjYrDtlYear = findPrjYrDtlYear;
    }


    /**
     * Gets the findPrtcpMp value for this PrjInfoVo.
     * 
     * @return findPrtcpMp
     */
    public java.lang.String getFindPrtcpMp() {
        return findPrtcpMp;
    }


    /**
     * Sets the findPrtcpMp value for this PrjInfoVo.
     * 
     * @param findPrtcpMp
     */
    public void setFindPrtcpMp(java.lang.String findPrtcpMp) {
        this.findPrtcpMp = findPrtcpMp;
    }


    /**
     * Gets the findPrtcpMpDicCode value for this PrjInfoVo.
     * 
     * @return findPrtcpMpDicCode
     */
    public java.lang.String getFindPrtcpMpDicCode() {
        return findPrtcpMpDicCode;
    }


    /**
     * Sets the findPrtcpMpDicCode value for this PrjInfoVo.
     * 
     * @param findPrtcpMpDicCode
     */
    public void setFindPrtcpMpDicCode(java.lang.String findPrtcpMpDicCode) {
        this.findPrtcpMpDicCode = findPrtcpMpDicCode;
    }


    /**
     * Gets the findRowPerPage value for this PrjInfoVo.
     * 
     * @return findRowPerPage
     */
    public int getFindRowPerPage() {
        return findRowPerPage;
    }


    /**
     * Sets the findRowPerPage value for this PrjInfoVo.
     * 
     * @param findRowPerPage
     */
    public void setFindRowPerPage(int findRowPerPage) {
        this.findRowPerPage = findRowPerPage;
    }


    /**
     * Gets the korKywd value for this PrjInfoVo.
     * 
     * @return korKywd
     */
    public java.lang.String getKorKywd() {
        return korKywd;
    }


    /**
     * Sets the korKywd value for this PrjInfoVo.
     * 
     * @param korKywd
     */
    public void setKorKywd(java.lang.String korKywd) {
        this.korKywd = korKywd;
    }


    /**
     * Gets the mainRsprDeptNm value for this PrjInfoVo.
     * 
     * @return mainRsprDeptNm
     */
    public java.lang.String getMainRsprDeptNm() {
        return mainRsprDeptNm;
    }


    /**
     * Sets the mainRsprDeptNm value for this PrjInfoVo.
     * 
     * @param mainRsprDeptNm
     */
    public void setMainRsprDeptNm(java.lang.String mainRsprDeptNm) {
        this.mainRsprDeptNm = mainRsprDeptNm;
    }


    /**
     * Gets the mainRsprNm value for this PrjInfoVo.
     * 
     * @return mainRsprNm
     */
    public java.lang.String getMainRsprNm() {
        return mainRsprNm;
    }


    /**
     * Sets the mainRsprNm value for this PrjInfoVo.
     * 
     * @param mainRsprNm
     */
    public void setMainRsprNm(java.lang.String mainRsprNm) {
        this.mainRsprNm = mainRsprNm;
    }


    /**
     * Gets the mainRsprTopDeptNm value for this PrjInfoVo.
     * 
     * @return mainRsprTopDeptNm
     */
    public java.lang.String getMainRsprTopDeptNm() {
        return mainRsprTopDeptNm;
    }


    /**
     * Sets the mainRsprTopDeptNm value for this PrjInfoVo.
     * 
     * @param mainRsprTopDeptNm
     */
    public void setMainRsprTopDeptNm(java.lang.String mainRsprTopDeptNm) {
        this.mainRsprTopDeptNm = mainRsprTopDeptNm;
    }


    /**
     * Gets the pageNo value for this PrjInfoVo.
     * 
     * @return pageNo
     */
    public int getPageNo() {
        return pageNo;
    }


    /**
     * Sets the pageNo value for this PrjInfoVo.
     * 
     * @param pageNo
     */
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }


    /**
     * Gets the prjInfoList value for this PrjInfoVo.
     * 
     * @return prjInfoList
     */
    public java.lang.Object[] getPrjInfoList() {
        return prjInfoList;
    }


    /**
     * Sets the prjInfoList value for this PrjInfoVo.
     * 
     * @param prjInfoList
     */
    public void setPrjInfoList(java.lang.Object[] prjInfoList) {
        this.prjInfoList = prjInfoList;
    }


    /**
     * Gets the prjNm value for this PrjInfoVo.
     * 
     * @return prjNm
     */
    public java.lang.String getPrjNm() {
        return prjNm;
    }


    /**
     * Sets the prjNm value for this PrjInfoVo.
     * 
     * @param prjNm
     */
    public void setPrjNm(java.lang.String prjNm) {
        this.prjNm = prjNm;
    }


    /**
     * Gets the prjNo value for this PrjInfoVo.
     * 
     * @return prjNo
     */
    public java.lang.String getPrjNo() {
        return prjNo;
    }


    /**
     * Sets the prjNo value for this PrjInfoVo.
     * 
     * @param prjNo
     */
    public void setPrjNo(java.lang.String prjNo) {
        this.prjNo = prjNo;
    }


    /**
     * Gets the prjYrDtlNm value for this PrjInfoVo.
     * 
     * @return prjYrDtlNm
     */
    public java.lang.String getPrjYrDtlNm() {
        return prjYrDtlNm;
    }


    /**
     * Sets the prjYrDtlNm value for this PrjInfoVo.
     * 
     * @param prjYrDtlNm
     */
    public void setPrjYrDtlNm(java.lang.String prjYrDtlNm) {
        this.prjYrDtlNm = prjYrDtlNm;
    }


    /**
     * Gets the prjYrDtlNo value for this PrjInfoVo.
     * 
     * @return prjYrDtlNo
     */
    public java.lang.String getPrjYrDtlNo() {
        return prjYrDtlNo;
    }


    /**
     * Sets the prjYrDtlNo value for this PrjInfoVo.
     * 
     * @param prjYrDtlNo
     */
    public void setPrjYrDtlNo(java.lang.String prjYrDtlNo) {
        this.prjYrDtlNo = prjYrDtlNo;
    }


    /**
     * Gets the prjYrDtlRsprDicCode value for this PrjInfoVo.
     * 
     * @return prjYrDtlRsprDicCode
     */
    public java.lang.String getPrjYrDtlRsprDicCode() {
        return prjYrDtlRsprDicCode;
    }


    /**
     * Sets the prjYrDtlRsprDicCode value for this PrjInfoVo.
     * 
     * @param prjYrDtlRsprDicCode
     */
    public void setPrjYrDtlRsprDicCode(java.lang.String prjYrDtlRsprDicCode) {
        this.prjYrDtlRsprDicCode = prjYrDtlRsprDicCode;
    }


    /**
     * Gets the prjYrDtlRsprNm value for this PrjInfoVo.
     * 
     * @return prjYrDtlRsprNm
     */
    public java.lang.String getPrjYrDtlRsprNm() {
        return prjYrDtlRsprNm;
    }


    /**
     * Sets the prjYrDtlRsprNm value for this PrjInfoVo.
     * 
     * @param prjYrDtlRsprNm
     */
    public void setPrjYrDtlRsprNm(java.lang.String prjYrDtlRsprNm) {
        this.prjYrDtlRsprNm = prjYrDtlRsprNm;
    }


    /**
     * Gets the prjYrDtlYear value for this PrjInfoVo.
     * 
     * @return prjYrDtlYear
     */
    public java.lang.String getPrjYrDtlYear() {
        return prjYrDtlYear;
    }


    /**
     * Sets the prjYrDtlYear value for this PrjInfoVo.
     * 
     * @param prjYrDtlYear
     */
    public void setPrjYrDtlYear(java.lang.String prjYrDtlYear) {
        this.prjYrDtlYear = prjYrDtlYear;
    }


    /**
     * Gets the prjYrNm value for this PrjInfoVo.
     * 
     * @return prjYrNm
     */
    public java.lang.String getPrjYrNm() {
        return prjYrNm;
    }


    /**
     * Sets the prjYrNm value for this PrjInfoVo.
     * 
     * @param prjYrNm
     */
    public void setPrjYrNm(java.lang.String prjYrNm) {
        this.prjYrNm = prjYrNm;
    }


    /**
     * Gets the prjYrNo value for this PrjInfoVo.
     * 
     * @return prjYrNo
     */
    public java.lang.String getPrjYrNo() {
        return prjYrNo;
    }


    /**
     * Sets the prjYrNo value for this PrjInfoVo.
     * 
     * @param prjYrNo
     */
    public void setPrjYrNo(java.lang.String prjYrNo) {
        this.prjYrNo = prjYrNo;
    }


    /**
     * Gets the prjYrRsprNm value for this PrjInfoVo.
     * 
     * @return prjYrRsprNm
     */
    public java.lang.String getPrjYrRsprNm() {
        return prjYrRsprNm;
    }


    /**
     * Sets the prjYrRsprNm value for this PrjInfoVo.
     * 
     * @param prjYrRsprNm
     */
    public void setPrjYrRsprNm(java.lang.String prjYrRsprNm) {
        this.prjYrRsprNm = prjYrRsprNm;
    }


    /**
     * Gets the prtcpMpDicCodeList value for this PrjInfoVo.
     * 
     * @return prtcpMpDicCodeList
     */
    public java.lang.String getPrtcpMpDicCodeList() {
        return prtcpMpDicCodeList;
    }


    /**
     * Sets the prtcpMpDicCodeList value for this PrjInfoVo.
     * 
     * @param prtcpMpDicCodeList
     */
    public void setPrtcpMpDicCodeList(java.lang.String prtcpMpDicCodeList) {
        this.prtcpMpDicCodeList = prtcpMpDicCodeList;
    }


    /**
     * Gets the prtcpMpList value for this PrjInfoVo.
     * 
     * @return prtcpMpList
     */
    public java.lang.String getPrtcpMpList() {
        return prtcpMpList;
    }


    /**
     * Sets the prtcpMpList value for this PrjInfoVo.
     * 
     * @param prtcpMpList
     */
    public void setPrtcpMpList(java.lang.String prtcpMpList) {
        this.prtcpMpList = prtcpMpList;
    }


    /**
     * Gets the rdaItemNm value for this PrjInfoVo.
     * 
     * @return rdaItemNm
     */
    public java.lang.String getRdaItemNm() {
        return rdaItemNm;
    }


    /**
     * Sets the rdaItemNm value for this PrjInfoVo.
     * 
     * @param rdaItemNm
     */
    public void setRdaItemNm(java.lang.String rdaItemNm) {
        this.rdaItemNm = rdaItemNm;
    }


    /**
     * Gets the reaultFlag value for this PrjInfoVo.
     * 
     * @return reaultFlag
     */
    public java.lang.String getReaultFlag() {
        return reaultFlag;
    }


    /**
     * Sets the reaultFlag value for this PrjInfoVo.
     * 
     * @param reaultFlag
     */
    public void setReaultFlag(java.lang.String reaultFlag) {
        this.reaultFlag = reaultFlag;
    }


    /**
     * Gets the resultMsg value for this PrjInfoVo.
     * 
     * @return resultMsg
     */
    public java.lang.String getResultMsg() {
        return resultMsg;
    }


    /**
     * Sets the resultMsg value for this PrjInfoVo.
     * 
     * @param resultMsg
     */
    public void setResultMsg(java.lang.String resultMsg) {
        this.resultMsg = resultMsg;
    }


    /**
     * Gets the rndPhaseNm value for this PrjInfoVo.
     * 
     * @return rndPhaseNm
     */
    public java.lang.String getRndPhaseNm() {
        return rndPhaseNm;
    }


    /**
     * Sets the rndPhaseNm value for this PrjInfoVo.
     * 
     * @param rndPhaseNm
     */
    public void setRndPhaseNm(java.lang.String rndPhaseNm) {
        this.rndPhaseNm = rndPhaseNm;
    }


    /**
     * Gets the rndcoTotAmt value for this PrjInfoVo.
     * 
     * @return rndcoTotAmt
     */
    public java.lang.String getRndcoTotAmt() {
        return rndcoTotAmt;
    }


    /**
     * Sets the rndcoTotAmt value for this PrjInfoVo.
     * 
     * @param rndcoTotAmt
     */
    public void setRndcoTotAmt(java.lang.String rndcoTotAmt) {
        this.rndcoTotAmt = rndcoTotAmt;
    }


    /**
     * Gets the subProgNm value for this PrjInfoVo.
     * 
     * @return subProgNm
     */
    public java.lang.String getSubProgNm() {
        return subProgNm;
    }


    /**
     * Sets the subProgNm value for this PrjInfoVo.
     * 
     * @param subProgNm
     */
    public void setSubProgNm(java.lang.String subProgNm) {
        this.subProgNm = subProgNm;
    }


    /**
     * Gets the sysId value for this PrjInfoVo.
     * 
     * @return sysId
     */
    public java.lang.String getSysId() {
        return sysId;
    }


    /**
     * Sets the sysId value for this PrjInfoVo.
     * 
     * @param sysId
     */
    public void setSysId(java.lang.String sysId) {
        this.sysId = sysId;
    }


    /**
     * Gets the sysPwd value for this PrjInfoVo.
     * 
     * @return sysPwd
     */
    public java.lang.String getSysPwd() {
        return sysPwd;
    }


    /**
     * Sets the sysPwd value for this PrjInfoVo.
     * 
     * @param sysPwd
     */
    public void setSysPwd(java.lang.String sysPwd) {
        this.sysPwd = sysPwd;
    }


    /**
     * Gets the totRschEndYear value for this PrjInfoVo.
     * 
     * @return totRschEndYear
     */
    public java.lang.String getTotRschEndYear() {
        return totRschEndYear;
    }


    /**
     * Sets the totRschEndYear value for this PrjInfoVo.
     * 
     * @param totRschEndYear
     */
    public void setTotRschEndYear(java.lang.String totRschEndYear) {
        this.totRschEndYear = totRschEndYear;
    }


    /**
     * Gets the totRschStartYear value for this PrjInfoVo.
     * 
     * @return totRschStartYear
     */
    public java.lang.String getTotRschStartYear() {
        return totRschStartYear;
    }


    /**
     * Sets the totRschStartYear value for this PrjInfoVo.
     * 
     * @param totRschStartYear
     */
    public void setTotRschStartYear(java.lang.String totRschStartYear) {
        this.totRschStartYear = totRschStartYear;
    }


    /**
     * Gets the totalRow value for this PrjInfoVo.
     * 
     * @return totalRow
     */
    public int getTotalRow() {
        return totalRow;
    }


    /**
     * Sets the totalRow value for this PrjInfoVo.
     * 
     * @param totalRow
     */
    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }


    /**
     * Gets the updateDt value for this PrjInfoVo.
     * 
     * @return updateDt
     */
    public java.lang.String getUpdateDt() {
        return updateDt;
    }


    /**
     * Sets the updateDt value for this PrjInfoVo.
     * 
     * @param updateDt
     */
    public void setUpdateDt(java.lang.String updateDt) {
        this.updateDt = updateDt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrjInfoVo)) return false;
        PrjInfoVo other = (PrjInfoVo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countControl==null && other.getCountControl()==null) || 
             (this.countControl!=null &&
              this.countControl.equals(other.getCountControl()))) &&
            ((this.dtlProgNm==null && other.getDtlProgNm()==null) || 
             (this.dtlProgNm!=null &&
              this.dtlProgNm.equals(other.getDtlProgNm()))) &&
            this.findPage == other.getFindPage() &&
            ((this.findPrjYrDtlNm==null && other.getFindPrjYrDtlNm()==null) || 
             (this.findPrjYrDtlNm!=null &&
              this.findPrjYrDtlNm.equals(other.getFindPrjYrDtlNm()))) &&
            ((this.findPrjYrDtlNo==null && other.getFindPrjYrDtlNo()==null) || 
             (this.findPrjYrDtlNo!=null &&
              this.findPrjYrDtlNo.equals(other.getFindPrjYrDtlNo()))) &&
            ((this.findPrjYrDtlRsprDicCode==null && other.getFindPrjYrDtlRsprDicCode()==null) || 
             (this.findPrjYrDtlRsprDicCode!=null &&
              this.findPrjYrDtlRsprDicCode.equals(other.getFindPrjYrDtlRsprDicCode()))) &&
            ((this.findPrjYrDtlRsprNm==null && other.getFindPrjYrDtlRsprNm()==null) || 
             (this.findPrjYrDtlRsprNm!=null &&
              this.findPrjYrDtlRsprNm.equals(other.getFindPrjYrDtlRsprNm()))) &&
            ((this.findPrjYrDtlYear==null && other.getFindPrjYrDtlYear()==null) || 
             (this.findPrjYrDtlYear!=null &&
              this.findPrjYrDtlYear.equals(other.getFindPrjYrDtlYear()))) &&
            ((this.findPrtcpMp==null && other.getFindPrtcpMp()==null) || 
             (this.findPrtcpMp!=null &&
              this.findPrtcpMp.equals(other.getFindPrtcpMp()))) &&
            ((this.findPrtcpMpDicCode==null && other.getFindPrtcpMpDicCode()==null) || 
             (this.findPrtcpMpDicCode!=null &&
              this.findPrtcpMpDicCode.equals(other.getFindPrtcpMpDicCode()))) &&
            this.findRowPerPage == other.getFindRowPerPage() &&
            ((this.korKywd==null && other.getKorKywd()==null) || 
             (this.korKywd!=null &&
              this.korKywd.equals(other.getKorKywd()))) &&
            ((this.mainRsprDeptNm==null && other.getMainRsprDeptNm()==null) || 
             (this.mainRsprDeptNm!=null &&
              this.mainRsprDeptNm.equals(other.getMainRsprDeptNm()))) &&
            ((this.mainRsprNm==null && other.getMainRsprNm()==null) || 
             (this.mainRsprNm!=null &&
              this.mainRsprNm.equals(other.getMainRsprNm()))) &&
            ((this.mainRsprTopDeptNm==null && other.getMainRsprTopDeptNm()==null) || 
             (this.mainRsprTopDeptNm!=null &&
              this.mainRsprTopDeptNm.equals(other.getMainRsprTopDeptNm()))) &&
            this.pageNo == other.getPageNo() &&
            ((this.prjInfoList==null && other.getPrjInfoList()==null) || 
             (this.prjInfoList!=null &&
              java.util.Arrays.equals(this.prjInfoList, other.getPrjInfoList()))) &&
            ((this.prjNm==null && other.getPrjNm()==null) || 
             (this.prjNm!=null &&
              this.prjNm.equals(other.getPrjNm()))) &&
            ((this.prjNo==null && other.getPrjNo()==null) || 
             (this.prjNo!=null &&
              this.prjNo.equals(other.getPrjNo()))) &&
            ((this.prjYrDtlNm==null && other.getPrjYrDtlNm()==null) || 
             (this.prjYrDtlNm!=null &&
              this.prjYrDtlNm.equals(other.getPrjYrDtlNm()))) &&
            ((this.prjYrDtlNo==null && other.getPrjYrDtlNo()==null) || 
             (this.prjYrDtlNo!=null &&
              this.prjYrDtlNo.equals(other.getPrjYrDtlNo()))) &&
            ((this.prjYrDtlRsprDicCode==null && other.getPrjYrDtlRsprDicCode()==null) || 
             (this.prjYrDtlRsprDicCode!=null &&
              this.prjYrDtlRsprDicCode.equals(other.getPrjYrDtlRsprDicCode()))) &&
            ((this.prjYrDtlRsprNm==null && other.getPrjYrDtlRsprNm()==null) || 
             (this.prjYrDtlRsprNm!=null &&
              this.prjYrDtlRsprNm.equals(other.getPrjYrDtlRsprNm()))) &&
            ((this.prjYrDtlYear==null && other.getPrjYrDtlYear()==null) || 
             (this.prjYrDtlYear!=null &&
              this.prjYrDtlYear.equals(other.getPrjYrDtlYear()))) &&
            ((this.prjYrNm==null && other.getPrjYrNm()==null) || 
             (this.prjYrNm!=null &&
              this.prjYrNm.equals(other.getPrjYrNm()))) &&
            ((this.prjYrNo==null && other.getPrjYrNo()==null) || 
             (this.prjYrNo!=null &&
              this.prjYrNo.equals(other.getPrjYrNo()))) &&
            ((this.prjYrRsprNm==null && other.getPrjYrRsprNm()==null) || 
             (this.prjYrRsprNm!=null &&
              this.prjYrRsprNm.equals(other.getPrjYrRsprNm()))) &&
            ((this.prtcpMpDicCodeList==null && other.getPrtcpMpDicCodeList()==null) || 
             (this.prtcpMpDicCodeList!=null &&
              this.prtcpMpDicCodeList.equals(other.getPrtcpMpDicCodeList()))) &&
            ((this.prtcpMpList==null && other.getPrtcpMpList()==null) || 
             (this.prtcpMpList!=null &&
              this.prtcpMpList.equals(other.getPrtcpMpList()))) &&
            ((this.rdaItemNm==null && other.getRdaItemNm()==null) || 
             (this.rdaItemNm!=null &&
              this.rdaItemNm.equals(other.getRdaItemNm()))) &&
            ((this.reaultFlag==null && other.getReaultFlag()==null) || 
             (this.reaultFlag!=null &&
              this.reaultFlag.equals(other.getReaultFlag()))) &&
            ((this.resultMsg==null && other.getResultMsg()==null) || 
             (this.resultMsg!=null &&
              this.resultMsg.equals(other.getResultMsg()))) &&
            ((this.rndPhaseNm==null && other.getRndPhaseNm()==null) || 
             (this.rndPhaseNm!=null &&
              this.rndPhaseNm.equals(other.getRndPhaseNm()))) &&
            ((this.rndcoTotAmt==null && other.getRndcoTotAmt()==null) || 
             (this.rndcoTotAmt!=null &&
              this.rndcoTotAmt.equals(other.getRndcoTotAmt()))) &&
            ((this.subProgNm==null && other.getSubProgNm()==null) || 
             (this.subProgNm!=null &&
              this.subProgNm.equals(other.getSubProgNm()))) &&
            ((this.sysId==null && other.getSysId()==null) || 
             (this.sysId!=null &&
              this.sysId.equals(other.getSysId()))) &&
            ((this.sysPwd==null && other.getSysPwd()==null) || 
             (this.sysPwd!=null &&
              this.sysPwd.equals(other.getSysPwd()))) &&
            ((this.totRschEndYear==null && other.getTotRschEndYear()==null) || 
             (this.totRschEndYear!=null &&
              this.totRschEndYear.equals(other.getTotRschEndYear()))) &&
            ((this.totRschStartYear==null && other.getTotRschStartYear()==null) || 
             (this.totRschStartYear!=null &&
              this.totRschStartYear.equals(other.getTotRschStartYear()))) &&
            this.totalRow == other.getTotalRow() &&
            ((this.updateDt==null && other.getUpdateDt()==null) || 
             (this.updateDt!=null &&
              this.updateDt.equals(other.getUpdateDt())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCountControl() != null) {
            _hashCode += getCountControl().hashCode();
        }
        if (getDtlProgNm() != null) {
            _hashCode += getDtlProgNm().hashCode();
        }
        _hashCode += getFindPage();
        if (getFindPrjYrDtlNm() != null) {
            _hashCode += getFindPrjYrDtlNm().hashCode();
        }
        if (getFindPrjYrDtlNo() != null) {
            _hashCode += getFindPrjYrDtlNo().hashCode();
        }
        if (getFindPrjYrDtlRsprDicCode() != null) {
            _hashCode += getFindPrjYrDtlRsprDicCode().hashCode();
        }
        if (getFindPrjYrDtlRsprNm() != null) {
            _hashCode += getFindPrjYrDtlRsprNm().hashCode();
        }
        if (getFindPrjYrDtlYear() != null) {
            _hashCode += getFindPrjYrDtlYear().hashCode();
        }
        if (getFindPrtcpMp() != null) {
            _hashCode += getFindPrtcpMp().hashCode();
        }
        if (getFindPrtcpMpDicCode() != null) {
            _hashCode += getFindPrtcpMpDicCode().hashCode();
        }
        _hashCode += getFindRowPerPage();
        if (getKorKywd() != null) {
            _hashCode += getKorKywd().hashCode();
        }
        if (getMainRsprDeptNm() != null) {
            _hashCode += getMainRsprDeptNm().hashCode();
        }
        if (getMainRsprNm() != null) {
            _hashCode += getMainRsprNm().hashCode();
        }
        if (getMainRsprTopDeptNm() != null) {
            _hashCode += getMainRsprTopDeptNm().hashCode();
        }
        _hashCode += getPageNo();
        if (getPrjInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrjInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrjInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrjNm() != null) {
            _hashCode += getPrjNm().hashCode();
        }
        if (getPrjNo() != null) {
            _hashCode += getPrjNo().hashCode();
        }
        if (getPrjYrDtlNm() != null) {
            _hashCode += getPrjYrDtlNm().hashCode();
        }
        if (getPrjYrDtlNo() != null) {
            _hashCode += getPrjYrDtlNo().hashCode();
        }
        if (getPrjYrDtlRsprDicCode() != null) {
            _hashCode += getPrjYrDtlRsprDicCode().hashCode();
        }
        if (getPrjYrDtlRsprNm() != null) {
            _hashCode += getPrjYrDtlRsprNm().hashCode();
        }
        if (getPrjYrDtlYear() != null) {
            _hashCode += getPrjYrDtlYear().hashCode();
        }
        if (getPrjYrNm() != null) {
            _hashCode += getPrjYrNm().hashCode();
        }
        if (getPrjYrNo() != null) {
            _hashCode += getPrjYrNo().hashCode();
        }
        if (getPrjYrRsprNm() != null) {
            _hashCode += getPrjYrRsprNm().hashCode();
        }
        if (getPrtcpMpDicCodeList() != null) {
            _hashCode += getPrtcpMpDicCodeList().hashCode();
        }
        if (getPrtcpMpList() != null) {
            _hashCode += getPrtcpMpList().hashCode();
        }
        if (getRdaItemNm() != null) {
            _hashCode += getRdaItemNm().hashCode();
        }
        if (getReaultFlag() != null) {
            _hashCode += getReaultFlag().hashCode();
        }
        if (getResultMsg() != null) {
            _hashCode += getResultMsg().hashCode();
        }
        if (getRndPhaseNm() != null) {
            _hashCode += getRndPhaseNm().hashCode();
        }
        if (getRndcoTotAmt() != null) {
            _hashCode += getRndcoTotAmt().hashCode();
        }
        if (getSubProgNm() != null) {
            _hashCode += getSubProgNm().hashCode();
        }
        if (getSysId() != null) {
            _hashCode += getSysId().hashCode();
        }
        if (getSysPwd() != null) {
            _hashCode += getSysPwd().hashCode();
        }
        if (getTotRschEndYear() != null) {
            _hashCode += getTotRschEndYear().hashCode();
        }
        if (getTotRschStartYear() != null) {
            _hashCode += getTotRschStartYear().hashCode();
        }
        _hashCode += getTotalRow();
        if (getUpdateDt() != null) {
            _hashCode += getUpdateDt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrjInfoVo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "PrjInfoVo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "countControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtlProgNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "dtlProgNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findPrjYrDtlNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findPrjYrDtlNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findPrjYrDtlNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findPrjYrDtlNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findPrjYrDtlRsprDicCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findPrjYrDtlRsprDicCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findPrjYrDtlRsprNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findPrjYrDtlRsprNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findPrjYrDtlYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findPrjYrDtlYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findPrtcpMp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findPrtcpMp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findPrtcpMpDicCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findPrtcpMpDicCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findRowPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "findRowPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("korKywd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "korKywd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainRsprDeptNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "mainRsprDeptNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainRsprNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "mainRsprNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainRsprTopDeptNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "mainRsprTopDeptNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "pageNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjYrDtlNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjYrDtlNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjYrDtlNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjYrDtlNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjYrDtlRsprDicCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjYrDtlRsprDicCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjYrDtlRsprNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjYrDtlRsprNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjYrDtlYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjYrDtlYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjYrNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjYrNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjYrNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjYrNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prjYrRsprNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prjYrRsprNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prtcpMpDicCodeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prtcpMpDicCodeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prtcpMpList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "prtcpMpList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rdaItemNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "rdaItemNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reaultFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "reaultFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "resultMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rndPhaseNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "rndPhaseNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rndcoTotAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "rndcoTotAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subProgNm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "subProgNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "sysId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "sysPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totRschEndYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "totRschEndYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totRschStartYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "totRschStartYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "totalRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "updateDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
