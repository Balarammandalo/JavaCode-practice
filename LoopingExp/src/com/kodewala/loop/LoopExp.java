package com.kodewala.loop;

public class LoopExp {

	public static void main(String[] args) {
		LoopExp le = new LoopExp();
		boolean result = le.findCity();
		if(result) {
			System.out.print("find the bangalore");
		}
		else{
			System.out.print("There is no any bangalore");
		}
	}
	
	public boolean findCity() {
		String cities[] = {"bangalore" , "chennai" , "hyd" , "vizag" ,"pune","mumbai"};
		
		for(String i : cities) {
			if(i == "bangalore") {
				return true;
			}
		}
		return false;
	}

}
