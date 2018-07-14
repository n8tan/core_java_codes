package security.controller;

import security.helper.*;
import security.model.*;

import java.util.*;
import java.io.*;
import java.beans.*;

public class RegisterEmployeeAccess {

	public static void main(String[] args) throws Exception {
		
		//EmployeeAccount employee = inputRecord();
		
		//persisting it to a hierarchical XML database
		//saveEmployeeToXMLDatabase(employee);
		readEmployeeFromXMLDatabase();
			
	}
	
	public static EmployeeAccount inputRecord() {
		String userId = input("Enter user ID:");
		String password = Security.encrypt(input("Enter user password:"));
		String lastName = input("Enter last name:");
		String firstName = input("Enter first name:");
		String position = input("Enter position:");
		String department = input("Enter department:");
		
		EmployeeAccount employee = 
				new EmployeeAccount(userId, password, lastName, firstName, position, department);
		
		return employee;
	}
	
	public static String input(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.print(message);
		String inputValue = scan.nextLine();
		return inputValue;
	}
	
	public static void saveEmployeeToXMLDatabase(EmployeeAccount empleyado) 
		throws Exception {
		
		XMLEncoder encoder = new XMLEncoder(
                new BufferedOutputStream(
                   new FileOutputStream(
                		"D:\\zalameda-corejava-se21\\EmployeeDB.xml")));
		encoder.writeObject(empleyado);
		encoder.close();
	}
	
	public static void readEmployeeFromXMLDatabase() throws Exception {
		XMLDecoder decoder = new XMLDecoder(
            new BufferedInputStream(
            new FileInputStream("D:\\zalameda-corejava-se21\\EmployeeDB.xml")));
		EmployeeAccount result = (EmployeeAccount) decoder.readObject();
		
		System.out.println("Employee ID: " + result.getUserId());
		System.out.println("Employee Password: " + Security.decrypt(result.getPassword()));
		System.out.println("Employee Lastname: " + result.getLastName());
		System.out.println("Employee Firstname: " + result.getFirstName());
		System.out.println("Employee Position: " + result.getPosition());
		System.out.println("Employee Department: " + result.getDepartment());		
		decoder.close();
	}	
}
