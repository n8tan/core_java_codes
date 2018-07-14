package sm.dept.store;

import bpi.credit.card.operations.BPICCOperationImpl;
import bpi.credit.card.exception.ExpiredCreditCardException;
import bpi.credit.card.exception.StolenCreditCardException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.awt.*;

public class SMDeptStore {

	public static void main(String[] args) {
			
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		try {
			Toolkit.getDefaultToolkit().beep();
			System.out.println("Enter your credit card number: ");
			String creditCard = reader.readLine();
			
			Toolkit.getDefaultToolkit().beep();
			System.out.println("Enter total purchase amount: ");
			double amount = Double.parseDouble(reader.readLine());
			
			//now call the payPurchase of BPI
			new BPICCOperationImpl().payPurchase(creditCard, amount);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExpiredCreditCardException ecce) {
			System.err.println(ecce.getMessage());
		} catch (StolenCreditCardException scce) {
			System.err.println(scce.getMessage());
		}
		displayThankYou();
	}
	
	private static void displayThankYou() {
		System.out.println("Thank you for shopping at SM Department Store.");
		System.out.println("Beause here at SM, we've got it all for you!!!!");
	}

}
