package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q118 {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\크기 정렬";
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\크기 정렬");
		File[] list = dir.listFiles();
		
		int max = 0;
		
		ArrayList<Integer> length = new ArrayList<Integer>();
		
		for(File f: list) {
			
			if(f.isDirectory()) {
				
				
				
			}
			
			if(f.isFile()) {
				
				if(f.length() > max) {				
					max = f.length();
				}
			}
			
		}
		
		
		
		
	}//main

}
