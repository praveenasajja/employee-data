package com.employeedata.employeedata.model;

public class Role {
	private String roleName;
	private Number roleId;
	
	
public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Number getRoleId() {
		return roleId;
	}
	public void setRoleId(Number roleId) {
		this.roleId = roleId;
	}
public Role() {
	
}
public Role(Number roleId) {
	this.roleId=roleId;
}
public Role(String roleName) {
	this.roleName=roleName;
}
public Role(Number roleId,String roleName) {
	this.roleName=roleName;
	this.roleId=roleId;
}

	

}
