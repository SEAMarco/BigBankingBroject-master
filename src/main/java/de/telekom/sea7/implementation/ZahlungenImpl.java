package de.telekom.sea7.implementation;

import java.util.ArrayList;
import java.util.Iterator;

import de.telekom.sea7.interfaces.Zahlungen;

public class ZahlungenImpl implements Zahlungen, Iterable {

	ArrayList<Object> paymentsList = new ArrayList<>();

	public void addZahlung(Object zahlung) throws Exception {
		if (paymentsList.size()== 3) {
			throw new Exception("Limit erreicht");
		}
		paymentsList.add(zahlung);
	}

	public ArrayList<Object> getPaymentsList() {
		return paymentsList;
	}

	public Object get(int position) throws OutOfRangeException {
		if (position >= 0 && position < this.size()) {
			return paymentsList.get(position);
		} else {
			throw new OutOfRangeException("Die Position ist ausserhalb des gültigen Bereiches.");

		}
	}

	public int size() {
		return paymentsList.size();
	}

	public Iterator iterator() {
		return paymentsList.iterator();
	}

}
