package com.kodewala.oopsconstructor;


class Payment{
	int amount;
	String upiId;
	String userName;
	int mobileNumber;
	String bankName;
	
	Payment(int _amount){
		this.amount = _amount;
	}
	Payment(String _upiId , String _name){
		this.upiId = _upiId;
		this.userName = _name;
	}
	
	Payment(String _upiId , String _name , int _mobileNum , String _bankName){
		this(2000);
		this.upiId = _upiId;
		this.userName= _name;
		this.mobileNumber = _mobileNum;
		this.bankName = _bankName;
	}
	
	void getDetailPayment() {
		System.out.println("Amount: " + amount);
		System.out.println("Upi Id: " + upiId);
		System.out.println("User name: " + userName);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Bank name: " + bankName);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Payment p = new Payment(2000);		
		Payment p2 = new Payment("123@ybl" ,  "raghu");
		Payment p3 = new Payment("nk@gpay" , "nikhil" , 1234321 , "SBI");

		p3.getDetailPayment();
	}

}
