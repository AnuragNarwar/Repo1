package com.anurag.cricket1;

public class Scorer {

	public static int scoreThePlayBall(Bowler bl, Batsman bm) {
		int bmscore = bm.bat();
		int blscore = bl.bowl();
		System.out.println("Batsman : " + bmscore);
		System.out.println("Bowler : " + blscore);
		if(bmscore == blscore) {
			System.out.println("Batsman Lost by getting out");
			return 10;
		} 
		return bmscore;
	}
	
}
