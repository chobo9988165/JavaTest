package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Q123 {
	
//	요구사항
//	이름을 입력받아 회원 정보를 검색 후 출력하시오.
//  
//
	
	public static void main(String[] args) {
		
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\단일검색.dat"));
			//BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\java\\"));
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = scan.nextLine();
			String[] temp;
			String membernumber = null;
			String member = null;
			String address = null;
			String phonenumber = null;
			
			String list = null;
			
			while((list = reader.readLine()) != null) {	
				
				if(list.contains(name)) {
					
					temp = list.split(",");
					membernumber = temp[0];
					member = temp[1];
					address = temp[2];
					phonenumber = temp[3];
					break;
				}
				
			}
			System.out.printf("[%s]\n", name);
			System.out.printf("번호: %s\n", membernumber);
			System.out.printf("주소: %s\n", address);
			System.out.printf("전화: %s\n", phonenumber);
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}