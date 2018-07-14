package controller;

import model.Car;

 class AccessCar {

	public static void main(String[] args) {
		//Creating the Car object
		
		Car rangerWildTrack = new Car("Ranger Wildtrak 4x2", 2015,
				"Ford Motors", "Chili Orange", 1299000);
		System.out.println(rangerWildTrack);
		
		//creating the Engine object - long version
		Car.Engine fordEngine1 = new Car().new Engine("Inline 4-Cylinder DOHC",
				"Ford Motors", 16);
		System.out.println(fordEngine1);
		
		//creating the Engine object - short version
		Car.Engine fordEngine2 = rangerWildTrack.new Engine("Inline 5-Cylinder DOHC",
				"Ford Motors", 16);
		System.out.println(fordEngine2);
		
		//creating the piston object - long
		Car.Engine.Piston piston1 = 
				new Car().
				new Engine().
				new Piston("Inline 4-Cylinder DOHC 20V");
		piston1.message();
		
		//creating the Piston object - short
		Car.Engine.Piston piston2 = 
				fordEngine2.
				new Piston("Inline 5-Cylinder DOHC 20V");
		piston2.message();
		


	
	}

}
