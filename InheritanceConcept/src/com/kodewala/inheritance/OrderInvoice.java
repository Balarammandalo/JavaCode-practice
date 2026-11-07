package com.kodewala.inheritance;

public class OrderInvoice extends FoodNotification {

	public void emailInvoice(String _order, int _orderId , String _mail) {
		sendEmail(_order , _orderId , _mail);
	}
	
	public void smsNotification(int _number , String text) {
		sendSms(_number , text);
	}

}
