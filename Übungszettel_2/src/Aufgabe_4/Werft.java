package Aufgabe_4;
public class Werft {
		
	public void produziereSchiff(String name, double laenge, Schifffahrtsamt amt) {
		Schiff schiff = new Schiff(name, laenge);
		amt.regestriereSchiff(schiff);
		schiff.setKennzeichen(Schifffahrtsamt.getKennzeichen());
	}
		
}