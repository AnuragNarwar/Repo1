package com.anurag.cricket1;

import java.util.Scanner;

public class Match {
	
	public static void main(String[] args) {

		int target = getTarget();
		int overs = getOverNumber();
		String bType = getBatsmanType();
		Batsman sehwag = new Batsman(BatsmanType.valueOf(bType));
		Bowler starc = new Bowler();
		int totalScore=0;
		
		for(int i=0; i<overs*6; i++) {
			int runscored = Scorer.playBall(starc, sehwag); // proper method name
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
	public static String getBatsmanType() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Batsman Type as : HITMAN or NORMAL");
		return obj.nextLine();
	}
	public static int getOverNumber() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of overs allowed");
		return obj.nextInt();
	}

}
