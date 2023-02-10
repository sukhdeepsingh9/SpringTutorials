package com.tbs.springtutorial.app;

import org.springframework.stereotype.Component;

import com.tbs.springtutorial.app.game.GamingConsole;

@Component
public class GameRunner {

		
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game=game;
	}

	public void run() {
		
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
	
	
}
