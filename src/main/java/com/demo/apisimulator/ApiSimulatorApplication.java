package com.demo.apisimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApiSimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSimulatorApplication.class, args);
	}

}
