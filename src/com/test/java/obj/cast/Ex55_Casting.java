package com.test.java.obj.cast;

public class Ex55_Casting {
	
	public static void main(String[] args) {
		
		//Ex55_Casting.java
		/*
		 
		 
		 
		 	형변환, Type Casting
		 	1. 값형 형변환
		 		- 값형끼리 형변환(boolean 제외)
		 		- 숫자끼리 형변환
		 		
		 		
		 	2. 참조형 형변환
		 		- 참조형끼리 형변환
		 		- 클래스끼리 형변환
		 		
		 		
		 	참조형 형변환
		 	- 전제조건: 1.상속 관계의 클래스간 형변환만 지원
		 			  2.직계끼리만 가능(방계는 불가능)
		 	- A클래스 > 8클래스
		 
		 	1. 업캐스팅, Up Casting
		 		-암시적 형변환
		 		-100% 안전
		 		-자식 클래스 > 부모 클래스
		 		
		 	2. 다운캐스팅, Down Casting
		 		-명시적 형변환
		 		-불안정
		 		-부모 클래스 > 자식 클래스
		 		
		 	
		 	Case 1
		 	1 2 3 4
		 	첫번째 종이 > 구멍 네개 > 1234 다 보임
		 	두번째 종이 > 구멍 두개 > 12만 보임
		 	사용자는 둘 다 만족(뚫린 구멍만큼 보이기 때문에)
		 	
		 	Case 2
		 	1 2 3 4
		 	첫번째 종이 > 구멍 네개 > 두개만 보임 → ??		 	
		 		
		 		
		 */
		
		
		
		Parent p1;
		Child c1;
		
		c1 = new Child(); //원본
		
		//복사
		//Parent = Child
		//암시적 형변환
		//부모 클래스 = 자식 클래스
		//업캐스팅(***)
		//안전(복사된값문제없이처리가능)
		p1 = (Parent)c1; //원형
		p1 = c1;		 //생략 가능
		
		//복사 후 검증 방법 > 복사된 참조 변수(p1) > 모든 멤버 접근 테스트
		p1.a = 10;
		p1.b = 20;
		//p1.c, p1.d > 안보임(구멍2개 값4개)
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		//메모리 상태
		//Stack : p1=100, c1=200
		//Heap :  p1 > a b ㅣ c1 > a b c d
		//p1 = c1 > 주소값 복사
		//p1 = 200, c1 = 200
		
		
		Parent p2;
		Child c2;
		
		p2 = new Parent(); //원본
		
		//Child = Parent
		//명시적 형변환
		//자식 클래스 > 부모 클래스
		//다운 캐스팅 > 형변환 생략 불가
		//불안정 > 불가능
		//c2 = (Child)p2;
		
		//검증? 복사본을 사용하는데 문제가 없는지?
//		c2.a = 10;
//		c2.b = 20;
//		c2.c = 30;			//누구는 존재하고 누구는 존재하지 않는지 확인할 방법 없다.
//		c2.d = 40;
		
		//java.lang.ClassCastException: class com.test.java.obj.cast.
		//Parent cannot be cast to class com.test.java.obj.cast.Child

//		System.out.println(c2.a);
//		System.out.println(c2.b);
//		System.out.println(c2.c);
//		System.out.println(c2.d);
		
		
		Parent p3;
		Child c3;
		
		c3 = new Child(); //원본
		
		//업캐스팅
		p3 = c3;
		
		
		Child c4;
		//정상적으로 실행되는 다운 캐스팅
		//→ p3 안의 주소값이 가르키는 건 c3기 때문
		//※업, 다운 캐스팅은 자바뿐만 아니라 상속을 지원하는 언어에서 매우 자주 사용됨
		
		c4 = (Child) p3;
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
		
		
		
		
		
	}

}//



class Parent {
	public int a;
	public int b;
	
}

class Child extends Parent {
	public int c;
	public int d;
	
}