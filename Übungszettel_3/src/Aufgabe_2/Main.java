package Aufgabe_2;

public class Main {

	public static void main(String[] args) {
		
		Sheep sheep = new Sheep("Herbert", new Fur(10));
		Sheep clonedSheep = sheep.clone();
		Sheep deepClone = sheep.deepCopy();
		
		System.out.println(sheep.toString());
		System.out.println(clonedSheep.toString());
		
		clonedSheep.name = "Hans";
		clonedSheep.shear();
		
		System.out.println(sheep.toString());
		System.out.println(clonedSheep.toString());
		
		//oh Wunder, da wir eine Referenz auf das sheep übergeben haben sind beide objecte die selben
		/* shallow kopieren in dem ein pointer auf das Objekt übergeben wird, wie im obrigen Fall, wo
		 * beide Objekte Referenzen auf das selbe Objekt im Speicher zeigen. In Java bezeichnet man ein
		 * shallow copy Objekt als Alias auf das originale Objekt
		 * 
		 * deep copy bezeichnet das kopieren(duplizieren) des Codes im Speicher
		 */
		
		System.out.println(deepClone.toString());
		
		/* Das interface Cloneable forder von der implementierden Klasse, dass das Objekt der Klasse 
		 * kopiert werden kann und dafür die Methode Clone implementiert. s
		 */
	}

}
