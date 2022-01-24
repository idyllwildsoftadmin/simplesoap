package com.desertx.soap.engine;

import com.concretepage.gs_ws.Country;
import com.concretepage.gs_ws.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {

        Country can = new Country();
        can.setCapital("Ottawa");
        can.setCurrency(Currency.CA);
        can.setName("Canada");
        can.setPopulation(30000000);

        countries.put("Canada", can);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
