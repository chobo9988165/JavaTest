package com.test.java;

public class Ex07_Variable {

	public static void main(String[] args) {
		
		//Ex07_Variable.java
		
		//숫자형 데이터 > 저장할 변수가 필요한 경우
		//- 수치로서의 데이터 > 산술 연산의 대상 > 더하기 빼기
		//- 수치가 아닌 데이터 > 산술 연산의 대상(X)
		
		//1. 몸무게 > 문제 없음
		int weight;
		weight = 70;
		
		//2. 주민등록번호 앞자리(990718) > 문제 있음
		int jumin;
		jumin = 990718;
		System.out.println("주민등록번호: " + jumin);
		
		jumin = 00717;
		System.out.println("주민등록번호: " + jumin);
		
		String jumin2;
		jumin2 = "00717";
		System.out.println("주민등록번호: " + jumin2);
		
		
		//생긴건 숫자 > 실제로 숫자취급X
		//- 주민등록번호
		//- 학번
		//- 전화번호
		
		
		//기수 표현에 상관없이 출력 > 10진수로 출력
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
		//자바 기수 표시법
		//- 숫자 데이터 표기 > 3개의 기수법 지원
		//1. 10진수 > 10
		//2. 8진수 > 010 > 8 ※ 반드시 첫 시작을 0으로, 앞의 0은 8진수임을 표현하는 표기
		//3. 16진수 > 0x10 > 16 ※ 0x는 16진수를 표현
		
		
	}

}
