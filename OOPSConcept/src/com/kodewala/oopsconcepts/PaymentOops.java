package com.kodewala.oopsconcepts;

class Payment{
	int amount;
	String userName;
	
	Payment(){
		System.out.println("constructor is called with out creation of object");
	}
	
	Payment(int _amount , String _name) {
		System.out.println("method is called");
		this.amount = _amount;
		this.userName = _name;
	}
}

public class PaymentOops {

	public static void main(String[] args) {
		Payment p = new Payment();
		System.out.println(p.amount);
		System.out.println(p.userName);
		
		Payment p2 = new Payment(1000 , "krishna");
		System.out.println(p2.amount);
		System.out.println(p2.userName);

	}

}
