package com.kodewala.tryResourses;

public class Driver {
	public static void main(String args[]) {
		System.out.println("Driver program run started");
		User user = new User();
		try {
			user.createUser();
		}
		catch(UserCreationException e) {
			e.printStackTrace();
			System.out.println("Contact to this ph number : 0000199282");
		}
		System.out.println("Driver program exit");
	}
}

class Account{
	public void createAccount() throws FailureToCreateAccount {
		System.out.println("Account is created");
		
		if(true){
			throw new FailureToCreateAccount("Failure to create Account");
		}
		
		System.out.println("Account is ended");
	}
}

class User{
	public void createUser() throws UserCreationException {
		System.out.println("User.createUser().start()");
		Account accnt = new Account();
		try {
			accnt.createAccount();
		}
		catch(FailureToCreateAccount e) {
			e.printStackTrace();
			throw new UserCreationException("User unable to create new account");
		}
		System.out.println("User.createUser().end()");
	}
}

