package Aufgabe_1;

public class Aufgabe_1 {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Fehler: Zu wenige Argumente");
			return;
		}
		long a = Long.parseLong(args[0]);
		long result = fakultaet(a);
		System.out.println(result);
	}
	
	public static long fakultaet(long n) {
		if (n < 0) return -1;
		if(n == 0) return 1;
		return fakultaet(n-1) * n;
	}

}
