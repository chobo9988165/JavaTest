package com.test.java.collection;

public class Ex66_Annonymous {
	
	public static void main(String[] args) {
		
		//Ex66_Annoymous.java
		
		/*
		 * 
		 * 
		 * 
		 * 		익명 객체, Annonymous Object
		 * 		-익명 클래스 ,Annonymous Class
		 * 		-이름없는 클래스
		 * 
		 * 
		 * 
		 * 
		 */
		
		//요구사항] 인터페이스를 구현한 클래스 선언 > 객체 생성
		
		//1. 본인 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();
		
		
		//2.부모 타입(인터페이스)으로 참조 변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();
		
		//3.
//		AAA b3 = new AAA();//인터페이스는직접적으로인스턴스를구현할수없다
//		b3.aaa();
		
		//The type new AAA(){} must implement the inherited abstract method 
		//AAA.aaa()
		AAA b3 = new AAA() {		//new AAA()는 의미없음, 지워보면 aaa b3 = {} 형태(머리(이름)없는 클래스)
			//익명 클래스. 익명 클래스는 강제로 앞에 있는 인터페이스의 자식이 된다.
			//자신의 타입 변수 생성 불가
			@Override
			public void aaa() {
				
				System.out.println("aaa");
				
			}
			
			
		};
		b3.aaa();
		
		
		
		//b2 vs b3
		
		//b2
		//- AAA 인터페이스 선언
		//- BBB 클래스 구현
		
		//b3
		//- AAA 인터페이스 선언
		//- 실명 클래스 구현(X) > 익명 클래스 구현(O)
		
		//익명 클래스 구현 > 클래스 재사용성 때문
		//익명 클래스 > 재사용 의사 없음
		//실명 클래스 > 재사용 의사 있음
		
		//클래스 사용 목적 > 객체 생성
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		//익명 클래스 > 붕어빵틀이긴한데 딱 한 번만 만들기 위한 틀
		AAA t4 = new AAA(){
			@Override
			public void aaa() {
				
			}
				
		};
		
		
		AAA t5 = new AAA() {		//t4와 t5는 전혀 다른 별개의 클래스
			@Override
			public void aaa() {
				
			}
		};
		
		
	}//main
	

}

class Test {
}


interface AAA {
	void aaa();
}

//The type BBB must implement the inherited abstract method AAA.aaa()
class BBB implements AAA {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa");
	}
	
}