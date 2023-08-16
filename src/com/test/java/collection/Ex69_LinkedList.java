package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex69_LinkedList {
	
	public static void main(String[] args) {
		
		//Ex69_LinkedList.java
		
		
		/*
		 * 
		 * 		물리 구조 + 인터페이스(사용법)
		 * 		- Array  + List
		 * 		- Linked + List
		 * 		- Hash   + Map
		 * 		- Tree   + Map
		 * 		- Hash   + Set
		 * 		- Tree   + Set
		 * 
		 * 		ArrayList**************************단골질문*************
		 * 		- 모든 컬렉션 중에서 요소에 접근하는 속도가 가장 빠르다.
		 * 	    - 요소 삽입/삭제에 대한 비용이 많이 든다. > Shift
		 * 		
		 * 		LinkedList
		 * 		- 요소에 접근 속도가 상대적으로 느리다.
		 * 		- 요소 삽입/삭제에 대한 비용이 거의 없다. > Shift X
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
	}

	private static void m2() {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		long begin = 0, end = 0;
		
		//순차적으로 데이터를 추가하기, Append
		System.out.println("[수차적으로 데이터 추가하기, Append]");
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i<1000000; i++) {
			list1.add(i); //배열 끝에 추가하기
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);

		
		
		
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i<1000000; i++) {
			list2.add(i); //배열 끝에 추가하기
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
		//중간에 데이터 추가하기, 삽입(Insert) > Shift 발생
		//순수배열, ArrayList에서 끼워넣기 > 오래걸림
		//LinkedList > Shift 발생하지 않음 (자전거체인끊고다시연결하듯)
		
		System.out.println("중간에 데이터 추가하기, 삽입(Insert) > Shift 발생");
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list1.add(0, 1); 
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list2.add(0, 1); 
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
		
		
		//중간의 데이터 삭제하기 > Shift 발생
		
		System.out.println("중간의 데이터 삭제하기 > Shift 발생");

		begin = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list1.remove(0); 
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list2.remove(0); 
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
		
		
		//순차적으로 데이터 삭제하기 > 끝의 방부터 지우기
		
		System.out.println("순차적으로 데이터 삭제하기 > 끝의 방부터 지우기");
		
		begin = System.currentTimeMillis();
		
		for (int i=list1.size()-1; i>=0; i--) {
			list1.remove(i);	//순차적삭제 
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		begin = System.currentTimeMillis();
		
		for (int i=list2.size()-1; i>=0; i--) {
			list2.remove(i); 
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
	}

	private static void m1() {
		
		//Collection(I) > List(I) > ArrayList(C), LinkedList(C)
		
		
		//ArrayList vs LinkedList
		//- List > 구현 > 사용법 아주 유사 > 새롭게 다시 배울 필요 없음
		//- 내부 구조가다르다. > 사용 용도가 다르다.
		
		//LinkedList 종류
		//1. LinkedList 일방 통행 ([1]이 [0]의 주소를 알 수 없음)
		//2. DoubleLinkedList 양방향 통행 (추가로 방 생성해 이전 주소 값 저장)
		//3. Double Circle LinkedList 양방향 + 처음과 끝 연결 > 자바의 LinkedList
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		System.out.println(list1.size());
		System.out.println(list2.size());						
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));

		//다 똑같음 remove, iterator, clear, remove, length 등 그대로 있음
		
		//ArrayList 방의 위치가 연속적(참조변수는첫번째방주소값만알면됨)
		//LinkedList는 방이 각각 따로따로 생긴다(각각의 공간 밑에 추가로 붙어있는 공간 생성, 추가로 생성된 공간에 다음 방의 주소값 넣어놨음, 참조변수는 첫번째 방 주소만 알면 똑같이 참조가능);
		//순수 배열, ArrayList은 자바의 컬렉션 중에서 접근 속도가 가장 빠르다.
		//LinkedList는 느림
	}//m1

}
