
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConversionEutoMad_QNAME = new QName("http://ws/", "conversionEutoMad");
    private static final QName _ConversionEutoMadResponse_QNAME = new QName("http://ws/", "conversionEutoMadResponse");
    private static final QName _GetConpte_QNAME = new QName("http://ws/", "getConpte");
    private static final QName _GetConpteResponse_QNAME = new QName("http://ws/", "getConpteResponse");
    private static final QName _ListComptes_QNAME = new QName("http://ws/", "listComptes");
    private static final QName _ListComptesResponse_QNAME = new QName("http://ws/", "listComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEutoMad }
     * 
     * @return
     *     the new instance of {@link ConversionEutoMad }
     */
    public ConversionEutoMad createConversionEutoMad() {
        return new ConversionEutoMad();
    }

    /**
     * Create an instance of {@link ConversionEutoMadResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEutoMadResponse }
     */
    public ConversionEutoMadResponse createConversionEutoMadResponse() {
        return new ConversionEutoMadResponse();
    }

    /**
     * Create an instance of {@link GetConpte }
     * 
     * @return
     *     the new instance of {@link GetConpte }
     */
    public GetConpte createGetConpte() {
        return new GetConpte();
    }

    /**
     * Create an instance of {@link GetConpteResponse }
     * 
     * @return
     *     the new instance of {@link GetConpteResponse }
     */
    public GetConpteResponse createGetConpteResponse() {
        return new GetConpteResponse();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     * @return
     *     the new instance of {@link ListComptes }
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListComptesResponse }
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEutoMad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEutoMad }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEutoMad")
    public JAXBElement<ConversionEutoMad> createConversionEutoMad(ConversionEutoMad value) {
        return new JAXBElement<>(_ConversionEutoMad_QNAME, ConversionEutoMad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEutoMadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEutoMadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEutoMadResponse")
    public JAXBElement<ConversionEutoMadResponse> createConversionEutoMadResponse(ConversionEutoMadResponse value) {
        return new JAXBElement<>(_ConversionEutoMadResponse_QNAME, ConversionEutoMadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConpte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConpte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getConpte")
    public JAXBElement<GetConpte> createGetConpte(GetConpte value) {
        return new JAXBElement<>(_GetConpte_QNAME, GetConpte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConpteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConpteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getConpteResponse")
    public JAXBElement<GetConpteResponse> createGetConpteResponse(GetConpteResponse value) {
        return new JAXBElement<>(_GetConpteResponse_QNAME, GetConpteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

}
