package com.kodewala.oopsthisandsuper;

class OrderMngmt {
	OrderMngmt(){
		super();
		System.out.println("The Order Management constructor is called-1");
	}
	OrderMngmt(int amt){
		System.out.println("take one parameter");
	}
}

class Order extends OrderMngmt{
	Order(){
		this("raghu");	
		System.out.println("Order empty parameter constructor is called-2");
	}
	
	Order(String name){
		super(100);
		System.out.println("Order one parament called-3");
	}
//	Order(String name , int age){
//		System.out.println("Order have two, one is name and age paramenter");
//	}
}

public class SuperDriverThis {

	public static void main(String[] args) {
		Order ord = new Order("nath");
	}

}
