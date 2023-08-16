package com.test.question;

import java.util.Scanner;

public class Q015 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number = 0;
		int sunny = 0;
		int foggy = 0;
		
		System.out.print("맑은 날: ");
		sunny = scan.nextInt();
		
		System.out.print("흐린 날: ");
		foggy = scan.nextInt();
		
		
		number = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다.\n", number);

	}//main
	
	
	public static int getApple(int sunny, int foggy) {
		
		int number = 0;
		int height = 0;
		
		height = sunny * 5 + foggy * 2;
		
		number = height >= 100 ? (height - 100) / 10 : 0;
		
		return number;
	}

}
