package model;

public class Parent {
	
	public String message = "This is the Parent class";
	
	public Parent() {
		this("string");
		System.out.println("Parent default constructor executed - no args.");
	}
	
	public Parent(String message) {
		this(0,"hello world");
		System.out.println("Parent constructor String param executed.");
	}
	
	public Parent(String message, int number) {
		this('A', -5);
		System.out.println("Parent constructor String and int param executed.");
	}
	
	public Parent(int number, String message) {
		this("hello world", 0);
		System.out.println("Parent constructor int and String param executed.");
	}
	
	public Parent(char letter, int number) {
		System.out.println("Parent constructor character and int param executed.");
	}
	
	public void displayMessage() {
		System.out.println(message);
	}
}
