package com.kodewala.methodLoadingRiding;

class PaymentStructor{
	void pay() {
		System.out.println("Payment are done");
	}
}

class PhonePay extends PaymentStructor{
	void pay() {
		System.out.println("Phone pay throw payment done");
	}
	
}
class GooglePay extends PaymentStructor{
//	void pay() {
//		System.out.println("Google pay throw payment done");
//	}
}

public class PaymentSystem {

	public static void main(String[] args) {
		GooglePay gp= new GooglePay();
		gp.pay();
		
		PhonePay pp = new PhonePay();
		pp.pay();
	}

}
