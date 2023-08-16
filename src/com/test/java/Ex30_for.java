package com.test.java;

public class Ex30_for {

	public static void main(String[] args) {

		// Ex30_for.java

		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		//다중 반복문 > 단일 반복문
		

	}// main
	
	
	



	private static void m5() {
		
		//별찍기(5X5)
		
		int n = 1;
		
		for (int i=0; i<5; i++) {			//열 만들기
			for (int j=0; j<5; j++) {		//행 만들기
				
				//System.out.print("*");
				System.out.printf("%3d", n);
			}
			System.out.println();
		}
		
		for (int i=0; i<5; i++) {			//열 만들기
			for (int j=i; j<5; j++) {		//행 만들기
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=0; i<5; i++) {			//열 만들기
			for (int j=0; j<=i; j++) {		//행 만들기
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}






	private static void m4() {
		
		//루프 > 분기문 개입(break, continue)
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				//if (i == 5) {
				//if (j == 5) {
				//if (j == 5 && i == 5) {
				if(i == 5 || j == 5) {
					break;	//자신이 포함된 제어문을 탈출한다. j 루프 탈출
				}
							
				System.out.printf("i: %d, j: %d\n", i, j);
			
			}
			
		}
		
	}






	private static void m3() {
		
		//쌍용 교육 센터
		//- 강의실(1강의실 ~ 6강의실)
		//- 학생들(30명)
		
		for (int i=1; i<=6; i++) {
			
			for (int j=1; j<=30; j++) {
				
				System.out.printf("%d강의실 %d번 학생\n"
									, i, j);
			}
			
		}
		
	}






	private static void m2() {
		
		//구구단(2~9단)
		
		for (int i=2; i<=9; i++) {
			
			System.out.println("==============");
			System.out.printf("     %d단\n", i);
			System.out.println("==============");
			
			for (int j=1; j<=9; j++) {
				
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				
			}
				System.out.println();
			
		}
		
	}






	//K&R > Eclipse/Intellij 기본 스타일
	public static void test() {
		
	}
	
	//Allman → C# 주로
	public static void test2()
	{
		
	}
	
	
	
	

	private static void m1() {
		
		
		//모든 제어문끼리는 중첩이 가능하다.
		
		//중첩된 반복문
		//2중 for문
		
		//루프 변수 > i
		
		//Ctrl + Shift + F(format) 권장X
		
		/*
		 * for (int i = 0; i < 10; i++) {
		 * 
		 * for (int j = 0; j < 10; j++) {
		 * 
		 * System.out.printf("i: %d, j: %d\n", i, j); } System.out.println(); }
		 */		
		
		
		//3중 for문
		//중첩 반복문은 회전수보다 루프 변수의 변화가 중요
		//모든 숫자가 나오는게 아니라 잘려서 나옴(출력버퍼의 한게, 메모리)
		for (int i=0; i<24; i++) {//대회전
			
			for (int j=0; j<60; j++) {//중
				
				for (int k=0; k<60; k++) {//소
					
					//System.out.println("실행문");
					
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
				}
				
			}
			
		}
		
		
		
	}// m1

}
