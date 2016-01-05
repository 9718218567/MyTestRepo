/*******************************************************************************
 * © Copyright 2015, Dell, Inc.  All Rights Reserved.
 ******************************************************************************/
package com.test.repo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author CPundhir
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource("spring-config.xml")
public class Application {

	public static void main(String[] args) {
		
			SpringApplication.run(Application.class, args);
			System.out.println("Application run.");
	}
}
