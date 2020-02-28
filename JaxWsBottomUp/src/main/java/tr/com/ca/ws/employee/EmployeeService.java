package tr.com.ca.ws.employee;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.soap.SOAPException;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;
import org.ca.data.Employee;
import org.ca.data.EmployeeRequest;
import org.ca.data.Status;

import tr.com.ca.ws.employee.exceptions.EmployeeAlreadyExistsException;
import tr.com.ca.ws.employee.exceptions.EmployeeNotFoundException;

//XXXX OK XXXXXXXXXXXXXXXXXXXXXXXXXXX
//@WebService
//@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

//@WebService(name = "EmployeeService", 
//		targetNamespace = "http://webservice.com.tr", 
//		wsdlLocation = "http://webservice.com.tr/webservice/EmployeeService?wsdl")

// If pre-existing WSDL file
//@WebService(name = "EmployeeService", 
//			targetNamespace = "http://webservice.com.tr", 
//			wsdlLocation = "WEB-INF/wsdl/EmployeeService?wsdl")

@WebService
//@WebContext(contextRoot="/TestService")  

//@SOAPBinding(style=Style.RPC, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
//@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)

//@WebService(name = "EmployeeService",
//			targetNamespace = "http://webservice.com.tr")
//@SOAPBinding(style= Style.DOCUMENT, parameterStyle = ParameterStyle.WRAPPED)
//@SOAPBinding(style=Style.RPC, use=Use.LITERAL)

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// https://javajee.com/soap-binding-style-encoding-and-wrapping
//The JAX-WS 2.0 RI support only below styles:
//    Document/Literal (Both Wrapped and Unwrapped (BARE))
//    RPC/Literal (Only Wrapped)

/// IMPORTANT : https://javajee.com/soap-binding-style-encoding-and-wrapping

//SOAPBinding Defaults :
//	(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)

// Style :
//   RPC      : Operations that take primitive data types like integer, string etc 
//              WSDL short and simple (no types section), but SOAP Boady cannot be validated, but Simpler for developper as it uses the service method names in soap body.
//   DOCUMENT : SOAP message can be validated (XSD: using type section), can use rich data types.
// Use :
//   LITERAL : The service's type definitions literally follow the WSDL documents XML Schema.
//   ENCODED : No longer used. (RPC/encoded was used before SOAP objects were defined with XML Schema)
// ParameterStyle :
//   WRAPPED : The method parameters are wrapped/enclosed in the SOAP message by the operation/method name in the WSDL - not in the Java code.
//             Give a document-style service the look and feel of an rpc-style service, thus trying to combine the benefits of document and rpc styles.
//             The body of a wrapped SOAP request envelope will have name of the requested service operation with sub-elements as in the rpc style. The wrapped version makes service operation explicit.
//   BARE (UNWRAPPED) :
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
@XmlSeeAlso({ Employee.class })

////XXXXXXXXXXXXXX SCHEMA VALIDATION XXXXXXXXXXXXXXXXXXXXXXXXX
// https://cxf.apache.org/docs/annotations.html
// Turns on SchemaValidation for messages. By default, for performance reasons, CXF does not validate message against the schema.
// By turning on validation, problems with messages not matching the schema are easier to determine.   
// These annotations can be applied globally to the SEI, but also can be applied at method level in both the SEI and Implementation.
@SchemaValidation(type = SchemaValidationType.BOTH)
//@InFaultInterceptors(classes = SchemaValidationErrorInterceptor.class)
//@OutFaultInterceptors(classes = SchemaValidationErrorInterceptor.class)
@HandlerChain(file = "/com/tr/webservice/SoapHandlers.xml")

//@SchemaValidation
// @SchemaValidation : This annotation validates incoming and outgoing SOAP messages against the relevant schema in the endpoint wsdl contract
//@SchemaValidation(type = SchemaValidation.SchemaValidationType.IN)
//@InFaultInterceptors(classes = SchemaValidationErrorInterceptor.class)
//@OutFaultInterceptors(classes = SchemaValidationErrorInterceptor.class)

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
////Enable Logs - KO
//@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
//@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
//@InFaultInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
//@OutFaultInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
//@Logging(pretty = true)
//@Logging(limit=16000, inLocation="<stdout>")

