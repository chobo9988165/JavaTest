package com.test.question;

public class Q009 {
	public static void main(String[] args) {
		
		String result;
		
		result = getName("홍길동");
		System.out.printf("고객: %s\n", result);
		
		result = getName("아무개");
		System.out.printf("고객: %s\n", result);
		
	}//main
	
	public static String getName(String name) {
		
		return name + "님";
		
	}
	

}