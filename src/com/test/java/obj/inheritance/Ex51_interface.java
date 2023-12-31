package com.test.java.obj.inheritance;

public class Ex51_interface {
	
	public static void main(String[] args) {
		
		//Ex51_interface.java
		
		/*
		 * 
		 * 
		 * 	인터페이스, interface
		 *  - 클래스의 일종
		 *  - 자료형
		 *  - 객체 생성 불가
		 *  - 참조 변수는 생성 가능
		 *  - 클래스의 부모 역할 > 상속
		 *  
		 *  
		 */ 
		
		
		//Cannot instantiate the type mouse
		//Mouse m1; // = new Mouse();
		//m1.click();
		
		//*** 인터페이스는 상속받는 여러 클래스들을 행동(사용법, 메소드)들을 통일시키는 역할 > 행동 규약 정의
		
		
		M705 m1 = new M705();
		m1.click();
		m1.click();
		
		G304 m2 = new G304();
		m2.click();
		//m2.push();//****문제점! > 사용자 경험을 살리지 못함!!!!!!!!!!!!
		
		
		
		
		
		
		
		
	}

}//class


///인터페이스 선언
interface Mouse {
	
	//인터페이스 멤버
	//- 멤버 변수
	//- 멤버 메소드
	//- 인터페이스는 추상 멤버만을 가질 수 있다.(추상 메소드)
	
	//****** 인터페이스는 구현된 멤버를 가질 수 없다.
	//public int a;
	//public void aaa() { }
	
	//*****/ 인터페이스는 구현부를 가진 메소드를 소유할 수 없다.
	//public void aaa() {
		//구현부
	//}
	
	//추상 메소드, Abstract Method
	//- 구현부 없이 선언부만 가지는 메소드
	public void click();
	
}

//The type M705 must implement the inherited abstract method Mouse.click()
//*** 인터페이스를 상속받는 클래스는 반드시 인터페이스의 추상 메소드를 구현해야 한다.
class M705 implements Mouse{

	public void click() {
		System.out.println("클릭");
		
	}
	
	//추상 메소드를 구현했다. > 일종의 오버라이드처럼 보이는 것

	
	
	//	public void click() {
//		
//	}
	
}

class G304 implements Mouse {
	
	public void click() {
		System.out.println("클릭!!");
	}
}
