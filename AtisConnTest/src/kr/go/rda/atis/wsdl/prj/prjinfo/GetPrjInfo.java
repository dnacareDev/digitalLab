/**
 * GetPrjInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.go.rda.atis.wsdl.prj.prjinfo;

public class GetPrjInfo  implements java.io.Serializable {
    private kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo vo;

    public GetPrjInfo() {
    }

    public GetPrjInfo(
           kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo vo) {
           this.vo = vo;
    }


    /**
     * Gets the vo value for this GetPrjInfo.
     * 
     * @return vo
     */
    public kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo getVo() {
        return vo;
    }


    /**
     * Sets the vo value for this GetPrjInfo.
     * 
     * @param vo
     */
    public void setVo(kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo vo) {
        this.vo = vo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPrjInfo)) return false;
        GetPrjInfo other = (GetPrjInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vo==null && other.getVo()==null) || 
             (this.vo!=null &&
              this.vo.equals(other.getVo())));
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
        if (getVo() != null) {
            _hashCode += getVo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPrjInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", ">getPrjInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "vo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "PrjInfoVo"));
        elemField.setNillable(false);
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
