package com.bpi.main;

import com.bpi.forex.utility.BPIForexValues;
import com.bsp.forex.regulations.ForexContract;

public class BPIForexBean implements BPIForexValues, ForexContract {
	private double phpAmount;
	private String currencyType;
	private double amountConverted;
	
	
	
	public double getPhpAmount() {
		return phpAmount;
	}

	public void setPhpAmount(double phpAmount) {
		this.phpAmount = phpAmount;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public double getAmountConverted() {
		return amountConverted;
	}

	public void setAmountConverted(double amountConverted) {
		this.amountConverted = amountConverted;
	}

	@Override
	public void convertMonetaryValue() {
		//TODO need to determine the correct formula
		switch(getCurrencyType()) {
		case "US$":
			setAmountConverted(getPhpAmount() / US$);
			break;// for today
		case "EURO":
			setAmountConverted(getPhpAmount() / EURO);
		    break;// for next week Sept 30
		case "AUS$":
			setAmountConverted(getPhpAmount() / AUS$);
		    break;// for October 7
		case "YEN":
			setAmountConverted(getPhpAmount() / YEN);
			break;// for October 14
		}

	}

	@Override
	public void sayThankYou() {
		System.out.println("Thank you for using the BPI Forex Application.");

	}

}
