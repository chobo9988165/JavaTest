package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {

		/*
		 * 요구사항 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		 * 
		 * 조건: 출력 숫자에 천단위 표기 하시오.
		 * 		결과값은 소수 이하 1자리까지 표기 하시오.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		//결과를 정확하게 그대로 출력하는게 맞기 때문에, 정수형으로 저장, 출력에 실수형이 나오는 부분만 형변환을 하는게 맞을 것 같다
		
		System.out.print("첫번째 숫자:");
		float number1 = scan.nextInt();
		
		System.out.print("두번째 숫자:");
		float number2 = scan.nextInt();
		
		                                  
		System.out.printf("%,.1f + %,.1f = %,.1f\n", number1, number2, number1 + number2);
		System.out.printf("%,.1f - %,.1f = %,.1f\n", number1, number2, number1 - number2);
		System.out.printf("%,.1f * %,.1f = %,.1f\n", number1, number2, number1 * number2);
		System.out.printf("%,.1f / %,.1f = %,.1f\n", number1, number2, number1 / number2);
		System.out.printf("%,.1f %% %,.1f = %,.1f\n", number1, number2, number1 % number2);
		                                  
		
		
	}//main

}
