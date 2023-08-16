package com.test.question;

import java.util.Scanner;

public class Q048 {
	public static void main(String[] args) {
//		요구사항
//		최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
//
//		조건..
//		int 양수만 입력하시오.
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int oddSum = 0, evenSum = 0;
		
//		System.out.print("숫자 입력: ");
//		int num = scan.nextInt();
		
		
		int num = 273645281;		//27364528
		
		for (;;) {
			
			//System.out.println(num % 10);
			
			if (num % 10 % 2 == 0) {
				evenSum += num % 10;
			} else {
				oddSum += num % 10;
			}
			
			sum += num % 10;
			num = num / 10;
			
			if (num == 0) {
				break;
			}
			
			
		}
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println(sum);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		int oddnum = 0, evennum = 0;
//		
//		System.out.print("숫자 입력:");
//		int num = scan.nextInt();
//		
//		if(num <= 0) {
//			System.out.println("양수만 입력하세요.");
//			return;
//		}			//양수 이외 숫자 입력할 경우 메소드 종료
//		
//		for(int i=10; i<=1000000000; i = i*10) {		 
//			if(((num % i) / (i/10)) % 2 == 0) {
//			evennum =(int)((num % i) / (i/10) + evennum);
//															//123456789 % 10 = 9 = 9 / (i/10)
//															//123456789 % (10 * 10) = 89 / (100/10) = 8.9
//															//123456789 % (10 * 10 * 10) = 789 / 100 = 7.89
//			} else { //0의 경우, 더하든 빼든 의미 없음
//				oddnum = (int)((num % i) / (i/10) + oddnum);
//			}
//		}//for
//		System.out.printf("짝수의 합: %d\n", evennum);
//		System.out.printf("홀수의 합: %d\n", oddnum);
		
	}

}
