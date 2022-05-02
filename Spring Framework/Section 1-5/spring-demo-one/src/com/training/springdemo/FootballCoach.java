package com.training.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach() {
		
	}
	
	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Ankle jump for 15 minutes";
	}

	@Override
	public String getDailyFortune() {

		return "Just kick it!" + fortuneService.getFortune();
	}
	
	
	//bean init
	public void initbean() {
		System.out.println("FootballCoach: bean init method");
	}
	
	//bean destroy
	public void destroybean() {
		System.out.println("FootballCoach: bean destroy method ");
	}

}
