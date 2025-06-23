package com.in28minutes.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


/*
 * Default is Eager Initialization.
 */

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;

	public ClassB(ClassA classA) {
		super();
		this.classA = classA;
		System.out.println("Initialization");
	}
	
	public void doSomething() {
		System.out.println("DoSomething" + this.classA);
	}
	
	
}

@Configuration
@ComponentScan()
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
			System.out.println("Initialization of context is completed");
			context.getBean(ClassB.class).doSomething();
		}
	}

}
