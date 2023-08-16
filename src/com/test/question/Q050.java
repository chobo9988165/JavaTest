package com.test.question;

import java.util.Scanner;

public class Q050 {
	public static void main(String[] args) {
		
		
		//A.반복하기 0~num
		//2.공백찍기 4~0
		//1.별찍기   1~num
		
	
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			
			for(int j=i; j<num; j++) {
				System.out.print(" ");
			}
			
			for(int j=num-i; j<=num; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}


}
