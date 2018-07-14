package model;

public class Person {
	
	public String name;
	public int age;
	
	public Person() {//default constructor
		name = "<no name specified>";
		System.out.println("default constructor executed");
		
		
	}
	
	public Person(String name) {
		System.out.println("constructor with String parameter executed");
		this.name = name;
		
		
	}
	
	public Person (int age) {
		System.out.println("constructor with int parameter executed");
		this.age = age;
		
	}
	
	public Person(String name, int age) {
		System.out.println("constructor with String and int paramters executed");
		this.name = name;
		this.age = age;
		
	}
	
	public Person(int age, String name) {
		System.out.println("constructor with int and String parameters executed");
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "Name: " + name +
				"\nAge: " + age + "\n"; 
	}
}
