package com.test.question;

import java.util.Scanner;

public class Q038 {
//	요구사항
//	입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int odd = 0;
		int oddcount = 0;
		int even = 0;
		int evencount = 0;
		
		System.out.print("입력 횟수: ");
		int inputnumber = scan.nextInt();
		
		
		for(int i=1; i<=inputnumber; i++) {
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			even += num;
			evencount++;
		} else if(num % 2 != 0) {
			odd += num;
			oddcount++;
		 }
		
		}//for
		System.out.printf("짝수 %d개의 합:%d\n", evencount, even);
		System.out.printf("홀수 %d개의 합:%d\n", oddcount, odd);
		
		
		
		
		
		
	}//main
}
