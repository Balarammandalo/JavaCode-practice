package com.kodewala.polymorphism;

class Teacher{
	String name = "ram";
	public void doPresent() {
		System.out.println("Teacher is present");
	}
}

class Student extends Teacher{
	String name= "shyam";
	@Override
	public void doPresent() {
		System.out.println("Student are present");
	}
}
public class TeacherStudent {
	public static void main(String[] args) {
		Teacher tc = new Student();
		tc.doPresent();		
		System.out.println(tc.name);
	}
}
