package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex63_HashSet {
	
	public static void main(String[] args) {
		
		//Ex63_HashSet.java
		
		
		
		/*
		 * 
		 * 		1. List
		 * 			- 순서가 있는 데이터 집합
		 * 			- 첨자(방번호)
		 * 			- 데이터 중복을 허용
		 * 
		 * 
		 *  	2. Set
		 *  		- 순서가 없는 데이터 집합
		 *  		- 요소를 구분하는 식별자가 없음
		 *  		- ****데이터 중복을 허용하지 않음 
		 *  	
		 *  
		 *  
		 *  	3. Map
		 *  		 - 순서가 없는 데이터 집합
		 *  		 - 키 + 값
		 *  		 - 데이터 중복을 허용
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		//m1();
		//m2();
		m3();
		
		
		
		
		
	}//main

	private static void m3() {
		
		
		HashSet<Person1> name = new HashSet<Person1>();
		
//		name.add(("홍길동"));
//		name.add(("홍길동"));
		System.out.println(name);
		System.out.println();
		
		
		
		HashSet<Person1> set = new HashSet<Person1>();
		
		set.add(new Person1("홍길동", 20));
		set.add(new Person1("아무개", 25));
		set.add(new Person1("이순시", 30));
		
		set.add(new Person1("홍길동", 20));
		
		System.out.println(new Person1("홍길동", 20)); //set > 중복값 배제
		
		
		
		
		//p1과 p2를 같은 사람이라고 인식 > 수정 > 가끔식 구현
		Person1 p1 = new Person1("홍길동", 20);
		Person1 p2 = new Person1("홍길동", 20);
		
		System.out.println(p1.equals(p2)); //false, 주소값 다르니까
		
		System.out.println("p1: " + p1.hashCode());//p1: 885851948
		System.out.println("p2: " + p2.hashCode());//p2: 2048834776
		
		
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1.equals(s2)); //주소값비교
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	
		
		
		

		
	}



	private static void m2() {
		
		//중복값 제거 > 로또 번호 > 중복되지 않는 난수 생성
		
		//Case 1. ArrayList
		ArrayList<Integer> lotto =  new ArrayList<Integer>();
		
		for(int i=0; i<6; i++) {
			
			int n = (int)((Math.random()*45)+1);
			boolean flag = false;
			
			for(int j=0; j<i; j++) {
				if (lotto.get(j) == n) {
					flag = true;
					break; 
				} else;{
					i--;
				}
			}
			
			if (!flag) {
				lotto.add(n);
			}
			
		}
		
		System.out.println(lotto);//중복값 발생 가능성 존재
		
		//Case 2. HashSet
		
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		while(lotto2.size() < 6) {
			int n = (int)(Math.random()*45) + 1;
			lotto2.add(n); //Set > 중복값 허용 X
		}
		System.out.println(lotto2);
		
		//Set의 탐색
		for (int num : lotto2) {
			System.out.println(num);
		}
		System.out.println();
		
		//*******List, Set > Iterator 지원 > 탐색 도구
		Iterator<Integer> iter = lotto2.iterator();
		
		System.out.println(iter.hasNext());//요소 존재 유무
		System.out.println(iter.next());//요소를 가져오기
		
		while (iter.hasNext()) {
		//	int n = iter.next();				//next할때마다 iterator 내부 커서는 다음 방으로 이동
			System.out.println(iter.next());	//결과적으로 루프 한 번에 출력 두번
												//while문 내에는 가급적 next 한 번만
												//*디버깅한답시고 찍어보려다 상황이 발생하곤 함
		}
		
		
	}

	private static void m1() {
		
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		
		list.add("강아지");
		list.add("고양이");
		list.add("거북이");

		set.add("강아지");
		set.add("고양이");
		set.add("거북이");
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		System.out.println(list);		//순서 존재
		System.out.println(set);		//**순서 존재 X
		
		
		list.add("고양이");
		System.out.println(list);		//중복값 허용
		
		System.out.println(set.add("고양이"));//**중복값 가질 수 없음 false 반환
		System.out.println(set);		
		
		
		list.remove(1);
		list.remove("거북이");
		System.out.println(list);
		
		set.remove("거북이");
		System.out.println(set);

		//indexof , lastIndexOf 같은 첨자 사용하는 메소드 존재 X
		
		System.out.println(set.contains("고양이")); //존재하는지 아는지만 알면 되기 때문에 존재함
		
		
	}
	
	

}

class Person1 {
	
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	//값이 동일하면 객체가 동일하게 처리
	//1. hashCode() 오버라이드
	//2. equals() 오버라이드
	
	
	
	@Override
	public int hashCode() {
		
		//원래 > 자신의 메모리 주소값 반환
		
		//p1 > "홍길동", 20 > "홍길동20" > 100번지
		//p2 > "아무개", 25 > "홍길동20" > 200번지
		//p3 > "홍길동", 20 > "홍길동20" > 100번지 
		
		return (this.name + this.age).hashCode();
	}
	
//	public boolean equals(Object obj) {
//		
//		//p1.eqauls(p2)
//		
//		return (this.name + this.age) == obj.hashCode();
//	}
	
	
}