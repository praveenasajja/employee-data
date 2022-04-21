package com.employeedata.employeedata.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.employeedata.employeedata.model.Employee;
import com.employeedata.employeedata.model.Role;

@Component
public class EmpDao {
	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
	private static final Map<Number, Role> roleMap = new HashMap<Number, Role>();

    static {
        initEmps();
        initRoles();
    }

    private static void initEmps() {
        Employee emp1 = new Employee("s1", "Sajja", "123");
        Employee emp2 = new Employee("p2", "Praveena", "121");
        Employee emp3 = new Employee("v3", "Veena", "345");

        empMap.put(emp1.getEmpId(), emp1);
        empMap.put(emp2.getEmpId(), emp2);
        empMap.put(emp3.getEmpId(), emp3);
    }
    private static void initRoles() {
        Role role1 = new Role(1,"manager");
        Role role2 = new Role(2,"admin");
        Role role3 = new Role(3,"lead");

        roleMap.put(role1.getRoleId(), role1);
        roleMap.put(role2.getRoleId(), role2);
        roleMap.put(role3.getRoleId(), role3);
    }

    public Employee getEmployee(String empId) {
        return empMap.get(empId);
    }

    public Employee addEmployee(Employee emp) {
        empMap.put(emp.getEmpId(), emp);
        return emp;
    }

    public List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }

	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
	      Collection<Role> c = roleMap.values();
	        List<Role> list = new ArrayList<Role>();
	        list.addAll(c);
	        return list;
	}
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		 roleMap.put(role.getRoleId(), role);
	        return role;
	}
	public Employee addRoleToEmployee(Employee emp) {
		// TODO Auto-generated method stub
		  Role roleAdmin = roleMap.get(emp.getRole().getRoleId());
		  Employee emp1 = empMap.get(emp.getEmpId());
		  emp1.setRole(roleAdmin);	
		  System.out.println(emp1);
		return emp1;
	}
}
