package com.kodewala.overRidingandLoding;

public class GeneraicPayment {

	GeneraicPayment(String _message){
		super();
	}
}

class UpiPayment extends GeneraicPayment{
	UpiPayment(String message, int code){
		super(message );
	}
}

