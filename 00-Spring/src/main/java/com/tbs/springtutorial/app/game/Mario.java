package com.tbs.springtutorial.app.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		System.out.println("Go into hole");
		
	}

	@Override
	public void left() {
		System.out.println("Go Back");
		
	}

	@Override
	public void right() {
		System.out.println("Accelerate");
		
	}

	
}
