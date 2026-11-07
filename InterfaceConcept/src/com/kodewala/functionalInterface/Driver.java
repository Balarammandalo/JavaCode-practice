package com.kodewala.functionalInterface;

interface Calc {
	void upperCaseLetter(String name);
}

//
//class Calculator implements Calc{
//	@Override
//	public void upperCaseLetter(String _name) {
//		System.out.println("calculators is lambda");
//	}
//}

public class Driver{
	public static void main(String args[]) {
		
		String name = "xyaram";
		Calc c = (_fullName) -> {
			System.out.println("Calculator is a lambda experssion");
		};
		c.upperCaseLetter(name);		
	}
}



















//		Calculator c = new Calculator();
//		c.upperCaseLetter("ramshyam");





//public abstract int add(int a , int b);
//
//default int multiPle(int a , int b) {
//	return a * b;
//}

//int sqre(int num);