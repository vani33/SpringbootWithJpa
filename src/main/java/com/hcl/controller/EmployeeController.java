package com.hcl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Employee;
import com.hcl.service.EmployeeService;

@Controller
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/")
	public ModelAndView display(){
		
		return new ModelAndView("index");
	}
	@RequestMapping("/loadEmployee")
	public ModelAndView loadEmployee(@ModelAttribute("employee") Employee employee){
		
		return new ModelAndView("AddEmployee");
	}
	
	//insert
	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployee( @Valid @ModelAttribute("employee") Employee employee, BindingResult br){
		
		if(br.hasErrors()) {
			return new ModelAndView("AddEmployee");
		}
		else{
			employeeService.saveEmployee(employee);
			return new ModelAndView("redirect:/viewEmployee");
		}
		
	}
	
	//read
	@RequestMapping("/viewEmployee")
	public ModelAndView getAllEmployee(@ModelAttribute("employee") Employee employee){
		
		List<Employee> list = employeeService.getAllEmployee();
		return new ModelAndView("Success","listOfEmployees",list);
	}
	
	//delete
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(HttpServletRequest request){
		
		int id = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployeeById(id);
		return new ModelAndView("redirect:/viewEmployee");
	}
	
	//update
		@RequestMapping("/editEmployee")
		public ModelAndView editEmployee(HttpServletRequest request,@ModelAttribute("employee") Employee employee){
			
			//int id = Integer.parseInt(request.getParameter("id"));
				return new ModelAndView("EditEmployee");
			
		}
}
