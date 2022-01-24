package de.telekom.sea7.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

import de.telekom.sea7.implementation.OutOfRangeException;

public interface Zahlungen extends Iterable {
	
	void addZahlung(Object zahlung) throws Exception;
	
	Object get(int position) throws OutOfRangeException;
	
	Iterator iterator();
	ArrayList<Object> getPaymentsList();

}
