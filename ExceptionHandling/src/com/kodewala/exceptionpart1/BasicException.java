package com.kodewala.exceptionpart1;

public class BasicException {

	public static void main(String[] args) {

		System.out.println("Programming is started");
		try {
//			int amount = Integer.parseInt(args[1]);

			int amount = Integer.parseInt("12a34");
//			int amount = 200/0;
			String fName = args[0];
			System.out.println("Amount: " + amount);
			
			System.out.println(fName.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("we can't find the length of null value");
		}
		catch(ArithmeticException e) {
			System.out.println("We can't divided by zero");
		}
		catch(Exception e) {
			System.out.println("ALl are exception handling");
		}
		System.out.println("Programming is ended");
	}
}
