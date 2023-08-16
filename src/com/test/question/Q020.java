package com.test.question;

import java.util.Calendar;

public class Q020 {
	
	
	/*
	 * 요구사항 오늘 태어난 아이의 백일과 첫돌을 출력하시오.
	 */
	
	public static void main(String[] args) {
		
		Calendar hundred = Calendar.getInstance();
		
		hundred.add(Calendar.DAY_OF_YEAR, 100);
		System.out.printf("백일: %tF\n", hundred);
		
		
		Calendar firstBirth = Calendar.getInstance();
		
		firstBirth.add(Calendar.YEAR, 1);
		System.out.printf("첫돌: %tF\n", firstBirth);
	}
	

}
