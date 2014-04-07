
package simple.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.xmlsoap.ping.ObjectFactory;
import org.xmlsoap.ping.Ping;
import org.xmlsoap.ping.PingResponseBody;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IPingService", targetNamespace = "http://xmlsoap.org/Ping")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IPingService {


    /**
     * 
     * @param ping
     * @return
     *     returns org.xmlsoap.ping.PingResponseBody
     */
    @WebMethod(operationName = "Ping", action = "http://xmlsoap.org/Ping")
    @WebResult(name = "PingResponse", targetNamespace = "http://xmlsoap.org/Ping", partName = "PingResponse")
    public PingResponseBody ping(
        @WebParam(name = "Ping", targetNamespace = "http://xmlsoap.org/Ping", partName = "Ping")
        Ping ping);

}