
package com.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rpmMathexpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rpmMathexpression"
})
@XmlRootElement(name = "evaluate")
public class Evaluate {

    @XmlElement(required = true)
    protected String rpmMathexpression;

    /**
     * Gets the value of the rpmMathexpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpmMathexpression() {
        return rpmMathexpression;
    }

    /**
     * Sets the value of the rpmMathexpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpmMathexpression(String value) {
        this.rpmMathexpression = value;
    }

}
