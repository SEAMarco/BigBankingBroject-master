package de.telekom.sea7.implementation;

import de.telekom.sea7.interfaces.Zahlung;
import de.telekom.sea7.interfaces.ZahlungView;

public class ZahlungViewImpl implements ZahlungView {

	
	public String singleOutput(Zahlung zahlung) throws Exception {

		return "Empfänger: " + zahlung.getEmpfaenger() + "\nIBAN Empfänger: " + zahlung.getEmpfaengerIBAN()
				+ "\nBIC Empfänger: " + zahlung.getEmpfaengerBIC() + "\nBetrag: " + zahlung.getBetrag() + " "
				+ zahlung.getWaehrung() + "\nVerwendungszweck: " + zahlung.getVerwendungszweck();

	}
	
	public Zahlung testZahlung() {
		return new ZahlungImpl("Testkunde", "TestIBAN", "TestBIC", 222.22, "Eruo", "Test Verwendung");
	}
}	
