package bpi.credit.card.operations;

import bpi.credit.card.exception.StolenCreditCardException;

public interface BPICCOperation {

		boolean payPurchase(String creditCard, double amount);
		
}
