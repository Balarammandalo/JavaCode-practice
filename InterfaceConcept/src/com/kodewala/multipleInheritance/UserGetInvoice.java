package com.kodewala.multipleInheritance;

class User implements ZomatoInvoice , SwiggyInvoice{
	
	@Override
	public void getInvoice() {
		SwiggyInvoice.super.getInvoice();
	}
}
public class UserGetInvoice {
	public static void main(String[] args) {
		User ugi = new User();
		ugi.getInvoice();
	}
}