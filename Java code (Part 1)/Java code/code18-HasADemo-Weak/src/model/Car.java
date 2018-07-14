package model;

public class Car {
	
	private String name;
	private int model;
	private String manufacturer;
	private String color;
	private double cost;
	
	public Engine engine = new Engine();
	
	public Car(String name, int model, String manufacturer,
			String color, double cost, Engine engine) {
		
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.cost = cost;
		this.engine = engine;
	}
	
	public String toString() {
		return "\nCar Name: " + model + " " + name +
			   "\nManufacturer: " + manufacturer +
			   "\nColor: " + color +
			   "\nCost: " + cost +
			   engine;
	}

}
