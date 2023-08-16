package com.test.question;

import java.util.Scanner;

public class Q082 {
	
//	요구사항
//	숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
// substring
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		String nums = scan.nextLine();
		StringBuilder sum = new StringBuilder("");
		for(int i=0; i<nums.length(); i++) {
			
			sum = sum.append(nums.substring(i,i+1));
			
		}
		
		
		
		
		
		
		
	}//main

}
