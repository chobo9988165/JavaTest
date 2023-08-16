package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Student;

public class Ex74_Stream {
	
	public static void main(String[] args) {
		
		//Ex74_Stream.java
		/*
		 * 
		 * 소스가 길어지면 아웃라인 사용 매우 좋음
		
		
		
			자바 스트림
			1. 입출력 스트림
				- 파일 입출력, 콘솔 입출력, 네트워크 입출력...
				
			2. 스트림
				- Java 8(JDK 1.8)
				- 람다식 + 함수형 인터페이스
				- 배열(컬렉션)의 탐색(조작) 지원*
				- 파일 입출력 지원
				- 디렉토리 탐색 지원
			
			3. 배열, 컬렉션 탐색
				- for문(루프변수)
				- 향상된 for문
				- Iterator
				- Stream
				
				함수형 인터페이스
				1. Consumer 매개변수 O 반환값 X
				
				2. Supplier 매개변수 X 반환값 O 
				
				3. Function 매개변수 O 반환값 O
				
				4. Operator Function 하위셋, 매개변수와 반환값의 자료형이 동일
				
				5. Predicate Function 하위셋, 반환값의 자료형이 boolean
				
				
				stream()
				
				-filter(Predicate)
				-map(Function)
				-sorted(Comparator)
				-distinct
				
				-count()/max()/min()/average()/sum()
				-allMatch()/anyMatch()/noneMatch()
				-forEach()
		
		*/
		
		
		
		String path = "test.java";
		
		//배포
		//개발자 자바 소스 > 다른 개발자에게 전달하는 방법
		//1. 소스 자체 전달 > MyFile.java > 친한 사람끼리만 가능
		//알고리즘은 노력의 산물, 특별한 기술 유출 가능성 존재
		
		//2. 컴파일한 실행 파일을 전달 > MyFile.class(컴파일된결과물) > 압축(1개 파일) > *.jar (java archive)
		
		
		//import > 같은 프로젝트 내에서만 가능
//		MyFile mf = new MyFile();
//		
//		System.out.println(mf.getFileNameWithoutExtension(path));
//		System.out.println(mf.getExtension(path));
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		m10();
		
		
	}//main

	private static void m10() {
		
		//집계, 통계< Reduce
		//- count(), max(), min(), sum(), avg()
		//- 최종 파이프
		//- 요소들을 가공해서 통계값
		//- 컬렉션으로 할 수 있는 건 count max min 밖에 없음(클래스, 오브젝트일때도 가능하지만, sum avg는 숫자일때만 가능)
		
		
		System.out.println(Data.getIntList().stream().count());
		
		//Optional<Integer> 뒤에 .get()찍으면 실제 숫자
		System.out.println(Data.getIntList().stream().max((a, b) -> a-b).get());

		System.out.println(Data.getIntList().stream().min((a, b) -> a-b).get());
		
		
		
		
		
		int sum = Data.getIntList().stream()
				 .mapToInt(n -> n)		//Streain<Integer> (X) IntStream(O)
				 .sum();
		System.out.println(sum);
		
		double avg = Data.getIntList().stream()
						 .mapToInt(n -> n)
						 .average().getAsDouble();
		System.out.println(avg);
		
		
		
	}

	private static void m9() {
		
		//매칭
		//- allMatch(), anyMathc(), noneMatch();
		//- 최종 파이프
		//- 스트림의 요소들이 조건을 제시할 때, 제시한 조건을 만족하는지 아닌지 판단
		//- a. boolean allMatch(Predciate)	> 모든 요소가 조건 100% 만족 > &&
		//- b. boolean anyMatch(Predciate)  > ||
		//- c. boolean noneMatch(Predciate) > 모든 요소가 조건을 만족하지 않을 때 true, 아니면 false
		
		
		//요구사항] 배열 > 짝수만 있는지?
		int[] nums = { 1, 1, 1, 1, 1};
		
		boolean result = false;
		
		for (int n : nums) {
			if (n % 2 == 1) {
				result = true;
				break;
			}
		}
		
		if (result) {
			System.out.println("홀수 발견");
		} else {
			System.out.println("짝수 배열");
		}
		
		System.out.println(Arrays.stream(nums).allMatch(n -> n % 2 == n));
		System.out.println(Arrays.stream(nums).anyMatch(n -> n % 2 == n));
		System.out.println(Arrays.stream(nums).noneMatch(n -> n % 2 == n));
		
		
		
	}

