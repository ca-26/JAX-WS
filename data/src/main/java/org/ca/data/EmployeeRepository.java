package org.ca.data;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.common.util.StringUtils;

public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<Employee>();

    public List<Employee> getEmployees() {
    	return employees;
    }
    
    public Employee getEmployee(int id) {
    	for ( Employee e : employees ) {
    		if ( e.getId() == id )
    			return e;
    	}
    	return null;
    }
    
    public List<Employee> findEmployees(EmployeeRequest employeeRequest) {
    	List<Employee> employeeResults = new ArrayList<Employee>();
    	if ( employeeRequest != null ) {
    		for ( Employee employee : employees ) {
    			if ( employeeRequest.getId() != null ) {
        			if ( employee.getId() != employeeRequest.getId() ) {
        				continue; }
    			}
    			if ( employeeRequest.getName() != null ) {
        			if ( !employee.getName().contains(employeeRequest.getName()) ) {
        				continue; }
    			}
    			if ( employeeRequest.getStatus() != null ) {
        			if ( !employee.getStatus().equals(employeeRequest.getStatus()) ) {
        				continue; }
    			}
    			employeeResults .add(employee);
    		}
    	}
    	return employeeResults;
    }

    public Employee getEmployeeByName(String name) {
    	if ( !StringUtils.isEmpty(name) ) {
        	for ( Employee e : employees ) {
        		if ( name.equals(e.getName()) )
        			return e;
        	}
    	}
    	return null;
    }
    
    public Employee updateEmployee(int id, String name, Status status) {
    	for ( Employee e : employees ) {
    		if ( e.getId() == id ) {
    			e.setName(name);
    			e.setStatus(status);
    			return e;
    		}
    	}
    	return null;
    }
 
    public boolean deleteEmployee(int id) {
    	for ( Employee e : employees ) {
    		if ( e.getId() == id ) {
    			employees.remove(e);
    			return true;
    		}
    	}
    	return false;
    }
 
    public Employee addEmployee(String name, Status status) {
    	int maxId = -1;
    	for ( Employee e : employees ) {
    		if ( e.getId() > maxId )
    			maxId = e.getId();
    	}
    	
    	Employee e = new Employee(maxId+1, name, status);
    	employees.add(e);
    	return e;
    }
    
}
