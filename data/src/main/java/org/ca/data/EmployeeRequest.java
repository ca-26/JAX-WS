package org.ca.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EmployeeRequest")
//@XmlRootElement(name = "EmployeeRequest", namespace="http://your.namespace.com")
public class EmployeeRequest implements Serializable {
	
	private static final long serialVersionUID = -2328269711978277524L;

	@XmlElement(name="id", 	  required=false, nillable=true)
	private Integer id;
	@XmlElement(name="name",   required=true, nillable=false)
	private String name;
	@XmlElement(name="status", required=false)
	private Status status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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