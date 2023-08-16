package com.test.java.obj;

import java.util.Calendar;

public class Mouse {
	
	private String model = "M301";
	private int price = 30000;
	private String color = "white";
	private Calendar date; //제조일
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}

	
	//계산된 프로퍼티 > Getter와 Setter는 기본적으로 private 멤버 변수를 조작하지만, 그게 필수는 아니다.
	// > 멤버 변수와 무관한 getter와 setter를 만들기도 한다.
	public String getState() {
		if (this.date.get(Calendar.YEAR) <= 2021) {
			return "구형";
		} else {
			return "신형";
		}
	}
	
	
	
	public void setDate(int year, int month, int date) {
		
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, date);
		
		this.date = c;
	}
	
	
	public String getDate() {
		
		//System.out.printf("%tF", this.date);  //출력 > 자바 콘솔 수업에서밖에 못씀
		
		return String.format("%tF", this.date); //반환
	}
	
	//덤프
	public String info() {
		
		String temp = "[";
		
		temp += this.model + ",";
		temp += this.price + ",";
		temp += this.color + ",";
		temp += String.format("%tF", this.date);
		
		temp += "]";
		
		return temp;
	}
	

}
