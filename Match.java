package com.anurag.cricket1;

import java.util.List;
import java.util.Scanner;

public class Match {
	
	public static void main(String[] args) {
		
		Batsman sehwag = new Batsman();
		Bowler starc = new Bowler();
		int totalScore=0;
		int target = getTarget();
		int overs = getOverNumber();
		for(int i=0; i<overs*6; i++) {
			int runscored = Scorer.playBall(starc, sehwag);
			if(runscored==10){
				System.exit(0);
			}
			else {
				totalScore+=runscored;
					if(totalScore>=target) {
						System.out.println("Batsman has Won");
						System.exit(0);
					}
			}
			
		}
			System.out.println("Batsman has Lost");
		
		
	}
	public static int getTarget() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the target");
		return obj.nextInt();
	}
	public static int getOverNumber() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of overs allowed");
		return obj.nextInt();
	}

}
