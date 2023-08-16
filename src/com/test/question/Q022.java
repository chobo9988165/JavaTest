package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {
	
//	요구사항
//	남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
//
//	입력..
//	남자 이름: 하하하 
//	여자 이름: 호호호 
//	만난날(년): 2023 
//	만난날(월): 7 
	public static void main(String[] args) {
		
		String mname = "''";
		String wname = "''";
		int year = 0;
		int month = 0;
		int day = 0;
		
		Scanner scan = new Scanner(System.in);
		Calendar meetday = Calendar.getInstance();
		
		
		System.out.print("남자 이름: ");
		mname = scan.nextLine();
		
		System.out.print("여자 이름: ");
		wname = scan.nextLine();
		
		System.out.print("만난날(년): ");
		year = scan.nextInt();
		meetday.set(Calendar.YEAR, year);
		
		System.out.print("만난날(월)");
		month = scan.nextInt();
		meetday.set(Calendar.MONTH, month);
		
		System.out.print("만난날(일)");
		day = scan.nextInt();
		meetday.set(Calendar.DATE, day);
		
		meetday.set(year, month -1, day); //※ month : 0~11 항상 기억
 		
		
		System.out.printf("%s와 %s의 기념일\n", mname, wname);
		
		meetday.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", meetday);
		
		meetday.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n", meetday);
		
		meetday.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n", meetday);
		
		meetday.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n", meetday);
		
		meetday.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n", meetday);
		
		
	}

}
