package com.mellora.drugconsortium.dao;

import org.springframework.data.repository.CrudRepository;

import com.mellora.drugconsortium.model.Company;

public interface CompanyRepo extends CrudRepository<Company, Integer> {

}
