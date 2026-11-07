package com.kodewala.tryResourses;

public class FailureToCreateAccount extends RuntimeException{
	
	public FailureToCreateAccount(String _msg) {
		super(_msg);
	}
}
