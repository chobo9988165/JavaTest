package com.test.java.obj.inheritance;

public class Ex58_Generic {
	
	public static void main(String[] args) {
		
		//Ex58_Generic.java
		
		
		//Item is a raw type.
		//References to generic type Item<T> should be parameterized
		//Item item = new Item();
		
		//Item item = new Item();
		Item<String> item = new Item<String>();
		item.c = "문자열";
		
		Item<Integer> item2 = new Item<Integer>();
		//Item<int> item2 = new Item<int>();
		item2.c = 100;
		
//		Pen <Boolean> pen = new Pen<Boolean>();
//		pen.a = true;
//		pen.b = false;
//		pen.b = true;
		
		
		Note<String, Integer> note = new Note<String,Integer>("홍길동", 20);
		
		System.out.println(note.getA());
		System.out.println(note.getB());
		
		//다중 제네릭 받을때 T, U 했으면 형식 똑같임 맞춰야함
		//아까 안해서 1시간 헤멤
		
	}

}


//제네릭 클래스
//- T: 타입: 변수(메소드의 매개변수 역할) > 자료형을 전달하는 변수 > 반드시 참조형만 가능
//- <> : 인자 리스트(메소드의 () 역할)
class Item<T> {
	
	public int a;
	public int b;
	public T c; 	//클래스의 선언까지는 결정(x) 객체를 생성할 때 결정(o)
	
}

//class Pen<T> {
//	
//	public T a;
//	public T b;
//	public T c;
//	
//}

class Desk<T> {
	
	public T a; //멤버 변수의 자료형
	
	public void set(T a) { //메소드 매개변수의 자료형
		this.a = a;
		
		T b; //지역변수의 자료형 > 비권자
	}
	
	public T get() { //메소드 반환타입
		return this.a;
	
}
}


class Note<T,U> { //제네릭 변수 여러개 선언 가능
	public T a;
	public U b;
	
	public Note(T a, U b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return this.a;
	}


	public U getB() {
		return this.b; 
	}
}

class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
	
	
}