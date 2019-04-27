package Aufgabe_3;

public class Aufgabe_3 {

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Fehler: Nicht genug Argumente!");
			return;
		}
		long a = Long.parseLong(args[0]);
		long b = Long.parseLong(args[1]);
		System.out.println("Ergebnis:"+ Euklid(a,b));
	}
	
	public static long Euklid (long a, long b) {
		if (a == 0)  {
			return b;
		} else {
			while (b != 0) {
				if(a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
			return a;
		}
	}

}
