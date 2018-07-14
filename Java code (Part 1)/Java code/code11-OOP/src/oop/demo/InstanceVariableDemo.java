package oop.demo;

import oop.demo.model.Vehicle;

public class InstanceVariableDemo {

	public static void main(String[] args) {
		
		//vehicle fordRanger; // declaration
		//fordRanger = new Vehicle(); // initialization

		//instantiation=declaration+initialization;
		Vehicle fordRanger = new Vehicle();
		
		fordRanger.manufacturer = "Ford Motors";
		fordRanger.name = "Ford Ranger";
		fordRanger.year = 2015;
		fordRanger.color = "Chili Orange";
		fordRanger.isAutomaticTransmission = true;
		fordRanger.price = 1299000.00;
		
		System.out.println("Car Details");
		System.out.println("Name: " + fordRanger.year + " " 
				+ fordRanger.name);
		System.out.println("Manufacturer: " + fordRanger.manufacturer);
		System.out.println("Price: PHP" + fordRanger.price);
		System.out.println("Color: " + fordRanger.color);
		
		String transmission = (fordRanger.isAutomaticTransmission)?
				"automatic":"manual";
		System.out.println("Transmission Type: " + transmission);
		
		fordRanger.start(80);
		fordRanger.accelerate();
		fordRanger.brake();
		fordRanger.stop();
		
		//hands-on exercise
		//create your own dream vehicle
		
		Vehicle acuraNSX = new Vehicle();
		
		acuraNSX.manufacturer = "Acura";
		acuraNSX.name = "Acura NSX";
		acuraNSX.year = 2015;
		acuraNSX.color = "White";
		acuraNSX.isAutomaticTransmission = true;
		acuraNSX.price = 6999638.73;
		
		System.out.println("Car Details");
		System.out.println("Name: " + acuraNSX.year + " "
				+ acuraNSX.name);
		System.out.println("Manufacturer: " + acuraNSX.manufacturer);
		System.out.println("Price: PHP" + acuraNSX.price);
		System.out.println("Color: " + acuraNSX.color);
		
		String transmissionTwo = (acuraNSX.isAutomaticTransmission)?
				"automatic":"manual";
		System.out.println("Transmission Type: " + transmissionTwo);
		
		acuraNSX.start(100);
		acuraNSX.accelerate();
		acuraNSX.brake();
		acuraNSX.stop();
		
				
		

	}

}
