//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.24 at 11:59:19 AM BRT 
//


package br.com.fiap.mba.scj.gerenciamento_filas;

import java.math.BigInteger;
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
 *         &lt;element name="idAtendimento" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="avaliacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idAtendimento",
    "servico",
    "avaliacao"
})
@XmlRootElement(name = "finalizarAtendimentoRequest")
public class FinalizarAtendimentoRequest {

    @XmlElement(required = true)
    protected BigInteger idAtendimento;
    @XmlElement(required = true)
    protected String servico;
    @XmlElement(required = true)
    protected String avaliacao;

    /**
     * Gets the value of the idAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdAtendimento() {
        return idAtendimento;
    }

    /**
     * Sets the value of the idAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdAtendimento(BigInteger value) {
        this.idAtendimento = value;
    }

    /**
     * Gets the value of the servico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServico() {
        return servico;
    }

    /**
     * Sets the value of the servico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServico(String value) {
        this.servico = value;
    }

    /**
     * Gets the value of the avaliacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvaliacao() {
        return avaliacao;
    }

    /**
     * Sets the value of the avaliacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvaliacao(String value) {
        this.avaliacao = value;
    }

}
