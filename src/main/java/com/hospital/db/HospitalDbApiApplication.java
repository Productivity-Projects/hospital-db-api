package com.hospital.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springbootcommonlib.mail")
public class HospitalDbApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalDbApiApplication.class, args);
	}

}
