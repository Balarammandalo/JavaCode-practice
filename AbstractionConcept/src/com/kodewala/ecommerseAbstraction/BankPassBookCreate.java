package com.kodewala.ecommerseAbstraction;

abstract class RBI{
	public abstract void minBalance();
	
	public void guideLine() {
		System.out.println("you follow the RBI guideLines");
	}
}

class SBI extends RBI{
	@Override
	public void minBalance() {
		System.out.println("Sbi need the minimum balance: 2000");
	}
}

class Icici extends RBI{
	@Override
	public void minBalance() {
		System.out.println("icici bank minimum balance need 50000");
	}
}

public class BankPassBookCreate {

	public static void main(String[] args) {
		Icici ic = new Icici();
		ic.minBalance();
		ic.guideLine();
	}

}
