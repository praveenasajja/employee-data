package com.employeedata.employeedata.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String empId;
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastname, String empId) {
		super();
		this.firstName=firstName;
		this.lastName=lastname;
		this.empId=empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	
}
