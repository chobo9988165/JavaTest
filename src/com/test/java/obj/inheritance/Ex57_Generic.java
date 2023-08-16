package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex57_Generic {
	
	public static void main(String[] args) {
		
		//EX55_Generic.java
		
		//클래스
		//1. 클래스
		//2. 인터페이스
		//3. 추상 클래스
		//4. enum
		//5. 제네릭 클래스
		
		//요구사항] 클래스 설계
		//1. 멤버 변수 선언 > int
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언
		
		//추가사항] String 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] Boolean 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//..
		//..
		//..
		//..추가사항] Student 중심 클래스 설계 + 나머지 업무는 동일
		//계속 증가할 때 해결법
		
		
		//위의 문제점 > 해결 방안
		//1. Object 클래스 > 오래된 방식 ~ 현재 방식
		//2. 제네릭 클래스 > 최신 방식 ~ 현재 방식

		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString());
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println();
		System.out.println();
		
		Wrapper<Double> f1 = new Wrapper<Double>(10.0);
		System.out.println(f1.toString());
		System.out.println();
		System.out.println();
		
		Wrapper<Character> c1 = new Wrapper<Character>('a');
		System.out.println(c1.toString());
		System.out.println();
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("이순신");
		System.out.println(s3.toString());
		System.out.println(s3.getData().length());
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.toString());
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
		
		
		
		
		//**** 값형과 참조형간 형변환 절대 불가능
		//값형 변수 내에는 무조건 값, 참조형에는 무조건 주소
		//주소를 저장하는 모든 참조 변수는 항상 Integer(운영체제 생각하면 됨)
		//Object 변수 == 만능 주머니(모든 자료형 담을 수 있는 변수)
		//※미련하게 자료형 전부 클래스 만들어서 담을 필요 없이 object 쓰면 해결※
		Object o1 = new Object();
		Object o2 = new Hong();		//업캐스팅
		Object o3 = new Scanner(System.in);
		Object o4 = new WrapperInt(1);
		Object o5 = "홍길동";
		//--------------------------------
		Object o6 = 10;		// = new Integer(10);박싱(Boxing) > 오토박싱
		Object o7 = true;	// 시도하는 순간 heap에 인스턴스 생성되고, 인스턴스 안의 멤버 변수로 들어감
							// 이후 10의 주소값 저장
		
		//System.out.println(o6 * 2);
		System.out.println((Integer)6 * 2); //언박싱(Unboxing)
		System.out.println((int)6 * 2);
		
		
		//((Scanner)o3).nextLine();
		//((Scanner)o4).nextLine(); object 클래스를 꺼내면서 쓸 경우 과정 귀찮음.
		//오류 발생시 발견하기 힘들고 개발자가 착각할 수 있다.
		//객체 내부에 든 것이 무엇인지 추측하기 힘듬(o3가 스캐너냐 아니냐)
		
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2.toString());
		System.out.println((int)n2.getData() * 2);
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("홍길동");
		System.out.println(s2.toString());
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(true);
		System.out.println(s2.toString());
		System.out.println(((boolean)s2.getData())? "참" : "거짓");
		System.out.println();
		
		
		
		
		
		
		
		
//		Integer num = new Integer(10);
//		System.out.println(num);
//		System.out.println(num + 10);
		
		
	}

}


class WrapperInt{
	
	private int data; //1. 클래스 중심 //
	
	//2. data 중심 > 행동
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}

class WrapperString{
	
	private String data; //1. 클래스 중심
	
	//2. data 중심 > 행동
	public WrapperString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}

class WrapperBoolean{
	
	private Boolean data; //1. 클래스 중심
	
	//2. data 중심 > 행동
	public WrapperBoolean(Boolean data) {
		this.data = data;
	}

	public Boolean getData() {
		return data;
	}

	public void setData(Boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}

class WrapperObject{
	
	private Object data; //한 번에 모든 자료형을 넣을 수 있게 됨

	public WrapperObject(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}