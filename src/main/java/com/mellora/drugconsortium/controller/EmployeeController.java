package com.mellora.drugconsortium.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mellora.drugconsortium.dao.EmployeeRepo;
import com.mellora.drugconsortium.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo eRepo;

	@GetMapping(path = "/employees/all")
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		eRepo.findAll().forEach(employeeList::add);
		return employeeList;
	}

	@PostMapping(path = "/employee/add")
	public Employee addEmployee(Employee employee) {
		eRepo.save(employee);
		return employee;
	}
	
	@DeleteMapping(path = "/employee/remove")
	public Employee removeEmployee(Employee employee) {
		eRepo.delete(employee);
		return employee;
	}
}
