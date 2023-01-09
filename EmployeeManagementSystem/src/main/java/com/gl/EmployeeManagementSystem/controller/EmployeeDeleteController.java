package com.gl.EmployeeManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.EmployeeManagementSystem.serviceImpl.EmployeeDeleteServiceImpl;

@Controller
public class EmployeeDeleteController {

	@Autowired
	EmployeeDeleteServiceImpl employeeDeleteServiceImpl;

	@RequestMapping("/employees/delete")
	public String deleteEmployee(@RequestParam("id") Long id) {
		employeeDeleteServiceImpl.deleteEmployeeById(id);
		return "redirect:/employees/list";
	}
}
