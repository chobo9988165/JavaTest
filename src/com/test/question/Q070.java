package com.test.question;

public class Q070 {
	
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		
		int n=1;
		
		
		for(int i=0; i<5; i++) {
			
			if(i%2 != 0) {
				for(int j=4; j>=0; j--) {
					nums[i][j] = n;
					n++;
					continue;
				}
				
			}	else   {
				for(int j=0; j<5; j++) {
					nums[i][j] = n;
					n++;
					}
				}
			}//for\
			
		
		
		
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}

/*
 * / for(int i=0; i<5; i++) {
 * 
 * 
 * if (i % 2 == 0) {
 * 
 * for (int j=0; j<5; j++) { System.out.printf("%5d", nums[i][j]); }
 * System.out.println(); continue; } else { for (int j=4; j>= 0; j--) {
 * System.out.printf("%5d", nums[i][j]); } System.out.println(); }
 * 
 * }
 */
