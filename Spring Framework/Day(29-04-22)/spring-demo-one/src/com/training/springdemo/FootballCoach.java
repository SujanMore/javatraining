package com.training.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Ankle jump for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just kick it!" + fortuneService.getFortune();
	}

}
