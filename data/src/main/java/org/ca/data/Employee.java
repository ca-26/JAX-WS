package org.ca.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
//@XmlType(name="Employee", propOrder = {"id", "name"}, namespace = Namespaces.MAIN_NAMESPACE)
@XmlType(name="Employee", propOrder = {"id", "name", "status"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	@XmlElement(name="id", nillable=false, required=true)
//	@Min(1)
    private int id;
	@XmlElement(name="name", nillable=false, required=true)
    private String name;
	@XmlElement(name="status", nillable=false, required=true)
    private Status status;
    
	public Employee(int id, String name, Status status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	public Employee() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

}