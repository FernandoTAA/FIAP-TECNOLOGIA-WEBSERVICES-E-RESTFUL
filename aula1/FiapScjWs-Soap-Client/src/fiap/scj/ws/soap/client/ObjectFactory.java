
package fiap.scj.ws.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fiap.scj.ws.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Imc_QNAME = new QName("http://soap.ws.scj.fiap/", "imc");
    private final static QName _CalculaImc_QNAME = new QName("http://soap.ws.scj.fiap/", "calculaImc");
    private final static QName _CalculaImcResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "calculaImcResponse");
    private final static QName _ImcResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "imcResponse");
    private final static QName _SituacaoImc_QNAME = new QName("http://soap.ws.scj.fiap/", "situacaoImc");
    private final static QName _SituacaoImcResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "situacaoImcResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fiap.scj.ws.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SituacaoImcResponse }
     * 
     */
    public SituacaoImcResponse createSituacaoImcResponse() {
        return new SituacaoImcResponse();
    }

    /**
     * Create an instance of {@link SituacaoImc }
     * 
     */
    public SituacaoImc createSituacaoImc() {
        return new SituacaoImc();
    }

    /**
     * Create an instance of {@link CalculaImc }
     * 
     */
    public CalculaImc createCalculaImc() {
        return new CalculaImc();
    }

    /**
     * Create an instance of {@link CalculaImcResponse }
     * 
     */
    public CalculaImcResponse createCalculaImcResponse() {
        return new CalculaImcResponse();
    }

    /**
     * Create an instance of {@link ImcResponse }
     * 
     */
    public ImcResponse createImcResponse() {
        return new ImcResponse();
    }

    /**
     * Create an instance of {@link Imc }
     * 
     */
    public Imc createImc() {
        return new Imc();
    }

    /**
     * Create an instance of {@link PessoaSaudeDTO }
     * 
     */
    public PessoaSaudeDTO createPessoaSaudeDTO() {
        return new PessoaSaudeDTO();
    }

    /**
     * Create an instance of {@link ResultadoImcDTO }
     * 
     */
    public ResultadoImcDTO createResultadoImcDTO() {
        return new ResultadoImcDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "imc")
    public JAXBElement<Imc> createImc(Imc value) {
        return new JAXBElement<Imc>(_Imc_QNAME, Imc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaImc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "calculaImc")
    public JAXBElement<CalculaImc> createCalculaImc(CalculaImc value) {
        return new JAXBElement<CalculaImc>(_CalculaImc_QNAME, CalculaImc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "calculaImcResponse")
    public JAXBElement<CalculaImcResponse> createCalculaImcResponse(CalculaImcResponse value) {
        return new JAXBElement<CalculaImcResponse>(_CalculaImcResponse_QNAME, CalculaImcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "imcResponse")
    public JAXBElement<ImcResponse> createImcResponse(ImcResponse value) {
        return new JAXBElement<ImcResponse>(_ImcResponse_QNAME, ImcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituacaoImc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "situacaoImc")
    public JAXBElement<SituacaoImc> createSituacaoImc(SituacaoImc value) {
        return new JAXBElement<SituacaoImc>(_SituacaoImc_QNAME, SituacaoImc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituacaoImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "situacaoImcResponse")
    public JAXBElement<SituacaoImcResponse> createSituacaoImcResponse(SituacaoImcResponse value) {
        return new JAXBElement<SituacaoImcResponse>(_SituacaoImcResponse_QNAME, SituacaoImcResponse.class, null, value);
    }

}
