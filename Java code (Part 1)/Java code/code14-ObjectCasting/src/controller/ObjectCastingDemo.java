package controller;

import model.*;
public class ObjectCastingDemo {

	public static void main(String[] args) {
		
		//sample widening
		Canine krypto = new Canine();
		Mammal mammalObj = krypto;
		Animal animalObj = mammalObj;
		
		Feline felix = new Feline();
		//krypto = felix; not valid
		
		new ObjectCastingDemo().printAnimalType(animalObj);

	}

	public void printAnimalType(Animal hayop) {
	
		/*
		if(hayop instanceof Canine) {
			System.out.println("hayop is of type Canine");
		} else if (hayop instanceof Feline) {
			System.out.println("hayop is of type Feline");
		} else if (hayop instanceof Hawk) {
			System.out.println("hayop is of type Hawk");
		} else if (hayop instanceof Owl) {
			System.out.println("hayop is of type Owl");
		} else if (hayop instanceof Crocodile) {
			System.out.println("hayop is of type Crocodile");
		} else if (hayop instanceof KomodoDragon) {
			System.out.println("hayop is of type KomodoDragon");
		} else if (hayop instanceof Mammal) {
			System.out.println("hayop is of type Mammal");
		} else if (hayop instanceof Avian) {
			System.out.println("hayop is of type Avian");
		} else if (hayop instanceof Reptile) {
			System.out.println("hayop is of type Reptile");
		} else if (hayop instanceof Animal) {
			System.out.println("hayop is of type Animal");
		}
		*/
		
		
	}
}
