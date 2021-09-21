package com.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.DAO.EmployeeDAO;
import com.hcl.model.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeDAO employeeDAO;
	@Override
	public void saveEmployee(Employee employee) {
		
		employeeDAO.saveEmployee(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDAO.getAllEmployee();
	}
	@Override
	public void deleteEmployeeById(int id) {
		employeeDAO.deleteEmployeeById(id);
		
	}

}
