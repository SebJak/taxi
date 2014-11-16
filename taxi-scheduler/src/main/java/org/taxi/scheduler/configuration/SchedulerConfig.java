package org.taxi.scheduler.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.taxi.scheduler.bean.CheckTaxiRequest;

@Configuration
@EnableScheduling
public class SchedulerConfig {

	@Bean
	public CheckTaxiRequest taxiRequest(){
		return new CheckTaxiRequest();
	}
}
