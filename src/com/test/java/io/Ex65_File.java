package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex65_File {
	
	public static final String FILE = "C:\\class\\code\\java\\file\\list.txt";
	
	//외부파일경로같은경우보통이렇게만듬
	
	public static void main(String[] args) {
		
		
		//Ex65_File.java
		/*
		
			파일 입출력
			- 응용프로그램 <- (데이터) -> 저장장치(*.txt)
			
			
			저장장치
			- 데이터 1,0으로 저장
			- 데이터의 자료형 존재X
			
			인코딩, Encoding
			- 문자 코드(자바 데이터)를 부호화(1,0) 시키는 작업
			- 자바 프로그램("홍길동") > 텍스트 파일(1001001110)
			
			디코딩, Decoding
			- 부호화 데이터를 문자 코드로 변환하는 작업
			- 텍스트 파일(1001001110) > 자바 프로그램("홍길동")

			
			인코딩/디코딩 규칙
			1. ISO-8859-1
			2. EUC-KR
			3. ANSI
			4. MS(CP)949
			5. UTF-8
			6. UTF-16
			7. ASCII
			
			
			ANSI (ISO-8859-1, EUC-KR, MS949)
			1. 영어(숫,특문,서유럽) : 1byte
			2. 한글(한자,일본어 등) : 2byte
			
			UTF-8(유니코드)
			1. 영어: 1byte
			2. 한글: 3byte
			
			UTF-16(유니코드)
			1. 영어: 2byte
			2. 한글: 2byte
			
			- [ANSI]영어.txt
			- [ANSI]한글.txt
			
			크기들이 위의 변환값과 비슷하게 나옴
			
			읽는방식과쓰는방식이다를때문제발생(데이터훼손)
			
		
		*/
		//m1(); fileoutputstream
		//m2(); fileinputstream
		
		//m3(); filewriter(문자열저장가능해서불만x)
		//m4(); filereader(문장단위로읽는메소드가없음,아쉬움)
		
		//m5(); BufferedWriter
		//m6();	BufferedReader 라인단위읽기가능,편함
		
		//m7();
		m8();
	}

	private static void m8() {
		
		try {
			//C:\class\code\java\JavaTest\src\com\test\java\\Ex01_java.java
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\hello.txt"));
			
			String line = null;
			int n = 1;
			
			boolean loop = true;
			
			while ((line = reader.readLine()) != null) {
				
				System.out.printf("%3d: %s\n", n, line);
				n++;
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m8");
			e.printStackTrace();
		}
		
	}

	private static void m7() {
		
		//메모장 쓰기
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("저장할 파일명: ");
			String filename = scan.nextLine();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\" + filename + ".txt"));			
			
			boolean loop = true;
			
			while (loop) {
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if (line.equals("exit")) {
					break;
				}

				
				writer.write(line); //한줄 입력 > 한줄 쓰기
				writer.write("\r\n");		//종료나 저장버튼으로 이스케이프 > GUI에서만 가능
				
			}
			
			writer.close();
			
			System.out.println("파일 저장 완료");
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m7");
			e.printStackTrace();
		}
		
	}

	private static void m6() {
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\memo.txt"));
			
			
			
			//reader2.read();
			//- read2.readLine();
			
			System.out.println(reader2.readLine());
			
			String line = null;
			
			while((line = reader2.readLine()) != null) {
				System.out.println(line);
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m6");
			e.printStackTrace();
		}
	}

	private static void m5() {
		
		//쓰기
		//- FileoutputStream > FileWriter > BufferedWriter
		
		//읽기
		//- FileInputStream > FileReader > BufferedReader***
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\memo.txt"));
			
			writer.write("하나");
			writer.write('A');
			writer.write("\r\n");
			writer.write("둘");
			writer.newLine();
			writer.write("셋");
			
			writer.close();
			
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m5");
			e.printStackTrace();
		}
		
		
	}

	private static void m4() {
		try {
			
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\member.txt");
			
//			int code =reader.read();
//			
//			System.out.println((char)code);
			
			int code = -1;
			
			while((code = reader.read()) != -1){
				
				System.out.print((char)code);
			}
			System.out.println();
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m4");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		//쓰기
		//- FileOutputStream > FileWriter
		
		//읽기
		//- FileInputStream < FileReader
		
		try {
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt");
			
			//writer.write(65);
			//writer.write("ABC");
			writer.write("홍길동");
			
			writer.close();
			
//			writer.write("아무개");//java.io.IOException: Stream closed, 스트림 닫히면 다시 열기전까지 사용 불가능
			
			//다시 열기
			FileWriter writer1 = new FileWriter("C:\\class\\code\\java\\file\\member.txt");
			
			writer1.write("아무개");
			
			
			System.out.println("종료");
			
			
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m3");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m2() {
		
		try {
			
			File file = new File(Ex65_File.FILE);
			
			//파일 읽기
			//- fileOutputStream
			//- fileInputStream
			
			//읽기 스트림 객체
			FileInputStream stream = new FileInputStream(Ex65_File.FILE);//경로도가능
			
			int code = -1;
			
			while ((code = stream.read()) != -1) { //**아예 외우는게 편함(비슷한패턴많이사용)
				
			
			System.out.print((char)code);
			
			}
			System.out.println();
			
			
			stream.close();
			
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m2");
			e.printStackTrace();
		}
		
		
	}

	private static void m1() {
		
		//파일 쓰기
		//-스트림 객체 필요 (입력, 출력 객체 따로 필요(단방향인이유→성능이 더 올라감))
		//-쓰기(입력) 스트림 객체
		
		//쓰기 스트림 객체
		//1. 생성 모드 ,Create mode > 덮어쓰기 > 훨씬 많이 사용!
		// 	- 기본값
		// a. 파일이 존재하지 않으면 자동으로 생성한다.
		// b. 파일이 존재하면 항상 덮어쓰기를 한다.
		
		
		
		//2. 추가 모드, Append mode > 기존 내용 > 이어쓰기
		// a. 파일이 존재하지 않으면 자동으로 생성한다.
		// b. 파일이 존재하면 항상 이어쓰기를 한다.
		
		
		
		try {
			
			File file = new File("C:\\class\\code\\java\\file\\list.txt");

			
			//쓰기 스트림 객체 생성 > 스트림 열기 Create mode > 덮어쓰기
			//메모리 임시 버퍼에 저장해놨다가, 한꺼번에 텍스트파일에 저장(성능문제)
			//메모리-메모리 관계(임시버퍼)간 접근은 빠르지만, 보조기억장치에 접근하는 속도는 매우 느림
			//- 바이트 단위 쓰기(1byte)
			FileOutputStream stream = new FileOutputStream(file, true);	//true 넣으면 append 모드
																		//옛날도구(잘안씀)
			//stream.write('홍'); 	
			//stream.write('길'); 		
			//stream.write('동'); 	
			
			String txt = "Hello~ Hong!!";
			
			for(int i=0; i<txt.length(); i++) {
				stream.write(txt.charAt(i));
			}
			
			
			
			//스트림 닫기*
			//- 저장이 안됨
			//- 잠긴 파일이 된다.
			stream.close();
			
			System.out.println("종료");
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m1");
			e.printStackTrace();
		}
		
		
	}

}
