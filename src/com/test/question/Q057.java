package com.test.question;

public class Q057 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	출력..
//	1 ~  10:   55
//	1 ~  20:  210
//	1 ~  30:  465
//	1 ~  40:  820
//	1 ~  50: 1275
//	1 ~  60: 1830
//	1 ~  70: 2485
//	1 ~  80: 3240
//	1 ~  90: 4095
//	1 ~ 100: 5050
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int j=10; j<=100; j+=10) {
			sum = 0;
		
			for(int i=1; i<=j; i++) {
				sum += i;
			}
			System.out.printf("1 ~ %3d: %4d\n", j, sum);
			
		}//for
		

	}//main
	
}
