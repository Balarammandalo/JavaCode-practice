package com.kodewala.encapsulationConept;

public class DriverDetails {

	public static void main(String[] args) {
		Driver busDriver = new Driver();
		
//		dr.payment = -5000;
		busDriver.setPayment(2000);
		System.out.println(busDriver.getPayment());
 
	}

}
