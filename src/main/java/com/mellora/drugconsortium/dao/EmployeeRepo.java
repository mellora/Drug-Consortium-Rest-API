package com.mellora.drugconsortium.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mellora.drugconsortium.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
