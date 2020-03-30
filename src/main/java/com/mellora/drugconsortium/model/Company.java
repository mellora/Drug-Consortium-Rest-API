package com.mellora.drugconsortium.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "company_generator", sequenceName = "company_seq", allocationSize = 1, initialValue = 0)
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_generator")
	@Column(updatable = false, nullable = false, name = "ID")
	private Long cId;
	@Column(name = "NAME")
	private String cName;

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cName=" + cName + "]";
	}
}