	private static void m8() {
		
		//정렬
		//-sorted()
		//-중간파이프
		//-배열/컬렉션의 sort()와 사용법 동일 -> Comparator 구현
		
		Data.getIntList()
			.stream()
			.sorted((a,b) -> b - a)
			.forEach(n -> System.out.println(n));
		
		
	}

	private static void m7() {
		
		//매핑
		//- map(), mapXXX()
		//- 중간 파이프
		//- 변환 작업
		//- 활용도 높음
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		list.stream()									//Stream<String>
			.filter(word -> word.length() <= 3)			//Stream<String>
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		list.stream()									//Strean<String>
			.map(word -> word.length())					//★Stream<Integer>
			.forEach(num -> System.out.println(num));
		System.out.println();
		
		
		String[] names = { "홍길동", "아무개", "이순신", "권율", "강감찬", 
"연개소문", "홍길동", "이순신", "남궁장군", "연개소문"};
		
		//이름 추출
		
		Arrays.stream(names).map(name -> name.substring(1)).forEach(name -> System.out.println(name));
		
		
		List<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student("가가가", 100, 90, 80));
		slist.add(new Student("나나나", 70, 80, 90));
		slist.add(new Student("다다다", 80, 70, 60));
		slist.add(new Student("라라라", 60, 70, 80));
		slist.add(new Student("마마마", 70, 60, 90));
		
		slist.stream()
			 .map(s -> {
				 		if ((s.getKor() + s.getEng() + s.getMath()) >= 180 ) {
				 			return s.getName() + ":합격";
				 		} else {
				 			return s.getName() + ":불합격";
				 		}
			 		})//map
			 		.forEach(result -> System.out.println(result));
		System.out.println();
		
		
		
