package com.test.java.auth.data;

import java.util.Scanner;

import com.test.java.auth.Member;
import com.test.java.data.Data;
import com.test.java.data.Student;

public class Auth {
	
	public static Student auth; //로그인 성공한 회원의 객체 > 인증 티켓
	

	public static void login() {
		
		//인증 > Authentication
		//- 접속한 사람이 회원인지 확인하는 과정
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("-------------");
		System.out.println("    로그인");
		System.out.println("-------------");
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		System.out.print("비밀번호: ");
		String pw = scan.nextLine();
		
		for (Student m : Data.list) {
			if(m.getNo().equals(id) && m.getNo().equals(pw)) {
				//회원 > static
				Auth.auth = m;
				break;
			}
		}//for
		
		
		if(Auth.auth != null) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		scan.nextLine();
		
	}


	public static void logout() {
		
		Auth.auth = null; //인증 티켓 제거 == 로그아웃
		
		System.out.println("로그아웃");
		
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		
		
	}

}
