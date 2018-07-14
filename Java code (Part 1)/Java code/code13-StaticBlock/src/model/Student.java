package model;

public class Student {
	
	//instance variables
	public String lastName;
	public String firstName;
	public String course;
	public int yearLevel;
	
	//class or static variable
	public static int counter;
	
	@Override
	public String toString() {
			return "Name: " + lastName + ", "
				+ firstName + "\n"
				+ "Course: " + course + "\n"
				+ "Year Level: " + yearLevel;
 }
}
