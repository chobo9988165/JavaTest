package com.test.question;

public class Q073 {
	
	public static void main(String[] args) {
		
		int n = 1;
		int[][] nums = new int[5][5];
		
		for (int i=0; i<5; i++) {
			
			for (int j=0; j<5-i; j++) {
				
				nums[i][j] = n;
				n++;
			}
			
		}//for
	
		//출력 > 수정없이 그대로 사용
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
