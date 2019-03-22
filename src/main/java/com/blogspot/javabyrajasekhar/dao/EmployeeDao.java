package com.blogspot.javabyrajasekhar.dao;

import java.util.List;

import com.blogspot.javabyrajasekhar.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
}