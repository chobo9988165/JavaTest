package com.test.question;

public class Q085 {
//	요구사항
//	주민 등록 번호 유효성 검사를 하시오. > 주민등록번호 생성하는 방법 규칙에 따라 생 > 
//
//	조건..
//	'-'의 입력 유무 상관없이 검사하시오.
}

// 1, 2 - 1900
// 3, 4 - 2000
// 9, 0 - 1800
// 5, 6 - 귀화
// 7, 8 - 귀화

//  0~12   01~31   1,3 2,4
//7 0  01    0 1 -    1                0 1 0 1 == 주소              0 출생신고 숫자         4 어떤 공식

//2 3  45    6  7     8                9 10 8
//  14      5 + 7 + 9 + 3 + 5 = 40
// 40 % 11= 7
//11 - 7 = 4 ★ 유효성 번호
//11 - 0 = 11 > 1
//11 - 1 = 10 > 0