package com.test.java.obj;

public class Ex36_Class {
	
	public static void main(String[] args) {
		
		//Ex36_Class.java
		
		/*
		 
		 	언어의 성향
		 	1. 절차적 프로그래밍
		 	2. 함수 지향 프로그래밍
		 	3. 객체 지향 프로그래밍
		 
		 
		 
		 	자바
		 	- 객체 지향 프로그래밍 언어, Object Oriented Programing
		 	- OOP
		 	- 객체를 선호하는 프로그래밍 방식의 언어
		 
		 
		 	클래스, Class
		 	
		 	1. 객체, Object
		 		- 사전적인 정의로 실제 존재하는 것을 말한다.
		 		- 객체지향 이론에서는 개념, 논리 등 무형적인 것들도 객체로 간주
		 		- 맥도날드 > 모든 주문 > 직업 
		 						   > 키오스크
		 	
		 	2. 클래스, Class
		 		- 객체를 분류하는 단위
		 		- 객체를 생성하는 단위
		 		
		 		ex) 붕어빵틀
		 			a. 붕어빵틀을 만든다.
		 			b. a를 사용해서 붕어빵을 만든다. > 붕어빵: 객체
		 			c. 붕어빵을 먹는다.
		 			
		 		ex2) 핸드폰
		 			a. 설계도 제작 > 핸드폰 제작
		 			b. a를 사용해 핸드폰을 제작.
		 			c. 핸드폰 사용.
		 	
		 	3. 인스턴스, Instance
		 		- 객체
		 		- 견해 1) 객체 == 인스턴스
		 		- 견해 2) 객체 != 인스턴스 
		 		- 우리는 비슷하게 보는걸로 간다.
		 		- ★메모리에 실체화된 객체
		 		
		 		
		 	4. 캡슐화, 정보은닉
		 		- 객체의 내부를 외부로부터 보호하기 위한 장치
		 		
		 		
		 		
		 	5. 인터페이스
		 		- 캡슐화된 내부와 외부간의 최소한의 연결이 가능한 통로 역할
		 		ex) 게임 인터페이스, 리모콘의 전원 버튼
		 		
		 	객체 = 데이터 + 행동
		 		
		 	리모콘 = 데이터(회색, 100g, 8cm...) + 행동 (전원 ON, OFF)
		 	
		 	홍길동 = 데이터(나이, 체중, 피부색...) + 행동 (말하기, 먹기, 자기...)
		 	
		 		
		 	6. 프로퍼티, Property
		 		-객체가 가지는 정보(데이터)
		 	
		 	7. 행동
		 		- 객체가 가지는 행동
		 	
		 	8. 상속
		 		- 부모가 가지는 재산을 자식이 물려받는 행동
		 
		 
		 
		 
		 */
		
		//요구사항] 지도 > 우리집 > 좌표 > 저장
		
		//Case. 1
		//- 가장 간단한 방법
		//- 식별자 문제
		//- a. 같은 성질의 식별자가 서로 다른 이름을 사용하고 있다.
		//- b. 한쌍의 집합 > 물리적 관리 불가능 > 치명적 > x,y 끼리 묶고 x2,y2끼리 묶는건 경험에 의존하는 행위
		//- 구조(X), 규칙(애매) > 조작 불편
		//- 혼자 연습하더라도 안좋은 짓(버릇들면 못고쳐서)
		
		//우리집 좌표
		int x = 100;
		int y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", x, y);
		
		//마트 좌표
		int x2 = 300;
		int y2 = 400;
		
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n", x, y);
		
		
		//Case 2.
		//- 배열 사용
		//- 데이터 저장 구조 생성 > 그룹 > 관리 수월
		//- 배열 단점 > 요소간의 성질을 구분하기 힘들다. > 첨자 사용 > 첨자는 의미를 가지지 못함
		//> 몇번째 방에 어떤 데이터를 넣었는지 관리 힘들다. > 배열은 같은 타입의 같은 성질의 데이터의 집합
		
		
		//우리집
		int[] a1 = { 100, 200 };
		
		//a1[0] > 0 > x좌표
		//a1[1] > 1 > y좌표
		
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", a1[0], a1[1]);
		
		//마트
		int[] a2 = { 300, 400 };
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", a2[0], a2[1]);
		
		//Case 3.
		//- 클래스 사용 > 데이터 집합(**************************************)
		//- 데이터 저장 구조 생성 > 관리 수월
		//- 같은 클래스의 객체 > 멤버 이름 동일 > 데이터 의미 명확
		//- 멤버 변수의 이름이 존재 > x, y > 배열과 달리 멤버의 의미 명확
		//- 클래스 선언 비용 발생(고가) > 개발자 할일 증가 
		
		
		//클래스명    변수명 = new 생성자();
		  Point      p1 = new Point(); //new Point(); 객체 생성
		  Point		 p2 = new Point();
		  
		  p1.x = 100;
		  p1.y = 200;
		  
		  System.out.printf("우리집은 [%d,%d]에 위치합니다.\n", p1.x, p1.y);
		
		  
		  p2.x = 300;
		  p2.y = 400;
		
		  System.out.printf("우리집은 [%d,%d]에 위치합니다. \n", p2.x, p2.y);
		  
		  
		  //요구사항] 크기 저장 > 너비, 높이
		  Size s1 = new Size();
		  
		  s1.name = "모니터";
		  s1.height = 100;
		  s1.width = 150;
		  
		  System.out.println(s1.name);
		  System.out.println(s1.width);
		  System.out.println(s1.height);
		  
		  
		  //학생 성적 > 이름, 국어, 영어, 수학 > 집합(=학생 1명)
		  
		  Score hong = new Score();
		  
		  hong.name = "홍길동";
		  hong.kor = 100;
		  hong.eng = 90;
		  hong.math = 80;
		  
		  //이클립스 > 확장 프로그램(Plugin-in)
		  //1. 직접 설치
		  //2. 마켓 플레이스
		  
		  //Objectaid >  UML 확장 프로그램
		  //- Class Diagram
		  
		  //UML, Unified Modeling Language
		  //- 프로그램의 설계도를 만드는 언어
		  //- 수많은 종류의 설게도
		  // a. Class Diagram
		  // b. Package Diagram
		  // c. Object Diagram
		  // d. Component Diagram
		  // e. Sequence Diagram
		  // f. UseCase Diagram
		  // g. Activity Diagram
		  // h. State..
		  
		  
		  
		  
		  
		  
		
	}//main

}//class


class Score {
	
	
	public String name;
	public int kor;
	public int eng;
	public int math;
	
}



class Size {
	public String name;
	public int width;
	public int height;
}



//클래스 선언하기 > 붕어빵 틀 만들기
//- 클래스명 > 파스칼 표기법
//- 클래스는 추상적, 규칙
class Point {
	
	//클래스 내부?
	// > 클래스 멤버 선언하기 > 변수 or 메소드
	
	//변수 > 객체 변수, 객체 멤버 변수
	public int x;
	public int y;
	
}
