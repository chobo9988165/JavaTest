package com.test.java.collection;

public class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	//private int total;				//계산된 값, 얼마든지 만들 수 있는 값 → 왜 저장을 안하느냐 → 오차 발생시 다시 만들어야함
	//private double avg;				//Setter 만드는 경우 > 나중에도 수정할 가능성이 있다고 판단될 때
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Ex60_Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	

}
