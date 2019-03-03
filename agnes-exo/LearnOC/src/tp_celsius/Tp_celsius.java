package tp_celsius;

import java.util.Scanner;

public class Tp_celsius {

	public static Scanner sc = new Scanner(System.in);

	public static double arrondi(double A, int B) {
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

	public static double conversionCelsius(double fahr) {
		
		
		double celsius = (fahr - 32) * 5 / 9;

		return (int)celsius;
	}

	public static double conversionFahrenheit(double celsius) {
		
		double fahr = (1.8 * celsius) + 32;
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
		boolean againLast = true;
		double nbAConvertir;




		while(again) {
			while(again) {
				System.out.println("Veuillez choisir la conversion a effectuer;"
						+ "\n 1 - Conversion Fahrenheit vers Celsius"
						+ "\n 2 - Convertion Celsius vers Fahrenheit");
				
				choiceConvert = sc.nextInt();
				
				if(choiceConvert == 1) {
					System.out.println("Merci d'entrée le nombre que vous souhaiter convertir");
					nbAConvertir = sc.nextDouble();
					System.out.println(conversionCelsius(nbAConvertir));
					again = false;
				}else if (choiceConvert == 2) {
					System.out.println("Merci d'entrée le nombre que vous souhaiter convertir");
					nbAConvertir = sc.nextDouble();
					System.out.println(conversionFahrenheit(nbAConvertir));
					again = false;
				}else {
					System.out.println("Saisis incorecte merci de recommencer !");
				}
				
			}	
			System.out.println("Voulez vous faire une nouvelle converion ?"
					+ "\n 1 - OUI"
					+ "\n 2 - NON");	
			choiceConvert = sc.nextInt();	
			againLast = true;
			while(againLast) {
				if(choiceConvert == 1 ) {
					System.out.println("Le programme va recommencer");
					againLast = false;
					again = true;
					
				}else if (choiceConvert == 2) {
					System.out.println("Au revoir !");
					againLast = false;
				}else {
					System.out.println("Erreur dans la saisis merci de recommencer");
				}
			}
		}


	}

}
