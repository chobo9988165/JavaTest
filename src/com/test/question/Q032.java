package com.test.question;

import java.util.Scanner;

public class Q032 {

//	요구사항
//	주차 요금을 계산하시오.
//
//	조건..
//	무료 주차: 30분
//	초과 10분당: 2,000원
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int enterHour = 0;
		int enterMinute = 0;
		int parkingMinute = 0;
		int parkingFee = 0;
		int freeParking = 30;
		
		int exitHour = 0;
		int exitMinute = 0;
		
		System.out.println("[들어온 시간]");
		System.out.print("시: ");
		enterHour = scan.nextInt();
		System.out.print("분: ");
		enterMinute = scan.nextInt();
		System.out.println();
		
		System.out.println("[나간 시간]");
		System.out.print("시: ");
		exitHour = scan.nextInt();
		System.out.print("분: ");
		exitMinute = scan.nextInt();
		
		
		
		if(enterHour != exitHour) {
			exitMinute = exitMinute + ((exitHour-enterHour) * 60);
			exitHour = enterHour;
			parkingMinute = (exitMinute - enterMinute - freeParking);
			parkingFee = (parkingMinute / 10) * 2000;
			
			if(parkingMinute < 0) parkingFee = 0;
			
			System.out.printf("주차 요금은 %,d원입니다.\n", parkingFee);
			
		} else {
			parkingMinute = (exitMinute - enterMinute - freeParking);				
			parkingMinute = (exitMinute - enterMinute - freeParking);
			parkingFee = (parkingMinute / 10) * 2000;
			
			if(parkingMinute < 0) parkingFee = 0;
			
			System.out.printf("주차 요금은 %,d원입니다.\n", parkingFee);
		}
		
		
		
		
		
		
	}
}
