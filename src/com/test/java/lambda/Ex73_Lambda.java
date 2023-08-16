package com.test.java.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex73_Lambda {
	
	public static void main(String[] args) {
		
		
		
		//Ex73_Lambda.java
		/*
		 * 
		 * 
		 * 		람다식 > 익명 객체의 (구현된) 추상 메소드 > 인터페이스 변수에 저장
		 * 		> 람다식은 반드시 인터페이스가 필요
		 * 		
		 * 
		 * 
		 * 
		 * 		함수형 인터페이스, Functional Interface
		 * 		-람다식을 사용하기 위한 자격
		 * 		-다른 용도로 사용 안함 
		 * 		-표준 API 함수형 인터페이스   > JDK 제공 **더 자주 사용
		 * 		-사용자 정의 함수형 인터페이스 > 개발자 선언
		 * 		
		 * 
		 * 
		 * 		표준 API 함수형 인터페이스 (인터페이스 만드는 것조차 귀찮음, 람다식 쓰는 이유는 애당초 편하려곤데 인터페이스 일일히 만드는건 주객전도)
		 * 		1. Consumer 매개변수 O, 반환값 X(void)
		 * 			- Consumer<T>      consumer,bicon 자주 사용
		 * 			- BiConsumer<T>
		 * 			- IntConsumer<T>
		 * 			- ...
		 *  
		 * 		2. Supplier 매개변수 X, 반환값 O
		 * 			- Supllier<T>
		 * 			- ...
		 * 		
		 * 		3. Function 매개변수 O, 반환값 O
		 * 			- Fucntion <T, R>
		 * 			- BiFunction<T, U, R>
		 * 
		 * 		4. Operator > 매개변수 O, 반환값 O
		 * 			- BinaryOperator<T>
		 * 			- Function 하위셋
		 * 			- ..
		 * 
		 * 		5. Predicate > 매개변수 O, 반환값 O
		 * 			- Predicate<T>
		 * 			- Function 하위셋
		 * 			- ..
		 * 	
		 * 
		 * 
		 */
		
		
		
//		Test t1 = () -> System.out.println("aaa");
//		t1.aaa();
		
		//m1(); //consumer
		//m2(); //supplier
		//m3(); //function
		//m4();	//opeartor
		//m5();	//predicate
		//m6(); //andThen 람다 객체 더하기
		m7();
	}

	private static void m7() {
		
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		
		Function<Boolean, String> f2 = flag -> flag ? "성공" : "실패";
		System.out.println(f2.apply(true));
		
		//Function = Function + Function
		//f3 = f1 + f2;
		//f1 > Integer 받고 Boolean 반환 > 반환된 Boolean이 f2의 매개변수로 넘어감 > String 반환
		Function<Integer, String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10));
		
		Function<Integer, String> f4 = num -> num > 0 ? "참" : "거짓";
		Function<String, Integer> f5 = str -> str.length();
		
		Function<Integer, Integer> f6 = f4.andThen(f5); // f4 + f5
		System.out.println(f6.apply(10));
		
		//펑션은 andthen()외에도 하나 더 있음. compose();
		Function<Integer, Integer> f7 = f5.compose(f4); // f5 + f4
		System.out.println(f7.apply(-10));
		
		
		
		
		
		//2의 배수
		Predicate<Integer> p1 = num -> num % 2 == 0;
		//3의 배수
		Predicate<Integer> p2 = num -> num % 3 == 0;
		
		int a = 10;
		System.out.println(p1.test(a));
		System.out.println(p2.test(a));

		
		//a가 2와 3의 공배수?
		System.out.println(p1.test(a) && p2.test(a));
		
		Predicate<Integer> p3 = p1.and(p2);	// AND
		System.out.println(p3.test(a));
		
		
		Predicate<Integer> p4 = p1.or(p2); // OR 둘중 하나라도 참이면 참
		
		Predicate<Integer> p5 = p1.negate(); // NOT
		System.out.println(p5.test(a));
		
	}

	private static void m6() {
		
		//표준 API 함수형 인터페이스 > 정적/디폴트 메소드
		//왜 구현 했냐? -> 람다 객체들의 연산자 역할
		
		Student s1 = new Student("홍길동", 100, 90, 80);
		
		
		
		//업무1.
		Consumer<Student> c1 = s -> System.out.println("총점: " + s.getTotal());
		c1.accept(s1);
		
		//업무2.
		Consumer<Student> c2 = s -> System.out.println("이름: " + s.getName());
		c2.accept(s1);
		
		//요구사항] 업무1과 업무2를 동시에 실행
		test(s1, c1, c2);
		
		
		Consumer<Student> c4 = s -> System.out.println("평균: " + s.getTotal());
		
		
		
		
		
		
		//c1 + c2 = test
		
		//c3 = c1  + c2 + c4
		Consumer<Student> c3 = c1.andThen(c2).andThen(c4); //편함
		
		c3.accept(s1);
		
	}

	private static void test(Student s1, Consumer<Student> c1, Consumer<Student> c2) {
		c1.accept(s1);
		c2.accept(s1);
	}

	private static void m5() {
		
		//Predicate
		//Function
		//- 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현
		//- 매개변수O, 반환값 X
		//- testXXX() 추상 메소드 제공
		//- Function의 하위셋
		
		//- 매개변수를 전달받아 > Boolean 반환 (반드시)
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		Predicate<Integer> 		   p1 = num -> num > 0;
		
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		System.out.println(p1.test(10));
		System.out.println(p1.test(-10));
		
		BiPredicate<Integer, Integer> p2 = (a, b) -> a > b;
		System.out.println(p2.test(10, 20));
		System.out.println(p2.test(20, 10));
		
		
		
	}

	private static void m4() {
		
		//Operator
		//Function
		//- 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현
		//- 매개변수O, 반환값 X
		//- applyXXX() 추상 메소드 제공
		
		//- Function의 하위셋
		//- 매개변수와 반환값의 타입이 같다.
		
		BinaryOperator<Integer> bo1 = (a, b) -> a + b;
		System.out.println(bo1.apply(10, 20));
		
//같음	BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
//		System.out.println(bf1.apply(10, 20));
		
		//Function<T, T>
		UnaryOperator<Integer> uo1 = num -> num * num;
		System.out.println(uo1.apply(10));
		
	}

	private static void m3() {
		
		//Function
		//- 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현
		//- 매개변수O, 반환값 X
		//- applyXXX() 추상 메소드 제공
		
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String, Integer> f2 = str -> str.length();
		System.out.println(f2.apply("홍길동"));
		System.out.println(f2.apply("안녕하세요"));
		
		Function<Student, Boolean> f3 = s -> {
			return s.getTotal() > 180 ? true : false;
		};
		
		if(f3.apply(new Student("홍길동", 80, 90, 75))){
			System.out.println("합격");
		}  else {
			System.out.println("불합격");
		}
		
		java.util.function.BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(10, 20));
		
		
		DoubleToIntFunction f4 = num -> (int)num;
		System.out.println(f4.applyAsInt(3.14));
		
		
		
		
		
		
		
	}

	private static void m2() {
		
		//Supplier
		//- 매개변수 없이 반혼값을 돌려주는 업무를 구현
		//- 매개변수X, 반환값O
		//- getXXX() 추상 메소드 제공
		
		Supplier<Integer> s1 = () -> 100;
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<String> s3 = () -> "홍길동";
		System.out.println(s3.get());
		
		Supplier<Student> s4 = () -> new Student("홍길동", 100, 90, 80);
		System.out.println(s4.get());
		
		
		IntSupplier s5 = () -> 200;
		System.out.println(s5.getAsInt());
		
		
	}

	private static void m1() {
		
		//Consumer
		//- 매개변수를 받아서 소비하는 업무를 구현
		//- 매개변수O, 반환값X > 추상메소드
		//- acceptXXXX() 추상 메소드 제공
		
		MyConsumer m1 = num -> System.out.println(num * num);
		m1.test(10);
		
		Consumer<Integer> c1 = num -> System.out.println(num * num);
		c1.accept(5);
		
		Consumer<String> c2 = str -> System.out.println(str.length());
		c2.accept("홍길동");
		
		Consumer<Integer> c3 = count -> {
			for (int i=0; i<count; i++) {
				System.out.println(i);
			}
		};
		c3.accept(5);
		
		Consumer<Student> c4 = s -> {
			System.out.println("이름: " + s.getName());
			System.out.println("국어: " + s.getKor());
			System.out.println("영어: " + s.getEng());
			System.out.println("수학: " + s.getMath());
			System.out.println("총점: " + s.getTotal());
		};
		
		c4.accept(new Student("홍길동", 100, 90, 80));
		
		BiConsumer<String, Integer> bc1 = (name, age) -> {
			System.out.printf("이름 %s, 나이: %d세\n", name, age);
		};
		bc1.accept("홍길동", 20);
		
		IntConsumer ic1 = num -> System.out.println(num * num);;
		ic1.accept(10);
		
		
		
		
	}//main

}

@FunctionalInterface
interface MyConsumer {
	void test(int num);
}



//The target type of this expression must be a functional interface
//*****fucntional interface, 함수형 인터페이스는 추상 메소드를 1개만 가질 수 있다.
//- 그 1개의 추상 메소드가 곧 람다식이 되기 때문에...


//람다식을 저장하는 목적의 인터페이스 vs 일반적인 인터페이스
//- 차이가 없다.


//람다식을 위한 인터페이스를 일반 인터페이스로 오해할 가능성 존재, 오해하지 않기 위해 어노테이션 추가
@FunctionalInterface
interface Test {
	void aaa();
}

interface Test2 {
	
	//일반적인 인터페이스 멤버
	//- 추상 멤버
	void aaa();
	
	//자바의 인터페이스 멤버
	//- 추상 멤버
	//- 구현 멤버(***)
	
//	public int a;
//	public void bbb(){};
	
	final public int b = 20;
	final static public int c = 30;
	
	public static void ccc() {}
	
	default void ddd() {};
}
