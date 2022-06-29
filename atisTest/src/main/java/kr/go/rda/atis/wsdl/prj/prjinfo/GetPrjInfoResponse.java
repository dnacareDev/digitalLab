/**
 * GetPrjInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.go.rda.atis.wsdl.prj.prjinfo;

public class GetPrjInfoResponse  implements java.io.Serializable {
    private kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo getPrjInfoReturn;

    public GetPrjInfoResponse() {
    }

    public GetPrjInfoResponse(
           kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo getPrjInfoReturn) {
           this.getPrjInfoReturn = getPrjInfoReturn;
    }


    /**
     * Gets the getPrjInfoReturn value for this GetPrjInfoResponse.
     * 
     * @return getPrjInfoReturn
     */
    public kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo getGetPrjInfoReturn() {
        return getPrjInfoReturn;
    }


    /**
     * Sets the getPrjInfoReturn value for this GetPrjInfoResponse.
     * 
     * @param getPrjInfoReturn
     */
    public void setGetPrjInfoReturn(kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo getPrjInfoReturn) {
        this.getPrjInfoReturn = getPrjInfoReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPrjInfoResponse)) return false;
        GetPrjInfoResponse other = (GetPrjInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPrjInfoReturn==null && other.getGetPrjInfoReturn()==null) || 
             (this.getPrjInfoReturn!=null &&
              this.getPrjInfoReturn.equals(other.getGetPrjInfoReturn())));
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
        if (getGetPrjInfoReturn() != null) {
            _hashCode += getGetPrjInfoReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPrjInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", ">getPrjInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPrjInfoReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "getPrjInfoReturn"));
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
