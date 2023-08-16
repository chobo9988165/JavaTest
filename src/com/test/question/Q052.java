package com.test.question;

import java.util.Scanner;

public class Q052 {
	
//문자코드
//      9797
//	  97989897
//  979899999897
// 97+num 
// 97+num 97+num-1
// 97+num 97+num-1 97+num-2
// 97+j 97+j-1 97+-j-2
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int num = scan.nextInt();
		
		
		for(int i=1; i<=num; i++) {
			
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.printf("%c", 97+j);
			}
			for(int j=num; j<=num; j--) {
				System.out.printf("%c", 97+(j));
			}
			System.out.println();
			
		}
	}//main

}
