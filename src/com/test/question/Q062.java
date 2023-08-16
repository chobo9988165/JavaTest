package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {
//	요구사항
//	학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	이름을 오름차순 정렬하시오.
	public static void main(String[] args) {
		
		int studentNum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		studentNum = scan.nextInt();
		scan.skip("\r\n");
		
		String[] studentName= new String[studentNum];
		
		for(int i=0; i<studentName.length; i++) {
			System.out.print("학생명: ");
			studentName[i] = scan.nextLine();
		}//
		Arrays.sort(studentName);
		System.out.printf("입력한 학생은 총 %d명입니다.\n", studentNum);
		
		for(int i=0; i<studentName.length; i++) {
			System.out.printf("%d. %s\n", i+1, studentName[i]);
		}//
		
		
		
		
		
		
		
		
		
	}

}
