package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {
	
	
//	요구사항
//	숫자를 한글로 바꾼 뒤 파일을 다른 이름으로 저장하시오.
//	120과 로직 동일(아라비아숫자한글로변경)
	
	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\숫자.dat"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Downloads\\파일_입출력_문제\\숫자_변환.dat"));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
			
				line = line.replace("0", "영");
				line = line.replace("1", "일");
				line = line.replace("2", "이");
				line = line.replace("3", "삼");
				line = line.replace("4", "사");
				line = line.replace("5", "오");
				line = line.replace("6", "육");
				line = line.replace("7", "칠");
				line = line.replace("8", "팔");
				line = line.replace("9", "구");
				
				writer.write(line);
			}
			reader.close();
			writer.close();
			System.out.println("변경 후 다른 이름으로 저장하였습니다.");
			
		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
