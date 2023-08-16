package com.test.question;

import java.util.Scanner;

public class Q011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String result = "";
		int n1 = 0, n2 = 0;
		
		System.out.print("첫번째 숫자:");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자:");
		n2 = scan.nextInt();
		
		result = add(n1, n2);
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);
		
		result = multiply(n1, n2);
		System.out.println(result);
		
		result = divide(n1, n2);
		System.out.println(result);
		
		result = mod(n1, n2);
		System.out.println(result);

	}//main
	
	public static String add(int n1, int n2) {
		String add = "";
		int n3 = n1 + n2;
		add = n1 + " + " + n2 + " = " + n3;
		return add;
	}
	public static String subtract(int n1, int n2) {
		String subtract = "";
		int n3 = n1 - n2;
		subtract = n1 + " - " + n2 + " = " + n3;
		return subtract;
	}
	public static String multiply(int n1, int n2) {
		String multiply = "";
		int n3 = n1 * n2;
		multiply = n1 + " * " + n2 + " = " + n3;
		return multiply;
	}
	public static String divide(int n1, int n2) {
		String divide = "";
		double n3 = (double)n1 / n2;
		divide = String.format("%d / %d = %.1f", n1, n2, n3);
		return divide;
	}
	public static String mod(int n1, int n2) {
		String mod = "";
		int n3 = n1 % n2;
		mod = n1 + " % " + n2 + " = " + n3;
		return mod;
	}

}
