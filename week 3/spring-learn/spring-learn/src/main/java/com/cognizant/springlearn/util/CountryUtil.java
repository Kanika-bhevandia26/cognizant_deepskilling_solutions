package com.cognizant.springlearn.util;

import com.cognizant.springlearn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CountryUtil {

    private static List<Country> countryList;

    static {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        countryList =
                context.getBean("countryList", List.class);

    }

    public static List<Country> getCountryList() {

        return countryList;

    }

}