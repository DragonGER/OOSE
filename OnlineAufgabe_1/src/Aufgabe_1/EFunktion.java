package Aufgabe_1;

import java.math.*;

public class EFunktion implements IFunction {
	
	private double a;
	private double b;
	//private Boolean isDerivate;
	
	public EFunktion(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double evaluate(double x) {
		return a* Math.pow(Math.E, b * x); // a * e ^ b * x
	}

	@Override
	public EFunktion derivate() {
		EFunktion function = new EFunktion(a * b, b);
		return function;
		
	}
	
	public void druckeWerteTabelle(int inner, int outer) {
		if(inner >= outer) return;
		System.out.println("Tabelle: ");
		for(;inner < outer + 1; inner++) {
			System.out.println(this.evaluate(inner)+ " ");
		}
		System.out.println("-----------");
	}
	
	public void druckeGraph(int inner, int outer) {
		if(inner >= outer) return;
		
		System.out.println("Drucke Graphen...\n");
		long[] temp = new long[Math.abs(outer) - Math.abs(inner)];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = Math.round(this.evaluate(inner));
			inner++;
		}
		for(int i = 0; i < temp.length; i++) {
			System.out.print("\n"+i+":");
			for(int j = 0; j < (temp[i]-1); j++) {
				System.out.print(" ");
			}
			System.out.print("o");
		}
	}
	
	public EFunktion nteLeitung(EFunktion function, int n) {
		if(n < 1) return null;
		System.out.println(String.format("%.2f*e^%.2f*x", function.a, function.b));
		function.druckeGraph(0, 2);
		function.druckeWerteTabelle(0, 2);
		return function.nteLeitung(function.derivate(), n-1);
	}

}
