package controller;

import model.Student;

public class ComparingObjectsDemo {

	public static void main(String[] args) {
		
		//declaring variables x,y, and z of type Student
		
		Student x = new Student();
		Student y = x;
		Student z = y;
		
		//Using the reflexive property
		if (x.equals(x)) {
			System.out.println("Reflexive property: x is the same as x.");
		} else {
			System.out.println("Reflexive property: x is the NOT same as x.");
		}

		//Using the symmetric property
		if (x.equals(y)&&y.equals(x)) {
			System.out.println("Symmetric property: x is the same as y and."
				+ " y is the same as x");
		} else {
			System.out.println("Symmetric property: x is the NOT same as y and"
				+ " y is the NOT same as x");
		}
		
		//using the transitive property
		if (x.equals(y)&&y.equals(z)&&x.equals(z)) {
			System.out.println("Transitive property: x is the same as y,"
					+ " y is the same as z and x is the same z.");
			
		} else {
			System.out.println("Transitive property: x is the NOT same as y,"
					+ " y is the NOT same as z and is the NOT same z.");	
		}
		
		x.lastName = "Villanueva";
		x.firstName = "Josiah";
		
		y.lastName = "Villanueva";
		y.firstName = "Jolo";
		
		if (x.lastName.equals(y.lastName)) {
			System.out.println("Lastnames are the same using equals().");
		} else {
			System.out.println("Lastnames are NOT the same using equals().");
		}
		
		if (x.lastName == y.lastName) {
			System.out.println("Lastnames are the same using ==.");
		} else {
			System.out.println("Lastnames are NOT the same using ==.");
		}
		
		System.out.println("Hash value of x:" + x);
		System.out.println("Hash value of y:" + y);	
		System.out.println("Hash value of z:" + z);
		
		//another String comparison
		String msg1 = "Hello World";
		String msg2 = new String("Hello World");
		//.equals() checks the reference while == checks the content.
		if (msg1.equals(msg2)) {
			System.out.println("Are the same using equals()");
		} else {
			System.out.println("Are NOT the same using equals()");
		}
		
		if (msg1 == msg2) {
			System.out.println("Are the same using ==");
		} else {
			System.out.println("Are NOT the same using ==");
		}
		
		//using getClass() and getName of an object type
		String classStudentInfo = x.getClass().getName();
		System.out.println("Class Info: " + classStudentInfo);
		
		String classStringInfo = msg1.getClass().getName();
		System.out.println("Class Info: " + classStringInfo);
	}

}
