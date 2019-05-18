package Aufgabe_2;

public abstract class Koerper {
	public Vector3 p;
	
	public Koerper(Vector3 position) {
		p = position;
	}
	
	public abstract void verschiebe(Vector3 k);
	public abstract void skaliere(int a);
	public abstract String berechneVolumen();
	
	@Override
	public abstract String toString();
}
