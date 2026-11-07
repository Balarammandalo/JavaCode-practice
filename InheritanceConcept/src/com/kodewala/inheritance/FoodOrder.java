package com.kodewala.inheritance;

public class FoodOrder extends OrderInvoice {

	String order = "Chicken Biriyani";
	int id = 12321;
	String email = "ram1234@gmail.com";

	int phoneNumber = 123432123;

	void getEmailInvoice() {
		emailInvoice(order, id, email);
	}

	void sendNotification() {
		smsNotification(phoneNumber, "You order is on the way..");
	}

	public static void main(String args[]) {
		FoodOrder getFood = new FoodOrder();

		getFood.getEmailInvoice();
		getFood.sendNotification();

	}
}
