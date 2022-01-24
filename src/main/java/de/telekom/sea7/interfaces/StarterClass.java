package de.telekom.sea7.interfaces;

import de.telekom.sea7.implementation.ApplicationImpl;
import de.telekom.sea7.implementation.OutOfRangeException;

public class StarterClass {

	public static void main(String[] args) throws Exception {
		
		Application application = new ApplicationImpl();
		
		application.run(args);
	}

}
