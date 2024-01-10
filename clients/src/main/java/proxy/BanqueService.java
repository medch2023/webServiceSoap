
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws/", className = "proxy.ListComptesResponse")
    @Action(input = "http://ws/BanqueService/listComptesRequest", output = "http://ws/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getConpte", targetNamespace = "http://ws/", className = "proxy.GetConpte")
    @ResponseWrapper(localName = "getConpteResponse", targetNamespace = "http://ws/", className = "proxy.GetConpteResponse")
    @Action(input = "http://ws/BanqueService/getConpteRequest", output = "http://ws/BanqueService/getConpteResponse")
    public Compte getConpte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEutoMad", targetNamespace = "http://ws/", className = "proxy.ConversionEutoMad")
    @ResponseWrapper(localName = "conversionEutoMadResponse", targetNamespace = "http://ws/", className = "proxy.ConversionEutoMadResponse")
    @Action(input = "http://ws/BanqueService/conversionEutoMadRequest", output = "http://ws/BanqueService/conversionEutoMadResponse")
    public double conversionEutoMad(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}
