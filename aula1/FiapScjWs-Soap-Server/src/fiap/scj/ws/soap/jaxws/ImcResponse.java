
package fiap.scj.ws.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "imcResponse", namespace = "http://soap.ws.scj.fiap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imcResponse", namespace = "http://soap.ws.scj.fiap/")
public class ImcResponse {

    @XmlElement(name = "return", namespace = "")
    private fiap.scj.ws.soap.ResultadoImcDTO _return;

    /**
     * 
     * @return
     *     returns ResultadoImcDTO
     */
    public fiap.scj.ws.soap.ResultadoImcDTO getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(fiap.scj.ws.soap.ResultadoImcDTO _return) {
        this._return = _return;
    }

}
