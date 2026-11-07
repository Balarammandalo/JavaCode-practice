package com.kodewala.methodLoadingRiding;

class Animal {
	
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dog are sound bhou bhou");
	}
}

class Crow extends Animal{
	void sound() {
		System.out.println("Crow are ka ka...");
	}
}

public class AnimalSounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Crow cr = new Crow();
		cr.sound();
		
		
		

	}

}
