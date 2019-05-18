package Aufgabe_3;

public class Main {

	public static void main(String[] args) {
		double[] array = {0.0, -4.21, 23.12, -3.2, -9.3, 2441.1, 0.0, -10.0};
		printArray(array);
		printArray(someSortOfSelectionSort(array));
	}
	//never trust java and floating point numbers
	// double a = 245.53;
	// if(a == Double.NaN)  => true
	
	public static double[] someSortOfSelectionSort(double[] array) {
		double[] sortedArray = new double[array.length];
		
		double min = 0;
		int index = 0;
		for(int z = 0; z < array.length; z++) {
			//printArray(array);
			for(int i = 0; i < array.length; i++) {
				if(array[i] == Double.POSITIVE_INFINITY) continue;
				min = array[i];
				index = i;
				break;
			}
			for(int i = 0; i < array.length; i++) {
				if(array[i] != Double.POSITIVE_INFINITY && array[i] < min) {
					min = array[i];
					index = i;
				}
			}
			array[index] = Double.POSITIVE_INFINITY;
			sortedArray[z] = min;
		}
	
		return sortedArray;
	}
	
	public static void printArray(double[] array) {
		System.out.println("Array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(",");
		}
		System.out.println("");
	}
}
