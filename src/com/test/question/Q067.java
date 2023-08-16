package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
//	요구사항
//	배열에 요소를 삽입하시오.
//
//	조건..
//	배열 길이: 10
//	마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
//	★★★★ 자주 쓰임
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		int[] copy = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		System.out.print("삽입 위치:");
		int insert = scan.nextInt();
		System.out.print("값:");
		int value = scan.nextInt();
		
		
		for(int i=0; i<10; i++) {
			if(insert==9) {
				copy[insert] = value;
				break;
			}
	//		num[insert+i] = copy{insert+i];
			copy[insert] = value;
		}
		
		
		System.out.printf("원본: %s\n", Arrays.toString(num));
		System.out.printf("결과: %s\n", Arrays.toString(copy));
		
		
		
		
		
	}
	
	
	
	
}
