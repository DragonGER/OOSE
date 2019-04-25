package Aufgabe_4;
public class Schifffahrtsamt {
	
	private Schiff[] schiffliste;
		
	public Schifffahrtsamt() {
		schiffliste = new Schiff[50];
	}
	
	public void regestriereSchiff(Schiff schiff) {
		for(int i = 0; i < schiffliste.length; i++) {
			if(schiffliste[i] == null) {  //prüfe ob die array stelle leer ist
				schiffliste[i] = schiff;
				System.out.println(String.format("Schiff an der Stelle %d eingefügt", i));
				return;
			}
		}
		System.out.println("Schiff konnte nicht eingefügt werden, das Array ist voll!");
	}
		
	public void meldung (String nachricht, int dringlichkeit) {
		if(dringlichkeit == 1) {
			for(int i = 0; i < schiffliste.length; i++) {
				if(schiffliste[i] != null) schiffliste[i].empfangeNachricht(nachricht); //null-check des array slots
			}
		}
	}
		
	public static String getKennzeichen() {
		java.util.Random rnd = new java.util.Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 6; i++) {
			sb.append((char)((rnd.nextInt(25)+65)));
		}
		return sb.toString();
	}
}