package com.kodewala.oopsconcepts;

class FoodList{
	String customerName;
	String itemName;
	String deliveryDate;
	String status;
	
	FoodList(){
		System.out.println(customerName);
		System.out.println(itemName);
		System.out.println(deliveryDate);
		System.out.println(status);
	}
	
	FoodList(String _customer , String _item , String _delivery , String _status){
		this.customerName = _customer;
		this.itemName = _item;
		this.deliveryDate = _delivery;
		this.status = _status;
	}
}

public class FoodDevlivery {

	public static void main(String[] args) {
		FoodList fl = new FoodList();
		
		FoodList ravi = new FoodList("Ravi" , "Biriyani" , "2:30PM" , "Prepered");
		System.out.println(ravi.customerName);
		System.out.println(ravi.itemName);
		System.out.println(ravi.deliveryDate) ;
		System.out.println(ravi.status);
		
	}

}
