package Aufgabe_1;

public class Main {

	public static void main(String[] args) {
		EFunktion function = new EFunktion(0.25, 1.75);
		function.nteLeitung(function, 4);
		//function.druckeWerteTabelle(0, 3);
		//function.druckeGraph(0, 3);
		/*
		function = function.derivate();
		function.druckeWerteTabelle(0, 10);
		function.druckeGraph(0, 10);
		function = function.derivate();
		function.druckeWerteTabelle(0, 10);
		function.druckeGraph(0, 10);
		*/		
	}

}
