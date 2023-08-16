package com.test.question;

public class Q041 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	조건..
//	누적값이 1000을 넘어가는 순간 루프를 종료하시오.
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;; i++) {
			
			sum += i;
			
			System.out.printf("+ %d", i);
			
			if(sum > 1000) {
				break;
			}
			
		}//for
		
		System.out.printf(" = %d", sum);
			
		
	}

}
