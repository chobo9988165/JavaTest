package com.test.question;

public class Q064 {
//	요구사항
//	1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
//
//	조건..
//	난수를 20개 발생 후 배열에 넣는다.
//	난수는 1 ~ 20 사이
	
	public static void main(String[] args) {
		
		
		int[] ran = new int[20];
		
		int max=0;
		int min=20;
		
		String txt = "";
		
		
		
		for(int i=0; i<ran.length; i++) {//
			
			ran[i] = (int)(Math.random()*20) + 1;
			txt = txt + ran[i] + ",";
			if(ran[i] > max) {
				max = ran[i]; 
			} else if (ran[i] < min) {
				min = ran[i];
			}
		}//for
		
		System.out.printf("원본: %s\n", txt);
		System.out.printf("최댓값: %d\n", max);
		System.out.printf("최솟값: %d\n", min);
		
		
		
		
		
		
	}//main

}
