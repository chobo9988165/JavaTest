package com.test.java.obj.inheritance;

public class Ex68 {
	
	public static void main(String[] args) {
		
		//Ex68.java
		
		//this vs super
		//- 객체 지정 연산자
		//- this: 자기 자신
		//- super: 부모 ★
		
		
		
		CupParent p1 = new CupParent();
		p1.check();
		
		//CupChild c1 = new CupChild();
		//c1.check();
		//1. 자식 객체가 만들어질때, 부모 인스턴스가 먼저 만들어지고 이후에 자기 자신 멤버 만듬
		//2. 자기 자신의 멤버와 부모 인스턴스를 합친 자식 인스턴스 만듬
		
		
		
		
	}//main

}

class CupParent {
	
	private int a = 10;
	public int b = 20;
	
	public void check() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
}

class CupChild extends CupParent {
	
	private int c = 30;
	public int d = 40;
	
	public void check() {
		
//		System.out.println(this.c);
//		System.out.println(this.d);
		
//	super.check();							  //매우드문호출방식(애당초private하는이유는외부접근을막기위해서니까)
		
//		System.out.println(this.a);	              //he field CupParent.a is not visible
//		System.out.println(this.b);
	}

	public CupChild(int c, int d) {
		super();
		this.c = c;
		this.d = d;
	}
	
	
	
	
}