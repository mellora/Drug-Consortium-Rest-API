package com.mellora.drugconsortium.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
	@SequenceGenerator(name = "employee_generator", sequenceName = "employee_seq", allocationSize = 1)
	@Column(updatable = false, nullable = false)
	private Long eId;
	private String eFirstName;
	private String eLastName;

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public String geteFirstName() {
		return eFirstName;
	}

	public void seteFirstName(String eFirstName) {
		this.eFirstName = eFirstName;
	}

	public String geteLastName() {
		return eLastName;
	}

	public void seteLastName(String eLastName) {
		this.eLastName = eLastName;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eFirstName=" + eFirstName + ", eLastName=" + eLastName + "]";
	}

}
