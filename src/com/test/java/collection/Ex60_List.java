package com.test.java.collection;

import java.util.ArrayList;

import Q098.Student;

public class Ex60_List {
	
	public static void main(String[] args) {
		
		
		///Ex60_List.java
		
		/*
		
		
		
		
				컬렉션, Collection
				- JCF, java Collection Framework
				- (향상된)배열
				- 기존의 순수 배열
					- 사용법 개량
					- 용도에 따른 입출력 방식 / 효율성 개량
				- 클래스 + 내부 순수 배열
				- 길이가 가변 ★★★ > 방의 개수를 마음대로 늘리고 줄이는게 가능
				- 자료 구조(주변에서 배열을 말한다면 순수배열보단 이쪽)
				★★★★★사용빈도가 매우 높다.
				다른 것보다 공들여서 보는 편이 좋음
				
				legacy : 오래되고, 대체할 것들이 생겨서 언젠가 사라지지 않을까 추측하는 것들
				List, Set, Map → 인터페이스(사용법이 비슷)
				********컬렉션 종류*********
				
				1. List 계열
					- *****ArrayList*********1 하늘이 무너져도 알아야되는 것들
					- LinkedList
					- Queue
					- Stack
					- Vector(legacy)
				2. Set 계열
					- HashSet***
					- TreeSet
					
					
				
				3. Map 계열
					- HashMap******2
					- TreeMap
					- Properties(legacy)
					- HashTable(legacy)
					
				Collection(I)
				- List(I)
				- Set(I)
				
				
				Map(I)
		
		
				ArrayList 클래스
				- ArrayList(C) → List(I) → Collection(I)
				- **순수 배열과 구조가 가장 유사함
				- 첨자(index)를 사용해 요소(element)에 접근
				
		
		
		
		
		
		
		*/
		
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		
		//m5();
		m6();
		
		
		
	}//main

	private static void m6() {
		
		//만약 처음에 4칸으로 시작하면
		//0 1 2 3 > 5번째 루프 때 방 부족
		//배열 2배로 늘린 후 원래 배열은 버림
		//0 1 2 3 4 5 6 7 > 9번째 루프 때 방 부족
		//배열 2배로 늘린 후 원래 배열은 버림
		//~  0 1 2 3 4 5 6 7 8 9 반복문 종료  > 이 과정에서 쓰레기 발생(상당한 부담)
		
		//컬렉션 초기 용량 > 내부 배열의 초기 길이 > 약간은 절약 가능
		ArrayList<Integer> list = new ArrayList<Integer>(10); //initial capacity 최대값 지정
		
		for(int i=0; i<list.size(); i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add(10); 			// 이젠 더 이상 추가 계획 없으(확신)
					  			// 문제가 발생(나머지 9칸은?) > 없앨 수 있음
					  			// 없애는 과정 > 실제값이 들어있는 길이만큼 복사한 새로운 배열 생성 > 남은 공간 버림
		list.trimToSize(); 		// 데이터가 들어있는 만큼의 길이로 재조정(진짜 확실할 때만)
		
		
	}

	private static void m5() {
		
		//ArrayList(컬렉션) 특징
		//1. 내부에 배열을 가지고 있다.
		//2. ArrayList 클래스의 대부분의 기능이 내부 배열을 조작하는 기능으로 구성
		//3. ? 길이가 가변 > 데이터를 계속 넣으면 계속 공간이 늘어나나?
		//public void add() if(검사 >  방이 없음? ) > 공간 두 배로 늘리고 Deep copy(배열 요소까지 복사), 기존에 가지고 있던 배열은 버림
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		System.out.println(list.size());
		
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		
		
		list.add(50);
		System.out.println(list.size());
		
		
	}

	private static void m4() {
		
		///성적표
		//학생(이름, 국어, 영어, 수학, 총점, 평균)을 여러명(다차원배열)
		
		//순수배열과 Arraylist 선택 기준?
		//- 길이로 판단
		//- 배열(고정) vs *ArraysList(불확실)(Collection)*
		
		//Student[] list;
		ArrayList<com.test.java.collection.Student> list = new ArrayList<com.test.java.collection.Student>();
		

		
		
		for(int i=0; i<10; i++){
			
			
			int kor = (int)(Math.random() * 41) + 60; //60 ~ 100 점
			int eng = (int)(Math.random() * 41) + 60; //60 ~ 100 점
			int math = (int)(Math.random() * 41) + 60; //60 ~ 100 점
			
			com.test.java.collection.Student s = new com.test.java.collection.Student("김"+i, kor, eng, math);
			
			list.add(s);
		}
		
		//System.out.println(list);
		

		System.out.println("===========================================");
		System.out.println("                    성적표");
		System.out.println("===========================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균");
		
		for(com.test.java.collection.Student s : list) {
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total / 3.0;
			
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%.1f\n"
					,s.getName()
					, s.getKor()
					, s.getEng()
					, s.getMath()
					, total
					, avg);
			
		}
		
	}

