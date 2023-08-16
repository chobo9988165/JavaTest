package com.test.question;

public class Q059 {
	
//	요구사항
//	아래와 같이 출력하시오.
//
//	조건..
//	마지막 숫자가 100이 넘기 전까지 출력하시오.
//	출력..
//	1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469
//1 = 1+0 = sum
//2 = 1+1 sum = sum + i
//4 = 2+2 sum = sum + i
//7 = 4+3 sum = sum + i
//11 = 7+4 sum = sum + i
//16 = 11+5

	
	public static void main(String[] args) {
		
		int sum = 1;
		int esum = 0;
		
			for(int i=0; true; i++) {
				sum = sum + i;
				if(sum > 100) {
					break;
				}
				esum = esum + sum;

				System.out.print(" + " + sum);
				
			}//for
				
			System.out.printf(" = %d", esum);
	
		
	}//main
}
