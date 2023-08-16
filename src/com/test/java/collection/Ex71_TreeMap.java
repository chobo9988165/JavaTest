package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {
	
	public static void main(String[] args) {
		
		//Ex72_TreeMap.java
		
		//TreeMap
		//- Tree > 이진 탐색 트리 > 자동 정렬
		//- Map  > 키 + 값 > 연관 배열
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("white", "하얀색");
		map.put("black", "검은색");
		map.put("red", "빨간색");
		map.put("yellow", "노란색");
		map.put("blue", "파란색");
		map.put("orange", "주황색");
		map.put("green", "초록색");
		
		
		System.out.println(map.size());
		
		System.out.println(map);
		
		System.out.println(map.get("green"));
		
		map.put("green", "녹색");
		
		System.out.println(map.get("green"));
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("r", "y"));
		
		
		/*
		 *  List
		 *  - ArrayList > 배열이 필요할 때 / 삽입, 삭제 (X)*******
		 *  - LinkedList > ArrayList 대체제 / 삽입, 삭제 (X)
		 *  - Stack > 스택 구조 필요
		 *  - Queue > 큐 구조 필요
		 * 	- Vector → 안함
		 * 
		 * 
		 *  Set
		 *  - HashSet > 중복값 베제, 유일한 집합******
		 *  - TreeSet > HashSet + 정렬
		 *  
		 *  
		 *  Map
		 *  - HashMap > 키/값 연관 배열이 필요할 때*******
		 *  - TreeMap > HashMap + 정렬
		 *  - HashTable > Vector랑 같은 포지션(사라지는추세)
		 *  
		 *  
		 *  - Properties > (JSON, XML)*
		 */
		
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(10);
		System.out.println(list.get(0));
		
		
		
		
		
		
		
	}//main

}
