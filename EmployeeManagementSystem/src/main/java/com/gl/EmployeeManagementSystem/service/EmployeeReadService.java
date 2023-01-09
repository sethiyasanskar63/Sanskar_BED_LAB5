package com.gl.EmployeeManagementSystem.service;

import java.util.List;

import com.gl.EmployeeManagementSystem.entity.Employee;

public interface EmployeeReadService {

	List<Employee> getEmployeesSortedById();

	Employee getEmployeeById(Long id);

}