package com.test.java.obj;

import java.util.Calendar;

public class Ex39_Access {
	
	public static void main(String[] args) {
		
		
		//Ex39_Access.java
		
		
		/*
		
			접근 지정자(제어자), Access Modifier
			- 클래스 멤버에 붙여서 사용한다. > 멤버 변수, 멤버 메소드
			- 클래스 자체에 붙여서 사용한다.
			- 지역 변수에는 사용이 불가능
			- 클래스(객체)의 영역을 기준으로, 외부에 해당 멤버를 어떻게 노출할지 통제하는 역할 > 보안 수준 제어
			
			
			
			
			1. public  >> 가장 낮음
			2. private >> 가장 높음
			--------------
			3. protected > 상속
			4. default > 패키지
		
		*/
		
		
		Box box = new Box();
		
		
		box.color = "갈색"; //public
		// box.size = 100; //private 안보임
		
		
		box.aaa();
		//box.bbb();
		
		
		
		//Book 객체
		Book book = new Book();
		
		//book.aaa("자바의정석");
			
		
		book.setTitle("자바의정석");  //Setter 쓰기
		System.out.println(book.getTitle());		//Getter 읽기
		
//		book.title = "자바의 정석";
//		book.author = "홍길동";
//		book.publisher = "도우출판";
//		book.price = 30000;			//음수나 적절하지 않은 숫자가 나올 경우 치명적, 조건 걸기
//		book.page = 1000;
		
		
		
//		int temp = 30000; 			//책가격
//		book.price = temp;
//		
//		if (temp >= 0 && temp <= 100000) { //유효성 검사
//			book.price = temp;
//		} else {
			
//		}
		
		
		
		
		
		
		Mouse m1 = new Mouse();
		
		m1.setModel("M910");
		System.out.println(m1.getModel());

		
		//쓰기 전용 : 읽어올 Getter 존재하지 않음
		m1.setPrice(50000);
		System.out.println();
		
		
		
		//읽기 전용 : 입력할 Setter 존재하지 않음
		System.out.println(m1.getColor());
		
		
		//Getter/Setter 역할
		//1. private 멤버 > 인터페이스 역할
		//2. 읽기 전용 멤버, 쓰기 전용 멤버
		//3.
		
//		Calendar date = Calendar.getInstance();
//		date.add(Calendar.YEAR, -3);
//
//		
//		m1.setDate(date);
//		System.out.printf("마우스 제조년월일: %tF\n", m1.getDate());
		
		//m1.getState > private String state;
		
		
		//(객체) 사용자 편의성 향상
		m1.setDate(2020, 7, 31);
		
		System.out.println(m1.getDate());
		
		System.out.println(m1.getState());
		
		
		//개발자가 개발의 상태를 확인하고 싶을 때 찍는 메소드 > dump
		System.out.println(m1.info());
		
	}//main

	private static void m1() {
		// TODO Auto-generated method stub
		
	}

}
