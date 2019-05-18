package Aufgabe_1;

public class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	public Angestellter(String vorname, String nachname, int alter, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
	
	public String getNachname() {
		return nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public int getAlter() {
		return alter;
	}
	public int getGehalt() {
		return gehalt;
	}
	
	public void altern() {
		this.alter += 1;
	}
	
	public void gehaltErhoehen(int anpassung) {
		this.gehalt += anpassung;
	}
}
