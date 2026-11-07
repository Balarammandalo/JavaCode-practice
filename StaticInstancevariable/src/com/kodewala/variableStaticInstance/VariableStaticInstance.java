package com.kodewala.variableStaticInstance;


//class Payment{
//	int amount = 1000;
//	static int amount = 2000;
//	
//	
//	public static void doPayment() {
//		System.out.println(amount);
//	}
//}

public class VariableStaticInstance {

	static int amount = 2000;
	public static void main(String[] args) {
//		Payment p = new Payment();
//		p.doPayment();
		System.out.println(amount);
		
		System.out.println(VariableStaticInstance.amount);
	}

}
