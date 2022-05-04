package com.training.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BadmintonSportConfig {

	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach badmintonCoach() {
		return new BadmintonCoach(happyFortuneService());
	}
}
