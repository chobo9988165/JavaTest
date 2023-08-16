package com.test.java.obj.inheritance;

public class Ex49_static {
	
	public static void main(String[] args) {
		
		
		//Ex49_static.java
		
		//요구사항]
		//1. 펜을 생산하시오.
		//2. 생산된 펜의 개수를 세시오.
		
		//Case 1.
		//-Pen 객체(클래스)와 count 간의 관계 약함, 카운트를 억지로 증가시키고 있다.
		//-오차 발생(count++ 누락하면?)
		
//		int count = 0;
//		
//		Pen p1 = new Pen("MonAmi", "black");
//		count++;
//		
//		Pen p2 = new Pen("MonAmi", "black");
//		count++;
//		
//		Pen p3 = new Pen("MonAmi", "black");
//		count++;
//		
//		System.out.println("펜 개수: " + count);
		
		//Case 2.
		//- Pen과 count간의 관계 > 강하게
		//1 2 3 → (객체 변수 여러개 발생) 1 1 1 → 왜 그 객체의 count 사용하는지 당위성이 없음
//		Pen p1 = new Pen("Monami", "black");
//		p1.count++;
//		
//		Pen p2 = new Pen("Monami", "black");
//		p2.count++;
//		
//		Pen p3 = new Pen("Monami", "black");
//		p3.count++;
//		
//		System.out.println("펜 개수: " + p1.count);
	
		//Case 3.
		//- Pen과 count 간의 관계 > 강하게
		//- count 변수 딱 1개만 만들기!!
		//누락(까먹으면) 어떻게 해결?
//		Pen p1 = new Pen("Monami", "black");
//		Pen.count++;
//		
//		Pen p2 = new Pen("Monami", "black");
//		
//		Pen p3 = new Pen("Monami", "black");
//		Pen.count++;
//		
//		System.out.println("펜 개수: " + Pen.count);
		
		//Case 4.
		//생성자 내부에 Static변수 누적시켜 새로운 객체가 만들어질때마다 누적
		Pen p1 = new Pen("Monami", "black");
		Pen p2 = new Pen("Monami", "black");
		Pen p3 = new Pen("Monami", "black");
		
		System.out.println("펜 개수: " + Pen.count);
		
		
		
		
		
		
	}//main

}


class Pen {
	
	//public int count = 0;
	public static int count = 0;
	
	private String model;
	private String color;
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}

	@Override
	public String toString() {
		return "Pen [model=" + model + ", color=" + color + "]";
	}
	
	
	
}