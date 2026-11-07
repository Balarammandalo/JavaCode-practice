package com.kodewals.switchstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		int num = 5;
		switch(num){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3 :
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("thursday");
				break;
			default:
				System.out.println("Givne a valid number below 4 number");		
		}
	}

}
