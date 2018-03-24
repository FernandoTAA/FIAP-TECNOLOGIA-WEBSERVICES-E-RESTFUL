
package fiap.scj.ws.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "imc", namespace = "http://soap.ws.scj.fiap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imc", namespace = "http://soap.ws.scj.fiap/")
public class Imc {

    @XmlElement(name = "arg0", namespace = "")
    private fiap.scj.ws.soap.PessoaSaudeDTO arg0;

    /**
     * 
     * @return
     *     returns PessoaSaudeDTO
     */
    public fiap.scj.ws.soap.PessoaSaudeDTO getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(fiap.scj.ws.soap.PessoaSaudeDTO arg0) {
        this.arg0 = arg0;
    }

}
