package com.test.java;

import java.util.Scanner;

public class Ex28_switch {
	
	public static void main(String[] args) {
		
		//Ex28_switch.java
		
		/*
		 
		    switch문, switch case문
		    - 조건이 boolean이 아닌 일반 값이다. > 정수, 문자열, 열거형(enum)
		    -if문보다 활용도가 떨어진다.
		    -if문보다 가독성이 높다.
		    
		    switch(조건) {
		    	case 값:
		    		문장:
		    		break;
		    	[case 값:
		    		문장:] x N
		    	[default:
		    		문장:
		    		break;]
		    		
		    }
		 
		 */
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}//main

	private static void m4() {
		Scanner scan = new Scanner(System.in);
		
		//-nextLine() vs 나머지 ()
		//	- nextLine() : 입력된 버퍼에서 개행문자를 만나기 전까지 읽기
		//  - ※위의 개행문자를 버퍼에서 제거한다.
		
		// -nextXXX()
		//	- 입력된 버퍼에서 개행문자를 만나기 전까지 읽기
		//	- ※위의 개행문자를 버퍼에서 제거하지 않음
		//	- 지들끼리는 자동으로 스킵하는 기능 내장 \r\n 남기지 않음
		
		//nextLine() 처리 순서
		//1. 홍길동\r\n
		//2. \r\n
		//3. \r\n 삭제
		
		
		//1. 숫자 입력
		//2. 문자열 입력
		
		System.out.print("숫자: ");		
		int num = scan.nextInt();			//10\r\n
		System.out.println(num);					
											//  \r\n
		
		//scan.skip("\r\n"); 쓰면 개행문자 버린 뒤 정상적으로 실행됨, 정석
		//scan.nextLine(); 같은 일 수행, Scanner()만의 문제
		System.out.print("문자열: ");
		String txt = scan.nextLine();		//  \r\n만 읽은 뒤 버림
		System.out.println(txt);			// 종료됨
		
		System.out.println("종료");
		
	}

	private static void m3() {
		
		//요구사항] 사용자가 월을 입력 > 해당 월의 마지막 일?
		int lastDay = 0; //마지막일
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월: ");
		
		int month = scan.nextInt();
		
		
		switch (month) {
		case 1: case 3: case 5:case 7:case 8:case 10:case 12:
			lastDay = 31;
			break;
		case 2 :
			lastDay = 28;
			break;

		case 4 : case 6: case 9: case 11:
			lastDay = 30;
			break;
		}
		
		System.out.printf("입력한 %d월의 마지막 날짜는 %d일입니다.\n", month, lastDay);

		
	}

	private static void m2() {
		//요구사항] 자판기
		//- 메뉴 출력 > 음료 선택 > 가격 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=================");
		System.out.println("      자판기");
		System.out.println("=================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("-----------------");
		System.out.println("선택(번호입력): ");					//숫자로 입력하라 명시해주어야 함
		
		int input = scan.nextInt();
		
		
		//값: > Label(표시판) ※잘 안씀
		
		switch (input) {
			case 1:
			case 2:
				//System.out.print("1500원입니다.");
				//break;
				System.out.print("1500원입니다.");
				break;
			case 3:
				System.out.print("500원입니다.");
				break;
			default:
				System.out.println("잘못된 선택");
				break;
		}
	}

	private static void m1() {
		
		//1 > "하나"
		//2 > "둘"
		//3 > "셋"
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		if (num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");
		} else if (num == 3) {
			System.out.println("셋");
		}
		
		switch(num) {
			case 1 :
				System.out.println("하나");
				break;
			case 2 :
				System.out.println("둘");
				break;
			case 3 :
				System.out.println("셋");
				break;
		}
		
		
	}

}