
package tr.com.ca.ws.employee;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2020-01-12T21:24:53.667+03:00
 * Generated source version: 3.3.4
 *
 */
public final class EmployeeService_EmployeePort_Client {

    private static final QName SERVICE_NAME = new QName("http://employee.ws.ca.com.tr/", "EmployeeService");

    private EmployeeService_EmployeePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EmployeeService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        EmployeeService_Service ss = new EmployeeService_Service(wsdlURL, SERVICE_NAME);
        EmployeeService port = ss.getEmployeePort();

        {
        System.out.println("Invoking updateEmployee...");
        int _updateEmployee_ıd = 0;
        java.lang.String _updateEmployee_name = "";
        tr.com.ca.ws.employee.Status _updateEmployee_status = null;
        try {
            boolean _updateEmployee__return = port.updateEmployee(_updateEmployee_ıd, _updateEmployee_name, _updateEmployee_status);
            System.out.println("updateEmployee.result=" + _updateEmployee__return);

        } catch (EmployeeNotFoundException_Exception e) {
            System.out.println("Expected exception: EmployeeNotFoundException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getEmployees...");
        java.util.List<tr.com.ca.ws.employee.Employee> _getEmployees__return = port.getEmployees();
        System.out.println("getEmployees.result=" + _getEmployees__return);


        }
        {
        System.out.println("Invoking getEmployee...");
        int _getEmployee_ıd = 0;
        try {
            tr.com.ca.ws.employee.Employee _getEmployee__return = port.getEmployee(_getEmployee_ıd);
            System.out.println("getEmployee.result=" + _getEmployee__return);

        } catch (EmployeeNotFoundException_Exception e) {
            System.out.println("Expected exception: EmployeeNotFoundException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking deleteEmployee...");
        int _deleteEmployee_ıd = 0;
        try {
            boolean _deleteEmployee__return = port.deleteEmployee(_deleteEmployee_ıd);
            System.out.println("deleteEmployee.result=" + _deleteEmployee__return);

        } catch (EmployeeNotFoundException_Exception e) {
            System.out.println("Expected exception: EmployeeNotFoundException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findEmployees...");
        tr.com.ca.ws.employee.EmployeeRequest _findEmployees_employeeRequest = null;
        try {
            java.util.List<tr.com.ca.ws.employee.Employee> _findEmployees__return = port.findEmployees(_findEmployees_employeeRequest);
            System.out.println("findEmployees.result=" + _findEmployees__return);

        } catch (SOAPException_Exception e) {
            System.out.println("Expected exception: SOAPException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking addEmployee...");
        java.lang.String _addEmployee_name = "";
        try {
            boolean _addEmployee__return = port.addEmployee(_addEmployee_name);
            System.out.println("addEmployee.result=" + _addEmployee__return);

        } catch (EmployeeAlreadyExistsException_Exception e) {
            System.out.println("Expected exception: EmployeeAlreadyExistsException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}
