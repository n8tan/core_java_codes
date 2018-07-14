package controller;

import model.Car;
import model.Engine;

public class AccessCar {

	public static void main(String[] args) {
		
		//creating the Engine class
		Engine fordEngine = new Engine("Inline 4-Cylinder DOHC",
				"Ford Motors", 16);
		
		Car rangerWildTrack = new Car("Ranger Wildtrak 4x2", 2015,
				"Ford Motors", "Chili Orange", 1299000, fordEngine);
		
		System.out.println(rangerWildTrack);
		
		System.out.println("\n\n");
		Engine civicEngine = new Engine("SOHC i-VTEC", "Honda Motors", 16);
		rangerWildTrack.engine = civicEngine;
		System.out.println(rangerWildTrack);
	}

}
