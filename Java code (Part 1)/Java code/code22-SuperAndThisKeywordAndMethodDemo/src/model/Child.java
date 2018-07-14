package model;

public class Child extends Parent {
	
	public String message = "This is the Child class";
	
	public Child() {
		this(true);
		System.out.println("Child constructor executed - no args.");
	}
	
	public Child(boolean verified) {
		super("iACADEMY", 2002); //will call the parent constructor with String and int
		System.out.println("Child constructor boolean params executed");
		
	}
 	
	public void displayMessage() {
		System.out.println("Now displaying the variables from Parent.");
		System.out.println("\t" + super.message);
		super.displayMessage();
		
		System.out.println("\nnow displaying the variabls from Parent.");
		System.out.println("\t" + this.message);
	
	}
}
