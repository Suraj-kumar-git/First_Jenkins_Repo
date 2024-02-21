package com.suraj.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.employeemanagementsystem.domain.Employee_Management_System;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee_Management_System, Long> {
	// This will be AUTO IMPLEMENTED by Spring into a Bean
}
