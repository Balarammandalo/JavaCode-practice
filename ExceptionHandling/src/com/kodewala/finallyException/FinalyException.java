package com.kodewala.finallyException;

public class FinalyException {

	public static void main(String[] args) {

		try {
			System.out.println("Programm execute");
			String email = args[1];
			System.out.println("Email: " + email);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Pass the value");
		}
//		finally {
			System.out.println("Code is exceute complete");
//		}

	}

}
