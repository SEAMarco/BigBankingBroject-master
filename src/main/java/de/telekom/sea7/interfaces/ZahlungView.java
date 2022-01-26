package de.telekom.sea7.interfaces;

public interface ZahlungView {
	
	String singleOutput(Zahlung zahlung) throws Exception;
	Zahlung testZahlung();

}
