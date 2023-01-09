package com.gl.EmployeeManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gl.EmployeeManagementSystem.entity.Employee;
import com.gl.EmployeeManagementSystem.repository.EmployeeRepository;
import com.gl.EmployeeManagementSystem.service.EmployeeReadService;

@Service
public class EmployeeReadServiceImpl implements EmployeeReadService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployeesSortedById() {
		return employeeRepository.findAll(Sort.by(Direction.ASC, "id"));
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElseThrow(RuntimeException::new);
	}
}
