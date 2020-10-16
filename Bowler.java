package com.anurag.cricket1;

import java.util.Random;

public class Bowler {
	
	public int bowl() {
		Random random = new Random();
		return random.nextInt(7);
	}

}
