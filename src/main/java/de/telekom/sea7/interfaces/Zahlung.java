package de.telekom.sea7.interfaces;

public interface Zahlung {
	
	String getEmpfaenger() throws Exception;
	String getEmpfaengerIBAN() throws Exception;
	String getEmpfaengerBIC() throws Exception;
	double getBetrag() ;
	String getWaehrung() throws Exception;
	String getVerwendungszweck() throws Exception;

}
