package com.test.question;

import java.util.Scanner;

public class Q031 {
	
//	요구사항
//	숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int odd = 0; //홀수
		int even = 0;
		
		System.out.print("숫자 입력:");
		int n1 = scan.nextInt();
		System.out.print("숫자 입력:");
		int n2 = scan.nextInt();
		System.out.print("숫자 입력:");
		int n3 = scan.nextInt();
		System.out.print("숫자 입력:");
		int n4 = scan.nextInt();
		System.out.print("숫자 입력:");
		int n5 = scan.nextInt();

		if(n1 % 2 == 0) even = even + 1; else odd = odd + 1;
		if(n2 % 2 == 0) even = even + 1; else odd = odd + 1;
		if(n3 % 2 == 0) even = even + 1; else odd = odd + 1;
		if(n4 % 2 == 0) even = even + 1; else odd = odd + 1;
		if(n5 % 2 == 0) even = even + 1; else odd = odd + 1;
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		
		if(odd > even) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
		} else if(odd > even) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", even - odd);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
