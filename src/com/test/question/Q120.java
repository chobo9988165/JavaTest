package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {
	
	//이름수정.dat 열고, 특정 단어 찾아 또 다른 단어로 변환 후 바꾼 단어로 파일 저장
	//bufferedreader로 읽고 유재석 찾기
	//bufferewriter로 메뚜기로 변경
	//이름수정_변환.dat저장
	
	
	public static void main(String[] args) {
		
		
		try {			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정.dat"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정_변환.dat"));
			
			String word = null;
			
			while((word = reader.readLine()) != null) {
					word = word.replace("유재석", "메뚜기");
					writer.write(word);
			}
			
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
			
			
		} catch (Exception e) {
			System.out.println("at Q120.main");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
