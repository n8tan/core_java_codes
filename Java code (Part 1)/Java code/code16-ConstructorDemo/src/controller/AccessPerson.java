package controller;

import model.Person;

public class AccessPerson {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		System.out.println(new Person(19));
		
		System.out.println(new Person("Daniel Riddle", 19));
		
	}

}
