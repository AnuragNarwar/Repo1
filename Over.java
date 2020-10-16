package com.anurag.cricket1;

import java.util.ArrayList;
import java.util.List;

public class Over {
	
	
	public static List<Integer> getOverScore(Batsman batsman){
		List<Integer> overScore = new ArrayList<>();
		for(int i=0;i<7;i++) {
			overScore.add(batsman.scorePerBall());
		}
		return overScore;
	}
}
