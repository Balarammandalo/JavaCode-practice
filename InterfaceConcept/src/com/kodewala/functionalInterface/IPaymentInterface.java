package com.kodewala.functionalInterface;


interface IPayment{
	void pay();
}


@FunctionalInterface 
interface Refund extends IPayment{
//	void settle();
	void pay();
}

class IPay implements Refund{
	public void pay(){
		System.out.println("Ipay throw payment");
	}
}

public class IPaymentInterface {

}
