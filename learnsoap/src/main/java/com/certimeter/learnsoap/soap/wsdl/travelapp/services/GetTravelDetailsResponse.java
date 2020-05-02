
package com.certimeter.learnsoap.soap.wsdl.travelapp.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.certimeter.learnsoap.soap.wsdl.travelapp.model.response.TravelDetailsRs;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTravelDetailsReturn" type="{http://response.model.travelapp.wspublic.alpi}TravelDetailsRs"/>
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
    "getTravelDetailsReturn"
})
@XmlRootElement(name = "getTravelDetailsResponse")
public class GetTravelDetailsResponse {

    @XmlElement(required = true, nillable = true)
    protected TravelDetailsRs getTravelDetailsReturn;

    /**
     * Recupera il valore della propriet� getTravelDetailsReturn.
     * 
     * @return
     *     possible object is
     *     {@link TravelDetailsRs }
     *     
     */
    public TravelDetailsRs getGetTravelDetailsReturn() {
        return getTravelDetailsReturn;
    }

    /**
     * Imposta il valore della propriet� getTravelDetailsReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDetailsRs }
     *     
     */
    public void setGetTravelDetailsReturn(TravelDetailsRs value) {
        this.getTravelDetailsReturn = value;
    }

}
