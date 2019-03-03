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
		int choiceConvert = 0;
		boolean again = true ;
		int celsius;
		double fahr = 0.0;

		System.out.println("Veuillez choisir la conversion a effectuer;"
				+ "\n 1 - Conversion Fahrenheit vers Celsius"
				+ "\n 2 - Convertion Celsius vers Fahrenheit");

		
		while(again) {
			while(again) {
				choiceConvert = sc.nextInt();
				if(choiceConvert == 1) {
					System.out.println("Merci d'entrée le nombre que vous souhaiter convertir");
					fahr = sc.nextDouble();
					System.out.println(conversionCelsius(fahr));
					again = false;
				}else if (choiceConvert == 2) {
					System.out.println("Merci d'entrée le nombre que vous souhaiter convertir");
					celsius = sc.nextInt();
					System.out.println(conversionCelsius(celsius));
					again = false;
				}else {
					System.out.println("Saisis incorecte merci de recommencer !");
				}
			}	
			System.out.println("Voulez vous faire une nouvelle converion ?");	
			choiceConvert = sc.nextInt();	

			if(choiceConvert == 1 ) {
				System.out.println("Le programme va recommencer");
				again = true;

			}else {
				System.out.println("Au revoir !");
				again = false;
			}

		}


	}

}
