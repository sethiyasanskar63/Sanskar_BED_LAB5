package com.gl.EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.EmployeeManagementSystem.entity.Employee;
import com.gl.EmployeeManagementSystem.serviceImpl.EmployeeReadServiceImpl;

@Controller
public class EmployeeReadController {

	@Autowired
	EmployeeReadServiceImpl employeeReadServiceImpl;

	@RequestMapping("/employees/list")
	public String showEmployees(Model theModel) {
		List<Employee> theEmployees = employeeReadServiceImpl.getEmployeesSortedById();
		theModel.addAttribute("employees", theEmployees);
		return "listEmployee";
	}
}
