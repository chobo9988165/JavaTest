package com.test.java.obj.cast;

public class Ex56_Casting {
	
	public static void main(String[] args) {
		
		//Ex56_Casting.java★★★★★★★★★★★★★★★★★★★ 예제 따로 없어서 이거로 봐야됨
		
		//프린터 기기
		//- LG500
		//- HP600
		
		
//		LG500 lg = new LG500();
//		HP600 hp = new HP600();
//		
//		lg.on();
//		hp.powerOn();
//		
//		lg.print();
//		hp.printing();
//		
//		lg.off();
//		hp.powerOff();
		
		LG500 lg = new LG500();
		HP600 hp = new HP600();
		
		lg.powerOn();
		hp.powerOn();
		
		lg.print();
		hp.print();
		
		lg.powerOff();
		hp.powerOff();
		
		Printer p1;
		LG500 lg2 = new LG500();
		
		//Printer = LG500
		//부모 = 자식
		//업캐스팅
		//※인터페이스는 항상 부모 클래스이기때문에 자식 클래스의 인스턴스 생성하는 업캐스팅 가능
		p1 = lg2;
		
		Printer p2 = (Printer)new HP600();
		
		Object o1 = new LG500(); //도 가능
		
		((HP600)p2).clean();//도 가능
		
		
		
		//상황] 프린터 판매 대리점 운영
		// - 재고
		//		- LG500 x 5대
		//		- HP600 X 3대
		//	- 매일 업무
		//		- 프린터가 제대로 동작 > 기능 확인
		//
		
		//추가상황] LG500 x 500대, HP600 X 300대
		//추가상황] BenQ700, Epson800 > 추가 브랜드(제품) 
		//m1();//무식하게출력
		//m2();//배열 > 갯수가 늘어가는 것에 대해선 쉽게 대응.새로운 변수가 늘어나면 추가 비용 발생
		m3();//참조형 형번환 + 인터페이스를 이용한 방법
		//업캐스팅 쓰는 이유 1. 형제뻘되는 클래스를 하나의 배열에 넣어 관리 가능
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		
		Printer[] ps = new Printer[8];
		
		//******** 서로 다른 클래스의 객체를 하나의 배열에 넣음★★★★
		//ps[0] = new LG500();
		//ps[1] = new HP600();
		
		for(int i=0; i<ps.length; i++) {
			
			if(ps[i] instanceof LG500) {
				ps[i] = new LG500();
			} else {
				ps[i] = new HP600();
			}
		}
		
		//업무
		for (int i=0; i<ps.length; i++) {
			ps[i].print();
			//추가 업무
			//- LG500 > selfTest()
			//- HP600 > clean()
			
			//ps[i].?
			
			//1)해결방법
			//instanceof 객체 자료형을 묻는 메소드
			
			if(ps[i] instanceof LG500) {
			((LG500)ps[i]).selfTest();		//.이 먼저 실행되기때문에 괄호로 캐스팅 먼저 실행되게 함
			} else {						//HP 돌 때 에러 발생
				((HP600)ps[i]).clean();		//순서 바뀌면 어떻게 해결?1)
			}
			
		}
		
		
		
	}
	
	

	private static void m2() {
		
		LG500[] lg = new LG500[5];
		for(int i=0; i<lg.length; i++) {
			lg[i] = new LG500();
		}
		
		
		HP600[] hp = new HP600[3];
		for(int i=0; i<hp.length; i++) {
			hp[i] = new HP600();
		}
		
		//업무
		for (int i=0; i<lg.length; i++) {
			lg[i].print();
		}
		
		for (int i=0; i<hp.length; i++) {
			hp[i].print();
		}
		
	}

	private static void m1() {
		
		//가장 단순한 방법, 비효율적인 방법
		
		LG500 lg1= new LG500();
		LG500 lg2= new LG500();
		LG500 lg3= new LG500();
		LG500 lg4= new LG500();
		LG500 lg5= new LG500();
		
		HP600 hp1= new HP600();
		HP600 hp2= new HP600();
		HP600 hp3= new HP600();
		
		//업무
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
		
		
	}

}

//hp lg 양쪽에 동일하게 들어갈 기능
interface Printer {
	public void powerOn();
	public void powerOff();
	public void print();
}





class LG500 implements Printer{
	
	private String type;
	private int price;
	
	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n", this.type);
	}
	

	public void selfTest() {
		System.out.println("자가 점검을 합니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}
	
}

class HP600 implements Printer{
	
	private String color;
	private int price;
	
//	public void printing() {
//		System.out.println("출력합니다.");
//	}
	
	public void powerOn() {
		System.out.println("전원 켜짐");
	}
	
	public void powerOff() {
		System.out.println("전원 꺼짐");
	}
	
	public void clean() {
		System.out.println("헤더를 청소합니다.");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}