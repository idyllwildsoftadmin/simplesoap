package com.desertx.soap.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SoapwebservicebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapwebservicebaseApplication.class, args);
	}

}
