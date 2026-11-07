package com.kodewala.birdAbstraction;

abstract class Bird{
	abstract void fly();
	
	abstract void eat();
	
	Bird(){
		System.out.println("Bird can fly & eat");
	}
	
	public void sleep() {
		System.out.println("Bird can sleep");
	}
}

class Crow extends Bird{
	
	@Override
	public void fly() {
		System.out.println("Crow was fly");
	}
	
	@Override
	public void eat() {
		System.out.println("Crow was eat");
	}
}


public class SkyAnimal {

	public static void main(String[] args) {
		
		Crow cr = new Crow();
		cr.eat();
		cr.fly();
		cr.sleep();
	}

}
