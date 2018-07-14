package model;

public class Car {
	
	private String name;
	private int model;
	private String manufacturer;
	private String color;
	private double cost;
	
	public Car() {
		
	}
	public Car(String name, int model, String manufacturer,
			String color, double cost) {
		
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.cost = cost;
	
	}
	
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
		
		public class Piston {
			private String name;
			
			public Piston(String pistonType) {
				name = pistonType;
			}
			
			public void message() {
			
				if (name.equals("Inline 5-Cylinder DOHC 20V")) {
					class Message {
						public void printMessage() {
							System.out.println("A very good " + name + " piston.");
						}
					}
					Message msgObj = new Message();
					msgObj.printMessage();
				} else if (name.equals("Inline 4-Cylinder DOHC 20V")){
					class Message {
						public void printMessage() {
							System.out.println("A good " + name + " piston");
						}
					}
					Message msgObj = new Message();
					msgObj.printMessage();
				} else {
					class Message {
						public void printMessage() {
							System.out.println("Not suitable piston type.");
						}
					}
					Message msgObj = new Message();
					msgObj.printMessage();
				}
				
			}
			
		}
	}

	public String toString() {
		return "\nCar Name: " + model + " " + name +
			   "\nManufacturer: " + manufacturer +
			   "\nColor: " + color +
			   "\nCost: " + cost 
			   ;
	}

}
