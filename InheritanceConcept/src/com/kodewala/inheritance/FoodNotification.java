package com.kodewala.inheritance;

public class FoodNotification {

	public void sendEmail(String _order, int _orderId , String _mail) {
		System.out.println("Your order is succesfully");
		System.out.print("Mail id: " + _mail);
		System.out.print(", Your Order : " + _order);
		System.out.println(", Order Id : " + _orderId);
	}
	
	public void sendSms(int _number , String text) {
		System.out.println("Ph: "+ _number  + ", Text: " + text);
	}
}

