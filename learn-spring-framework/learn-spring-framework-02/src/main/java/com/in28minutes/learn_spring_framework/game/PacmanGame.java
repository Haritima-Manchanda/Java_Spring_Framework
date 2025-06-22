package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

// Such classes are considered as candidates for auto-detection 
//when using annotation-based configuration and classpath scanning.
@Component
public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Down");	
	}
	
	public void left() {
		System.out.println("Left");	
	}
	
	public void right() {
		System.out.println("Right");
	}
}
