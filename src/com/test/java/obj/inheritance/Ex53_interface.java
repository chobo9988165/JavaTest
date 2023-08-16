package com.test.java.obj.inheritance;

public class Ex53_interface {
	
	public static void main(String[] args) {
		
		
		//Ex53_interface.java
		
		MxKeys keyboard = new MxKeys();
		
		keyboard.powerOn();
		keyboard.keyDown('A');
		System.out.println(keyboard.checkBatter());
		keyboard.powerOff();
		
		
		
	}//main

}



//** Keyboard는 객체를 생성할 수 없다. > 실체화할 수 없다. > 누군가의 부모가 된다.
//***인터페이스가 가지는 모든 추상 메소드는 public 이여야 한다.(생략가능)
interface Keyboard {
	
	//키보드로서 갖춰야 할 행동을 정의(선언부(O), 구현부(X)) > 호출 사용법
	void keyDown(char c);
	void powerOn();
	void powerOff();
	int checkBatter();
}

class MxKeys implements Keyboard {

	@Override
	public void keyDown(char c) {
		//구현은 지맘대로
		System.out.println(c + " 눌렀음");
	}

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
		
	}

	@Override
	public int checkBatter() {
		return 80;
	}
	
}