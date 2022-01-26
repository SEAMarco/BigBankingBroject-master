package de.telekom.sea7.interfaces;

import java.io.IOException;

public interface ZahlungenView {
	void multiOutput(Zahlungen zahlungen) throws Exception;
	void multiExport(Zahlungen zahlungen) throws IOException, Exception;
	Zahlungen testZahlungen();
}
