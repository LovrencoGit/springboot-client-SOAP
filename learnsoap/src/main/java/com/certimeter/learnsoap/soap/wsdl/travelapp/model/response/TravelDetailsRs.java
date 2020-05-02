
package com.certimeter.learnsoap.soap.wsdl.travelapp.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TravelDetailsRs complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TravelDetailsRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numPratica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totPax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="child" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codAdv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrAdv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="travelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aptDept" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aptArr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aptDeptDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aptArrDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hotelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hotelDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codVacanza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoHotel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codCeva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataOrdine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estrattoContoCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xmlPreventivo" type="{http://response.model.travelapp.wspublic.alpi}XmlPreventivoRs"/>
 *         &lt;element name="travelCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hotelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDetailsRs", propOrder = {
    "numPratica",
    "departureDate",
    "brand",
    "totPax",
    "child",
    "numDay",
    "codAdv",
    "descrAdv",
    "travelType",
    "description",
    "aptDept",
    "aptArr",
    "aptDeptDescription",
    "aptArrDescription",
    "hotelCode",
    "hotelDescription",
    "codVacanza",
    "tipoHotel",
    "codCeva",
    "dataOrdine",
    "estrattoContoCliente",
    "xmlPreventivo",
    "travelCategory",
    "hotelType"
})
public class TravelDetailsRs {

    @XmlElement(required = true, nillable = true)
    protected String numPratica;
    @XmlElement(required = true, nillable = true)
    protected String departureDate;
    @XmlElement(required = true, nillable = true)
    protected String brand;
    @XmlElement(required = true, nillable = true)
    protected String totPax;
    @XmlElement(required = true, nillable = true)
    protected String child;
    @XmlElement(required = true, nillable = true)
    protected String numDay;
    @XmlElement(required = true, nillable = true)
    protected String codAdv;
    @XmlElement(required = true, nillable = true)
    protected String descrAdv;
    @XmlElement(required = true, nillable = true)
    protected String travelType;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String aptDept;
    @XmlElement(required = true, nillable = true)
    protected String aptArr;
    @XmlElement(required = true, nillable = true)
    protected String aptDeptDescription;
    @XmlElement(required = true, nillable = true)
    protected String aptArrDescription;
    @XmlElement(required = true, nillable = true)
    protected String hotelCode;
    @XmlElement(required = true, nillable = true)
    protected String hotelDescription;
    @XmlElement(required = true, nillable = true)
    protected String codVacanza;
    @XmlElement(required = true, nillable = true)
    protected String tipoHotel;
    @XmlElement(required = true, nillable = true)
    protected String codCeva;
    @XmlElement(required = true, nillable = true)
    protected String dataOrdine;
    @XmlElement(required = true, nillable = true)
    protected String estrattoContoCliente;
    @XmlElement(required = true, nillable = true)
    protected XmlPreventivoRs xmlPreventivo;
    @XmlElement(required = true, nillable = true)
    protected String travelCategory;
    @XmlElement(required = true, nillable = true)
    protected String hotelType;

