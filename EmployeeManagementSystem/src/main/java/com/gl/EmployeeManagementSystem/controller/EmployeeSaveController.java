package com.gl.EmployeeManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.EmployeeManagementSystem.entity.Employee;
import com.gl.EmployeeManagementSystem.serviceImpl.EmployeeCreateServiceImpl;
import com.gl.EmployeeManagementSystem.serviceImpl.EmployeeReadServiceImpl;

@Controller
public class EmployeeSaveController {

	@Autowired
	EmployeeReadServiceImpl employeeReadServiceImpl;

	@Autowired
	EmployeeCreateServiceImpl employeeCreateServiceImpl;

	@PostMapping("/employees/save")
	public String saveEmployee(@RequestParam("id") Long id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastname, @RequestParam("email") String email) {

		Employee theEmployee;
		if (id != 0) {
			theEmployee = employeeReadServiceImpl.getEmployeeById(id);
			theEmployee.setFirstName(firstName);
			theEmployee.setLastName(lastname);
			theEmployee.setEmail(email);
		} else {
			theEmployee = Employee.builder().firstName(firstName).lastName(lastname).email(email).build();
		}
		employeeCreateServiceImpl.addSingleEmployee(theEmployee);
		return "redirect:/employees/list";
	}
}
