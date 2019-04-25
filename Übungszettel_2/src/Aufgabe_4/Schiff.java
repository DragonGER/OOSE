package Aufgabe_4;
public class Schiff {
	
	private String name;
	private String kennzeichen;
	@SuppressWarnings("unused")
	private double laenge;
		
	public Schiff (String name, double laenge) {
		this.name = name;
		this.laenge = laenge;
	}
		
	public void setKennzeichen (String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
		
	public void empfangeNachricht (String msg) {
		System.out.println(String.format("[%s Kennung: %s] Nachricht: %s", this.name, this.kennzeichen, msg));
	}
}