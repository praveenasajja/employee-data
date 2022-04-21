package com.employeedata.employeedata.controller;

import java.util.List;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeedata.employeedata.model.Employee;
import com.employeedata.employeedata.model.Role;
import com.employeedata.employeedata.service.EmpService;


@RestController
public class Empcontroller {
	@Autowired
	private EmpService empService;
	
    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Employee and Role Data";
    }
	
    @RequestMapping(path="/getEmployee", produces = "application/json")
	public Employee getEmployee(@RequestParam(value = "empId") String empId) {
		return empService.getEmployee(empId);

}
    @RequestMapping(value = "/employees", 
            method = RequestMethod.GET, 
            produces = "application/json")
    @ResponseBody
    public List<Employee> getEmployees() {
        List<Employee> list = empService.getAllEmployees();
        return list;
    }
    @RequestMapping(value = "/addEmployee", 
            method = RequestMethod.POST, 
            produces = "application/json")
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee emp) {

        System.out.println("(Service Side) Creating employee: " + emp.getEmpId());

        return empService.addEmployee(emp);
    }
    @RequestMapping(value = "/getAllRoles", 
            method = RequestMethod.GET, 
            produces = "application/json")
    @ResponseBody
    public List<Role> getAllRoles() {
        List<Role> list = empService.getAllRoles();
        return list;
    }
    
    @RequestMapping(value = "/addRole", 
            method = RequestMethod.POST, 
            produces = "application/json")
    @ResponseBody
    public Role addRole(@RequestBody Role role) {

        System.out.println("(Service Side) Creating employee: " + role.getRoleId());

        return empService.addRole(role);
    }
    
    @RequestMapping(value = "/addRoleToEmployee",
            method = RequestMethod.POST, 
            produces = "application/json")
    @ResponseBody
    public Employee addRoleToEmployee(@RequestBody Employee emp) {

        return empService.addRoleToEmployee(emp);
    }
}