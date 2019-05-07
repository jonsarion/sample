package com.samplegit.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samplegit.dao.EmployeeDAO;
import com.samplegit.domain.Employee;

@Service
public class EmployeeManager {

	@Autowired
	EmployeeDAO employeeDAO;

	public Employee testEmployee() {
		Employee emp;
		emp = employeeDAO.testEmployee();
		return emp;
	}

}
