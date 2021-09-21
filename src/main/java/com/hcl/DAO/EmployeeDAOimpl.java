package com.hcl.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.Employee;
import com.hcl.repository.EmployeeRepository;

@Repository
public class EmployeeDAOimpl implements EmployeeDAO{

	
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public void saveEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		return (List<Employee>) employeeRepository.findAll();
	}
	@Override
	public void deleteEmployeeById(int id) {
		
		employeeRepository.delete(id);
		
	}

	

}
