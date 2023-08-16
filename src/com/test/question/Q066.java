package com.test.question;

import java.util.Arrays;

public class Q066 {
//	요구사항
//	★중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
//
//	조건..
//	숫자의 범위: 1 ~ 45
//	오름차순 정렬
	
	public static void main(String[] args) {
		
		
		int[] nums = new int[6];
		boolean con = true;
		String txt = "";
		


			for(int i=0; i<nums.length-1; i++) {
			
				nums[i] = (int)(Math.random()*50) + 1;
				for(int j=0; i<nums.length-1-i; i++) {
					
					if(nums[i] == nums[i+1]) {
						continue;
					}
				}//중복판별for
			}
			
				for (int i=0; i<nums.length-1; i++) { //0, 1, , 2, 3
					
					for (int j=0; j<nums.length-1-i; j++) {
					
						if (nums[j] > nums[j+1]) { //오름차순
							
							int temp = nums[j];
							nums[j] = nums[j+1];
							nums[j+1] = temp;
							txt = nums[i] + txt + "";
							
						}
						
						if(nums[j] == nums.length) con = false;
					}
					
				}//정렬for
		  
		
		
		System.out.printf("%s", txt);
		

	}//main

}
