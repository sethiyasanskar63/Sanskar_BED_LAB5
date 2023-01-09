package com.gl.EmployeeManagementSystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.EmployeeManagementSystem.repository.EmployeeRepository;
import com.gl.EmployeeManagementSystem.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}
}
