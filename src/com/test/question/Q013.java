package com.test.question;

import java.util.Scanner;

public class Q013 {

	public static void main(String[] args) {
		
		/*
		 * 요구사항 국어, 영어, 수학 점수를 전달하면 '합격' 
		 * 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		 * 
		 * 조건.. String test(int kor, int eng, int math) 
		 * 평균 점수 60점 이상은 '합격'이다. 평균 점수 60점미만은 '불합격'이다.
		 * 과락: 한 과목 이상 40점 미만이면 불합격이다.
		 */		

		Scanner scan = new Scanner(System.in);
		int kor, eng, math = 0;
		int average = 0;
		
		System.out.print("국어:");
		kor = scan.nextInt();
		System.out.print("영어:");
		eng = scan.nextInt();
		System.out.print("수학:");
		math = scan.nextInt();
		test(kor, eng, math);
		
	}
	
	
	public static String test(int kor, int eng, int math) {
		String test = "";
		
		test = ((kor + eng + math) / 3 >= 60 ) ? "합격입니다." : "불합격입니다.";
		
		return test;
	}

}
