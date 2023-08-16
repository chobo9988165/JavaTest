package com.test.question;

import java.util.Scanner;

public class Q029 {
//	요구사항
//	숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
//
//	조건..
//	정수만 입력하시오.(유효성 검사 필요없음)
//	나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
//	연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
	
	public static void main(String[] args) {
		String operator = "";
		int firstNumber = 0;
		int secondNumber = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 숫자:");
		firstNumber = scan.nextInt();
		
		System.out.print("두번째 숫자:");
		secondNumber = scan.nextInt();
		scan.nextLine(); //?
		
		System.out.print("연산자:");
		operator = scan.nextLine();
		
		if(operator.equals("+")) {
			System.out.printf("%d %s %d = %d", firstNumber, operator, secondNumber, firstNumber+secondNumber);
		} else if(operator.equals("-")) {
			System.out.printf("%d %s %d = %d", firstNumber, operator, secondNumber, firstNumber-secondNumber);
		} else if(operator.equals("*")) {
			System.out.printf("%d %s %d = %d", firstNumber, operator, secondNumber, firstNumber*secondNumber);
		} else if(operator.equals("/")) {
			System.out.printf("%d %s %d = %.1f", firstNumber, operator, secondNumber, (double)firstNumber/secondNumber);
		} else if(operator.equals("%")) {
			System.out.printf("%d %s %d = %d", firstNumber, operator, secondNumber, firstNumber%secondNumber);

		}
	}

}
