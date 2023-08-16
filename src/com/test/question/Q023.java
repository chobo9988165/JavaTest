package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	
	public static void main(String[] args) {
		
		int fatherYear= 0;
		int fatherMonth = 0;
		int fatherDate = 0;
		int daughterYear= 0;
		int daughterMonth = 0;
		int daughterDate = 0;
		long fatherTick = 0;
		long daughtherTick = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아빠 생일(년):");
		fatherYear = scan.nextInt();
		System.out.println("아빠 생일(월):");
		fatherMonth = scan.nextInt();
		System.out.println("아빠 생일(일):");
		fatherDate = scan.nextInt();

		System.out.println("딸 생일(년):");
		daughterYear = scan.nextInt();
		System.out.println("딸 생일(월):");
		daughterMonth = scan.nextInt();
		System.out.println("딸 생일(일):");
		daughterDate = scan.nextInt();
		
		Calendar fatherBirthday = Calendar.getInstance();
		fatherBirthday.set(fatherYear, fatherMonth - 1, fatherDate);
		
		Calendar dautherBirthday = Calendar.getInstance();
		dautherBirthday.set(daughterYear, daughterMonth - 1, daughterDate);
		
		fatherTick = fatherBirthday.getTimeInMillis();
		daughtherTick = dautherBirthday.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n", (daughtherTick - fatherTick) / 1000 / 60 / 60 / 24);
				
		
		
		
	}//main

}
