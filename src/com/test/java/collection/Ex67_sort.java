package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {

	public static void main(String[] args) {

		// Ex67_sort.java

		// 배열 or 컬렉션
		// - 오름차순 정렬, 내림차순 정렬
		// 1. 직접 알고리즘 구현
		// 2. JDK 제공 기능

		// 2 + 1 > JDK 제공 + 커스터마이징 + 익명 클래스 사용(선택)

		// int[] nums
		Integer[] nums = { 1, 5, 2, 4, 3 };

		System.out.println(Arrays.toString(nums));

		// 오름차순 정렬
		// Arrays.sort(nums); //Quick Sort
//		System.out.println(Arrays.toString(nums));
//		
//		//내림차순 정렬 > 지원 안함 > 직접 구현
//		//Arrays.sort(배열, Comparator);//Comparator : 인터페이스
//		Arrays.sort(nums, new MyComparator());
//		
//		System.out.println(Arrays.toString(nums));
//
//		//쓸모 없음, 태어났을때의 목적이 아님
//		MyComparator mc1 = new MyComparator();
//		System.out.println(mc1.compare(10, 20));

//		Double[] nums2 = { 2.5, 7.1, 3.8, 9.2, 8.9 };
//		
//		Arrays.sort(nums2, new Comparator<Double>() {
//
//			@Override
//			public int compare(Double o1, Double o2) {
//				
//				if (o1 < o2) {
//					return 1;
//				} else if (o1 > o2) {
//					return -1;
//				} else {
//					return 0;
//				}//실수일때는 오히려 이게 깔끔할수도있다
//				
//				//return (int)((o2 - o1) * 10); 나도 생각했던거
//				//return o2 - o1; 정수일때
//				
//			}
//			});   									//과하다. 붕어빵 하나 먹으려고 틀 생성 → 익명 클래스 구현
//		System.out.println(Arrays.toString(nums2));
//		

		// m2();
		// m3();
		// m4();
		m5();

	}// main

	private static void m5() {

		// 컬렉션의 정렬
		// 1. ArrayList > O
		// 2. HashMap > X 애시당초 순서가 없음
		// 3. Queue > X 줄서기에서 갑자기 나이순 정렬을 하진 않으니까
		// 4. Stack > X ''
		// 5. HashSet > X

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100)); // 0~99
		}

		System.out.println(list);

		// Collections.sort(list); == Arrays.sort();
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});

		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return 01 - o2;
			}
		});

		System.out.println(list);

		// 인스턴스에도붙힐수있다는거빼면구현방식이완전히같다(단,sort()없음)

	}

	private static void m4() {

		// 객체 정렬
		Score[] list = new Score[5];

		list[0] = new Score("홍길동", 100, 90, 80);
		list[1] = new Score("아무개", 98, 78, 88);
		list[2] = new Score("유재석", 78, 95, 80);
		list[3] = new Score("박명수", 56, 58, 76);
		list[4] = new Score("이순신", 99, 67, 79);

		System.out.println(Arrays.toString(list));

		Arrays.sort(list, new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {

				// return o1.getName().compareTo(o2.getName());
				// return o2.getKor() - o1.getKor();
				return (o2.getKor() + o2.getEng() + o2.getMath()) - (o1.getKor() + o1.getEng() + o1.getMath());
			}

		});

		System.out.println(Arrays.toString(list));

	}

	private static void m3() {

		Calendar[] dates = new Calendar[5];

		for (int i = 0; i < dates.length; i++) {
			dates[i] = Calendar.getInstance(); // 전부 같은 시간 들어감, 아주 조금 다르겠지만 별차이없음
		}

		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);

		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}

		System.out.println();

		Arrays.sort(dates); // 매우잘됨

		Arrays.sort(dates, new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {

				// return o1 - o2; //불가능, 주소값은연산대상아님
				// return (int)(o2.getTimeInMillis() - o1.getTimeInMillis());//위험, 두 비교값 사이 격차
				// 너무 클 경우 오차발생
				// return o2.compareTo(o1);

				// 일(1)~토(7)
				return o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK);
			}
		});

		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF %tA\n", dates[i], dates[i]);
		}

		System.out.println();

	}

	private static void m2() {

		// 자료형별 정렬
		// 1. 숫자
		// 2. 문자(열) > 문자코드값 > 숫자정렬
		// 3. 날짜시간 > 숫자
		// 4. 객체(***) 정렬도 가능

		String txt1 = "ABC";
		String txt2 = "abc";

		// System.out.println(txt1 > txt2); //둘 중 누가 더 큰가? 오류. 주소값은 연산의 대상이 될 수 없다.
		// 문자열 > 문자열 : 불가능(참조값)
		// 문자 > 문자 : 가능(값)

//		System.out.println('A' > 'B'); 우리가 할일은 없다. 문자열 비교 메소드 compareTo가 이미 존재하기때문에
//		
//		int n = 0;
//		
//		for (int i=0; i<3; i++) {
//			char c1 = txt1.charAt(i);
//			char c2 = txt2.charAt(i);
//			
//			if (c1 > c2) {
//				n = 1;
//				break;
//			} else if (c2 > c1) {
//				n = -1;
//				break;
//			} else {
//				
//			}
//		}
//		
//		System.out.println(n);

		System.out.println(txt1.compareTo(txt2)); // 문자열 비교 메소드
		System.out.println(txt1.compareToIgnoreCase(txt2)); // 대소문자무시

		String[] names = { "홍길동", "아무개", "유재석", "박명수", "이순신", "훈", "김철" };

		// 가나다 순으로 정렬
		System.out.println(Arrays.toString(names));

		Arrays.sort(names);

		System.out.println(Arrays.toString(names));

		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				// return o1.compareTo(o2);

				// return o1.length() - o2.length();

				if (o1.length() > o2.length()) {
					return 1;
				} else if (o2.length() > o1.length()) {
					return -1;
				} else {
					// 글자수 정렬을 하다보면 글자수같은애들끼리는 정렬이 안될 수 있음.
					// 걔네들을 정렬하고 싶을때
					// 2차정렬기준이 여기
					return o2.compareTo(o1);
				}
			}
		});

		System.out.println(Arrays.toString(names)); // 글자수 순 정렬 해달라고 하면 그냥 글자수length비교하면됨
		// ★Comparator 써야 하는 이유(커스터마이징이 쉬워짐)

	}

	class MyComparator implements Comparator<Integer> {/// 정렬 때문에 선언한 클래스

		@Override
		public int compare(Integer o1, Integer o2) {

			// o1 vs o2
			// 1. 오름차순
			// a. o1 > o2 > 양수 반환
			// b. o1 < o2 > 음수 반환
			// c. o1 == o2 > 0반환

			// 2. 내림차순
			// a. o1 > o2 > 음수 반환
			// b. o1 < o1 > 양수 반환
			// c. o1 == o2 > 0반환

			if (o1 < o2) {
				return 1;
			} else if (o1 > o2) {
				return -1;
			} else {
				return 0;
			}

		}

	}
}

class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
	
}
