package com.test.question;

import java.util.Scanner;

public class Q027 {
//	요구사항
//	문자 1개를 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	f, F → Father
//	m, M → Mother
//	s, S → Sister
//	b, B → Brother
//	유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
//	입력..
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("문자: ");
		String alphabet = scan.nextLine();
		
		if(alphabet.equals("f") || alphabet.equals("F")) {
			System.out.println("Father");
		} else if(alphabet.equals("m") || alphabet.equals("M")) {
			System.out.println("Mother");
		} else if(alphabet.equals("s") || alphabet.equals("S")) {
			System.out.println("Sister");
		} else if(alphabet.equals("b") || alphabet.equals("B")) {
			System.out.println("Brother");
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
	}
}
