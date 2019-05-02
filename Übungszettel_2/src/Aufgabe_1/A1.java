package Aufgabe_1;

public class A1 {

	static long fak(long n) {
		if(n==1) {
			return 1;
		} else {
			return n*fak(n-1);
		}
	}

	static long bio(long n, long k) {
		if(n<k) {
			return 0;
		} else {
			return fak(n)/(fak(k)*fak(n-k));
		}
	}

	static long lotto(long n, long k) {
		return bio(n,k)+fak(k);
	}
	
	public static void main(String[] args) {
		System.out.println(fak(10));
		System.out.println(bio(8,4));
		System.out.println(lotto(49,7));
	}
}