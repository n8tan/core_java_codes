package controller;

import model.Student;

public class AccessStudent {

	static {
		Student coleenB = new Student();
		coleenB.lastName = "Bartido";
		coleenB.firstName = "Coleen";
		coleenB.course = "BS CS-SE";
		coleenB.yearLevel = 2;
		Student.counter++;
		
		System.out.println(coleenB);
		
		Student chenC = new Student();
		chenC.lastName = "Cerbo";
		chenC.firstName = "Chen";
		chenC.course = "BS CoE";
		chenC.yearLevel = 1;
		Student.counter++;
		
		System.out.println(chenC);
		
		Student ralphB = new Student();
		ralphB.lastName = "Bausas";
		ralphB.firstName = "Ralph";
		ralphB.course = "BS CSE";
		ralphB.yearLevel= 3;
		Student.counter++;
		
		System.out.println(ralphB);
		
		Student nathanR = new Student();
		nathanR.lastName = "Remante";
		nathanR.firstName = "Nathan";
		nathanR.course = "BS CS-SE";
		nathanR.yearLevel= 2;
		Student.counter++;
		
		System.out.println("\n" + nathanR);
		System.out.println("\n\nTotal Students: " + 
				(Student.counter));
		
		//to call the testMethod inside static block
		new AccessStudent().testMethod();
		
	}
	
	public static void main(String[] args) {
		main("test");
	}
	
	public static void main(String args) {
		System.out.println("main method with no param");
		main();
	}
	
	public static void main() {
		System.out.println("Main method with no param");
		
	}
	
	static {
		System.out.println("This is the static block.");
	}
	
	public void testMethod() {
		System.out.println("this is a test method.");
		
	}
	

}
