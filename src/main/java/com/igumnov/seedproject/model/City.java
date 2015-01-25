package com.igumnov.seedproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
	private String name;
	
	@Column(nullable = false)
	private Long population;
	
	@ManyToOne
	private Country country;

	public String getName() {
		return name;
	}

	public City setName(String name) {
		this.name = name;
		return this;
	}

	public Long getPopulation() {
		return population;
	}

	public City setPopulation(Long population) {
		this.population = population;
		return this;
	}

	public Country getCountry() {
		return country;
	}

	public City setCountry(Country country) {
		this.country = country;
		return this;
	} 
	
}
