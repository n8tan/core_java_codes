package model;

public class Engine {
	
	private String name;
	private String manufacturer;
	private int cylinders;
	
	public Engine() {
		
	}
	
	public Engine(String name,
		String manufacturer, int cylinders) {
		
		this.name = name;
		this.manufacturer = manufacturer;
		this.cylinders = cylinders;
	}
	
	public String toString() {
		return "\nEngine Name: " + name +
			   "\nManufacturer: " + manufacturer +
			   "\nCylinders: " + cylinders + " valves";
 	}
}
