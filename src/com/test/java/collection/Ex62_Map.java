package com.test.java.collection;

import java.util.HashMap;
import java.util.Set;

public class Ex62_Map {
	
	public static void main(String[] args) {
		
		//Ex62_Map.java
		
		
		
		/*
		 * 
		 * 
		 * 
		 * 		ArrayList
		 * 		-요소 접근 > 첨자(index) 사용
		 * 		-순서가 있는 데이터 집합(방번호 == 요소의 순서)
		 * 		ex) 강의실 6개 > 1강의실, 2강의실, 3강의실, 4강의실.. 6강의실
		 * 		-스칼라 배열(Scalar Array)
		 * 		-요소 일괄 접근 가능 > 루프(for)
		 * 		-요소끼리 구분이 힘들다 > 구분하는 유일한 수단이 방번호(index) > 의미가 없다.
		 * 		-첨자(index)는 유일하다. 당연한 이야기지만 짚고 넘어가야한다.
		 * 		-값(value)는 중복이 가능하다.
		 * 		class[1]=홍길동, class[2]=홍길동 가능 → 왜? 방번호(index)가 다르니까.
		 * 
		 * 
		 * 
		 *		HashMap****************** 구조 많이 다름
		 *		- 요소 접근 > 키(key)사용
		 *		- 순서가 없는 데이터 집합
		 *		ex) 강의실 6개 > 햇님반, 달님반, 별님반.. 지구반
		 * 		-키(Key) → 값(Value)
		 * 		-맵, 딕셔너리(Dictionary) = 사전 구조
		 * 		-연관 배열(A를 통해 B를 찾는다)
		 * 		-요소 일간 접근 불가능
		 * 		-요소끼리 구분이 용이하다. > 식별자(key) > 방의 의미 > 가독성 ↑
		 * 		-키(Key)는 유일하다.
		 * 		-값(Value)은 중복이 가능하다. > 키가 유일해서..
		 * 
		 */
		//String  - key 자료형 > 방이름
		//Integer - value 자료형 > 데이터
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		
		//1. 요소 추가
		//- V put(K key, V value)
		map.put("국어", 100); //int 국어 = 100
		map.put("영어", 90);
		map.put("수학", 80);
		
		
		//2. 요소 개수
		//- int size()
		System.out.println(map.size());
		
		//3. 요소 읽기
		//- V get(K key)
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		
		//4. 일괄 탐색 > 불가능 > 존재하긴 하지만 나중에
		//HashMap은 애초에 루프를 돌리려는 목적으로 생성하는 게 아니다. 적합하지 않음
		
		//5. 요소 수정
		//- V put(K key, V value)
		//만약 면접관이 같은 put인데 첫번째는 초기화고 두번째는 수정이냐고 물어본다면****
		//→ HashMap의 키는 유일해야하기 때문에.
		map.put("국어", 95); //추가(X), 수정(O)
		
		System.out.println(map.get("국어"));
		
		//6. 요소 검색
		//- boolean containsKey(K key)
		//- boolean containsValue(V value)
		//- indexOf ? (X) → 첨자가 업으니까.
		
		System.out.println(map.containsKey("국어"));//배열 > 국어점수 있나?
		System.out.println(map.containsKey("국사"));
		
		System.out.println(map.get("국사"));//null
		
		System.out.println(map.containsValue(90));//90점, 무슨 과목인지는 모름,
		System.out.println(map.containsValue(100));
		
		
		//7. 요소 삭제
		//- V remove(K key)
		map.remove("국어");
		
		System.out.println(map.size());
		System.out.println(map.get("국어"));
		
		//8. 초기화(clear)
		map.clear();
		System.out.println(map.size());
		
		
		map.put("국어", 100); //int 국어 = 100
		map.put("영어", 90);
		map.put("수학", 80);
		
		//루프 돌리는법
		//자료구조형이 Set
		//순서가 존재하지 않기 때문에 무엇이 먼저 나오는지, 나중에 나오는지가 아무런 의미가 없다.
		//(자체적으로 관리하는 순서가 있긴 하지만 내가 넣은 순서도 아니고 중요하지도 않음)
		//→ 즉, 애시당초 순서를 반드시 지키기 위해서 만드는 컬렉션이라면 해시맵이 아니라 어레이리스트 사용
		//그렇기 때문에 각각의 컬렉션의 특징을 잘 알아야 한다.(필요한 상황에 필요한 도구가 무엇인지 알아야 하니까)
		
		
		Set<String> set = map.keySet();
		
		System.out.println(set);
		
		for (String key : set) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		
		
		//교실
		HashMap<String,String> list = new HashMap<String,String>();
		
		list.put("반장", "홍길동");
		list.put("부반장", "아무개");
		list.put("미화부장", "하하하");
		
																							//Stack Queue 공부할 시간에 HashMap, ArrayList 공부하라고(대표적이고 중요하니까)
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
