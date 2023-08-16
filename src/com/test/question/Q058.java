package com.test.question;

public class Q058 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	출력..
//	 1 ~  10:  55
//	11 ~  20: 155
//	21 ~  30: 255
//	31 ~  40: 355
//	41 ~  50: 455
//	51 ~  60: 555
//	61 ~  70: 655
//	71 ~  80: 755
//	81 ~  90: 855
//	91 ~ 100: 955
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int j=1; j<100; j+=10) {
			sum = 0;
		
			for(int i=j; i<(j+10); i++) {
				
				sum += i;
			}
				
			System.out.printf("%2d ~ %3d: %4d\n", j, j+9, sum);
		}//for
		
	}//main
	
}
