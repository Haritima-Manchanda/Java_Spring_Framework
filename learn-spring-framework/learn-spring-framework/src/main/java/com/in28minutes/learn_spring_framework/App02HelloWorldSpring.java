package com.in28minutes.learn_spring_framework;

import java.util.Arrays;

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
		
		/*	We can also retrieve a bean by specifying the class type instead of name.
		 * When you try to retrieve a Bean by type in Spring and there are multiple Beans of 
		 * that type, Spring cannot determine which one you want, so it throws an exception 
		 * to indicate this ambiguity. 
		 * This emphasizes the importance of being specific when dealing with multiple Beans in the Spring context.
		 * Therefore commenting the following line for now, we have address(or address2) and address3 of Address type.
		System.out.println(context.getBean(Address.class));	
		*/
		
		// Functional programming to print all the beans managed by the spring container.
		System.out.println("All beans managed by spring container: ");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
