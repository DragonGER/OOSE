package Aufgabe_4;

public class Singleton {
	
	private static Singleton _instance = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(_instance == null) {
			_instance = new Singleton();
		}
		return _instance;
	}
}
