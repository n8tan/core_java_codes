package com.bpi.forex.utility;

import com.bpi.main.BPIForexBean;
public class BeanFactory {

	public static BPIForexBean getInstance(double phpAmount, String currencyType) {
		
		BPIForexBean forex = new BPIForexBean();
		forex.setPhpAmount(phpAmount);
		forex.setCurrencyType(currencyType);
		forex.convertMonetaryValue();
		
		return forex;
	}
}
