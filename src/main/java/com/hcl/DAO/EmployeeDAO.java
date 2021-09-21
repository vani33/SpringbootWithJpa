package com.hcl.DAO;

import java.util.List;

import com.hcl.model.Employee;

public interface EmployeeDAO {

	public void saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public void deleteEmployeeById(int id);

}