	private static void m3() {
		
		//차원
		int[] ns1 = new int[3];
		int[][] ns2 = new int[3][3];
		int[][][] ns3 = new int[3][3][3];
		
		
		//ArrayList 다차원 배열 만드는 법
		//<T> 하나의 요소, T를 요소로 가지는 배열 선언
		//종종 사용
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		
		
		
		
		ArrayList<ArrayList<Integer>> ms2 
			= new ArrayList<ArrayList<Integer>>();
		
		ArrayList<ArrayList<ArrayList<Integer>>> ms3
			= new ArrayList<ArrayList<ArrayList<Integer>>>();
		
	}

	private static void m2() {
		
		
		//ArrayList 용법
		ArrayList<String> list = new ArrayList<String>();
		
		
		
		//CRUD
		//- Create(쓰기)
		//- Read(읽기)
		//- Update(수정)
		//- Delete(삭졔)
		
		//1. 요소 추가하기*
		//- boolean add(T value)
		//- 배열의 맨 마지막에 추가하기 > Append
		list.add("바나나");
		list.add("귤");
		list.add("사과");
		list.add("파인애플");
		list.add("딸기");
		
		//2. 요소의 개수*
		//- int size();
		//데이터를 삽입 삭제할 때마다 변화가 일어나기 때문에 배열의 길이(도중요하지만) 보다 훨씬 중요
		//System.out.println(list.size());
		
		
		
		
		
		
		//3. 요소 접근(읽기)*
		//- T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(list.get(list.size()-1));
		
		
		// java.lang.IndexOutOfBoundsException
		// Index 5 out of bounds for length 5
		// System.out.println(list.get(5));
		
		//4. 요소 수정*
		//- list[0] = 10; 대입이기도하고 수정이기도 함 Indexer는 대입과 수정의 방식이 동일
		//- String set(int index, T newValue) > String : 수정되기 직전 값 반환
		String temp = list.set(2, "포도");
		System.out.println(temp);
		System.out.println(list.get(2));
		System.out.println();
		
		//5. 요소 삭제
		//- 순수 배열의 요소(방) 삭제? > 불가능
		//- 컬렉션은 요소 삭제? > 가능
		//- T remove(int index) > 방 번호를 찾아서 삭제
		//- boolean remove(T value) > 값을 찾아서 삭제
		//- *** 시프트가 발생한다 > 삭제된 방 이후의 모든 요소는 모두 방번호 -1 감소
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println();
		
		//list.remove(2); 자주 씀
		//list.remove("포도");//포도를 지우고 싶은데 방번호를 모를때(잘 안씀) >** 만약 포도가 2개 이상이면 첫번째로 만나는 포도 삭제
		
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));//시프트 발생
		System.out.println(list.get(3));
		System.out.println();
		
		
		//6. 탐색
		//- 루프
		
		for (int i=0; i<list.size(); i++) {
			System.out.printf("list.get(%d) = %s\n"
					, i, list.get(i));
		}
		System.out.println();
		
		
		//for each문*
		
		//for (변수 : 배열/컬렉션) {
		//}
		
		for (String item : list) { //배열 처음부터 끝까지 자동으로 불러옴→ 세세한 조작 어려움
			System.out.println(item);
		}
		System.out.println();
		
		//7. 덤프
		//- Arrays.toString(배열)
		System.out.println(list.toString());
		System.out.println(list);
		
		//8. 요소의 추가
		//- 배열의 원하는 위치에 요소를 추가 > Insert(삽입)
		//- void add(index index, T value)
		//- *** 시프트가 발생한다 > 삽입된 방 이후의 모든 요소의 방번호 + 1
		//- 실수가 많이 생김(헷갈리고, 오류가 발생하지 않음(논리오류))
		list.add(2, "망고");
		System.out.println(list);
		
		
		//9. 기타 등등
		System.out.println(list.indexOf("사과"));
		System.out.println(list.indexOf("귤"));
		System.out.println(list.lastIndexOf("파인애플"));
		System.out.println(list.contains("귤"));
		
		//10.
		System.out.println(list.isEmpty());
		
		list.clear();		//모든 요소 삭제 > 초기화
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		
		
		
	}

	private static void m1() {
		
		//순수 배열 선언
		//- 타입 명시(int)
		//- 길이 명시(3)
		int[] num1 = new int[3];
		
		//요소 접근 > 첨자(index) 사용 > Indexer(편한표기법)
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		
		System.out.println(num1.length);
		
		//컬렉션
		//- 타입 명시 > <Integer>
		//- 길이 명시(X) > 가변
		//데이터를 넣고 호출하는 방식이 메소드
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		//요소 추가 > 첨자? > add() == append > 차례대로 마지막 방에 넣어라.
		
		num2.add(10);	// 0번째 방
		num2.add(20);	// 1번째 방
		num2.add(30);	// 2번째 방
		
		System.out.println(num2.get(0)); //num1[0]
		System.out.println(num2.get(1));
		System.out.println(num2.get(2));
		
		System.out.println(num2.size());	// size == length
		
		num2.add(40);
		num2.add(50);
		
		System.out.println(num2.size());	// size == length
		//어디까지? > 매우많이
		
		
		
	}

}//class
