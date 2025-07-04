package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record helps in eleminating verbosity in creating Java Beans
// Public accessor methods, constructors, equals, hashcode, and toString methods
// are automatically created. Released in JDK 16. 
record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};


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
	
	@Bean
	public int age() {
		return 15;
	}
	
	// Bean to manage an object of a class
	@Bean 
	public Person person() {
		var person = new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
		return person;
	}
	
	// Bean created by using other beans
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());
		return person;
	}
	
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		// There ia a bean with name 'name', 'age', and 'address3'
		var person = new Person(name, age, address3);
		return person;
	}
	
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		// There ia a bean with name 'name', 'age', and 'address3'
		var person = new Person(name, age, address);
		return person;
	}
	
	@Bean
	public Person person5Parameters(String name, int age, @Qualifier("address3Qualifier") Address address) {
		// There ia a bean with name 'name', 'age', and 'address3'
		var person = new Person(name, age, address);
		return person;
	}
	
	
	// Bean to manage an object of a class. By default the name of the bean is the name of the function
	//	If we want to define a custom name then we can do that by -  
	@Bean(name = "address2")
	@Primary
	public Address address() {
		var address = new Address("Baker Street", "London");
		return address;
	}
	
	@Bean(name = "address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		var address = new Address("Moti Nager", "Hyderabad");
		return address;
	}
	
}
