package com.gl.EmployeeManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.EmployeeManagementSystem.entity.Employee;

@Controller
public class EmployeeCreateController {

	@RequestMapping("/employees/add")
	public String addEmployee(Model theModel) {

		Employee theEmployee = new Employee();
		theModel.addAttribute("employee", theEmployee);
		theModel.addAttribute("formType", "Create Employee");
		return "formEmployee";
	}
}
