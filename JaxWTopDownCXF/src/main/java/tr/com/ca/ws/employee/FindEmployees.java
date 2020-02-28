
package tr.com.ca.ws.employee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findEmployees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findEmployees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="employeeRequest" type="{http://employee.ws.ca.com.tr/}employeeRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEmployees", propOrder = {
    "employeeRequest"
})
public class FindEmployees {

    @XmlElement(required = true)
    protected EmployeeRequest employeeRequest;

    /**
     * Gets the value of the employeeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRequest }
     *     
     */
    public EmployeeRequest getEmployeeRequest() {
        return employeeRequest;
    }

    /**
     * Sets the value of the employeeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRequest }
     *     
     */
    public void setEmployeeRequest(EmployeeRequest value) {
        this.employeeRequest = value;
    }

}
