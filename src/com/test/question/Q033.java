package com.test.question;

import java.util.Scanner;

public class Q033 {
	
	/*
		a. 년도를 4로 나눈다.
		떨어지면 b 검사
		떨어지지 않으면 "평년"
		b. 년도를 100으로 나눈다.
		떨어지면 c 검사
		떨어지지 않으면 "윤년"
		c. 년도를 400으로 나눈다.
		떨어지면 "윤년"
		떨어지지 않으면 "평년"
	 */
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1 = 0;

		
		System.out.print("년도 입력:");
		n1 = scan.nextInt();
		
		if(n1 % 4 != 0 && n1 % 400 != 0) {System.out.printf("%d년은 '평년'입니다.\n", n1);}
		else if(n1 % 400 == 0 || n1 % 100 != 0) {System.out.printf("%d년은 '윤년'입니다.\n", n1);}
	
//		if(n1 % 4 == 0) {
//			if(n1 % 100 == 0) {
//				if(n1 % 400 == 0) {
//					System.out.printf("%d년은 '윤년'입니다.\n", n1);
//								  } else if (n1 % 400 != 0) { System.out.printf("%d년은 '평년'입니다.\n");}
//			} else if(n1 % 100 != 0) {
//				System.out.printf("%d년은 '윤년'입니다.\n", n1);
//									 }
//		} else if(n1 % 4 != 0) System.out.printf("%d년은 '평년'입니다.\n", n1);
		
		
	}
}
