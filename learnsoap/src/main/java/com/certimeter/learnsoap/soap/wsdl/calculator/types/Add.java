
package com.certimeter.learnsoap.soap.wsdl.calculator.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "intA",
    "intB"
})
@XmlRootElement(name = "Add")
public class Add {

    protected int intA;
    protected int intB;

    /**
     * Recupera il valore della propriet� intA.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Imposta il valore della propriet� intA.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Recupera il valore della propriet� intB.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Imposta il valore della propriet� intB.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}
