
package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Q122 {
	
//	요구사항
//	성적을 확인 후 합격자/불합격자 명단을 출력하시오.
//  CSV표기법
//	한줄 씩 읽기
//  합격, 불합격 조건 취합해서 출력
	

	
	public static void main(String[] args) {//***중요
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\성적.dat"));
			
			ArrayList<String> pass = new ArrayList<String>();
			ArrayList<String> fail = new ArrayList<String>();

			String list = null;
			
			while((list = reader.readLine()) != null) {
				
				String[] temp = list.split(",");
				
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				
				if ((kor + eng + math) / 3 >= 60 && (kor >= 40 && eng >= 40 && math >= 40)) {
					pass.add(temp[0]);
				} else {
					fail.add(temp[0]);
				}
				
			}
			
			System.out.printf("[합격자]");
			
			for(String name : pass) {
				System.out.println(name);
			}
			
			System.out.println("[불합격자]");
			
			for(String name : fail) {
				System.out.println(name);
			}
			
		} catch (Exception e) {
			System.out.println("at Q122.main");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}