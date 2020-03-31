package com.mellora.drugconsortium.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mellora.drugconsortium.model.Company;

public interface CompanyRepo extends JpaRepository<Company, Long> {

}
