package Aufgabe_1;

public class Test {

	public static void main(String[] args) {
		C1 a=new C2();
		C2 b=new C2();
		
		((C2) a).f1(); //C2::f1
		((C1) b).f1(); //C2::f1
		System.out.println(a.s); //1
		b.f1(); //C2::f1
		b.f2(); //C1::f2
		b.f3(); //C2:f3
		
		/* kann nicht funktionieren C1 besitzt keine Funtkion f3
		C1 c = new C1(); 
		c.f3(); */
		
		/* die Klasse C1 kann nicht zu Klasse C2 gecastet werden 
		C1 c = new C1(); 
		((C2) c).f1(); */
	}
}
