package assertion.test;

import java.io.*;


public class AssertionDemo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter age: ");
		int age = Integer.parseInt(reader.readLine());
		
		assert (age > 17) : "Masyado ka pang bata. Wait ka for next election.";
		
		if(age > 18) {
			System.out.println("You can now vote in" 
				+ "the National Elections on May 2016.");
		}
		
	}

}
