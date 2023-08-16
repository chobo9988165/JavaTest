package com.test.question;

import java.util.Scanner;

public class Q051 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	조건..
//	행의 갯수를 입력받으시오.
	
	
	//행 찍기 1~num
	//공백 찍기 4 3 2 1 0
	
	//별 찍기 1 0
	//       2 1
	//       3 2
	//       4 3
	//       5 4

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int j=num-i+1; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}//main
		
		
		
}


