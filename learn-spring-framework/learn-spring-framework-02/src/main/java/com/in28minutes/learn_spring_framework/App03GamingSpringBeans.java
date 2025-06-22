package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;


@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
public class App03GamingSpringBeans {
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) { // wiring Packman game 
		System.out.println("Parameter: " + game);
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
			context.getBean(GameRunner.class).run();
		}
	}

}
