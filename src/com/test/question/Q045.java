package com.test.question;

import java.util.Scanner;

public class Q045 {
//	요구사항
//	사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
//
//	조건..
//	최대 3자리까지만 입력하시오.
	public static void main(String[] args) {
		//369 찾는 과정을 생각하는게 핵심
		//3 6 9가 들어갈 경우~ 
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("최대 숫자: ");
		num = scan.nextInt();
		
		if(num < 1000) {
			for (int i=1; i<=num; i++) {
				System.out.print(checkClap(i) + "");
			}///for
			
			System.out.println();
			
		} else {
			System.out.println("1000 이하만 가능합니다.");
		}
				
		
	}//main
	
	
	private static String checkClap(int i) {
		
		String temp = "";
		int n = i;
		
		for(; n > 0;) {
			
			if (n % 10 % 3 == 0 && n % 10 != 0) {
				temp += "짝";
			}
			
			n /= 10;
		}
		
		if (temp.equals("")) {
			
			return i + "";
		} else {
			return temp;
		}
	}//check
}
