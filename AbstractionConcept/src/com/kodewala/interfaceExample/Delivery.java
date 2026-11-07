package com.kodewala.interfaceExample;

interface Delivery {
	void deliveryProduct(String items);
	
	void trackingStatus(String status);
	
	void deliveryTime(int time);
	
	
	default void giftCard() {
	}
}

class Zepto implements Delivery{

	@Override
	public void deliveryProduct(String items) {
		System.out.println("Biscuit packet");
		
	}

	@Override
	public void trackingStatus(String status) {
		System.out.println("Out of devliery");
		
	}

	@Override
	public void deliveryTime(int time) {
		System.out.println("10 mins delivery");
	}
}

class Amazon implements Delivery{

	@Override
	public void deliveryProduct(String items) {
		System.out.println("TV");
	}

	@Override
	public void trackingStatus(String status) {
		System.out.println("Preparing for Shipment");
	}

	@Override
	public void deliveryTime(int time) {
		System.out.println("it take up to 3 days");
		
	}
	
	@Override
	public void giftCard() {
		System.out.println("you can buy the giftcard");
	}
}