//Enables GZIP compression of on-the-wire data
//@GZIP

// Adds a property to an endpoint. Many things such as WS-Security related things and such can be configured via endpoint properties. 
// Traditionally, these would be set via the <jaxws:properties> element on the <jaxws:endpoint> element in the spring config, 
// but these annotations allow these properties to be configured into the code.
//@EndpointProperties(
//    { @EndpointProperty(key = "my.property", value="some value"),
//      @EndpointProperty(key = "my.other.property", value="some other value"),
//    })
public interface EmployeeService {

//	@WebMethod(
//		      action = "http://topdown.server.jaxws.baeldung.com/"
//		      + "EmployeeServiceTopDown/countEmployees")
//    @WebResult(
//      name = "countEmployeesResponse", 
//      targetNamespace = "http://topdown.server.jaxws.baeldung.com/", 
//      partName = "parameters")

//	@WebMethod(operationName="getEmployees")
//	@RequestWrapper( targetNamespace="http://webservice.com.tr/ws/types", className="java.lang.String")
//	@ResponseWrapper(targetNamespace="http://webservice.com.tr/ws/types", className="com.tr.webservice.Employee")
//	@WebResult(      targetNamespace="http://webservice.com.tr/ws/types", name="EmployeeResult")
//	@Action(input = "http://soapCl.test/WsSessionEJBEndPoint/getServerTimePropertiesRequest", output = "http://soapCl.test/WsSessionEJBEndPoint/getServerTimePropertiesResponse")

//  @WebMethod(action = "http://webservice.com.tr/" + "EmployeeService/getEmployee")
//  	    @WebResult( name = "getEmployeesResponse",
//			    	    partName = "parameters")
	
	//@WebMethod(operationName="getEmployees")
	//@ResponseWrapper(className="com.tr.webservice.Employee")
	@WebMethod
	@WebResult(name="employee")
    Employee[] getEmployees();
    
//	 throws SOAPFaultException, SOAPException;
	
//    @NotNull @Pattern(regexp = "\\d+") @FormParam("id") String id,
//    @NotNull @Size(min = 1, max = 50) @FormParam("name") String name) {
	 
//    @SchemaValidation(type = SchemaValidationType.NONE)
//    @SchemaValidation(type = SchemaValidationType.IN)
//    @SchemaValidation(type = SchemaValidationType.OUT)
//    @SchemaValidation(type = SchemaValidationType.REQUEST)
//    @SchemaValidation(type = SchemaValidationType.RESPONSE)
    @WebMethod
    @WebResult(name="employee")
//    @SchemaValidation(type = SchemaValidationType.IN)
//    @HandlerChain(file = "/com/tr/webservice/SoapHandlers.xml")
//    Employee getEmployee(@NotNull @WebParam(name="id") @XmlElement(required=true, nillable=false) int id) throws EmployeeNotFoundException;
    Employee getEmployee(@WebParam(name="id") @XmlElement(required=true, nillable=false) int id) throws EmployeeNotFoundException;
//    Employee getEmployee(@WebParam(name="id") @XmlElement(required=true, nillable=false) int id) throws SOAPFaultException, SOAPException;
 

//@WebParam(name = "result", mode = WebParam.Mode.INOUT, partName = "result")
    
    @WebMethod
    @WebResult(name="employee")
    Employee[] findEmployees(@WebParam(name="employeeRequest") @XmlElement(required=true, nillable=false) EmployeeRequest employeeRequest) throws SOAPException;

    @WebMethod
    @WebResult(name="result")
    boolean updateEmployee(@WebParam(name="id") 	@XmlElement(required=true, nillable=false) int id,
				    	   @WebParam(name="name")	@XmlElement(required=true, nillable=false) String name,
				    	   @WebParam(name="status") @XmlElement(required=true, nillable=false) Status status) throws EmployeeNotFoundException;

    @WebMethod
    @WebResult(name="result")
    boolean  deleteEmployee(@WebParam(name="id") @XmlElement(required=true, nillable=false) int id) throws EmployeeNotFoundException;
 
    //throws SOAPFaultException, SOAPException;
    @WebMethod
    @WebResult(name="result")
    boolean addEmployee(@WebParam(name="name") @XmlElement(required=true, nillable=false) String name) throws EmployeeAlreadyExistsException;
 
}