package de.telekom.sea7.implementation;

import java.io.IOException;

import de.telekom.sea7.interfaces.Application;
import de.telekom.sea7.interfaces.MenuView;
import de.telekom.sea7.interfaces.ZahlungView;
import de.telekom.sea7.interfaces.Zahlungen;
import de.telekom.sea7.interfaces.ZahlungenView;

public class ApplicationImpl implements Application {
	
	private MenuView menuView = new MenuViewImpl();
	
	public void run(String[] args) throws Exception, IOException {
		
		menuView.menu();
		

	}

}
