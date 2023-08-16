package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		/*요구사항
		 *태어난 년도를 입력받아 나이를 출력하시오.
		 *
		 *조건 : 우리나라 나이로 출력하시오.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("태어난 년도: ");
		
		int koreanbirth = scan.nextInt(); //밑줄보다 여기에 +1 값을 더하는게 맞을 것 같다
		int thisyear = 2023;
		
		System.out.printf("나이: %d세\n", thisyear - koreanbirth + 1);	// '한국 나이'라서 결과값에 +1세	
		
		
		

	}//main

}
