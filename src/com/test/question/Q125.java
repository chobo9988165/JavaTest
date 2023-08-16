package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q125 {
	
	//풀수있으면풀고못풀면넘겨도됨
	//괄호의 짝이 맞는지 검색해야함(괄호가엉망진창임)
	//스택쓰면됨
	//1. 스택 생성
	//2. 라인단위로읽으면안됨, 한글자씩 읽기
	//3. 읽던 중 여는 괄호 만나면 스택에 쌓기
	//4. 가다가 여는 소괄호 만나면 스택에 쌓기
	//5. 닿는 소괄호 만나면 스택에 있는 마지막에 있는 것 꺼내기, 소괄호 만나면 맞는 짝, 사라짐
	//6. 또 여는 소괄호 만나면 스택에 쌓기, 다음 닫는 소괄호 만나면 꺼내기 
	//7. 꺼낸 것과 닿는 괄호가 1:1로 일치하면 true else false
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new FileReader(""));
		
		String list = null;
		
	
		
		
		
	}

}
