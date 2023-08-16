package com.test.question;

import java.io.File;

public class Q117 {//재귀탐색
	
	public static void main(String[] args) {
		
		
		//내용 있는 폴더 삭제하기
		File dir = new File("C:\\class\\code\\java\\file\\파일_디렉토리_문제\\폴더 삭제\\delete");
		
		
		//탐색
		delete(dir);
		
		System.out.println("종료");
		
	}//main

	private static void delete(File dir) {
		
		File[] list = dir.listFiles();
		
		for(File f : list) {
			if(f.isFile()) {
				f.delete();
				//action
			}
		}
		
		for(File d : list) {
			if(d.isDirectory()) {
				delete(d);
			}
		}
		
		//***내용물아무것도없는폴더상황
		dir.delete();
	}

}
