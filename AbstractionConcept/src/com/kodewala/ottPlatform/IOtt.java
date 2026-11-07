package com.kodewala.ottPlatform;

interface IOtt {
	public abstract void signUp(String userName ,int mobileNumber, int otp);
	public abstract void login(int moileNumber , int otp);
	public abstract void subscription(int price);
	public abstract void cancleSubscripiton();
	
	void changeMobileNumber(int oldMobileNuber , int newMobileNumber );
	void logOut();
	void searchContent(String contentName);
}
