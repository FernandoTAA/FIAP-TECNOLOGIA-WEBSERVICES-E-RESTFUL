
package fiap.scj.ws.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultadoImcDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultadoImcDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuidados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoImcDTO", propOrder = {
    "cuidados",
    "imc",
    "situacao"
})
public class ResultadoImcDTO {

    protected String cuidados;
    protected Double imc;
    protected String situacao;

    /**
     * Gets the value of the cuidados property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuidados() {
        return cuidados;
    }

    /**
     * Sets the value of the cuidados property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuidados(String value) {
        this.cuidados = value;
    }

    /**
     * Gets the value of the imc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImc() {
        return imc;
    }

    /**
     * Sets the value of the imc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImc(Double value) {
        this.imc = value;
    }

    /**
     * Gets the value of the situacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacao(String value) {
        this.situacao = value;
    }

}
