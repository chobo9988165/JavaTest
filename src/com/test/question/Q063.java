package com.test.question;

import java.util.Scanner;

public class Q063 {
//	요구사항
//	int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드를 구현하시오.
//
//	조건..
//	String dump(int[] list) arrays.toString 구현
	
	public static void main(String[] args) {
		
		
		int[] list = new int[4];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		
		String result = dump(list);
		
		System.out.printf("[nums = %s\b\n]", result); //40 뒤에 ',' 걸리는건 이클립스 오류때문이니 예외처리 안했음
		
		
	}
	
	public static String dump(int[] list) {
		
		String result = "";
		
		for(int i=0; i<list.length; i++) {
			
			result = result + list[i] + ","; 		
			
		}
		return result;
		
	}


}
