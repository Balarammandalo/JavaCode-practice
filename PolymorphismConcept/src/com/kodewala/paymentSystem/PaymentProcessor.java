package com.kodewala.paymentSystem;

public class PaymentProcessor {
	
	public void doProcessing(Payment payment) {
		
		//Payment payment = new UpiPayment(); new PhonePayment();
		payment.doPayment();
	}
}
