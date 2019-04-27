package Aufgabe_2;

public class Aufgabe_2 {

	public static void main(String[] args) {
		double a = 6.5f;
		double b = 6.5;
		double c = 6.4f;  //6.4f kann nicht ohne Verlust der Genauigkeit in double konvertiert werden
		double d = 6.4;
		
		System.out.println("Prüfe a="+a+ " und b="+b);
		if(a == b) {
			System.out.println("sind gleich!");
		} else {
			System.out.println("sind ungleich");
		}
		System.out.println("Prüfe c="+c+ " und d="+d);
		if(c == d) {
			System.out.println("sind gleich!");
		} else {
			System.out.println("sind ungleich");
		}
	}
}
