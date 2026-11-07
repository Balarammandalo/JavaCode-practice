package com.kodewala.customeException;

public class Driver {

	public static void main(String[] args) {
		
		String mail = args[0];
		UserRegisterMail userMail = new UserRegisterMail();
		try {
			userMail.registerEmail(mail);
		}
		catch(EmailException e) {
			e.printStackTrace();
			System.out.println("Already register connect with support team...");
		}
	}

}
