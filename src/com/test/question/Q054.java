package com.test.question;

public class Q054 {

//	요구사항
//	2부터 100사이의 소수를 구하시오.
//
//	조건..
//	소수: 1과 자기자신으로밖에 나눠지지 않는 수
	//2중 반복문, 바깥 2~100 판별, 안쪽 나눗셈
	
	public static void main(String[] args) {
		
		for(int i=2; i<=100; i++) {
			
			if(i == 2) {
				System.out.printf("%d, ", i);
				continue;
			}
			
			for(int j=i-1; j<i; j++) {
			
				if(i % j == 0) {
					continue;
				}  else if (i % j != 0) {
					System.out.printf("%d, ", i);
				}
			}
			
		}//for
		
		
	}
	
	
}
