package com.gl.EmployeeManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.EmployeeManagementSystem.entity.Employee;
import com.gl.EmployeeManagementSystem.serviceImpl.EmployeeReadServiceImpl;

@Controller
public class EmployeeEditController {

	@Autowired
	EmployeeReadServiceImpl employeeReadServiceImpl;

	@RequestMapping("/employees/edit")
	public String editEmployee(@RequestParam("id") Long id, Model theModel) {
		Employee theEmployee = employeeReadServiceImpl.getEmployeeById(id);
		theModel.addAttribute("employee", theEmployee);
		theModel.addAttribute("formType", "Edit Employee");
		return "formEmployee";
	}
}
