package com.employeedata.employeedata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeedata.employeedata.dao.EmpDao;
import com.employeedata.employeedata.model.Employee;

@Service
public class EmpService {

	@Autowired
	private EmpDao empDao;
	public  Employee getEmployee(String empId) {
		// TODO Auto-generated method stub
		return empDao.getEmployee(empId);
	}
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empDao.getAllEmployees();
	}

}
