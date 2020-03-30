package com.mellora.drugconsortium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mellora.drugconsortium.dao.EmployeeRepo;
import com.mellora.drugconsortium.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo eRepo;

	@GetMapping(path = "/employee/all")
	public List<Employee> getAllEmployees() {
		return eRepo.findAll();
	}

	@PostMapping(path = "/employee/add")
	public Employee addEmployee(Employee employee) {
		eRepo.save(employee);
		return employee;
	}
	
	@DeleteMapping(path = "/employee/remove")
	public Employee removeEmployee(@RequestParam(name = "eFirstName") String eFirstName, @RequestParam(name = "eLastName") String eLastName) {
		Employee employee = eRepo.findEmployeeByFirstAndLastName(eFirstName, eLastName);
		eRepo.delete(employee);
		return employee;
	}
	
	@PatchMapping(path = "/employee/update")
	public Employee updateEmployee(Employee employee) {
		return employee;
	}
}
