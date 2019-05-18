package Aufgabe_1;

public class Praktikant extends Angestellter {

	private final int gehalt;
	public Praktikant(String vorname, String nachname, int alter) {
		super(vorname, nachname, alter, 400);
		this.gehalt = 400;
	}
	
	@Override
	public void gehaltErhoehen(int anpassung) {
		System.out.println("Das gehalt von Praktikanten kann nicht verändert werden");
	}
	
}
