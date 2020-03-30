package com.mellora.drugconsortium.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mellora.drugconsortium.dao.CompanyRepo;
import com.mellora.drugconsortium.model.Company;

@RestController
public class CompanyController {
	@Autowired
	CompanyRepo cRepo;
	
	@GetMapping(path = "/companies/all")
	public List<Company> getAllCompanies(){
		List<Company> companyList = new ArrayList<>();
		cRepo.findAll().forEach(companyList::add);
		return companyList;
	}
}
