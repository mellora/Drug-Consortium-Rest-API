package com.mellora.drugconsortium.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mellora.drugconsortium.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	@Query(value = "SELECT * FROM employee e WHERE e.FIRST_NAME = :first AND e.LAST_NAME = :last", nativeQuery = true)
	public Optional<Employee> findEmployeeByFirstAndLastName(@Param("first") String firstName, @Param("last") String lastName);
}
