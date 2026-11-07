package com.kodewala.studentArrayList;

import java.util.ArrayList;

public class CollageStudents {

	public static void main(String[] args) {
		
		ArrayList<String> studentName = new ArrayList<>();
		
		studentName.add("rahul");

		studentName.add("shyam");
		studentName.add("nikon");
		studentName.add("Nikhil");
		
		for(int i = 0;i<studentName.size();i++) {
			String student = studentName.get(i);
			if(student.toLowerCase().startsWith("n")) {
				System.out.println(student);
			}
		}
		
//		System.out.println(studentName);
	}

}
