package com.blogspot.javabyrajasekhar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogspot.javabyrajasekhar.dao.EmployeeDao;
import com.blogspot.javabyrajasekhar.model.Employee;
import com.blogspot.javabyrajasekhar.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		return employees;
	}

}