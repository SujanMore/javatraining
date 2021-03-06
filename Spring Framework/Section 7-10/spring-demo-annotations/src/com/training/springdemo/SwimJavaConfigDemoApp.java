package com.training.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyLoggerConfig.class, SportConfig.class);
		
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call the method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call methods specific to swimCoach
		 System.out.println("email: " + theCoach.getEmail());
		 System.out.println("team: " + theCoach.getTeam());
		 
		//close the context
		context.close();
	}

}
