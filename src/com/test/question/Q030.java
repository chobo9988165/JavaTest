package com.test.question;

import java.util.Scanner;

public class Q030 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자:");
		int alphabet = (int)scan.nextLine().charAt(0);
		
		if (alphabet >= (int)'a' && alphabet <= (int)'z') {
			System.out.printf("'%c'의 대문자는 '%c'입니다.\n", alphabet, alphabet-32);
		} else if (alphabet >= (int)'A' && alphabet <= (int)'Z') {
			System.out.printf("'%c'의 소문자는 '%c'입니다.\n", alphabet, alphabet+32);
		} else {
			System.out.println("영문자만 입력하시오.");
		}
		
		
		
		
		
	}

}
