package com.test.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex64_File {
	
	//누적 변수
	private static int count = 0;	//파일 개수
	private static int dcount = 0;	//폴더 개수
	private static long length = 0;	//21억 넘어가는 경우가 흔함
	
	public static void main(String[] args) {
		
		//Ex64_File_java
		
		/*
		 
		 
		 
		 	1. 파일/디렉토리 조작
		 		- 윈도우 탐색기로 하는 모든 행동 > 자바로 구현
		 		- 파일 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기 ,삭제하기 등
		 		- 폴더 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기 ,삭제하기 등
		 		//윈도우탐색기왼쪽:트리뷰
		 		 *폴더목록내역:리스트뷰
		 		
		 	2. 파일 입출력
		 		- 파일 > 읽기/쓰기
		 		- 메모장 기능	 
		 
		 */
		
		
		//m1(); 	//파일
		//m2(); 	//폴더
		//m3();   	//파일 생성
		//m4();		//파일 이름 수정(renameTo)
		//m5();		//파일 경로 변경(renameTo)
		//m6();		//파일 삭제(조심)
		
		//m7();		//디렉토리생성
		//m8();		//
		//m9();		//캘린더로 생성하기
		//m10();	//폴더 이름 바꾸기
		//m11();	//폴더 이동하기
		//m12();	//폴더 삭제하기(빈폴더일때만)
		//m13();	//폴더 내용 보기
		
		
		//m14();		//*자주 쓰이는 로직
		m15();			//**************재귀***********진짜중요★★★★★★★★★★★★
		
//		덮어쓰기 : 기존파일 삭제하고 새 파일 추가하기
//
//		확장자 카운트 : 해시맵으로 처리
//		(HashMap<String, Integer>)
//
//		delete폴더삭제 : 재귀메소드
//
//		크기정렬안의모든파일목록출력+크기정렬
	}

	private static void m15() {
		
		//특정 폴더 > 파일 개수 세기
		File dir = new File("C:\\class\\dev\\eclipse");
		
		if (dir.exists()) {
			
			countFile(dir);
			
			System.out.printf("총 파일 개수:%,d개\n", count);
			System.out.printf("총 폴더 개수:%,d개\n", dcount);
			System.out.printf("폴더 크기:%,dB\n", length);
		}
		
		
		
		
		
		
		
	}

	private static void countFile(File dir) {
		
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 개수
		for (File subfile : list) {
			if(subfile.isFile()){
				count++;
				
				length += subfile.length(); //파일 크기를 누적
			}
		}
		//3. 자식 폴더를 대상으로 1~2번을 반복
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				
				dcount++;
				
				//1~2번 실행 > 3번 > 손자 폴더
				countFile(subdir); 	//자식 폴더 > 반복 
			}
		}
		
	}

	private static void m14() {
		
		//특정 폴더 > 파일 개수 세기
		File dir = new File("C:\\class\\dev\\eclipse");
		
		int count = 0; //누적 변수
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles();
			
			for (File subfile : list) {
				if (subfile.isFile()) {
					count++;
				}
			}
			
			
			for (File subdir : list) {
				if (subdir.isDirectory()) {
					
					//자식 폴더 > 내용
					File[] sublist = subdir.listFiles();
					
					for(File subsubFile : sublist) {
						if (subsubFile.isFile()) {
							count++;
						}
					}
					
					
					
					for(File subsubdir : sublist) {
						if(subsubdir.isDirectory()) {
							
							//손자 폴더 > 내용물
							File[] subsublist = subsubdir.listFiles();
							
							for (File subsubsubfile : subsublist) {
								if( subsubsubfile.isFile()) {
									count++;
								}
								
							}
						}
					}
					
				}
			}
			
			
			System.out.printf("총 파일 개수: %,d개\n", count);
			
		}//if
		
	}

	private static void m13() {
		
		//폴더의 내용 보기(자식 폴더, 파일)
		//파일인지 아닌지 확인하려면 추가 작업이 필요해서 귀찮음
		String path = "C:\\class\\dev\\eclipse";
		
		File dir = new File(path);
		
//		if(dir.exists()) {
//			
//			//dir.list();
//			//dir.listFiles();
//			
//			String[] list = dir.list();
//			
//			for(String f: list) {
//				
//				//파일명, 폴더명
//				//System.out.println(f);
//				
//				File file = new File(path + "\\" + f);
//				System.out.println(f + " > " + (file.isFile() ? "파일" : "폴더"));
//			}
//		}
		
		
//		File[] list = dir.listFiles();
//		
//		for (File f : list) {
//			
//			System.out.printf("%s - %s\n"
//					, f.getName()
//					, f.isDirectory() ? "폴더" : "파일");
//		}
		
		
		//탐색기 느낌
		File[] list = dir.listFiles();
		
		for (File d : list) {
			
			if (d.isDirectory()) {
				System.out.printf("[%s]\n", d.getName());
			}
		}
		
		for (File f : list) {
			
			if (f.isFile()) {
				System.out.println(f.getName());
			}
			
		}
		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void m12() {
		
		//폴더 > 삭제하기
		//- 빈폴더일때만 가능하다.
		//- 내용물(파일, 자식폴더)이 있으면 삭제가 불가능하다.
		File dir = new File("C:\\class\\code\\java\\move\\할일");
		
		if (dir.exists()) {
			
			System.out.println(dir.delete());
		}
		
		
	}

	private static void m11() {
		
		//폴더 => 이동하기
				File dir = new File("C:\\class\\code\\java\\file\\할일");
				File dir2 = new File("C:\\class\\code\\java\\move\\할일");
				
				if(dir.exists()) {
					
					System.out.println(dir.renameTo(dir2));
					
				}
		
	}

	private static void m10() {
		
		//폴더 => 이름 바꾸기
		File dir = new File("C:\\class\\code\\java\\file\\날짜");
		File dir2 = new File("C:\\class\\code\\java\\file\\할일");
		
		if(dir.exists()) {
			
			System.out.println(dir.renameTo(dir2));
			
		}
		
		
	}

	private static void m9() {
		
		//요구사항] 날짜별 폴더 > 2023-01.01 ~ 2023-12~31];
		
		Calendar c = Calendar.getInstance();
		c.set(2023, 0, 1);
		
		//System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		int max = c.getActualMaximum(Calendar.DAY_OF_YEAR);//365로 고정
		
		
		for(int i=0; i<max; i++) {
			
			//"2023-01-01"
			String name = String.format("%tF", c);
			System.out.println(name);
			
			File dir = new File("C:\\class\\code\\java\\file\\날짜\\" + name);
			dir.mkdirs();
			System.out.println();
			
			c.add(Calendar.DATE, 1);
		}
		
	}

	private static void m8() {
		
		//요구사항] 회원 > 회원명으로 개인 폴더 생성
		
		String[] member = { "홍길동", "아무개", "권율", "유관순", "이순신" };
		
		for(int i=0; i<member.length; i++) {
			
			String path = String.format("C:\\class\\code\\java\\file\\회원\\[개인폴더]%s님"
					, member[i]);
			
			File dir = new File(path);
			
			System.out.println(dir.mkdirs());
			
		}
		
		
		
	}

	private static void m7() {
		
		//폴더(디렉토리)단일 생성 mkdir(), 다중 생성 mkdirs()
		
		//폴더 > 만들기
//		File dir = new File("C:\\class\\code\\java\\aaa");
		File dir = new File("C:\\class\\code\\java\\bbb\\ccc");
		
		if(!dir.exists()) {
			
			//System.out.println(dir.mkdir());
			System.out.println(dir.mkdirs());
		}
		
		
	}

	private static void m6() {
		//파일 > 삭제하기
		File file = new File("C:\\class\\code\\java\\move\\데이터.txt");
		
		if(file.exists()) {
			//파일 이동 > 휴지통(O)
			//파일 삭제 > 휴지통(X)
			//휴지통 이동 안하고 바로 삭제됨
			//수명: 하드 > SSD > USB (공식적으로는)
			System.out.println(file.delete());
		}
		
	}

	private static void m5() {
		
		//파일 > 이동하기
		//- C:\\class\\code\\java\\file\\data.txt;
		//- C:\\class\\code\\java\\move\\data.txt
		//*경로이동할때도리네임메소드.
		//리네임메소드는파일이름만바꾸는게아니라경로이름을바꾼다.
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		File file2 = new File("C:\\class\\code\\java\\move\\데이터.txt");
		
		if(file.exists()) {
			
			System.out.println(file.renameTo(file2));
		}

		
	}

	private static void m4() {
		
		//파일 > 파일명 바꾸기
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		File file2 = new File("C:\\class\\code\\java\\file\\데이터.txt");
		
		if(file.exists()) {
			
			System.out.println(file.renameTo(file2));
		}
		
	}

	private static void m3() {
		
		File file = new File("C:\\class\\code\\java\\file\\hello.txt");
		
		if (!file.exists()) {
			
			try {
				System.out.println(file.createNewFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}else {
			System.out.println("이미 동일한 파일이 존재합니다.");
		}
		
		
	}

	private static void m2() {
		
		
		//폴더 > 정보
		//- 폴더(Folder) == 디렉토리(Directory)
		//- C:\class\code\java\file
		
		//폴더 참조 객체
		//- 폴더는 파일이다.
		//파일은 폴더 안에 들어 있는 것이 아니지만 자신이 속한 폴더의 이름은 기억한다.
		//나중에 윈도우 탐색기를 열 때, 폴더를 참조하고 있는 모든 파일의 목록 불러옴
		//폴더는 이름만 가지고 있는 애다(크기 존재하지 않음)
		
		File dir = new File("C:\\class\\code\\java\\file");
		
		if (dir.exists()) {
			System.out.println("폴더가 있습니다.");
			
			System.out.println(dir.getName());				//폴더이름, 우린 이미 적었는데 왜 필요한가? → 나중에 찾아야 하는 파일 이름을 모르는 상황이 나옴. 그때 사용
			System.out.println(dir.isFile());				//파일인가 아닌가 false 우린 이미 아는데? 위와 동일
			System.out.println(dir.isDirectory());			//디렉토리인가 아닌가 true 동일
			System.out.println(dir.length());				// 0 > 폴더 크기(byte)
			System.out.println(dir.getAbsolutePath());     //경로
			
			System.out.println(dir.lastModified());		//마지막으로수정한날짜 (Tick값)
			System.out.println(dir.isHidden());			//숨김이냐 아니냐

			
			
		} else {
			System.out.println("폴더가 없습니다.");
		}
		
		
	}

	private static void m1() {
		
		//파일의 정보 확인 작업을 해보자
		//- C:\class\code\java\file - 폴더 생성
		//- C:\class\code\java\file\data.txt > 텍스트 파일 생성
		
		//자바 프로그램에서 외부의 파일을 접근
		//1. 외부 파일을 참조하는 참조 객체 생성 > 대리자, 위임자
		//2. 파일 참조 객체 조작 > 행동 > 외부 파일에 적용 (나-부동산중개인-주인 관계)
		
		
		
		//파일 참조 클래스 > 객체 > java.io.File
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		
		//System.out.println(file.exists());
		
		
		if(file.exists()) {
			
			System.out.println("파일이 있습니다.");
			
			//업무
			System.out.println(file.getName());				//파일이름, 우린 이미 적었는데 왜 필요한가? → 나중에 찾아야 하는 파일 이름을 모르는 상황이 나옴. 그때 사용
			System.out.println(file.isFile());				//파일인가 아닌가 true 우린 이미 아는데? 위와 동일
			System.out.println(file.isDirectory());			//디렉토리인가 아닌가 false 동일
			System.out.println(file.length());				// 16 > 파일 크기(byte)
			System.out.println(file.getAbsolutePath());     //경로
			System.out.println(file.lastModified());		//마지막으로수정한날짜 (Tick값)
			System.out.println(file.isHidden());			//숨김이냐 아니냐
			
			//tick > 년월일시분초
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis());
			c1.setTimeInMillis(file.lastModified());
			
			System.out.printf("%tF %tT\n", c1, c1);
			
		} else {
			System.out.println("파일이 없습니다.");
		}
		
	}
	
	

}
