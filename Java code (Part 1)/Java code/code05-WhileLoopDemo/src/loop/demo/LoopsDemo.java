package loop.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LoopsDemo {

	public static void main(String[] args) throws IOException{
		BufferedReader input
		 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your name: ");
		String name = input.readLine().toUpperCase().trim();
		
		System.out.print("Enter your favorite number: ");
		int faveNumber = Integer.parseInt(
				input.readLine().toUpperCase().trim());
		
		performWhileLoop(name, faveNumber);

	}
	
	public static void performWhileLoop(String name, int repeat) {
		int counter = 1;
		
		while (counter <= repeat) {
			System.out.println(counter + ". Hello, " + name);
			counter++;
		}
	}

}
