package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class Q124 {
	
//	요구사항
//	이름을 입력받아 회원 주문 정보를 검색 후 출력하시오
//  123 업그레이드 버전 (파일이 두개임)
//  주문 2번째(구매갯수) 3번째(회원번호)
//  회원번호를 통해서 회원 정보에 접근 해야함
	
	
	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\검색_회원.dat"));
			Scanner scan = new Scanner(System.in);		
			String list = null;
			
			
			System.out.print("이름: ");
			String name = scan.nextLine();
			String membernumber = null;
			String membername = null;
			String address = null;
			String productname = null;
			String count = null;
			
			while((list = reader.readLine()) != null) {//회원명,주소들어있는파일검색
				String[] temp = list.split(",");
				if(temp[1].equals(name)) {
					membernumber = temp[0];
					address = temp[2];
					break;
				}
			}
			
			
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\검색_주문.dat"));
			while((list = reader2.readLine()) != null){ //주문정보들어있는파일검색
				String[] temp = list.split(",");
				if(temp[0].equals(membernumber)) {
					count = temp[3];
					productname = temp[1];
				}
			}
			
			
			System.out.println("====구매내역====");
			System.out.printf("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]\n");
			System.out.printf("%s\t%s\t%s\t%s\t%s\t\n",membernumber,name,productname,count,address);
			
			reader.close();
			reader2.close();
			
			
			} catch (Exception e) {
			System.out.println("at Q124.main");
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	

}
