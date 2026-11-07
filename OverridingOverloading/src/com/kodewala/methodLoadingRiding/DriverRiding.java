package com.kodewala.methodLoadingRiding;

class Employee{
	Employee(){
		System.out.println("Employee class called");
	}
}

class Manager extends Employee
{
	
}

public class DriverRiding {

	public static void main(String[] args) {
		Manager m = new Manager();
	}

}
