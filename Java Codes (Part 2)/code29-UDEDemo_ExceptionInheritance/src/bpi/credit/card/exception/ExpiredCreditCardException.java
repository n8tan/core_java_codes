package bpi.credit.card.exception;

import bpi.credit.card.exception.messages.CreditCardExceptionMessages;

@SuppressWarnings("serial")
public class ExpiredCreditCardException extends Exception implements
	CreditCardExceptionMessages{

	public ExpiredCreditCardException() {
		super(EXPIRED_CREDIT_CARD);
	}
	
	public ExpiredCreditCardException(String message) {
		super(message);
	}
}
