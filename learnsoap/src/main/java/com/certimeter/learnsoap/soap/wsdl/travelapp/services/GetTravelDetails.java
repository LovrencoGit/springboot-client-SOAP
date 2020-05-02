
package com.certimeter.learnsoap.soap.wsdl.travelapp.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.certimeter.learnsoap.soap.wsdl.travelapp.model.request.TravelDetailsRq;


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
 *         &lt;element name="travelsDetailsRequest" type="{http://request.model.travelapp.wspublic.alpi}TravelDetailsRq"/>
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
    "travelsDetailsRequest"
})
@XmlRootElement(name = "getTravelDetails")
public class GetTravelDetails {

    @XmlElement(required = true, nillable = true)
    protected TravelDetailsRq travelsDetailsRequest;

    /**
     * Recupera il valore della propriet� travelsDetailsRequest.
     * 
     * @return
     *     possible object is
     *     {@link TravelDetailsRq }
     *     
     */
    public TravelDetailsRq getTravelsDetailsRequest() {
        return travelsDetailsRequest;
    }

    /**
     * Imposta il valore della propriet� travelsDetailsRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDetailsRq }
     *     
     */
    public void setTravelsDetailsRequest(TravelDetailsRq value) {
        this.travelsDetailsRequest = value;
    }

}
