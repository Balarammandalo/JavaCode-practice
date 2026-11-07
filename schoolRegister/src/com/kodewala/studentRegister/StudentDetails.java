package com.kodewala.studentRegister;

public class StudentDetails {

	public static void main(String[] args) {
		System.out.println("Student are register started...");
		
		StudentDetails sd = new StudentDetails();
		sd.feesDue();
		System.out.println("Student are register ended...");
	}
	public void feesDue() {
		System.out.println("You have cleare the feed");
		TotalFees tf = new TotalFees();
		tf.feesPending();
		System.out.println("done......");
	}
}

class TotalFees {
	public void feesPending() {
		System.out.println("No fees pending");
	}
}
