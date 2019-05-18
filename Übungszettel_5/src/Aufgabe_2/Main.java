package Aufgabe_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Koerper> liste = new ArrayList<Koerper>();
		liste.add(new Kugel(new Vector3(), 2));
		liste.add(new Kugel(new Vector3(4,3,0), 4));
		liste.add(new Quader(new Vector3(), 15));
		liste.add(new Quader(new Vector3(10, -4, 4), 22));
		
		for(Koerper k: liste) {
			k.toString();
		}
	}

}
