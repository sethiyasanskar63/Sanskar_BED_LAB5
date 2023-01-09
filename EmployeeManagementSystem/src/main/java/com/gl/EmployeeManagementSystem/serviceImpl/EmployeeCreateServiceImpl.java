package com.gl.EmployeeManagementSystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.EmployeeManagementSystem.entity.Employee;
import com.gl.EmployeeManagementSystem.repository.EmployeeRepository;
import com.gl.EmployeeManagementSystem.service.EmployeeCreateService;

@Service
public class EmployeeCreateServiceImpl implements EmployeeCreateService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void addSingleEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
	}
}
