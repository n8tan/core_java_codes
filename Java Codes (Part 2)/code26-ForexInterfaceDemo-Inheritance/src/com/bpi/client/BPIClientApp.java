package com.bpi.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bpi.main.BPIForexBean;
import com.bpi.forex.utility.BeanFactory;

public class BPIClientApp {

	public static void main(String[] args) throws IOException{
       
		BufferedReader scan = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter Philippine peso amount: PHP");
		double phpAmount = Double.parseDouble(scan.readLine());
		
		System.out.println("Enter Forein Currency Type(US$, EURO, AUS$, YEN): ");
		String currencyType = scan.readLine();
		
		
		
		BPIForexBean forex = BeanFactory.getInstance(phpAmount, currencyType);
		
		System.out.println("The Philippine peso amount of "
				+ forex.getPhpAmount() + "is equivalent to "
				+ forex.getCurrencyType() + forex.getAmountConverted() + "\n");
		
		forex.sayThankYou();
		

	}

}
