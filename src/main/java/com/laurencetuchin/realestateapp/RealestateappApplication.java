package com.laurencetuchin.realestateapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan({"com.laurencetuchin.realestateapp.repositories.UserRepository"})
public class RealestateappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealestateappApplication.class, args);
	}

}