		slist.stream()				//훨씬 체계적으로 해보자			
			 .map(s -> {
				 		if ((s.getKor() + s.getEng() + s.getMath()) >= 180 ) {
					 
						 	Result r = new Result();
						 	r.setName(s.getName());
						 	r.setResult("합격");
						 	
						 	return r;
				 } else {
					 
						 	Result r = new Result();
						 	r.setName(s.getName());
						 	r.setResult("불합격");
						 	
						 	
						 	return r;
					 
				 }
			 })//map -> foreach가 건네받는 것은 result객체
			 .forEach(r -> {
				 
			 System.out.println("이름: " +r.getName());
			 System.out.println("결과: " +r.getResult());
			 System.out.println();
			 });
		
		
		
		
	}//m7

	private static void m6() {
		
		//중복 제거
		//- distinct()
		//- 중간 파이프
		//- 앞의 스트림에서 중복 요소를 제거 후 > 유일한 요소만 남은 새로운 스트림을 반환한다.
		
		
		List<Integer> list = Data.getIntList();
		System.out.println(list.size());
		//중복된 숫자가 꽤 있다. 여기서 중복값을 배제하고 싶을 때, 보통의 경우 중첩된 for문을 돌려야하지만 스트림은 매우 쉽게 해준다.
		
		
		//요구사항] 위의 배열에서 중복값 제거
		//Case 1.
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(int n : list) {
			set1.add(n);
		}
		System.out.println(set1.size());
		
		
		//Case 2.
		Set<Integer> set2 = new HashSet<Integer>(list); // 중복값 제거
		System.out.println(set2.size());
		
		
		//Case 3.
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println(list.stream().count());   		//count, 최종 파이프(리턴값 O, long)
		System.out.println(list.stream().distinct().count());
		System.out.println();
		
		
		
		String[] names = { "홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군", "연개소문"}; //중복값존재
		
		Arrays.stream(names)
				.distinct()
				.filter(name -> name.length() == 3)
				.forEach(name -> System.out.println(name));
		System.out.println();
		System.out.println();
		//스트림에서 중간파이프의 차례는 늘 신경쓰면서 해야함
		
		
		List<Cup> clist = new ArrayList<Cup>();
		
		clist.add(new Cup(Cup.BLACK, 200));
		clist.add(new Cup(Cup.blue, 300));
		clist.add(new Cup(Cup.WHITE, 500));//1
		clist.add(new Cup(Cup.yellow, 700));//2
		clist.add(new Cup(Cup.red, 600));
		clist.add(new Cup(Cup.yellow, 700));//2
		clist.add(new Cup(Cup.red, 800));
		clist.add(new Cup(Cup.WHITE, 500));//1
		clist.add(new Cup(Cup.blue, 1000));
		clist.add(new Cup(Cup.BLACK, 1100));
		
		
		//Set, distinct() > 중복 객체 제거하려면?
		//1. HashCode() 재정의('')
		//2. equals() 재정의(오버라이드)
		
		clist.stream()								
			 .distinct()
			 .forEach(cup -> System.out.println(cup));
		System.out.println();
		System.out.println();
		
		
	}

	private static void m5() {
		
		/*
		 * 스트림 - 데이터 소스로부터 탐색/조작 가능한 도구 
		 * - list.stream().forEach()
		 * 
		 * 
		 * foreach같은 애들을 파이프라고 부른다(pipe)
		 * - 스트림 객체 메소드(긴한데 이렇게 부르는 경우는 거의 없음)
		 * 
		 * 1. 중간 파이프
		 * 	  - 반환값 o + 스트림 반환
		 * 
		 * 
		 * 2. 최종 파이프   → 두 개 구분하면서 써야함. 구분 기준은 스트림 반환 여부
		 * 	  - 반환값 x + void
		 * 	  - 반환값 o + 다른 자료형 반환(stream말고)
		 * 
		 *
		 * 
		 * 
		 * 요소 처리
		 * - forEach()
		 * - 최종 파이프
		 * 
		 * 
		 * 
		 * 필터링
		 * -filter()
		 * - 중간 파이프
		 * Predicate
		 * 
		 * 
		 * 
		 */
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//요구사항] 짝수만 출력
		for (int n : list) {
			if (n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		}
		System.out.println();
		
		
		list.stream().forEach(num -> {
			if (num % 2 == 0) {
				System.out.printf("%-4d", num);
			}
		});
		System.out.println();
		
		
		//.filter(predicate), 인자 전달받아서 중간에서 조건에 안 맞는 것들 걸러냄(그래서필터)
		//filter가 중간에 낄 수 있는 이유. filter도 스트림 반환임
		list.stream().filter(num -> num % 2 == 0).forEach(num -> {
			System.out.printf("%-4d", num);
		});
		System.out.println();
		
		
		Data.getStringList().stream()
							.filter(word -> word.length() >=  5)
							.forEach(word -> System.out.print(word + " "));
		System.out.println();
		
		
		Data.getUserList().stream()
						  .filter(user -> user.getWeight() >= 70 && user.getGender() == 1)
						  .forEach(user -> System.out.println(user));
		System.out.println();
		System.out.println();
		
		//스트림을 쓸 때, 필터를 많이 쓸 수 밖에 없다(조건 거는 거랑 마찬가지니까)
		//조건이 조금이라도 길어지면 가독성 떨어짐
		//filter 파이프 하나 더 추가(단, and 일때만 가능)
		//★ forEach는 하나만 가능(리턴값없으니까)
		Data.getUserList().stream()
				.filter(user -> user.getWeight() >= 70)
				.filter(user -> user.getGender() == 1)
				.filter(user -> user.getHeight() >= 180)
				.forEach(user -> System.out.println(user));
		System.out.println();
		System.out.println();
		
		
		
		
		
		
	}

	private static void m4() {
		
		//스트림을 얻어오는 방법
		//1. 배열로부터    *** 이거 두개 집중적으로 연습 
		//2. 컬렉션으로부터 ***
		
		
		//3. 숫자범위로부터
		//4. 파일로부터
		//5. 디렉토리로부터
		
		//1. 배열로부터
		int[] nums1 = { 10, 20, 30};
		
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2. 컬렉션으로부터
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		
		//3. 숫자범위로부터 (?)
		
		//Stream<Integer> : 범용 스트림 > foreach > Consumer<Integer> (제네릭)
		//IntStream		  : 전용 스트림 > foreach > IntConsumer
		//.range() 적혀있는 숫자(inclusive)부터 숫자 바로 전까지(exclusive) 차례로 제공
		
		IntStream.range(1, 10).forEach(num -> System.out.println(num)); //활용도 높지는 않음
		
		
		try {
			
			//4. 파일로부터
			//- 스트림 > 파일 읽기
			//Paths.get("C:\\class\\java\\code\\JavaTest\\data\\number.txt"); //길다
			
			//java.io > 버전업 > java.nio
			
			//. : 현재 실행파일이 있는 폴더
			//- 자바 콘솔 프로젝트에서는 프로젝트 루트 폴더를 표현. .\\ 까지도 생략 가능
			//※나가서 일하는게 신규 개발만 하지는 않는다.
			//※신규개발을할때는최신기술을쓰려고노력하는곳도있다(아닌곳도많지만)
			//※당연히옛날쓰던코드쓰는곳도많고,옛날코드를몰라서는일을할수가없다.
			//※최신,예전아울러서두루두루알고있어야함
			Path path = Paths.get(".\\data\\number.txt");
			
			Files.lines(path).forEach(line -> System.out.println(line)); //얘보단 BufferedReader 쓴다. (익숙함 때문)
			System.out.println();
			
			
			
			//5. 디렉토리로부터
			//- 목록보기 > dir.listFile()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				System.out.println(p.toFile().isFile());//path객체는file객체와목적이다르다.
				System.out.println();
			});
			//잘모르겠다고함.잘안쓴다고함
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("at Ex74_Stream.m4");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m3() {
		
		//함수형 프로그래밍 == 의식의 흐름대로 → 가독성 떨어짐
		Data.getIntList().stream().forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println("[회원정보]");
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("성별: " + user.getGender());
			System.out.println();
		});
		
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getColor());
			System.out.println(item.getName());
			System.out.println(item.getName());
			System.out.println();
		});
		
			
	}
	

	private static void m2() {
		
		//배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10);
		
		//1. for
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		//2. 향상된 for문
		
		for (String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println();
		
		
		//3. Iterator
		Iterator<String> iter = list.iterator();//이터레이터자체가직접적으로쓰이진않지만비슷한방식으로작동하는것들이많아서기억해야함
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		
		//4. Stream
		Stream<String> stream = list.stream();
		
		Consumer<String> c1 = str -> System.out.print(str + " ");
		
		//**********stream = 탐색 객체**********
		//steram.foreach 내부 동작 방식 1. 첫번째 데이터(애플아케이드) 가져옴
		//2. 가져온 데이터를 consumer.accept()의 메소드에게 인자 전달, 메소드 호출
		//3. 2번째 요소 가져오고, consumer의 메소드에게 또 넘김
		//4. .... 마지막줄까지 반복
		//다른점, foreach문을 돌리면서 메소드를 호출하는 메소드
		
		//forEach 메소드
		stream.forEach(c1);
		//stream.forEach(c1);		//오류, 한번 사용한 스트림은 더 이상 사용할 수 없음
	
		System.out.println();
		System.out.println();
		
		//Stream 쓰면 비약적으로 코드 줄일 수 있다.
		//method chaining 사용 > 함수형 프로그래밍 방식(자바스타일은아님, 함수형 프로그래밍 방식)
		list.stream().forEach(str -> System.out.print(str + " "));
		
		
		
	}

	private static void m1() {

		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums1.length);
		
		int[] nums2 = Data.getIntArray(5);
		System.out.println(Arrays.toString(nums2));
		
		//List<Integer>
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3.size());
		
		
		List<Integer> nums4 = Data.getIntList(5);
		System.out.println(nums4);
		
		String[] txt = Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		
		Item[] items = Data.getItemArray();
		System.out.println(Arrays.toString(items));
		
		User[] users = Data.getUserArray();
		System.out.println(Arrays.toString(users));
		
		
	}
}//main

