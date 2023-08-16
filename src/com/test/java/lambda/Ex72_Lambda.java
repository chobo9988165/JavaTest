package com.test.java.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex72_Lambda {
	
	public static void main(String[] args) {
		
		//Ex72_Lambda.java
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 *  람다식, Lambda Expression
		 *  - 함수형 프로그래밍 > 지원
		 *  - 자바 > 람다식 > 컬렉션 조작(= 스트림)
		 *  - 람다식을 사용하면 코드가 간결해진다.
		 *  - 자바의 메소드 > 다른(간결한) 표현
		 *  - 람다식은 매개변수를 가지는 코드블럭(=메소드)
		 *  - 자바의 람다식은 인터페이스를 사용해서 만든다(자바 람다의 한계)
		 * 
		 *  
		 *  람다식 형식
		 *  - 인터페이스 변수 = 람다식;
		 *  - ex) MyInterface m1 = () -> {};
		 *  
		 *  - 자바의 메소드의 다른 표현
		 *  - (매개변수) -> {실행코드}
		 * 	- a. (매개변수): 메소드의 매개변수 리스트와 동일
		 *  - b. ->: 화살표(Arrow), 코드블럭 호출역할
		 *  - c. (실행코드) : 메소드의 구현부와 동일
		 * 
		 * 
		 * 
		 * 
		 */ 
		
		
			//m1();
			//m2();
			//m3();	//파일 입출력, 람다, 익명 클래스 
				
	}//main

	private static void m3() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\성적.dat"));
			
			ArrayList<Student> list = new ArrayList<Student>();
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				//텍스트 1줄 > Student 객체 1개
				//홍길동, 47, 61, 73
				
				String[] temp = line.split(",");
				
				Student s = new Student(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));

				list.add(s);
			}
			
			
			//성적순 > 정렬
//			list.sort(new Comparator<Student>() {
//
//				@Override
//				public int compare(Student o1, Student o2) {
//					
//					return o2.getTotal() - o1.getTotal();
//				}
//			});
			
			list.sort((o1, o2) -> o2.getTotal() - o1.getTotal());
			
			System.out.println(list);
			
			for(Student s : list) {
				System.out.println(s.getName() + ":" + s.getTotal());
			}
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Ex72_Lambda.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		
		//람다식 활용한다는 말 == 익명 클래스(객체) 사용
		
		//Math.random(); // 0~1 실수 난수
		
		Random rnd = new Random();
		
		//0 (inclusive) ~ specified value (exclusive)
		System.out.println(rnd.nextInt(10));//double,float,long,boolean 반환 
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			nums.add(rnd.nextInt(10)+1);
		}
		
		System.out.println(nums);
		
		nums.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
			}
			
		});
		
		System.out.println(nums);
		
		nums.sort((Integer o1, Integer o2) -> {
			return o1 - o2;
		});
		
		nums.sort((o1, o2) -> o2 - o1);
		System.out.println(nums);
		
		
	}
	

	private static void m1() {
		//요구사항] MyInterFace를 구현한 객체를 1개 만드시오.
		MyInterface m1 = new Myclass();
		m1.test();
		
		MyInterface m2 = new MyInterface() {
		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("익명 클래스에서 구현한 메소드");
			
		}};
		m2.test();
		
		MyInterface m3 = () -> {//람다식:익명객체를편하게만드는표현식
			System.out.println("람다식에서 구현한 메소드");
		};
		m3.test();
		
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			
			@Override
			public void call() {
				
				System.out.println("pr1");
			}
		};
		pr1.call();
		
		
		NoParameterNoReturn pr2 = () -> { System.out.println("pr2");
		};
		pr2.call();
		
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();
		//if문 {} 생략 가능 조건 -> 제어문이 딱 하나만 있을 때 가능(왠만해선 쓰는게 좋다)
		//lambda 특징 1: 실행 블럭에 문장이 하나면 {}생략 가능(심지어 이쪽이 권장**)
		
		ParameterNoReturn pr4 = (int num) -> System.out.println(num);
		pr4.call(100);
		
		//lambda 특징 2 ***** : 매개변수의 자료형 생략 가능
		ParameterNoReturn pr5 = (num) -> System.out.println(num);
		pr5.call(200);
		
		//lambda 특징 3 **** : 매개변수 () 생략 가능
		ParameterNoReturn pr6 = num -> System.out.println(num);
		pr6.call(500);
		
		//=======================================================
		//매개 변수가 여러개일때
		MultiParameterNoReturn pr7 = (String name, int age) -> {
			System.out.println(name + "," + age);
		};
		pr7.call("홍길동", 20);
		
		//lambda 특징 4 : 매개변수의 소괄호는 매개변수가 1개일때만 생략할 수 있다.
		MultiParameterNoReturn pr8 = (name, age) -> System.out.println(name + "," + age);
		pr8.call("아무개", 25);
		
		//==========================================================
		//매개변수없지만리턴있을때
		NoParameterRetrun pr9 = () -> {
			return 100;
		};
		System.out.println(pr9.call());
		
		//lambda 특징 5 : 리턴문을 생략할때는 리턴까지 생략해야됨
		NoParameterRetrun pr10 = () -> 100;
		System.out.println(pr10.call());
		
		//==========================================================
		ParameterRetrun pr11 = name -> name.length();
		System.out.println(pr11.call("홍길동"));
		System.out.println(pr11.call("바람바람"));
	}
		
		
}

class Student {
	
	//홍길동, 47, 61, 73
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor+ this.eng + this.math;
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
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
}



interface MyInterface {
	void test();
}

class Myclass implements MyInterface {

	@Override
	public void test() {
		System.out.println("실명 클래스에서 구현한 메소드");
	}
	
}


interface NoParameterNoReturn {
	void call();
}

interface ParameterNoReturn {
	void call(int num);
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface NoParameterRetrun {
	int call();
}

interface ParameterRetrun {
	int call(String name);
}
