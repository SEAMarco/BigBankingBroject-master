package de.telekom.sea7.interfaces;

import de.telekom.sea7.implementation.OutOfRangeException;

public interface Application {

	void run(String[] args) throws OutOfRangeException, Exception;
	
	

}
