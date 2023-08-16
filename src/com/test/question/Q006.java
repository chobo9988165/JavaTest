package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		
		
		/*
		 * 요구사항 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		 * 
		 * 조건: 세금 = 수입 * 0.033;
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("한달 수입 금액(원):");
		double monthincome = scan.nextLong();
		
		System.out.printf("세후 금액(원): %,.0f원\n", monthincome - (monthincome * 0.033));
		System.out.printf("세금(원): %,.0f원\n", monthincome * 0.033);
		
		
		

	}//main

}
