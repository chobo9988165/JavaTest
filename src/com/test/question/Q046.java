package com.test.question;

import java.util.Scanner;

public class Q046 {
	
	public static void main(String[] args) {
//		요구사항
//		숫자를 10개 입력받아 한글로 변환 후 출력하시오.
//
//		조건..
//		1~9까지만 입력하시오.
		
		Scanner scan = new Scanner(System.in);

		String snum = "";
		
		
		for(int i=1; i<=10; i++) {
			
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		if(num == 1) snum += "일";
		if(num == 2) snum += "이";
		if(num == 3) snum += "삼";
		if(num == 4) snum += "사";
		if(num == 5) snum += "오";
		if(num == 6) snum += "육";
		if(num == 7) snum += "칠";
		if(num == 8) snum += "팔";
		if(num == 9) snum += "구";
		}
		System.out.printf("%s", snum);
		
	}//main

}
