package org.taxi.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages="org.taxi")
@EnableJpaRepositories(basePackages = "org.taxi.dao")
@EnableAutoConfiguration
public class SampleController {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(SampleController.class, args);
	}
}
