package Aufgabe_3;

public class Main {

	public static void main(String[] args) {
		Person a = new Person("Aner", "Paul", 53113, "Endincher Allee", 19);
		Person b = a;
		
		Person c = new Person("Bola", "Tom", 53113, "Endincher Allee", 19);
		Person d = new Person("Aner", "Paul", 53113, "Endincher Allee", 20);
		
		Person[] array = {a, b, c, d};
		
		var e = Findus.findMin(array);
		((Person)e).ToString();

	}

}
