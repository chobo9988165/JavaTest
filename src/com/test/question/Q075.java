package com.test.question;

public class Q075 {
	
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		int n = 1;
		 
		//데이터 입력	> 문제
		
		for (int i=0; i<nums.length-1; i++) {
			for (int j=0; j<nums.length-1; j++) {
			
				nums[i][j] = n;
				nums[i][4] += n;
				nums[4][j] += n;
				nums[4][4] += n;
				
				n++;
				
			}
		}//for
		
		
		//출력 > 수정없이 그대로 사용
		for(int i=0; i<nums.length; i++) {
			for (int j=0; j<nums.length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}//main

}
