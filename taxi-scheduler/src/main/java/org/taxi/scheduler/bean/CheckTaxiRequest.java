package org.taxi.scheduler.bean;

import org.springframework.scheduling.annotation.Scheduled;

public class CheckTaxiRequest {

	//@Scheduled(fixedRate= 5000)
	public void checkTaxiRequest(){
		System.out.println("Checking");
	}
}
