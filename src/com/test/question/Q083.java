package com.test.question;

import java.util.Scanner;

public class Q083 {
	
	public static void main(String[] args) {
//		요구사항
//		파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
//
//		조건..
//		확장자는 다음으로 제한한다.
//		mp3
//		jpg
//		java
//		hwp
//		doc
//	확장자 누적변수
		
		Scanner scan = new Scanner(System.in);
		
		String[] filename = new String[10];
		String[] extensionSum = {"mp3","jpg","java","hwp","doc"};
		
		for(int i=0; i<10; i++) {
			
			System.out.print("파일명:");
			filename[i] = scan.nextLine();
			
		}//for
		
	}//main
	
	

}
