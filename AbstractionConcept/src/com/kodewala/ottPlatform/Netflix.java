package com.kodewala.ottPlatform;

public class Netflix implements IOtt {

	@Override
	public void signUp(String userName ,int mobileNumber, int otp) {
		System.out.println("User Name: " + userName + " Enter mobile Number : " + mobileNumber+ " Otp: " + otp);
		
	}

	@Override
	public void login(int moileNumber , int otp) {
		System.out.println(" Enter mobile Number : " + moileNumber + " Otp: " + otp);
		
	}

	@Override
	public void subscription(int price) {
		System.out.println("Netflix Min Subscription Price above 99");
		if(price < 99) {
			System.out.println("Sorry plan not exits.");
		}
		System.out.println("1 months Subscription Price: " + price);		
	}

	@Override
	public void cancleSubscripiton() {
		System.out.println("Cancle your plan");
	}

	@Override
	public void changeMobileNumber(int oldMobileNuber , int newMobileNumber ) {
		System.out.println("change Mobile number: " + oldMobileNuber + " to new Mobile : " + newMobileNumber);		
	}

	@Override
	public void logOut() {
		System.out.println("Get back soon..");
		
	}

	@Override
	public void searchContent(String contentName) {
		// TODO Auto-generated method stub
		System.out.println("content name : " + contentName);
		
	}
}
