package com.test.question;

import java.util.Scanner;

public class Q044 {
//	요구사항
//	숫자를 N개 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	누적값이 100을 넘어가는 순간 루프를 종료하시오.
//	짝수는 더하고 홀수는 빼시오.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String sumString = "";
		
		
		for(int i=1; true; i++) {
			
			System.out.print("숫자: ");
			int num=scan.nextInt();
			
			if(num % 2 == 0) {
				sum += num;
				sumString += " + " + num;
			} else if(num % 2 != 0) {
				sum -= num;
				sumString += " - " + num;
			}
				
			if(sum > 100) {		//비교값이 달라서 따로 뺌(num, sum)
				break;
			}
		}//for
		
		System.out.printf("%s = %d", sumString, sum);
	}//main

}
