package com.anurag.cricket1;

import java.util.List;
import java.util.Scanner;

public class Match {
	
	public static void main(String[] args) {
		
		Batsman sehwag = new Batsman();
		int target = getTarget();
		int runscored = getTotalRunScored(sehwag);
		if(runscored>=target) {
			System.out.println("Batsman has Won");
		}
		else 
			System.out.println("Batsman has Lost");
		System.exit(0);
		
	}
	public static int getTarget() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the target");
		return obj.nextInt();
	}
	public static int getTotalRunScored(Batsman bm) {
		List<Integer> score = Over.getOverScore(bm);
		int totalScore=0;
		for (int run: score) {
			totalScore+=run;
		}
		return totalScore;
	}

}
