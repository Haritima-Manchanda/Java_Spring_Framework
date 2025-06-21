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
		System.out.println("Name " + context.getBean("name"));
		System.out.println("Age " + context.getBean("age"));
		System.out.println("Person " + context.getBean("person"));
		
		// Retrieving beans created from other beans
		System.out.println("person2MethodCall " + context.getBean("person2MethodCall"));
		System.out.println("person3Parameters " + context.getBean("person3Parameters"));
		
		System.out.println("address2: " + context.getBean("address2"));
		
		//	We can also retrieve a bean by specifying the class type instead of name
//		Commenting this for now, otherwise an error will be thrown. Will come back to this later. 
//		System.out.println(context.getBean(Address.class));
	}
}
