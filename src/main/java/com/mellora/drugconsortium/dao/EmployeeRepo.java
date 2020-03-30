package com.mellora.drugconsortium.dao;

import org.springframework.data.repository.CrudRepository;

import com.mellora.drugconsortium.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
