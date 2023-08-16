package com.test.question;

public class Q074 {
	
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		//데이터 입력	> 문제
		
		for (int i=0; i<nums.length/2+1; i++) {//3번반복
			
			for (int j=2-i; j<=2+i; j++) { //1, 3, 5
				
				nums[i][j] = n;
				n++;
				
			}	
		}//for
		
		
		for (int i=nums.length/2+1; i<nums.length; i++) {
			//2번반복
			for (int j=i-2; j<=6-i; j++) {//3,5
				nums[i][j] = n;
				n++;
			}
			
		}
		
		
		//출력 > 수정없이 그대로 사용
		for(int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
