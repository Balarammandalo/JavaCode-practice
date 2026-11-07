package com.kodewala.birdAbstraction;

interface FlyingAnimal{
	void fly();
	
	void eat();
	
	default void sleep() {
		System.out.println("Birds can sleep");
	}
}

interface Walking{
	void walk();
}
class Parrot implements FlyingAnimal , Walking{
	
	@Override
	public void walk() {
		System.out.println("Parrot can walk");
	}
	
	@Override
	public void fly() {
		System.out.println("Parrot can fly");
	}
	
	@Override
	public void eat() {
		System.out.println("Parro can eat");
	}
}

public class SkyAnimalInterface {
	public static void main(String args[]) {
		Parrot pr = new Parrot();
		pr.eat();
		pr.fly();
	}
}
