package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int station = 0;
		int change = 0;
		int time = 0;
		
		System.out.print("역의 개수:");
		station = scan.nextInt();
		
		System.out.print("환승역의 개수: ");
		change = scan.nextInt();
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		time = scan.nextInt();
		
		total = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d분입니다.\n", total);
		
	}//main
	
	
	public static int getTime(int station, int change, int time) {
		int total = 0;
		
		total = station * 2 + change * ((time==1) ? 3 : (time == 2) ? 4 : 5);
		
		return total; 
	}

}
