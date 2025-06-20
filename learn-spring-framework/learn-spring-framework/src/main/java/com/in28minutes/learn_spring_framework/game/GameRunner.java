package com.in28minutes.learn_spring_framework.game;

public class GameRunner {

//	MarioGame game;
//	
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}

//	SuperContraGame game;
//	public GameRunner(SuperContraGame game) {
//		this.game = game;
//	}
	
	GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running Game: "+ this.game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
