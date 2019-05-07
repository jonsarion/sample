package com.samplegit.dao;

import org.apache.ibatis.annotations.Mapper;

import com.samplegit.domain.Employee;

@Mapper
public interface EmployeeDAO {
	
	public Employee testEmployee();

}
