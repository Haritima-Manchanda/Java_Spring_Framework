package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("learn-spring-framework-02 running Game: "+ this.game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
