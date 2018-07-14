package com.bsp.forex.regulations;

import com.bpi.forex.utility.BPIForexValues;

public interface ForexContract extends BPIForexValues{
	
    //implicitly defined as public abstract void convertMonetaryValue(); 
	void convertMonetaryValue();
	
	//implicitly defined as public abstract void sayThankYou();
	void sayThankYou();
	
}