    /**
     * Recupera il valore della propriet� numPratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPratica() {
        return numPratica;
    }

    /**
     * Imposta il valore della propriet� numPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPratica(String value) {
        this.numPratica = value;
    }

    /**
     * Recupera il valore della propriet� departureDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Imposta il valore della propriet� departureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Recupera il valore della propriet� brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Imposta il valore della propriet� brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Recupera il valore della propriet� totPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotPax() {
        return totPax;
    }

    /**
     * Imposta il valore della propriet� totPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotPax(String value) {
        this.totPax = value;
    }

    /**
     * Recupera il valore della propriet� child.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChild() {
        return child;
    }

    /**
     * Imposta il valore della propriet� child.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChild(String value) {
        this.child = value;
    }

    /**
     * Recupera il valore della propriet� numDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDay() {
        return numDay;
    }

    /**
     * Imposta il valore della propriet� numDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDay(String value) {
        this.numDay = value;
    }

    /**
     * Recupera il valore della propriet� codAdv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAdv() {
        return codAdv;
    }

    /**
     * Imposta il valore della propriet� codAdv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAdv(String value) {
        this.codAdv = value;
    }

    /**
     * Recupera il valore della propriet� descrAdv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrAdv() {
        return descrAdv;
    }

    /**
     * Imposta il valore della propriet� descrAdv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrAdv(String value) {
        this.descrAdv = value;
    }

    /**
     * Recupera il valore della propriet� travelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelType() {
        return travelType;
    }

    /**
     * Imposta il valore della propriet� travelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelType(String value) {
        this.travelType = value;
    }

    /**
     * Recupera il valore della propriet� description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della propriet� description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della propriet� aptDept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAptDept() {
        return aptDept;
    }

    /**
     * Imposta il valore della propriet� aptDept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAptDept(String value) {
        this.aptDept = value;
    }

    /**
     * Recupera il valore della propriet� aptArr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAptArr() {
        return aptArr;
    }

    /**
     * Imposta il valore della propriet� aptArr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAptArr(String value) {
        this.aptArr = value;
    }

    /**
     * Recupera il valore della propriet� aptDeptDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAptDeptDescription() {
        return aptDeptDescription;
    }

    /**
     * Imposta il valore della propriet� aptDeptDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAptDeptDescription(String value) {
        this.aptDeptDescription = value;
    }

    /**
     * Recupera il valore della propriet� aptArrDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAptArrDescription() {
        return aptArrDescription;
    }

    /**
     * Imposta il valore della propriet� aptArrDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAptArrDescription(String value) {
        this.aptArrDescription = value;
    }

    /**
     * Recupera il valore della propriet� hotelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Imposta il valore della propriet� hotelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Recupera il valore della propriet� hotelDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelDescription() {
        return hotelDescription;
    }

    /**
     * Imposta il valore della propriet� hotelDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelDescription(String value) {
        this.hotelDescription = value;
    }

    /**
     * Recupera il valore della propriet� codVacanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVacanza() {
        return codVacanza;
    }

    /**
     * Imposta il valore della propriet� codVacanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVacanza(String value) {
        this.codVacanza = value;
    }

    /**
     * Recupera il valore della propriet� tipoHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoHotel() {
        return tipoHotel;
    }

    /**
     * Imposta il valore della propriet� tipoHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoHotel(String value) {
        this.tipoHotel = value;
    }

    /**
     * Recupera il valore della propriet� codCeva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCeva() {
        return codCeva;
    }

    /**
     * Imposta il valore della propriet� codCeva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCeva(String value) {
        this.codCeva = value;
    }

    /**
     * Recupera il valore della propriet� dataOrdine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOrdine() {
        return dataOrdine;
    }

    /**
     * Imposta il valore della propriet� dataOrdine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOrdine(String value) {
        this.dataOrdine = value;
    }

    /**
     * Recupera il valore della propriet� estrattoContoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstrattoContoCliente() {
        return estrattoContoCliente;
    }

    /**
     * Imposta il valore della propriet� estrattoContoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstrattoContoCliente(String value) {
        this.estrattoContoCliente = value;
    }

    /**
     * Recupera il valore della propriet� xmlPreventivo.
     * 
     * @return
     *     possible object is
     *     {@link XmlPreventivoRs }
     *     
     */
    public XmlPreventivoRs getXmlPreventivo() {
        return xmlPreventivo;
    }

    /**
     * Imposta il valore della propriet� xmlPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPreventivoRs }
     *     
     */
    public void setXmlPreventivo(XmlPreventivoRs value) {
        this.xmlPreventivo = value;
    }

    /**
     * Recupera il valore della propriet� travelCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelCategory() {
        return travelCategory;
    }

    /**
     * Imposta il valore della propriet� travelCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelCategory(String value) {
        this.travelCategory = value;
    }

    /**
     * Recupera il valore della propriet� hotelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelType() {
        return hotelType;
    }

    /**
     * Imposta il valore della propriet� hotelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelType(String value) {
        this.hotelType = value;
    }

}
