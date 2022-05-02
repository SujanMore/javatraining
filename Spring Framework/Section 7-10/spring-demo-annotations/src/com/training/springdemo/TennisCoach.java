package com.training.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartup() {
		System.out.println("TennisCoach: inside of doMyStartup()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanup() {
		System.out.println("TennisCoach: inside of doMyCleanup()");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
//	//define a setter method
//	@Autowired
//	public void someOtherMethod(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside someOtherMethod() method");
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
	
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
