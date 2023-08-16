package com.test.question;

import java.util.Scanner;

public class Q025 {
//	요구사항
//	숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
//
//	조건..
//	두 숫자가 얼마의 차이를 보이는지 출력하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자:");
		int n1 = scan.nextInt();
		
		System.out.print("두번째 숫자:");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n", n1, n2, n1-n2);
		} else if (n1 < n2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n", n2, n1, n2-n1);
		} else if (n1 == n2) {
			System.out.println("두 숫자는 동일합니다.");
		}
	}
}
