package com.test.question;

import java.util.Scanner;

public class Q040 {
	
//	요구사항
//	아래와 같이 출력하시오.
//	시작 숫자: 1 
//
//	종료 숫자: 10 
//
//	출력..
//	1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("시작 숫자: ");
		int startnumber = scan.nextInt();
		System.out.print("종료 숫자: ");
		int endnumber = scan.nextInt();
		
		for(int i=startnumber; i<=endnumber; i++) {
			if(i == startnumber) {
				System.out.print(i);
				sum = sum + startnumber;
				continue;
			}//1일 경우만 예외처리
			
			if(i % 2 == 0) {
				System.out.printf(" - %d", i);
				sum -= i;
				
			} else {
				System.out.printf(" + %d", i);
				sum += i;
			}
		}//for
		
		System.out.printf(" = %d", sum);
		
		
		
		
		
		
		
		
	}

}
