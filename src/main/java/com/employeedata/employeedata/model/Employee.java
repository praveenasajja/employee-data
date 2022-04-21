package com.employeedata.employeedata.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String empId;
	private Role role;
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastname, String empId) {
		super();
		this.firstName=firstName;
		this.lastName=lastname;
		this.empId=empId;
	}
	public Employee(String firstName, String lastname, String empId, Role role) {
		super();
		this.firstName=firstName;
		this.lastName=lastname;
		this.empId=empId;
		this.role=role;
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
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
