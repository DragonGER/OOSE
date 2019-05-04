package Aufgabe_4;

public class Singleton2 {
	
	private static Singleton2 _instance = new Singleton2();
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		return _instance;
	}
}
