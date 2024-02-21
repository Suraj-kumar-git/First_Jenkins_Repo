package com.suraj.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.employeemanagementsystem.domain.Employee_Management_System;
import com.suraj.employeemanagementsystem.repository.EmployeeRepository;

@Service // This means that this class is a service
public class EmployeeService {
	@Autowired
	// This means to get the bean which is auto-generated by Spring
	// We will use it to handle the data
	EmployeeRepository employeeRepository;

	//	get all employees
	public List<Employee_Management_System> getAllEmployees() {

		//		find all employees data, then return it
		return employeeRepository.findAll();
	}

	// save an employee
	public void saveEmployee(Employee_Management_System emp) {
		//		save employee data to database
		employeeRepository.save(emp);
	}

	//	get employee by id
	public Employee_Management_System getEmployeeById(Long id) {
		//		find an employee by id
		Employee_Management_System emp = employeeRepository.getById(id);

		//		if there is not an employee who has the id, throw the error.
		if (emp == null) {
			throw new RuntimeException("Employee not found");
		}
		return emp;
	}

	//	delete employee by id
	public String deleteEmployeeById(Long id) {
		//		find an employee by id
		Employee_Management_System emp = employeeRepository.getById(id);

		//		if there is not an employee who has the id, throw the error.
		if (emp == null) {
			throw new RuntimeException("Employee not found");
		}

		//		delete an employee who has the id from the database
		employeeRepository.deleteById(id);
		return "Deleted: " + emp.getFirstName() + " " + emp.getLastName();
	}
}
