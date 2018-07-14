package model;

public class Car {
	
	private String name;
	private int model;
	private String manufacturer;
	private String color;
	private double cost;
	
	private Engine engine;
	
	public Car(String name, int model, String manufacturer,
			String color, double cost) {
		
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.cost = cost;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public String toString() {
		return "\nCar Name: " + model + " " + name +
			   "\nManufacturer: " + manufacturer +
			   "\nColor: " + color +
			   "\nCost: " + cost +
			   engine;
	}

}
