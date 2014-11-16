package org.taxi.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Scheduler {

	public static void main(String[] args){
		SpringApplication.run(Scheduler.class, args);
	}
}
