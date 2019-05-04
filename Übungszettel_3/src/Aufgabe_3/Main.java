package Aufgabe_3;

public class Main {
	
	public static void main(String[] args) {
		
		Stereoanlage s=new Stereoanlage();
		IPlayable pl=new CD();
		s.play(pl);
		pl=new Kassette();
		s.play(pl);
		
		/* Die Ausgaben sind unterschiedlich da unterschiedliche Klassen das selbe Interface anders implementier haben.
		 * Das interface stellt nur das Klassengerüst zur Verfügung, nicht aber den Inhalt einzelner Methoden
		 */
	}
}
