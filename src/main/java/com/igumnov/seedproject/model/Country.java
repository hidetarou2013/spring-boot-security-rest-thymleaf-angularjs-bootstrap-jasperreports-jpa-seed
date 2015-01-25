package com.igumnov.seedproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	private String name;
	
	@OneToMany (mappedBy="country")
	private List<City> cities = new ArrayList<City>();

	public String getName() {
		return name;
	}

	public Country setName(String name) {
		this.name = name;
		return this;
	}

	public List<City> getCities() {
		return cities;
	}

	public Country setCities(List<City> cities) {
		this.cities = cities;
		return this;
	}
	
	public Country addCity(City city) {
		if(!cities.contains(city)) {
			cities.add(city);
		}
		return this;
	}

}
