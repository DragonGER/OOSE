package Aufgabe_1;

public class Rechner {

	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Fehler: Zu wenige Argumente!");
			return;
		}
		
		int a = 0;
		int b = 0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
		} catch (NumberFormatException ex) {
			System.out.println("Fehler: Als Eingabe werden nur integer Zahlen akzeptiert!");
			return;
		}
		
		double result = 0.00;
		switch (args[2]) {
			case "+": 
				result = (double)a + b;
				break;
			case "*":
				result = (double)a * b;
				break;
			case "-":
				result = (double)a - b;
				break;
			case ":":
				result = (double)a / b;
				break;
			default:
				System.out.println("Fehler: Operator unbekannt");
				return;
		}
		System.out.println("Ergebnis: "+ result);
	}

}
