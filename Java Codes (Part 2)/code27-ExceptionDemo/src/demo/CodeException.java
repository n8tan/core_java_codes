package demo;

import java.io.*;

public class CodeException {

	public static void main(String[] args) {
		
		int iNum1 = 6;
		int iNum01 = 0;
		
		try {
			System.out.println("Quotient is " + (iNum1 / iNum01));
		} catch (ArithmeticException ae) {
			System.err.println("HEY!!! Exception is " + ae.getMessage());
			
			try {
				BufferedReader reader = new
				BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter a number: ");
				String strInput = reader.readLine();
				
				int iNum2 = Integer.parseInt(strInput);
				
				System.out.println("Quotient is " + (iNum1 / iNum2));
			} catch (IOException ioe) {
				System.err.println("IOException is " + ioe.getMessage());
			} catch (NumberFormatException nfe) {
				System.err.println("Not convertible to a double data type");
				System.err.println("NFException is " + nfe.getMessage());
			} catch (Exception e) {
				System.err.println("General exeption occured: " + e.getMessage());
			}
			
			System.out.println("inside catch statement");
		} catch (Exception e) {
			System.err.println("General exception occured: " + e.getMessage());
		} finally {
			System.out.println("Using exceptions are easy");
		}
		System.out.println("Program is finished.");
		
		
		
		
		
		
		String input = "invalid input";
		try {
			if  (input.equals("Invalid input")) {
				throw new RuntimeException("throw exception demo");
			} else {
				System.out.println(input);
			}
			System.out.println("After throwing");
		} catch (RuntimeException e) {
			System.out.println("Exception caught here.");
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		/*
		try {
			System.out.println(args[1]);
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.err.println("Invalid index number: non-existent");
			System.err.println("Message Exception: " + aiobe.getMessage());
		} finally {
			System.out.println("Please check your index number target");
		}
		*/
	}
	


}
