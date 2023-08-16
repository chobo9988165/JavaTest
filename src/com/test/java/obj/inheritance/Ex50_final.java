package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex50_final {
	
	public static void main(String[] args) {
		//Ex50_final.java
		/*
		 
		  	final 키워드
		  	- 한번 결정하면 바꿀 수 없다.
		  	- 안정성 높음
		  	1. 변수 적용(지역 변수, 멤버 변수)
		  		- 초기화 이후 값을 변경할 수 없다.
		  		- 상수
		  		
		  	2. 메소드 적용
		  		- 상속
		  		- 오버라이드 금지
		  		- 부모 메소드 > 수정하지 못하게 막음
		  		- ※실제 상황에서는 미래의 상황까지 계측해서 사용해야되기 때문에, 거의 안쓴다.
		  		
		  	3. 클래스 적용
		  		- 상속
		  		- 부모 클래스 > 수정하지 못하게
		  		- ※ 얘도 자주 안씀
		  
		 */
		
		//지역 변수
		int a = 10;
		a = 20;
		a = 30;
		
		//final 변수 = 상수
		final int b = 10;
		//b = 20; //The final local variable b cannot be assigned. It must be blank and not using a compound assignment
		
		//비추천 > 변수처럼 보임
		final int c;
		c = 10;
		//c = 20;
		
		//권장 > 선언과 동시에 초기화
		final int d = 10;
		final int e = 10;
		
		
		Test t = new Test();
		t.a = 20;
//		t.b = 30; ///The final field(클래스멤버) Test.b cannot be assigned
		
		test(100);
		
		System.out.println(Calendar.YEAR);//캘린더상수
		//Calendar.YEAR = 2;
		
		
		int gender; 
		
		gender = 1;
		gender = 2;
		
		
		final int MALE = 1;
		final int FEMALE = 2;
		
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		
	}

	private static void test(final int i) {
		System.out.println(i);
		//i = 200;
	}

}

class FinalParent {
	
	//부모 클래스 설계자가
	//-test() > 나중에 상속받은 자식 클래스가 이 test()메소드를 재정의하면 안될 것 같다고 느낄 때
	
	final public void test() {
		System.out.println("부모 메소드");
	}
}

class FinalChild extends FinalParent {
	
	//Cannot override the final method from
//	@Override
//	public void test() {
//	}
	
}


class Test {
	public int a = 10;
	public final int b = 20; //멤버 변수
}


//남자(1), 여자(2) > 열거값 > final static 오브젝트(인스턴스)를 만들지 않고 바로 접근
class Gender {
	
	public final static int MALE = 1;
	public final static int FEMALE = 2;
	
}

//부모 클래스 설계 중 > 상속 불가능
final class FinalMember {
	
}

//The type FinalUser cannot subclass the final class FinalMember (상속불가)
//class FinalUser extends FinalMember {
//	
//}













