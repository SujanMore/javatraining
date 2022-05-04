package com.training.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Do sideways lunges with weights";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
