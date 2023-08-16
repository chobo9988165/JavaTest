package com.test.java.obj.inheritance;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {
	
	public static void main(String[] args) {
		
		//예외처리는 가볍게 보고 넘겨도 됨
		//main throws Exception = 예외 처리 포기
		
		//Ex59_Exception.java
		
		/*
		 
		 
		 
		 
		 	예외 Exception
		 	- 런타임 오류
		 	- 컴파일 발견(X) > 실행 중 발견(O)
		 	- 개발자 미리 예측(O)
		 	
		 	
		 	예외 처리, Exception Handling
		 	1. 전통적인 방식
		 		-제어문 사용(조건문)
		 	
		 	2. 전용 방식
		 		-try catch finally 문 사용
		 	
		 
		 
		 */
		//m1();
		//m2();
		//m3();
		//m4();
		
//		try {
//			m5();
//		} catch (Exception e) {
//			System.out.println("예외 발생");
//		} //Unhandled exception type Exception
		
		m6();
		
		try {
			int num = 0;
			System.out.println(100 / num);
		} catch (Exception e) {
			
		}							//★catch 구현 안하면 에러 떴는데 메세지가 안뜸→ 오류 잡아내기 어려워짐
		
		
	}//main
	private static void m6() {
		
		
		
		
		//예외 던지기
		
		//요구사항] 숫자 입력 > 처리
		//조건] 반드시 짝수만 입력
		//		     홀수 입력 > 에러 처리
		//if문은 조건을 내마음대로 걸 수 있지만, try catch문은 자바 내의 진짜 오류가 아니면 잡지 않음
		int num = 1;
		
		if (num % 2 == 0) {
			System.out.println("업무를 진행...");
		} else {
			System.out.println("업무 중단");
		}
		
		//try 구현
		try {
			if(num % 2 == 1) {
			throw new Exception("홀수 입력"); //★thorws 아님, 강제로 에러 발생
			}//
			System.out.println("업무 진행..");
		} catch (Exception e) {
			System.out.println("예외 처리..");
			System.out.println(e.getMessage());//좀 더 상세하게 알고 싶다면 예외객체에서 꺼내오기 가능
		}
		
		
		
		
		
		
		
	}
	private static void m5() throws Exception {
		
		//예외 미루기 throws
		//에러 메세지가 당사자가 아닌 호출한 곳으로 감
		//예외 미루기의 존재 이유:
		//예)-서울지부 부산지부 각자도생 : 가벼운 대신 각자 일어나는 일 알 수 없음
		//  -★부산지부(메소드) 전남지부(메소드) 문제 발생시 → 서울(메인) 지부로 떠넘김 : 무거워지는 대신 서울은 모든 곳에 대한 관리 가능
		//  -그런데 어지간해서는 안씀(어렵다, 초기부터 설계 필요)
		BufferedReader reader
		= new BufferedReader(new InputStreamReader(System.in));		
		
		//Unhandled exception type IOException 에러를 발생시킬 위험이 있으니
		//적절한 조치를 취해라
		String input = reader.readLine();
		
		
		
		
		
	}
	private static void m4() {//다중 캐치문
		try {			//구간 마다 캐치는 잘함 1번이나면 1번부터 2번이 나면 1번 실행후 2번 캐치. 그러나 상세함은 떨어짐(전부 예외처리 출력 끝)
			//0으로 나누기 >  java.lang.ArithmeticException
			int num = 10;
			System.out.println(100/num);	// new ArithmeticException 예외 객체 생성후 던짐 → catch가 예외 잡아챔
			
			//배열 첨자 오류 >  java.lang.ArrayIndexOutOfBoundsException
			int[] nums = new int[3];
			nums[0] = 10;
			System.out.println(nums[0]);
			
			//널참조 >  java.lang.NullPointerException
			Scanner scan = null;
			scan.nextLine();
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누기");
			
		}catch (ArrayIndexOutOfBoundsException e) { //잡을 자격이 없다. 형변환도 안됨, 서로간 형제라서 → Exception은 모든 오류들의 부모 객체
			System.out.println("배열 첨자");
			
		}catch (NullPointerException e) {
			System.out.println("널참조");
			
		}catch (Exception e) {
			System.out.println("예외 처리");
		}//만약 오류가 모든 catch를 벗어난다면 프로그램이 종료됨(없을 때랑 마찬가지)
		//Exception e의 순서가 바뀌면 안됨.
	}
	private static void m3() {//가독성 떨어짐
		
		//0으로 나누기 >  java.lang.ArithmeticException
		try {
			int num = 10;
			System.out.println(100/num);
		} catch (Exception e) {
			System.out.println("0으로 나누기");
		}
		
		//배열 첨자 오류 >  java.lang.ArrayIndexOutOfBoundsException
		try {
			int[] nums = new int[3];
			nums[0] = 10;
		} catch (Exception e) {
			System.out.println("배열 첨자");
		}
		
		//널참조 >  java.lang.NullPointerException
		try {
			Scanner scan = null;
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("널 참조");
		}
		
		
	}
	private static void m2() {
		
		int num = 0;
		
		try {
			
			//test.txt 파일 열기
			
			//비즈니스 영역
			System.out.println(100 / num);
			
			//text.txt 파일 닫기
			
		} catch (Exception e) {
			//예외처리 여역
			System.out.println("예외 처리");
			
		}finally {
			
			//? > 마무리 영역 > 무조건 실행되는 블럭 > 뒷수습
			//- 예외와 상관없이 항상 실행해야 하는 코드 블럭 
			System.out.println("마지막");
			
		}
		
		
	}
	private static void m1() {
		
		//요구사항] 숫자를 입력받아 연산을 하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력:");
		
		int num = scan.nextInt();
		
		
		
		//예외처리 > 전통적인 방식
		
		
		
		/*
		 
		 * 
		 * 	if (조건) {
		 * 		참 > 실행
		 *	} else {
		 * 		거짓 > 실행
		 * 	} 
		 * 
		 * 
		 */
		
		
		
		
		
		
//		//권장		비즈니스 코드는 조건이 참일때
//		if(num != 0) {
//			//비즈니스 코드(=업무 코드) > 원래 목적!
//			System.out.printf("100 / %d = %d\n", num, 100 / num);
//		} else {
//			//예외 처리 코드
//			System.out.println("0 입력하지 마세요.");
//		}
//		
//		
//		//비권장
//		if(num == 0) {
//			//예외 처리 코드
//			System.out.println("0 입력하지 마세요.");
//		} else {
//			//비즈니스 코드(=업무 코드) > 원래 목적!
//			System.out.printf("100 / %d = %d\n", num, 100 / num);
//		}
//		
		
		//if문 vs try문
		//- if문 : 사전에 미리 검사를 해서 사고가 안나게 처리
		//- try문: 일단 실행 > 감시 > 사고가 터지면 그때 뒷처리
		
		//try 영역 > 감시(CCTV) > 예외가 발생하는지 감시
		
		try {
			System.out.println(1);
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			System.out.println(2);
		}
		catch (Exception e) {
			System.out.println("0 입력하지 마세요.");
			
			//Exception e
			//- 예외 객체
			//- 예외 상황을 전달
			System.out.println(e.getMessage());
		}
		
		System.out.println("종료");
		
		
	}
}

