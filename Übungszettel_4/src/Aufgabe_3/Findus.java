package Aufgabe_3;

public class Findus {
	public static Comparable findMin(Comparable[] x) {
		if(x.length == 0) return null;
		if(x.length == 1) return x[0];
		Comparable min = x[0];
		for(int i = 0; i < x.length - 1; i++) {
			if(x[i].compareTo(min) < 0)
				min = x[i];
		}
		return min;
	}
}
