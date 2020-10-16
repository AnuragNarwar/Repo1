package com.anurag.cricket1;

import java.util.Random;

public class Batsman {
	
	public int scorePerBall() {
		Random random = new Random();
		return random.nextInt(7);
	}

}
