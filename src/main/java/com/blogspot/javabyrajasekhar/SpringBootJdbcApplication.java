package com.blogspot.javabyrajasekhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blogspot.javabyrajasekhar.service.EmployeeService;

@SpringBootApplication
public class SpringBootJdbcApplication {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
}