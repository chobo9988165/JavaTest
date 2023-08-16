package com.test.question;

import java.util.Scanner;

public class Q004 {
	
	public static void main(String[] args) {
		
		/*
		 * 요구사항 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		 * 
		 * 조건: ℉ = ℃ × 1.8 + 32
				소수 입력 가능
				소수 이하 1자리까지 출력하시오.
		 */
		
		//조건에 소수 입력 가능이 붙어있고, 화씨 계산에 실수가 들어가기 때문에
		//처음 섭씨값 저장 받을 때부터 실수형으로 저장함
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("섭씨(°C):");
		double Celsius = scan.nextDouble();
		
		System.out.printf("섭씨 %.1f°C는 화씨 %.1f°F입니다.\n", Celsius, Celsius * 1.8 + 32);
		
		
		
		
	}//main

}
