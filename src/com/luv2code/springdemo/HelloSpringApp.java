package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file (spring context)
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrive the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach mySonCoach = context.getBean("mySonCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(mySonCoach.getDailyWorkout());
		context.close();
	}

}
