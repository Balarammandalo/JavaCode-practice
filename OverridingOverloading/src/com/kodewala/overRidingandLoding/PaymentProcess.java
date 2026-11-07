package com.kodewala.overRidingandLoding;

class PaymentSystem {
	protected void doPayment(String _accNo, int _amount, String Note) {
		System.out.println("Payment from subclass");
//		return new GeneraicPayment("General payment");
	}
}

class Upi extends PaymentSystem {
	@Override
	public void doPayment(String _accNo, int _amount, String Note) {
		System.out.println("UPI throw Payment");
//		return new UpiPayment("called to child method", 200);
	}
}

public class PaymentProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
