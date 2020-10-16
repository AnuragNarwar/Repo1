package com.anurag.cricket1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Batsman {
	int runs=0;
	int ballsPlayed=0;
	boolean out;
	BatsmanType type;
	
	public int bat() {
		Random random = new Random();
		if(type == BatsmanType.NORMAL) {
			return random.nextInt(7);
		} else if(type == BatsmanType.HITMAN){
			List<Integer> list = new ArrayList<>(); 
			list.add(0);
			list.add(4);
			list.add(6);
			return list.get(random.nextInt(list.size()));
		}
		else {
			return random.nextInt(4);
		}
	}

	public int getRuns() {
		return runs;
	}

	public int getBallsPlayed() {
		return ballsPlayed;
	}

	Batsman(BatsmanType type) {
		this.type = type;
	}

	public BatsmanType getType() {
		return this.type;
	}

}
