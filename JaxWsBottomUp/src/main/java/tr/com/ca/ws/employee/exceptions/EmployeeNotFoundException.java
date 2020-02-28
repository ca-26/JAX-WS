package tr.com.ca.ws.employee.exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.ws.WebFault;

@WebFault(name="EmployeeNotFound")
@XmlAccessorType(XmlAccessType.FIELD)
//public class EmployeeNotFoundException extends RuntimeException {
//    /**
//      * We only define the fault details here. Additionally each fault has a message
//      * that should not be defined separately
//      */
//    String employeeName;
//}

public class EmployeeNotFoundException extends Exception {

	private static final long serialVersionUID = 8375036888297109753L;

	public EmployeeNotFoundException() {
        super("Employee not found.");
    }
    
}