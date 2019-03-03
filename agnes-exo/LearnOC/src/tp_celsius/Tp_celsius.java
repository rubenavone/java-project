package tp_celsius;

import java.util.Scanner;

public class Tp_celsius {
	
	public static Scanner sc = new Scanner(System.in);

	public static double arrondi(double A, int B) {
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
	
	public static int conversionCelsius(double fahr) {
		
		int celsius = 0;
		
		return celsius;
	}
	
	public static double conversionFahrenheit(int celsius) {
		double fahr = 0.0;
		
		return fahr;
		
	}

	public static void main(String[] args) {
		/*
		 * Caracteristique du programme:
		 * demande quelle conversion on veut faire celsius -> fahrenheit ou l'inverse
		 * on n'autorise que les mode de conversion définis par le programme 
		 * enfin on demande a l'utilisateur si il souhaite refaire une conversion
		 */
		
	}
	
}
