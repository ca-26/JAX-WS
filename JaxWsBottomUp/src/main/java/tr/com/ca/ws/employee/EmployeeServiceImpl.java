package tr.com.ca.ws.employee;

import java.util.List;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

import org.ca.data.Employee;
import org.ca.data.EmployeeRepository;
import org.ca.data.EmployeeRequest;
import org.ca.data.Status;

import tr.com.ca.ws.employee.exceptions.EmployeeAlreadyExistsException;
import tr.com.ca.ws.employee.exceptions.EmployeeNotFoundException;

//import com.sun.xml.ws.developer.SchemaValidation;
//import org.apache.cxf.annotations.SchemaValidation;

//XXXX OK XXXXXXXXXXXXXXXXXXXXXXXXXXX
//@WebService(endpointInterface = "tr.com.ca.ws.employee.EmployeeService")
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

//@WebService(
//	    portName = "EmployeeServicePort",
//	    serviceName = "EmployeeService",
//	    targetNamespace = "http://ca.ws.com.tr",
//	    endpointInterface = "tr.com.ca.ws.employee.EmployeeService")

@WebService(name="Employee", serviceName = "EmployeeService", endpointInterface = "tr.com.ca.ws.employee.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
  
//    @Inject
//    private EmployeeRepository employeeRepositoryImpl;
    private EmployeeRepository employeeRepositoryImpl = new EmployeeRepository();

	//@WebMethod(exclude=true) // Marks a method to NOT be exposed as a web method. 
							   // Used to stop an inherited method from being exposed as part of this web service. 


    public Employee[] getEmployees() {
    	if ( employeeRepositoryImpl.getEmployees() == null || employeeRepositoryImpl.getEmployees().isEmpty() ) {
    		return new Employee[0]; }
    	else {
            return employeeRepositoryImpl.getEmployees().toArray(new Employee[employeeRepositoryImpl.getEmployees().size()]); }
    }

//	if (  ) {
//		
//	}
//	  SOAPFactory factory = SOAPFactory.newInstance();
//      SOAPFault fault = factory.createFault("New Error", new QName("http://uniba.de/dsg/soa/", "CustomFault"));
//      throw new SOAPFaultException(fault);
//	
    
//To customize the fault code : https://stackoverflow.com/questions/13596260/how-to-throw-a-custom-fault-on-a-jax-ws-web-service 
//    import javax.xml.soap.SOAPFactory;
//    import javax.xml.soap.SOAPFault;
//    import javax.xml.ws.soap.SOAPFaultException;
//    import javax.xml.namespace.QName;
//    ...
//
//    SOAPFactory soapFactory = SOAPFactory.newInstance();
//    SOAPFault soapFault = soapFactory.createFault(
//            "Your custom message", 
//             new QName("http://schemas.xmlsoap.org/soap/envelope/", "Client")); 
//    throw new SOAPFaultException(soapFault);

    public Employee getEmployee(int id) throws EmployeeNotFoundException {
    	Employee employee = employeeRepositoryImpl.getEmployee(id);
    	if ( employee != null )
            return employee;
    	else// Runtime exception
    		throw new EmployeeNotFoundException();
    }
    
    public Employee[] findEmployees(EmployeeRequest employeeRequest) throws SOAPException {
    	if ( employeeRequest != null ) {
    		if ( employeeRequest.getName() == null || employeeRequest.getName().trim().isEmpty() ) {
        		throw createSOAPFaultException("Client", "Invalid Parameter : EmployeeRequest : Name field cannot be null!");
    		}
    		List<Employee> result = employeeRepositoryImpl.findEmployees(employeeRequest);
            return result.toArray(new Employee[result.size()]);
    	}
    	else {
    		throw createSOAPFaultException("Client", "Invalid Parameter : EmployeeRequest cannot be null!");
    	}
    }
 
    public boolean updateEmployee(int id, String name, Status status) throws EmployeeNotFoundException {
    	if ( employeeRepositoryImpl.getEmployee(id) != null ) {
    		employeeRepositoryImpl.updateEmployee(id, name, status);
    		return true;
    	}
    	else {
    		throw new EmployeeNotFoundException(); }
    }
 
    public boolean deleteEmployee(int id) throws EmployeeNotFoundException {
        if ( employeeRepositoryImpl.getEmployee(id) != null ) {
    		employeeRepositoryImpl.deleteEmployee(id);
    		return true;
    	}
    	else {
    		throw new EmployeeNotFoundException(); }
    }
 
    public boolean addEmployee(String name) throws EmployeeAlreadyExistsException {
    	if ( employeeRepositoryImpl.getEmployeeByName(name) == null ) {
    		employeeRepositoryImpl.addEmployee(name, Status.ACTIVE);
    		return true;
    	}
    	else {
    		throw new EmployeeAlreadyExistsException(); }
    }
    
    /**
     * @param faultCode : Client / Server
     * @param faultString
     * @return
     * @throws SOAPException 
     */
    private SOAPFaultException createSOAPFaultException(String faultCode, String faultString) throws SOAPException {
	    SOAPFactory soapFactory = SOAPFactory.newInstance();
	    SOAPFault soapFault = soapFactory.createFault(faultString, new QName("http://schemas.xmlsoap.org/soap/envelope/", faultCode)); 
	    return new SOAPFaultException(soapFault);
    }
 
}