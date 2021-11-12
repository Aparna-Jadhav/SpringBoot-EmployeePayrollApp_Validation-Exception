package com.bridgelabz.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeeApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to spring");
		ApplicationContext context = SpringApplication.run(EmployeeApplication.class, args);
		log.info("Employee Payroll App Started in {} Environment", context.getEnvironment().getProperty("envirnment"));
		log.info("Employee Payroll DB is {}", context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