//이전 Set 수업
class Cup {
	
	public final static int BLACK = 1;			//그래서 열거값을 사용하는 것
	public final static int WHITE = 2;			//사용자가 데이터를 입력해야하면 하나 고르게 해야 한다.
	public final static int red = 3;
	public final static int yellow = 4;
	public final static int blue = 5;
	
	
	private String color2; //color2 = "white" 오타 안날거란 보장 없음!(여기에 있는 모든 유효성 검사 다 해야함 -> 불편함!)
						   //주간식은 늘 실수를 할 가능성이 높고 사용자가 실수 할 확률이 높다
	private int color; //빨강, 파랑... 하나 딱 선택해야되는 값들을 열거값이라고 부른다.
	private int size;
	
	public Cup(int color, int size) {
		this.color = color;
		this.size = size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", size=" + size + "]";
	}
	
	//개발자의 의도대로 객체를 비교하려면..
	@Override
	public int hashCode() {
		
		return (" " + (this.color + this.size)).hashCode();			//해시코드찍어서반환하려고해도안나옴(값형이라서, 주소값 X) 원래는 valueof찍어야되지만 걍 빈문자 더하기도 함
	}
	
	private boolean eqauls(Object obj) {
		
		return this.hashCode() == obj.hashCode();

	}
	
}

//Stream<Student> -> map() -> Stream<Result
class Result {
	private String name;
	private String result;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}




