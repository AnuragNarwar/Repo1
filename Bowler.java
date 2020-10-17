package com.anurag.cricket1;

import java.util.Random;

public class Bowler {
	BowlerType type;
	
	Bowler(BowlerType type){
		this.type = type;
	}
	public int bowl() {
		Random random = new Random();
		return random.nextInt(7);
	}
	
	public BowlerType getType() {
		return this.type;
	}

}
