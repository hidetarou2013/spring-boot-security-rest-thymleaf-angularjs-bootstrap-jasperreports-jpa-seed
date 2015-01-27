package com.igumnov.seedproject.service;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.igumnov.seedproject.model.City;
import com.igumnov.seedproject.model.Country;
import com.igumnov.seedproject.repository.CityRepository;
import com.igumnov.seedproject.repository.CountryRepository;

@Component
public class ApiService {
	final static Logger logger = Logger.getLogger(ApiService.class);

	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private CountryRepository countryRepository;

	@PostConstruct
    public void init() {
    	logger.info("ApiService.init()");
    	City city = new City().setName("Test").setPopulation(10000L);
    	Country country = new Country().setName("USA");
    	country = countryRepository.save(country);
    	country.addCity(city);
    	city.setCountry(country);
    	cityRepository.save(city);
    }
}
