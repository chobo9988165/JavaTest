package com.test.java.obj.inheritance;

public class Ex54_interface {

	public static void main(String[] args) {
		
		//Ex54_interface.java
		
		/*
		 * 
		 

		 	상속
		 	1. 단일 상속 > 부모가 1개
		 	2. 다중 상속 > 부모가 2개 이상
		 	
		 	*** 자바는 다중 상속을 허용하지 않는다.
		 	***** ★인터페이스에 한해서 다중 상속을 허용 → 인터페이스는 구현부가 존재하지 않으니까
		 	★★★★★상속, 인터페이스를 보고 형태 짐작 가능
		 	
		 
		 
		 *
		 *
		 *
		 */
		
		
		Hong hong = new Hong();//hong은 직원이자 아빠
		
		hong.출근하다();
		hong.일을한다();
		hong.퇴근하다();
		
		
	}

}

interface 직원 {
	void 출근하다();
	void 퇴근하다();
	void 일을한다();
}

interface 아빠{
	void 애들과놀기();
	void 돈벌기();
	void 낮잠자기();
}

class Hong implements 직원,아빠 {//나열하면 끝

	@Override
	public void 출근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 퇴근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 일을한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 애들과놀기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 돈벌기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 낮잠자기() {
		// TODO Auto-generated method stub
		
	}
	
}

class Lee implements 직원{

	@Override
	public void 출근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 퇴근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 일을한다() {
		// TODO Auto-generated method stub
		
	}
	
}

class Park implements 아빠 {

	@Override
	public void 애들과놀기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 돈벌기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 낮잠자기() {
		// TODO Auto-generated method stub
		
	}
	
}
