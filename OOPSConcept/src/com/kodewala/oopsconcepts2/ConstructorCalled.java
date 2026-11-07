package com.kodewala.oopsconcepts2;

class Invoice{
	Invoice(int amt) {
		System.out.println("Amount constructor called");
	}
}

public class ConstructorCalled {

	public static void main(String[] args) {
		Invoice inv = new Invoice(200);
		//Invoice inv2 = new Invoice();
		
	}

}
