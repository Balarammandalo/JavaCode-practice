package com.kodewala.breakstatement;

public class BreakStatement {

	public static void main(String[] args) {
		String cities[] = {"chennai" , "ranchi" ,"Hyderabad", "Up" , "vizag", "Hyderabad"};
		String find = "Hyderabad";
		
		for(int i = 0;i<cities.length;i++) {
			if(cities[i] == find) {
				System.out.println("We get the hyderabad");
				break;
			}
		}
	}
}
