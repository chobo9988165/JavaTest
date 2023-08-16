package com.test.question;

import java.util.Scanner;

public class Q036 {
//	요구사항
//	시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int n1 = scan.nextInt();
		System.out.print("종료 숫자: ");
		int n2 = scan.nextInt();
		System.out.print("증감치: ");
		int n3 = scan.nextInt();
		
		
		for(int i = n1; i<= n2; i=i+n3) {
		System.out.println(i);	
		}
		
		
		
	}

}
