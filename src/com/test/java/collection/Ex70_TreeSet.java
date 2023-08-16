package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex70_TreeSet {
	
	public static void main(String[] args) {
		
		//Ex70_TreeSet.java
		
		//Hash 알고리즘 > 무언가를 탐색하는데 매우 빠르다.
		
		/*
	
		 * 
		 * 
		 * 
		 * 		TreeSet				  이진 트리 구조(이진 탐색 트리, Binary Search Tree) > 가지의 갯수가 최대 두개
		 * 							  숫자 하나 넣고, 다음 숫자 들어올 때 비교(무조건 크거나 작거나. set이니까)
		 * 							  왼쪽에 작은 숫자, 오른쪽에 큰 숫자
		 * 						      이후 새로 들어올 때 → 왼쪽 가고, 3 비교, 적으면 왼쪽, 많으면 오른쪽
		 * 							  무한반복 ... 왜 이렇게 하는가? 값 전부 넣고 보면 사선으로 정렬이 되어있음(**Set인데 정렬된 값이 들어감***)
		 * 
		 * 
		 * 		- Tree 구조     	>     
		 * 		- Set  사용법    	>
		 * 		
		 * 		Set
		 * 		- 순서가 없다.
		 * 		- 중복값을 가지지 않는다.
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(40);
		set1.add(30);
		set1.add(50);
		
		set2.add(50);
		set2.add(20);
		set2.add(40);
		set2.add(30);
		set2.add(10);
		
		System.out.println(set1);
		System.out.println(set2);
		
		//탐색 > for > iterator
		
		for (int n : set2) {
			System.out.println(n);
		}
		
		Iterator<Integer> iter = set2.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}
		System.out.println();
		
		//TreeSet 고유 기능
		System.out.println(set2.first());	 //가장 작은 요소
		System.out.println(set2.last()); 	 //가장 큰  요소
		
		System.out.println(set2.headSet(30)); // 부분 집합 반환, exclusive
		System.out.println(set2.tailSet(30)); // '' inclusive
		System.out.println(set2.subSet(20, 40)); //substring
		
		
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		set3.add(20);
		set3.add(50);
		set3.add(30);
		set3.add(10);
		set3.add(40);
		
		System.out.println(set3);
		
		ArrayList<Integer> list = new ArrayList<Integer>(set3);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
		
	}//main

}
