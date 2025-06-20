package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This is a spring framework class
// How do you indicate that?
// By adding an annotation called @Configuration - Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime

@Configuration
public class HelloWorldConfiguration {
	
	// @Bean - Indicates that a method produces a bean to be managed by the Spring container.
	@Bean
	public String name() {
		return "Ranga";
	}
}
