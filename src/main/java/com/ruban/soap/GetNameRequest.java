
package com.ruban.soap;

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
 *         &lt;element name="name_project" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nameProject"
})
@XmlRootElement(name = "getNameRequest", namespace = "http://ruban.com/soap")
public class GetNameRequest {

    @XmlElement(name = "name_project", namespace = "http://ruban.com/soap", required = true)
    protected String nameProject;

    /**
     * Gets the value of the nameProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProject() {
        return nameProject;
    }

    /**
     * Sets the value of the nameProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProject(String value) {
        this.nameProject = value;
    }

}
