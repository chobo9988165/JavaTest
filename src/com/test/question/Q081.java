package com.test.question;

import java.util.Scanner;

public class Q081 {
//	요구사항
//	이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
//	1. indexof
//	2. split
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이메일: ");
		String email = scan.nextLine();
		
		String temp[] = email.split("@");
		
		System.out.printf("아이디: %s\n", temp[0]);
		System.out.printf("도메인: %s\n", temp[1]);
		
		
		
	}
	
	
}
