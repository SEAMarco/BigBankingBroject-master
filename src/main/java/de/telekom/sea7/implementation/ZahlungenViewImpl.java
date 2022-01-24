package de.telekom.sea7.implementation;

import de.telekom.sea7.interfaces.Zahlung;
import de.telekom.sea7.interfaces.Zahlungen;
import de.telekom.sea7.interfaces.ZahlungenView;

public class ZahlungenViewImpl implements ZahlungenView {

	public void multiOutput(Zahlungen zahlungen) throws Exception {
        for (Object multiPayment : zahlungen) {
            Zahlung tempZahlung = (Zahlung)multiPayment; // Besonderheit wenn man Objekt aus dem Array holt muss man ihnen wieder sagen was sie sind!
            System.out.println(tempZahlung.getEmpfaenger() + " " + tempZahlung.getBetrag() + tempZahlung.getWaehrung());

        
		}

	}

}