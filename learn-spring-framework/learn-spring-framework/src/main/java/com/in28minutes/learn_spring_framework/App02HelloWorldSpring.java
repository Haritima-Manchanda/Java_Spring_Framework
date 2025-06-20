package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. Launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2. Configure the things that we want spring to manage - 
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		
		// Retrieving beans managed by spring
		System.out.println(context.getBean("name"));
		
	}
	

}
