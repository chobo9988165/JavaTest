package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
	
//	요구사항
//	태어난 년도를 입력하면 나이를 출력하시오.
//
//	조건..
//	올해를 기준으로 나이를 계산하시오.
//	내년, 내후년에 실행해도 그때에 맞는 나이를 출력한다.
//	우리나라 나이로 출력하시오.
	
	public static void main(String[] args) {
		
		int birth = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("태어난 년도: ");
		birth = scan.nextInt() - 1;
		
		Calendar age = Calendar.getInstance();
		age.set(Calendar.YEAR, birth);			//입력받은 태어난 년도
		Calendar now = Calendar.getInstance();	
		
		long ageTick = age.getTimeInMillis();	//기준점으로부터 태어난 년도 정수화
		long nowTick = now.getTimeInMillis();	//현재
		System.out.printf("나이: %d세\n", (nowTick - ageTick) / 1000 / 60 / 60 / 24 /
				365);
		
		
		
	}

}
