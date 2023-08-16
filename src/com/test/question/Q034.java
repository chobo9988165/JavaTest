package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
//	요구사항
//	날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
//
//	조건..
//	입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
//	입력받은 날짜가 토/일요일이면 아무것도 안한다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar n1 = Calendar.getInstance();
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.print("년:");
		year = scan.nextInt();
		
		System.out.print("월:");
		month = scan.nextInt()-1;
		
		System.out.print("일:");
		day = scan.nextInt();
		
		n1.set(Calendar.YEAR, year);
		n1.set(Calendar.MONTH, month);
		n1.set(Calendar.DATE, day);
		
		int dOW = n1.get(Calendar.DAY_OF_WEEK); //Day of Week
		
		
		if(dOW == 1 || dOW == 7) {
			System.out.printf("입력하신 날짜는 '휴일(토/일)입니다.\n");
			System.out.println("결과가 없습니다.");
		} else {
				System.out.printf("입력하신 날짜는 '평일'입니다.\n");
				System.out.printf("해당 주의 토요일로 이동합니다.\n");
				n1.set(Calendar.DAY_OF_WEEK, 7);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", n1);
		}
		
		
		
		
		
		
		
		
		
	}//main

}