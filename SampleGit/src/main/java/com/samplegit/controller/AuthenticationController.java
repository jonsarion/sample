package com.samplegit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samplegit.domain.Employee;
import com.samplegit.manager.EmployeeManager;

@RestController
public class AuthenticationController {

	@Autowired
	EmployeeManager  employeeManager;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(){
		return "Hello Test";
	}
	
	@RequestMapping(value="/test/employee", method=RequestMethod.GET)
	public Employee testEmployee(){
		Employee emp;
		
		emp = employeeManager.testEmployee();
		System.out.println(emp + " hello");
	return emp;
	}
}
