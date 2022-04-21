package com.employeedata.employeedata.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.employeedata.employeedata.model.Employee;

@Component
public class EmpDao {
	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Employee emp1 = new Employee("s1", "Sajja", "123");
        Employee emp2 = new Employee("p2", "Praveena", "121");
        Employee emp3 = new Employee("v3", "Veena", "345");

        empMap.put(emp1.getEmpId(), emp1);
        empMap.put(emp2.getEmpId(), emp2);
        empMap.put(emp3.getEmpId(), emp3);
    }

    public Employee getEmployee(String empId) {
        return empMap.get(empId);
    }

    public Employee addEmployee(Employee emp) {
        empMap.put(emp.getEmpId(), emp);
        return emp;
    }

    public Employee updateEmployee(Employee emp) {
        empMap.put(emp.getEmpId(), emp);
        return emp;
    }

    public void deleteEmployee(String empNo) {
        empMap.remove(empNo);
    }

    public List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }
}
