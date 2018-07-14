package oop.demo.model;

public class Vehicle {
	//instance variables
	public String name;
	public int year;
	public boolean isAutomaticTransmission;
	public String manufacturer;
	public double price;
	public String color;
	public void start(int speed) {
		System.out.println(name + " starts at " + speed + "kph.");
	}
	
	public void accelerate() {
		System.out.println(name + " accelerates.");
	}
	
	public void brake() {
		System.out.println(name + " decelerates.");
	}
	
	public void stop() {
		System.out.println(name + " stop.");
	}
}
