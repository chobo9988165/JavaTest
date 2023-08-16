package com.test.question;

import java.util.Scanner;

public class Q080 {
	
	//요구사항
	//문장을 입력받아 역순으로 출력하시오.
	//방번호바꾸는걸로는 안됨.
	//문자 하나 하나 추출한 것
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력: ");
		String kor = scan.nextLine();
		StringBuilder rkor = new StringBuilder();
		
		for (int i=0; i<kor.length(); i++) {
			
			rkor = rkor.append(kor.substring(kor.length()-i-1,kor.length()-i));
			
			
		}
		
		System.out.println("\"" + rkor + "\"");
		
		
		
		
		
		
		
	}//main

}
