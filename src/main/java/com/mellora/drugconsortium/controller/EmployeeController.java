package com.mellora.drugconsortium.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@DeleteMapping(path = "/employee/delete")
	public Optional<Employee> removeEmployeeByName(@RequestParam(name = "eFirstName") String eFirstName,
			@RequestParam(name = "eLastName") String eLastName) {
		Optional<Employee> employeeRecord;
		if(eRepo.findEmployeeByFirstAndLastName(eFirstName, eLastName).isPresent()) {
			employeeRecord = eRepo.findEmployeeByFirstAndLastName(eFirstName, eLastName);
			Employee employee = employeeRecord.get();
			eRepo.delete(employee);;
		} else {
			employeeRecord = null;
		}
		return employeeRecord;
	}

	@DeleteMapping(path = "/employee/delete/{eId}")
	public Optional<Employee> removeEmployeeById(@PathVariable(name = "eId") long eId) {
		Optional<Employee> employee;
		if (eRepo.findById(eId).isPresent()) {
			employee = eRepo.findById(eId);
			eRepo.deleteById(eId);
		} else {
			employee = null;
		}
		return employee;
	}
	
	@DeleteMapping(path = "employee/delete/all")
	public List<Employee> removeAllEmployees(){
		List<Employee> employeeList = eRepo.findAll();
		eRepo.deleteInBatch(employeeList);
		return employeeList;
	}

	@PutMapping(path = "/employee/update")
	public Employee saveOrUpdateEmployee(@RequestBody Employee employee) {
		eRepo.save(employee);
		return employee;
	}
}
