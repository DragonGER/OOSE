package Aufgabe_2;

public class Quader extends Koerper {

	private int kantenlaenge;
	
	public Quader(Vector3 position, int kantenlaenge) {
		super(position);
		this.kantenlaenge = kantenlaenge;
	}
	
	
	@Override
	public void verschiebe(Vector3 k) {
		p.x += k.x;
		p.y += k.y;
		p.z += k.z;
	}

	@Override
	public void skaliere(int a) {
		kantenlaenge *= a;
	}

	@Override
	public String berechneVolumen() {
		int volumen = kantenlaenge * kantenlaenge * kantenlaenge;
		return String.format("Das Volumen des Quaders beträgt: %d", volumen);
	}

	@Override
	public String toString() {
		String format = String.format("%s\n%s\n[%d,%d,%d]\n", "Quader", berechneVolumen(), p.x, p.y, p.z);
		System.out.println(format);
		return format;
	}

}
