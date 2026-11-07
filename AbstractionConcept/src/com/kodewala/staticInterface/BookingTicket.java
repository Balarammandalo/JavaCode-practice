package com.kodewala.staticInterface;

interface BusTicketBook {
	void chargeingPoint();

	void waterBottle();
	
	 default void fireExtension() {
		System.out.println("Every bus are need the fireExtension");
	}

	 public static void AirCondition() {
		System.out.println("AC availability depends on bus type");
	}
}

class AbhiBus implements BusTicketBook {

	@Override
	public void chargeingPoint() {
		System.out.println("Each sheet available the charging point");
	}

	@Override
	public void waterBottle() {
		System.out.println("every one get the free water bottle");
	}
	
	{
		BusTicketBook.AirCondition();
	}
}

class RedBus implements BusTicketBook {

	@Override
	public void chargeingPoint() {
		System.out.println("Per sheet only 1 charging point available");
	}

	@Override
	public void waterBottle() {
		System.out.println("every one get the free water bottle");
		
	}
	
}

public class BookingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RedBus rb = new RedBus();
//		rb.waterBottle();
		
		AbhiBus ab = new AbhiBus();
		ab.fireExtension();
	}

}
