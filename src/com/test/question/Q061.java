package com.test.question;

import java.util.Scanner;

public class Q061 {
//	요구사항
//	숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
//
//	조건..
//	int[] nums = new int[5]; 방번호 거꾸로 돌리기
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		
		for(int i=0; i<nums.length; i++) {
			
			System.out.print("숫자 입력: ");
			nums[i] = scan.nextInt();
			
		}
		
		for(int i=nums.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		
		
	}//main
}
