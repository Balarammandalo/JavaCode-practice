package com.kodewala.paymentOptions;

public class PaymentApp extends GettingConfMessage {
	
	void phonePay(int _amount) {
		sendSmsToUser(_amount , "Phone pay");
	}
	
	 void googlePay(int _amount) {
		sendSmsToUser(_amount , "google pay");
	}
	
	void creditCard(int _amount) {
		sendSmsToUser(_amount , "Credit-card pay");
	}
	
	void netBanking(int _amount) {
		sendSmsToUser(_amount , "Net Banking");
	}	
}