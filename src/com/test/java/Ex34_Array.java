package com.test.java;

import java.util.Scanner;

public class Ex34_Array {
	
	public static void main(String[] args) {
		
		
		//EX34_String.java
		
		
		//문자열, String
		//- JDK 제공하는 문자열 조작 기능
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
		
		
		
		
	}//main

	private static void m13() {
		
		//문자열 분리
		//- String[] split(string delimiter)
		//- 구분자를 기준으로 쪼개는 메소드
		
		String name = "홍길동,아무개,유재석,강호동,박명수";	//구분자는사라짐
		
		String[] temp = name.split(",");
		
		for(int i=0; i<temp.length; i++) {
			System.out.println(i + ": " + temp[i]);
		}
		
		
		
	}

	private static void m12() {
		
		//문자열 치환(바꾸기)
		//- String replace(String old, String new)
		//- 문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = txt.indexOf("홍길동");
		
		String temp1 = txt.substring(0, index); 	//"안녕하세요. "
		String temp2 = txt.substring(index + 3); 	//"입니다."
		
		System.out.println(temp1 + "아무개" + temp2);
		
		System.out.println(txt.replace("홍길동", "아무개"));
		
		txt = "                   하나                    둘                 셋               ";
		System.out.println(txt.trim());
		
		//*** replace로 무언가를 삭제하고 싶으면 찾아서 ""로 교체하면 된다
		System.out.println(txt.replace(" ", ""));
		
	}

	private static void m11() {
		
		//문자열 검색
		//-indexOf(), lastIndexOf()
		//- startWith(), endWith()
		
		//-boolean contains(String)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.contains("아무개"));
	}

