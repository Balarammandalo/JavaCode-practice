package com.kodewala.exceptionpart2;

class Delivery{
	private String name;
	private String address;
	private String landMark;
	private String pinCode;
	
	public Delivery(String _name , String _address, String _landmark , String _pincode) {
		this.name = _name;
		this.address = _address;
		this.landMark = _landmark;
		this.pinCode = _pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
}

class Order{
	private String status;
	private String message;
	
	public Order(String _status , String _message) {
		this.status = _status;
		this.message = _message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

public class Driver {

	public static void main(String[] args) {
		
		Delivery dlv = new Delivery("ram" ,"BTM layout" ,  null , null);
		
		Order ord;
		
		try {
			dlv.getAddress();
			dlv.getName();
			String pincode=dlv.getPinCode();
			System.out.println(pincode.codePointAt(0));
			ord = new Order("On the way" , "wait for 10-15 minus");
		}
		catch(NullPointerException e) {
			ord = new Order("Hold" , "Due to item stock not available");
//			System.out.println("Null pointer Error");
		}
		
		System.out.println("Status: "+ord.getMessage());
	}
}
