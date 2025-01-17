
package org.onvif.ver10.advancedsecurity.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasPrivateKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hasPrivateKey"
})
@XmlRootElement(name = "GetPrivateKeyStatusResponse")
public class GetPrivateKeyStatusResponse {

    protected boolean hasPrivateKey;

    /**
     * Gets the value of the hasPrivateKey property.
     * 
     */
    public boolean isHasPrivateKey() {
        return hasPrivateKey;
    }

    /**
     * Sets the value of the hasPrivateKey property.
     * 
     */
    public void setHasPrivateKey(boolean value) {
        this.hasPrivateKey = value;
    }

}
