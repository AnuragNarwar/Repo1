package com.anurag.cricket1;

import java.util.Random;

public class Batsman {
	int runs=0;
	int ballsPlayed=0;
	boolean out;
	
	public int bat() {
		Random random = new Random();
		return random.nextInt(7);
	}

	public int getRuns() {
		return runs;
	}

	public int getBallsPlayed() {
		return ballsPlayed;
	}

}
