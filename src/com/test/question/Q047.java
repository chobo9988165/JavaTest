package com.test.question;

import java.util.Scanner;

public class Q047 {
	public static void main(String[] args) {
//		요구사항
//		자판기 프로그램을 구현하시오..
// 		금액이 부족할 경우, 아무튼 예외상황 구현
		
		int cola = 700;
		int cider = 600;
		int bita = 500;
		
		String enter = "";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("===================");
		System.out.println("       자판기");
		System.out.println("===================");
		System.out.printf("1. 콜라 : %d원\n", cola);
		System.out.printf("2. 사이다 : %d원\n", cider);
		System.out.printf("3. 비타500 : %d원\n", bita);
		System.out.println("-------------------");
		System.out.print("금액 투입:(원) : ");
		int won = scan.nextInt();
		System.out.println("--------------------");
		System.out.print("음료 선택(번호) : ");
		int selectnubmer = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<1; i++)
			
			if(selectnubmer == 1) {
				System.out.printf("+콜라를 제공합니다.\n");
				System.out.printf("+잔돈 %d원를 제공합니다.\n", won-cola);
				
				System.out.println("계속하시려면 엔터를 입력하세요.");
				enter = scan.nextLine();
				if(enter.equals("\r\n")) {
				}		
			}
				
			if(selectnubmer == 2) {
				System.out.printf("+사이다를 제공합니다.\n");
				System.out.printf("+잔돈 %d원를 제공합니다.\n", won-cider);
				
				System.out.println("계속하시려면 엔터를 입력하세요.");
			}		
			
			if(selectnubmer == 3) {
				System.out.printf("+비타500을 제공합니다.\n");
				System.out.printf("+잔돈 %d원를 제공합니다.\n", won-bita);
				
				System.out.println("계속하시려면 엔터를 입력하세요.");
						
			}
		
		
	}//main	
	

}
