package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		
		/*
		 * 요구사항 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		 * 너비
		 * 조건: 사각형 넓이 = 너비 * 높이
		 * 		사각형 둘레 = (너비 * 2) + (높이 * 2)
		 */
		
		
		
		//값을 입력받아 그대로 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("너비(cm):");
		int width = scan.nextInt();
		
		System.out.print("높이(cm):");
		int height = scan.nextInt();
		
		System.out.printf("사각형의 넓이는 %dcm²입니다.\n", width * height);
		System.out.printf("사각형의 둘레는 %dcm입니다.\n", width * 2 + height * 2 );
		
		
		
		
	}//main

}
