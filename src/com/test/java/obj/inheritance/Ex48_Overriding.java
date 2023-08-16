package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {

	public static void main(String[] args) {
		
		//Ex48_Override.java
		
		//대중적인 오버라이드
		
		Time t1 = new Time(2, 30);
		
		//com.test.java.obj.inheritance.Time @ 5aaa6d82
		System.out.println(t1);
		System.out.println(t1.toString());   //2:30 > 전 세계 개발자가 아는 이름//String com.test.java.obj.inheritance.***Time***.toString() 메소드 재정의하면 바껴있음
		System.out.println(t1.info());	 	 //2:30 > 나밖에 모르는 이름
		
		
		Date now = new Date();
		
		//Wed Aug 02 11:48:39 KST 2023
		System.out.println(now);
		System.out.println(now.toString());
		
		
		
	}
	
}

class Time {
	
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	//덤프..
	public String info() {
		
		return this.hour + ":" + this.minute;
	}
	
	@Override	//어노테이션(Annotation) 기능이 있는 주석
	//★대부분의 클래스를 만들때, toString 메소드를 오버라이딩해 덤프한다.
	public String toString() {
		
		return this.hour + ":" + this.minute;
	}
	
	
}



















