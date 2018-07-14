package bpi.credit.card.operations;

import bpi.credit.card.exception.ExpiredCreditCardException;
import bpi.credit.card.exception.StolenCreditCardException;

public class BPICCOperationImpl implements BPICCOperation {

	@Override
	public boolean payPurchase(String creditCard, double amount)
			throws ExpiredCreditCardException, StolenCreditCardException {
		
		System.out.println("Welcome to BPI Credit Card Operations....");
		if (creditCard.equals("111-111-1111")) { //tagged as stolen
			throw new StolenCreditCardException("Nakaw ang credit card na ito. Hulihin "
					+ "at bugbugin ang kriminal na ito. I-bartolino kasama si Koko na makulit sa presinto.");
		} else if(creditCard.equals("222-222-2211")) { //tagged as expired
			throw new ExpiredCreditCardException("Expired ang credit card na ito. Kumuha ng gunting at gupitin"
					+ "at gupitin para hindi na magami pa.");
		} else {
			System.out.println("Credit card " + creditCard + " accepted.");
			System.out.println("Thank you for payin the amoun of " + amount + ".");
			promoteUseOfCard();
		}
		
		return true;
	}
	
	private void promoteUseOfCard() {
		System.out.println("\n\nKeep on using your card for more freebies.");
		System.out.println("\n\nFor transations P2,500. you have the choice of 1-Piece Chickenjoy with Rice & Gravy OR"
				+ "1 Cheesy Bacon Mushroom Yum");
		System.out.println("\n\nFor transactions P6,000. you have the choice of 2 orders of 1-Piece Chickenjoy with Rice & Gravy + 2 Peach Mango Pie OR"
				+ "2 orders of Cheesy Bacon Mushroom Yum + 2 Regular Fries + 2 Regular Softdrinks");
		System.out.println("\n\nFor transactions P12,000. you have the choice of 1 Bucket Treats Super Special: 6-Piece Chickenjoy Bucket + 3 Plain Rice + 3 Regular Softdrinks OR"
				+ "4 orders of Cheesy Bacon Mushroom Yum + 4 Regular Fries + 4 Regular Softdrinks");
	}

}
