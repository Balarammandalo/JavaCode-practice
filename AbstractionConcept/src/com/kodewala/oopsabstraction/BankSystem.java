package com.kodewala.oopsabstraction;

abstract class RBI{
	public abstract void doKyc();
}

class SBI extends RBI{
	@Override
	public void doKyc() {
		System.out.println("sbi bank the kyc is done");
	}
}


public class BankSystem {

	public static void main(String[] args) {

	}

}
