package com.test.question;

import java.util.Scanner;

public class Q039 {
//	요구사항
//	아래와 같이 출력하시오.
	
//	시작 숫자: 1 
//	종료 숫자: 10 
	
//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("시작 숫자: ");
		int startnumber = scan.nextInt();
		System.out.print("종료 숫자: ");
		int endnumber =  scan.nextInt();
		
		for(int i=startnumber; i<=endnumber; i++) {
			sum += i;

			if(i==endnumber) {
				System.out.printf("%d = %d", i, sum);
				break;
			}
			System.out.printf("%d + ", i);
			
			//\b쓰면 간단하지만 이클립스에서 안먹히기 때문에 + 찍히는 채로 끝내도 됐음.
			//첫번째 숫자 하나만을 위해 조건문 만드는건 과하다.(다른 곳에서 오버하는 코드가 되기 때문에)
			//그래서 안중요하니까 대충 넘기자
			
			
		}//for
		
		
		
		
		
		
		
	}//main

}
