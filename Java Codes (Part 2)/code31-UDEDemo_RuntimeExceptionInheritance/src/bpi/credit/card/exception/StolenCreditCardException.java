package bpi.credit.card.exception;

import bpi.credit.card.exception.messages.CreditCardExceptionMessages;

@SuppressWarnings("serial")
public class StolenCreditCardException extends RuntimeException implements
	CreditCardExceptionMessages{
	
	public StolenCreditCardException() {
		super(STOLEN_CREDIT_CARD);
	}
	
	public StolenCreditCardException(String message) {
		super(message);
	}
}
