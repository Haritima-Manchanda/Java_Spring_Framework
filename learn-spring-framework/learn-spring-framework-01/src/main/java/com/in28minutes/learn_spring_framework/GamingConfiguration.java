package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}
	
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) { // wiring Packman game 
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	//	var game = new MarioGame();
	//	var game = new SuperContraGame();
//		var game = new PacmanGame(); // 1. Object Creation
//		
//		var gameRunner = new GameRunner(game);
//		// 2. Object Creation & Wiring of Dependencies
//		// game is a dependency of GameRunner
//		
//		gameRunner.run();
}
