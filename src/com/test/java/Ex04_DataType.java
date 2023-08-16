package com.test.java;

public class Ex04_DataType {

	public static void main(String[] args) {
		
		//Ex04_Datatype.java
		
		//변수 생성 방법, 주의점
		
		byte kor; // 변수 선언
		kor = 100; // 변수 초기화
		System.out.println(kor); //출력
		
//		문장(Statetment) : 1개 이상의 표현식
//		자바는 문장이 끝날 때마다 문장 종결자를 입력해야 함. (;)
		byte eng;
		eng = 90;
		System.out.println(eng);
		
		byte math;
		math = 80;
		System.out.println(math);
//		★자료형의 크기는 정해져 있다. ( byte kor = 1과 byte math = 2가 차지하는 공간의 차이는 없다)
		
		
		
//		Duplicate local variable kor
//		- 같은 이름의 변수명 두가지 이상 선언 불가능
//		- 변수명은 유일해야 한다
		/*
		 * byte kor; kor = 70;
		 * 
		 * System.out.println(kor);
		 */		
		
		//** 폴더 > 한글 사용 지양(나중에 에러 날 수 있음)
		
//		변수명을 만들 때 규칙(*******) > 모든 것의 식별자를 만들 때 규칙(폴더, 파일, 프로젝트, 클래스 등)
//		1. 영문자 + 숫자 + '_'(언더바)만 사용한다. > 관습
//		2. 숫자로 시작 불가능 > 물리
//		3. 예약어(키워드 byte, int, system등) 사용 불가능
//		4. 의미있게(★★★★★) , 풀네임(★★★★★)
//		5. 대소문자 구분
//		byte 국어; 되긴 하는데 안씀
		
		
		byte kor_score;
		byte s;
		byte ks; // X
		
		
		byte a;
		byte a2;
		byte c;
		byte aaa;
		
		byte kor1;
		byte kor_1;
		byte kor$;
		
		
		
		
		byte b1;
		
		//초기화
		b1 = 100;
		
		System.out.println(b1);
		
		//수정, 치환
		b1 = 50; //기존값 100을 가지고 있는 변수 b1에 새롭게 50을 대입
		
		System.out.println(b1);
		
//		변(變)수, 상(常)수
//		표현은 동일, 값이 변하냐 안변하냐 차이
//		프로그래밍의 상수 > 데이터
	
		
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		
		
		byte score ;
		score = 100;
		System.out.println(score); //100
		
		score = 90;
		System.out.println(score); //100→90
		
		score = 80;
		System.out.println(score); //90→80
		
		
		//국어 점수(100) > 화면에 출력
		//byte kor;
		kor = 100;
		System.out.println(kor); //국어 점수 출력 > 가독성 높음> 변수명 = 데이터의 의미
		
		System.out.println(100); //국어 점수 출력 > 가독성 낮음 > 의미(X)
	
		
		//프로그래밍 발전 방향 > 코드 재사용
		
		//변수 생성하기
		byte b2;
		b2 = 100;
		
//		선언 + 초기화
		byte b3 = 100;
		
		byte b4;
		byte b5;
		
		byte b6, b7;
		
		byte b12 = 100, b13 = 50, b14  = 50;
		
		
//		지도 좌표(x, y)
		byte x1; //현재 X좌표
		byte y1; //현재 y좌표
		
		byte x2, y2;
		
		byte x3,
			 y3;
		
		
		
		//변수명 명명법 패턴
		//1. 헝가리인 표기법
		//2. 파스칼 표기법
		//3. 캐멀 표기법
		//4. 스네이크 표기법
		//5. 케밥 표기법
		
		//1. 헝가리인 표기법
		// 식별자를 만들 때 식별자의 접두어로 자료형을 표시하는 방법
		// 자바에서 많이 사용하지는 않음
		// 가끔 사용 > 인터페이스명
		
		byte weight;
		byte byte_weight;
		byte byteWeight;
		byte bweight;
		byte bWeight;
		byte b_weight;
		
		weight = 100;
		
		//2. 파스칼 표기법
		// - 식별자 단어의 첫문자를 대문자로 표기 + 나머지 문자는 소문자로 표기
		// - 2개 이상 단어로 만든 합성어 > 모든 단어 붙임 > 각 단어의 첫문자를 대문자
		// - 클래스명 만들 때 자주 사용
		
		byte height;
		byte Height; //파스칼
		
		byte englishscore;//가독성 낮음
		
		byte EnglishScore;//파스칼
		
		//3. 캐멀 표기법
		// - 식별자 단어의 첫문자를 소문자로 표기 + 나머지 문자는 소문자로 표기
		// - 2개 이상 단어로 만든 합성어 > 모든 단어 붙임 > 각 단어의 첫문자를 대문자
		// - 사용) 변수명, 메소드명
		
		
		byte mathscore;
		
		byte MathScore; //파스칼
		
		byte mathScore; //캐멀
		
		byte MapPostionLatitude;
		
		byte mapPositionLatitude;
		
		//코드 컨벤션
		
		//4. 스네이크 표기법
		// - 전부 소문자 표기
		// - 합성어 > 각 단어를 '_'로 연결
		
		byte english_score;
		
		
		//5. 케밥 표기법
		// - 전부 소문자 표기
		// - 합성어 > 각 단어를 '-'로 연결
		// - 자바에서는 사용 불가능
		// - 사용)HTML, CSS
		
		// byte english-score;
		
		
		
	}//main
}
