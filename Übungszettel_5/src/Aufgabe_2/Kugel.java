package Aufgabe_2;

public class Kugel extends Koerper {
	
	private int radius;
	private final double pi = 3.14;
	public Kugel(Vector3 position, int radius) {
		super(position);
		this.radius = radius;
	}
	
	@Override
	public void verschiebe(Vector3 k) {
		if(k == null) return;
		this.p.x += k.x;
		this.p.y += k.y;
		this.p.z += k.z;
	}
	
	@Override
	public void skaliere(int a) {
		radius *= a;
	}
	
	@Override
	public String berechneVolumen() {
		double volumen = 2.0 * pi * (double)radius;
		return String.format("Das Volumen der Kugel beträgt: %.2f", volumen);
	};
	
	@Override
	public String toString() {
		String format = String.format("%s\n%s\n[%d,%d,%d]\n", "Kugel", berechneVolumen(), p.x, p.y, p.z);
		System.out.println(format);
		return format;
	}
}
