package com.kodewala.sibiib;

class Payment{
	static int score = 0;
	
	{
		score++;
		System.out.println("instance Iib called " + score);
	}
	
	Payment(){
		System.out.println("Constructor method is called");
	}
	
	static {
		System.out.println("Static SIB called");
	}
}

public class PaymentIibSib {

	public static void main(String[] args) {
		System.out.println("payment class call");
		Payment p = new Payment();
//		Payment p2 = new Payment();
	}
}
