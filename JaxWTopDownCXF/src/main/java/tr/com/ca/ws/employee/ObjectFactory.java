
package tr.com.ca.ws.employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.com.ca.ws.employee package. 
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

    private final static QName _EmployeeAlreadyExists_QNAME = new QName("http://employee.ws.ca.com.tr/", "EmployeeAlreadyExists");
    private final static QName _EmployeeNotFound_QNAME = new QName("http://employee.ws.ca.com.tr/", "EmployeeNotFound");
    private final static QName _EmployeeRequest_QNAME = new QName("http://employee.ws.ca.com.tr/", "EmployeeRequest");
    private final static QName _SOAPException_QNAME = new QName("http://employee.ws.ca.com.tr/", "SOAPException");
    private final static QName _AddEmployee_QNAME = new QName("http://employee.ws.ca.com.tr/", "addEmployee");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://employee.ws.ca.com.tr/", "addEmployeeResponse");
    private final static QName _DeleteEmployee_QNAME = new QName("http://employee.ws.ca.com.tr/", "deleteEmployee");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://employee.ws.ca.com.tr/", "deleteEmployeeResponse");
    private final static QName _Employee_QNAME = new QName("http://employee.ws.ca.com.tr/", "employee");
    private final static QName _FindEmployees_QNAME = new QName("http://employee.ws.ca.com.tr/", "findEmployees");
    private final static QName _FindEmployeesResponse_QNAME = new QName("http://employee.ws.ca.com.tr/", "findEmployeesResponse");
    private final static QName _GetEmployee_QNAME = new QName("http://employee.ws.ca.com.tr/", "getEmployee");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://employee.ws.ca.com.tr/", "getEmployeeResponse");
    private final static QName _GetEmployees_QNAME = new QName("http://employee.ws.ca.com.tr/", "getEmployees");
    private final static QName _GetEmployeesResponse_QNAME = new QName("http://employee.ws.ca.com.tr/", "getEmployeesResponse");
    private final static QName _UpdateEmployee_QNAME = new QName("http://employee.ws.ca.com.tr/", "updateEmployee");
    private final static QName _UpdateEmployeeResponse_QNAME = new QName("http://employee.ws.ca.com.tr/", "updateEmployeeResponse");
    private final static QName _EmployeeRequestId_QNAME = new QName("", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.com.ca.ws.employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeAlreadyExistsException }
     * 
     */
    public EmployeeAlreadyExistsException createEmployeeAlreadyExistsException() {
        return new EmployeeAlreadyExistsException();
    }

    /**
     * Create an instance of {@link EmployeeNotFoundException }
     * 
     */
    public EmployeeNotFoundException createEmployeeNotFoundException() {
        return new EmployeeNotFoundException();
    }

    /**
     * Create an instance of {@link EmployeeRequest }
     * 
     */
    public EmployeeRequest createEmployeeRequest() {
        return new EmployeeRequest();
    }

    /**
     * Create an instance of {@link SOAPException }
     * 
     */
    public SOAPException createSOAPException() {
        return new SOAPException();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link FindEmployees }
     * 
     */
    public FindEmployees createFindEmployees() {
        return new FindEmployees();
    }

    /**
     * Create an instance of {@link FindEmployeesResponse }
     * 
     */
    public FindEmployeesResponse createFindEmployeesResponse() {
        return new FindEmployeesResponse();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployees }
     * 
     */
    public GetEmployees createGetEmployees() {
        return new GetEmployees();
    }

    /**
     * Create an instance of {@link GetEmployeesResponse }
     * 
     */
    public GetEmployeesResponse createGetEmployeesResponse() {
        return new GetEmployeesResponse();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link UpdateEmployeeResponse }
     * 
     */
    public UpdateEmployeeResponse createUpdateEmployeeResponse() {
        return new UpdateEmployeeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeAlreadyExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeAlreadyExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "EmployeeAlreadyExists")
    public JAXBElement<EmployeeAlreadyExistsException> createEmployeeAlreadyExists(EmployeeAlreadyExistsException value) {
        return new JAXBElement<EmployeeAlreadyExistsException>(_EmployeeAlreadyExists_QNAME, EmployeeAlreadyExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "EmployeeNotFound")
    public JAXBElement<EmployeeNotFoundException> createEmployeeNotFound(EmployeeNotFoundException value) {
        return new JAXBElement<EmployeeNotFoundException>(_EmployeeNotFound_QNAME, EmployeeNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "EmployeeRequest")
    public JAXBElement<EmployeeRequest> createEmployeeRequest(EmployeeRequest value) {
        return new JAXBElement<EmployeeRequest>(_EmployeeRequest_QNAME, EmployeeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SOAPException }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "SOAPException")
    public JAXBElement<SOAPException> createSOAPException(SOAPException value) {
        return new JAXBElement<SOAPException>(_SOAPException_QNAME, SOAPException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "addEmployeeResponse")
    public JAXBElement<AddEmployeeResponse> createAddEmployeeResponse(AddEmployeeResponse value) {
        return new JAXBElement<AddEmployeeResponse>(_AddEmployeeResponse_QNAME, AddEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployees }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindEmployees }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "findEmployees")
    public JAXBElement<FindEmployees> createFindEmployees(FindEmployees value) {
        return new JAXBElement<FindEmployees>(_FindEmployees_QNAME, FindEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindEmployeesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "findEmployeesResponse")
    public JAXBElement<FindEmployeesResponse> createFindEmployeesResponse(FindEmployeesResponse value) {
        return new JAXBElement<FindEmployeesResponse>(_FindEmployeesResponse_QNAME, FindEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "getEmployee")
    public JAXBElement<GetEmployee> createGetEmployee(GetEmployee value) {
        return new JAXBElement<GetEmployee>(_GetEmployee_QNAME, GetEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "getEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployees }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployees }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "getEmployees")
    public JAXBElement<GetEmployees> createGetEmployees(GetEmployees value) {
        return new JAXBElement<GetEmployees>(_GetEmployees_QNAME, GetEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "getEmployeesResponse")
    public JAXBElement<GetEmployeesResponse> createGetEmployeesResponse(GetEmployeesResponse value) {
        return new JAXBElement<GetEmployeesResponse>(_GetEmployeesResponse_QNAME, GetEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "updateEmployee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://employee.ws.ca.com.tr/", name = "updateEmployeeResponse")
    public JAXBElement<UpdateEmployeeResponse> createUpdateEmployeeResponse(UpdateEmployeeResponse value) {
        return new JAXBElement<UpdateEmployeeResponse>(_UpdateEmployeeResponse_QNAME, UpdateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "id", scope = EmployeeRequest.class)
    public JAXBElement<Integer> createEmployeeRequestId(Integer value) {
        return new JAXBElement<Integer>(_EmployeeRequestId_QNAME, Integer.class, EmployeeRequest.class, value);
    }

}
