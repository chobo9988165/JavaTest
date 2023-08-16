package com.test.question;

import java.util.Scanner;

public class Q065 {
//	요구사항
//	난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
//
//	조건..
//	난수를 20개 발생 후 배열에 넣는다.
//	난수는 1 ~ 20 사이
//	배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] ran = new int[20];
		
		int max;
		int min;
		
		String txt = "";
		String txt2 = "";
		
		System.out.print("최대 범위:");
		max = scan.nextInt();		
		System.out.print("최소 범위:");
		min= scan.nextInt();
		
		
		
		
		for(int i=0; i<ran.length; i++) {
			
			ran[i] = (int)(Math.random()*20) + 1;
			txt = txt + ran[i] + ",";
			if(ran[i] < min || ran[i] > max) {
				continue;
			}
			txt2 = txt2 + ran[i] + ",";
			
		}//for
		
		System.out.printf("원본: %s\n", txt);
		System.out.printf("결과: %s\n", txt2);

	}//main
	
}
