package com.kodewala.ecommerseAbstraction;

abstract class Delivery{
	public abstract void deliverPackage(String deliveryItem);
	
	public void deliveryTime() {
		System.out.println("checking the statndrad timeing: ");
	}
}

class DTDC extends Delivery{
	@Override
	public void deliverPackage(String deliveryItem) {
		System.out.println("DTDC is delivery: " + deliveryItem);
	}
	
	@Override
	public void deliveryTime() {
		System.out.println("Dtdc take up to 7 days of devliery");
	}
}

class PostOffice extends Delivery{
	@Override
	public void deliverPackage(String deliveryItem) {
		System.out.println("Post office delivery the items: " + deliveryItem);
	}
}

public class EcommerseDelivery {

	public static void main(String[] args) {
		DTDC dtdc = new DTDC();
		dtdc.deliverPackage("Mobile phone");
		dtdc.deliveryTime();

	}

}
