
// 주석, Comment
// -컴파일 작업 때 제외하는 영역

//단일 라인 주석, 엔터까지
/*

다중라인주석
1
2
3
4

 */

//패키지 선언
//현재 자바 파일이 어떤 패키지 내에 위치하는지 표현
package com.test.java;


// 클래스,Class
// 코드의 집합
//public class Ex01 선언부(Header)
//{} 몸통(Body), 구현부

//Ex01 클래스

public class Ex01_ {
	
	//메소드, Method
	// - 코드의 집합
	public static void main(String[] args) {
	
		//명령어 > 문장 단위 구성
		
		//자바의 문장종결자는 세미콜론';'
		
		//- System: 클래스
		//- . : 멤버 접근 연산자(Member Access Operator) 부모.자식
		//- out: 필드(filed)
		//- println(): 메소드 호출
		//- "안녕하세요." : 문자열 리터럴
		
		System.out.println("안녕하세요");
		
		/*
		 
		  특수문자
		 - ~, !, @, #, $, %, ^, &, *, -, +, _, =, ;, :, ", ', ?, /, \, (), {}, [], <>(화살표 괄호), `(back quote, back tick)
		 |(pipe, vertical bar, or)
		  
		  
		  폰트 > 가독성 좋은 프로그래밍용 폰트 (consolas, D2 cording, 나눔고딕코딩) 
		  - 1, l, I, |, i
		  - 0, o, O, D
		  - ", ''
		  
		  이클립스 > 코드 자동 완성 > Ctrl + Space
		  ※현재 상태에서 사용 가능한 문법만 보여줌
		  
		 */
		
		//Ctrl + Alt + 방향키(위/아래)
		//Alt + 방향키 (이동) ★
		System.out.println(100);
		System.out.println(200);
		System.out.println(300);
		
		//Shift + 방향키(위,아래,좌우,Home,End)
		//Shift + Ctrl + 방향키 토큰 단위
		
		//Ctrl + D 라인 삭제 ★
		
		//Ctrl + Shift + L 단축키 보여주는 단축키 (안중요)
		
		//Ctrl + Tab 탭이동	(원래는 Ctrl + F6, Preference Keys에서 Next Editor 수정)
	}

}
