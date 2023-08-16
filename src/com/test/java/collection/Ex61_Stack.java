package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex61_Stack {
	
	public static void main(String[] args) {
		
		
		
		//Ex61_Stack.java
		
		
		
		/*
		
			자료구조(컬렉션)
			- 물리적인 특징(내부 구조)
			- 추상적인 특징(사용법
			
			
			ADT
			-Abstract Data Type
			-Stack, Queue;
			
			
			List
			- ArrayList
			- Queue
			- Stack
			
			
			Stack
			- 후입선출
			- LIFO Last Input First Output
			- 저장소에 나중에 들어간 요소가 가장 먼저 나온다.
			- 배열임에도 불구하고 방번호가 없음
			- Push Down, Pop Up(인터넷팝업창의 그 팝업이 여기서 유래) 형태
			
			Queue
			- 선입선출
			- FIFO First Input First Output
			- 저장소에 먼저 들어간 요소가 먼저 나온다.
			
			파이프가 있다고 치자. 외부에서는 내부의 상황을 알 수 없다.
			
			스택 > 파이프의 구멍이 한쪽으로만 뚫려 있는 형태
				> 한쪽 방향으로만 공을 넣고 뺄 수 있다.
				> 들어가는 순서 → 1 2 3 , 나오는 순서 → 3 2 1  (후입선출)
				ex) 메모리 구조
				ex) 되돌리기(Ctrl + z), 다시하기(Ctrl + y)
				
			큐 	> 파이프의 구멍이 양쪽으로 뚫려 있음
				> 어느쪽으로 공을 넣고 뺄지 미리 정해져있다.
				> 들어가는 순서 → 1 2 3 , 나오는 순서 → 1 2 3 (선입선출)
				ex) 줄서기
				ex) 운영체제는 우리가 하는 모든 행동을 메세지 큐(*)로 관리함 > 바로 실행이 들어가는게 아니라 쌓임
				ex) 식당에서 주문, 물건이 나가는 방식...등
				
				
			
			
		
		*/
		//m1();
		//m2();
		m3();
		//m4();
	}

	private static void m4() {
		// TODO Auto-generated method stub
		
	}

	private static void m3() {
		
		//Queue
		//- 선입 선출
		//- ***인터페이스
		Queue<String> queue = new LinkedList<String>();
		
		//1. 요소 추가하기
		//- boolean add(T value)
		queue.add("짜장면");
		queue.add("짬뽕");
		queue.add("탕수육");
		
		//2. 요소 개수
		//- int size() **** 인터페이스 덕분(collection)
		System.out.println(queue.size());
		
		//3. 요소 읽기(꺼내기)
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.size());

		System.out.println(queue.poll());
		System.out.println(queue.size());
		

		System.out.println(queue.poll());		//null
		
		
		
		//4. 비었는지 아닌지?
		if(queue.size() != 0) {
			System.out.println(queue.poll());
		}
		if(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		//5. 요소 확인
		System.out.println(queue.peek());
		
	}

	private static void m2() {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("짜장면"); //길이가변적(arraylist와 동일)
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		//5. 요소 확인(읽기 O, 삭제 X)
		System.out.println(stack.peek()); // 볶음밥
		System.out.println(stack.peek()); // 볶음밥 ★
		System.out.println(stack.size()); // 3
	}

	private static void m1() {
		
		Stack<String> stack = new Stack<String>();
		
		//후입선출
		
		//1. 요소 추가하기
		//- T push(T value)
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		//2. 요소 개수
		//- int size();
		System.out.println(stack.size());
		
		//3. 요소 읽기
		//- T pop()
		//데이터를 읽으면서 스택에서 삭제(공을 꺼낸다)
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println();

		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println();
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println();

		//java.util.EmptyStackException
		//System.out.println(stack.pop());
		
		//4. 스택이 비었는지 아닌지 확인하는 법
		if (stack.size() != 0) {
			System.out.println(stack.pop());
		}
		
		if (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
			
		
		
	}

}
