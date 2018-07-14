package controller;

import model.Car;
import model.Engine;

public class AccessCar {

	public static void main(String[] args) {
		Car rangerWildTrack = new Car("Ranger Wildtrak 4x2", 2015,
				"Ford Motors", "Chili Orange", 1299000);
		
		rangerWildTrack.setEngine(new Engine("Inline 4-Cylinder DOHC",
				"Ford Motors", 16));
		
		System.out.println(rangerWildTrack);
		
		//since car object is still active, i can retrieve it
		Engine  makinaNiWildTrak = rangerWildTrack.getEngine();
		System.out.println(makinaNiWildTrak);
		
		//now let us destroy the car
		rangerWildTrack = null;
		
		//then get the engine -can I still retrieve it?
		Engine makina = rangerWildTrack.getEngine();
		System.out.println(makina);
		
	}

}
