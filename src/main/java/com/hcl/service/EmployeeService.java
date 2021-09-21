package com.hcl.service;

import java.util.List;

import com.hcl.model.Employee;

public interface EmployeeService {

	public void saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public void deleteEmployeeById(int id);
}