	private static void m10() {
		
		//문자열 추출
		//- String substring(int beginIndex, int endIndex)
		//- String substring(int beginIndex)
		//- beginIndex : 포함(inclusive)
		//- endIntex : 미포함(exclusive)
		
		
		//*** 자바에서는 범위를 나타낼 때 > 시작(포함) ~ 끝(미포함)
		//Math.random() > 0~1 사이 난수
		
		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3, 7));
		System.out.println(txt.charAt(5));			//'바' > 문자코드값 변환 가능
		System.out.println(txt.substring(5, 6));	//"바" > 문자코드값 변환 불가
		System.out.println(txt.substring(3));		//end 없으면 시작위치부터 끝까지
		System.out.println();
		
		
		//주민등록번호
		String jumin = "970728-1012345";
		
		//성별?
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
		
		
		//몇년생?
		//'9'(57) + '7'(55) == 112
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1));	//97
		System.out.println(jumin.substring(0, 2));
		
		//몇월생?
		System.out.println(jumin.substring(2, 4));
		
		//몇일생?
		System.out.println(jumin.substring(4, 6));
		System.out.println();
		
		String path = "c:\\class\\java\\JavaTest\\Ex34_String.java";
		
		
		//1. 파일명 추출 > Ex34_String.java
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index + 1);
		System.out.println(filename);
		
		
		//2. 확장자 없는 파일명 추출 > "Ex34_String"
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0, index);
		System.out.println(filenameWithoutExtension);
		
		
		//3. 확장자 추출 > ".java"
		String extension = filename.substring(index + 1);
		System.out.println(extension);
		
		
		
	}

	private static void m9() {
		
		//패턴 검색
		//- boolean startsWith(String)		//해당 문자열로 시작하는가
		//- boolean endWish(String)			//해당 문자열로 끝나는가
		
		String txt = "자바 프로그래밍";
		
		System.out.println(txt.startsWith("자바"));
		System.out.println(txt.startsWith("프로그래밍"));
		
		System.out.println(txt.endsWith("자바"));
		System.out.println(txt.endsWith("프로그래밍"));
		
		
		String name = "홍길동";
		
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf("동") == name.length()-1);
		System.out.println();
		
		//파일 경로
		String path = "c:\\class\\java\\JavaTest\\\\Ex34_String.java";
		
		//해당 파일이 '자바 소스 파일' 입니까?
		if (path.endsWith(".java")) {
			System.out.println("자바 소스 파일");
		} else {
			System.out.println("다른 파일");
		}

		
	}

	private static void m8() {
		
		
		//대소문자 변경
		//- String toUpperCase();
		//- String toLowerCase();
		
		String content = "오늘 수업은 Java입니다.";
		String word = "java";
		
		System.out.println(content);
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		
		//대소문자 구분(Case sensitive)
		//- 정확도 높음
		//- 검색율 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("결과 O");
		} else {
			System.out.println("결과 X");
		}
		
		//대소문자 구분X(Case insensitive)
		//- 정확도 낮음
		//- 검색율 높음
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("결과 O");
		} else {
			System.out.println("결과 X");
		}
		
		
		
	}

	private static void m7() {
		
		//주민등록번호 > '-' 기입
		String jumin = "970728-2012345";
		
		
		
		if (jumin.charAt(6) == '-') {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		if (jumin.indexOf("-") == 6) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}				//활용도 훨씬 높음
		
		
		//게시판 글쓰기 > 관리자 > 금지어!!!
		String word = "바보";
		String content = "바보 안녕하세요. 반갑습니다~ 자바를 공부하고 있어요.";
		
		if (content.indexOf(word) > -1) {
			System.out.println("금지어 발견!!");
		} else {
			System.out.println("글쓰기 진행~");
		}
		
		
		String[] words = { "바보", "멍청이", "메롱", "ㅂㅏㅂㅗ" };
		
		for (int i=0; i<words.length; i++) {
			
			if (content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견!!");
				break;
			}
			
			
		}
		
		
		
		
		
	}

	private static void m6() {
		
		//문자열 조작
		//1. int length()
		//2. char chatAt(int)
		//3. String trim()
		
		
		
		//문자열 검색
		//- int indexOf()
		//- int indexOf(String) → 찾는 문자열의 첫번째 글자 주소값 반환 몇번을 호출해도 첫번째밖에 못찾음
		//- int indexOf(char, int)
		//- int indexOf(String, int)
		
		//- int lastindexOf()
		//- int lastindexOf(String) → 찾는 문자열의 첫번째 글자 주소값 반환 몇번을 호출해도 첫번째밖에 못찾음
		//- int lastindexOf(char, int)
		//- int lastindexOf(String, int)
		
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = -1; // -1로 초기화 한 이유. 못찾으면 0을 반환하기 때문에 헷갈리지 않도록 한다.
		
		index = txt.indexOf('하', 0);
		System.out.println(index);
		
		index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf('김');
		System.out.println(index);
		
		index = txt.indexOf("홍길동", 0);
		System.out.println(index);
		System.out.println();
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕하세요.  홍길동입니다. 홍길동";
		
//		index = txt.indexOf("홍길동", 0);
//		System.out.println(index);
//		
//		index = txt.indexOf("홍길동", 10); //22
//		System.out.println(index);
//		
//		index = txt.indexOf("홍길동", 25); //38
//		System.out.println(index);
		
		index = -1;
		
		//for (int i=0; i<3; i++) {
		while(true) {	
			index = txt.indexOf("홍길동", index);
			
			if(index == -1) { //홍길동을 못찾았는가?
				break;
			}
			
			System.out.println(index);
			
			index += 3;
		}
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		//검색 방향: 왼쪽 > 오른쪽
		System.out.println(txt.indexOf("홍길동"));//7
		
		//검색 방향: 오른쪽 > 왼쪽
		System.out.println(txt.lastIndexOf("홍길동"));//22
		
		
		
		
		
		
		
		
	}

	private static void m5() {
		
		//공백 제거
		//-String trim()
		//-문자열내의 공백(Whitespace > 스페이스, 탭, 개행)문자를 제거
		
		String txt = "    하나     둘     셋     ";
		
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		
	}

	private static void m4() {
		//주민등록번호: 970727-1000001
		
		String jumin = "970727-1000001";
		
		System.out.println(jumin.charAt(6));
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
			
			if(jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
			
		} else {
			System.out.println("올바르지 않은 주민번호");
		}
		
	}

	private static void m3() {
		
		Scanner scan = new Scanner(System.in);
		
		//요구사항] 회원 가입 > 아이디 입력 > 영어 소문자만 입력
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		//아이디: 'h' 'o' 'n' 'g'
		
		for (int i=0; i<id.length(); i++) {
			
			char c = id.charAt(i);
			
			//System.out.println(c);
			
			//영소문자가 아니다.
			if (c < 'a' || c > 'z') {
				System.out.println("잘못된 문자가 발견되었습니다.");
				break;
			}
		
		}
		System.out.println("종료");
	}

	private static void m2() {
		
		//문자열 추출
		//- char charAt(int index)
		
		//			  0 12 3 4
		String txt = "안녕하세요. 홍길동입니다.";
		
		//Returns the char value at thespecified index
		//An index ranges from 0 to length
		char c1 =txt.charAt(3);
		System.out.println(c1);

		char c2 =txt.charAt(7);
		System.out.println(c2);

		char c3 =txt.charAt(13);
		System.out.println(c3);
		
//		char c4 =txt.charAt(14);	// java.lang.StringIndexOutOfBoundsException
//		System.out.println(c3);
		
		//마지막 문자
		char c = txt.charAt(txt.length() - 1);
		System.out.println(c);
		
		
		
	}

	private static void m1() {
		
		//문자열(String), 문자(char)
		//문자열 == 문자의 집합
		//String == char[]
		
		//문자열 조작 기능 == 배열 조작 기능 유사
		
		//문자열 길이
		//- int length()
		//- 문자열의 글자수
		
		//홍길동입니다.
		char[] clist = { '홍', '길', '동', '입', '니', '다', ',' };
 		System.out.println(clist.length);
 		
 		
 		String str = "홍길동입니다.";
 		System.out.println(str.length());
 		
 		System.out.println("홍길동".length());
 		
 		
 		System.out.println("A1가$".length());
 		
 		
 		//요구사항] 회원 가입 > 이름 입력 > 이름을 2자~5자이내로 작성하시오.
 		//		 - 유효성 검사
 		
 		Scanner scan = new Scanner(System.in);
 		
 		System.out.print("이름: ");
 		
 		System.out.print("이름: ");
 		String name = scan.nextLine();
 		
 		if(name.length() >= 2 && name.length() <= 5) {
 			System.out.println("올바른 이름~");
 		} else {
 			System.out.println("이름을 2자~5자이내로 작성하시오.");
 		}
 		
 		
 		
 		
	}

}
