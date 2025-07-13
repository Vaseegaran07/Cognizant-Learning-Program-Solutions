package com.cognizant.spring_learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.Country;

@Service
public class CountryService {

    public Country getCountry(String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        // Using Lambda + Stream
        Optional<Country> match = countryList.stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst();

        return match.orElse(null); 
    }
}
