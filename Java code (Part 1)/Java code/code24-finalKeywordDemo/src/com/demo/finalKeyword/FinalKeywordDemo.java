package com.demo.finalKeyword;

public class FinalKeywordDemo {

	
	public static void main(String[] args) {
		finalVariableDemo();
		
	}
	
	public static void finalVariableDemo() {
		
		final String school;
		//System.out.println("The only former school in Ayala: " + school);
		
		
		//now changing the value of school.
		school = "iACADEMY NavyBlue  Gamechangers";
		System.out.println("The only former school in Ayala: " + school);
		
		//school = "The Great iACADEMY besides Ministop"; // illegal changing of value
		
	}
	
	public static void finalMethodDemo() {
		Child child = new Child();
		child.message();
	}

}

/*final*/ class Parent {
	public /*final*/ void message() {
		System.out.println("This is the Parent the class.");
	}
	
}

class Child extends Parent{
	//doing overriding
	/*@Override
	public void message() {
		System.out.println("This is the Child class.");
	}*/	
}