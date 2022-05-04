package com.training.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BadmintonJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BadmintonSportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method on the bean
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
