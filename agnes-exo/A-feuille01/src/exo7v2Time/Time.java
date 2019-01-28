package exo7v2Time;

import java.util.Scanner;

public class Time {
	
	public static void main(String[] args) {
		

		/*Crée une variable nombre aléatoire entre 0 et 1000 
		 * 01 - crée une  variable nombre aleatoire entre 0 et 1000
		 * 02 - crée un system.out , demande de la saisis
		 * 03 - crée une saisis utilisateur
		 * 04 - crée une condition de limite sur la saisis entre O et 1000
		 * 05 - crée une condition pour comparer la saisie avec le nombre mystere
		 * 06 - Boucler pour que le programme recommence si le chiffre n'est pas bon 
		 * 07 - Compter le nombre de tour 
		 * 08 - un booléen pour sortir de la boucle si saisis ==  le nombre aleatoire est correct
		 */

		//Instanciation//
		//Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		//Declaration des variable//
			//Divers façon de randomiser//
			int nbAleatoire;

		int saisis;
		boolean verif = true;
		int count = 0;
		long countStart = 0;
		long countEnd = 0;
		
		//Debut du compteur//
		countStart = System.currentTimeMillis();
		
		
		
		//Etape 01// 
		nbAleatoire = (int) (Math.random() * 1000); // Casting solution simple
		System.out.println(nbAleatoire); //Affiche le résultat//
		//Debut Etape 06//
		while(verif) {
			//Etape 02//
			System.out.println("Quel est le nombre mystere (entre 0 et 1000)"); // Demande de saisis 

			//Etape 03//

			saisis = sc.nextInt();

			//Etape 04//
			//NB : La double esperluette verifie la condition deux meme si la premiere est fausse //
			// Il en est de meme avec ou ( || )

			if(saisis >= 0 && saisis <= 1000) {
				//Etape: O5//
				if(saisis > nbAleatoire) {
					System.out.println("C'est moins");
					
				}else if (saisis < nbAleatoire) {
					System.out.println("C'est plus !");
					
				}else {
					System.out.println("Bravo vous avez trouver le bon nombre : " + nbAleatoire +"\nIl vous a fallus " + count + "coups");
					verif = false;
				}

			}else {
				System.out.println("Votre saisis est incorecte !");
			}
			count++;
			//Fin etape 06//
		}
		
		//Fin du compteur//
		countEnd = System.currentTimeMillis();
		long countTime = (countStart - countEnd)/1000;
		System.out.println("difference entre stamp début et stamp fin " + (countTime - (countTime * 2)) + " seconde");
		sc.close();
		
		//Testing things Affichage//
		//System.out.println("Nombre aléatoire 1" + nbAleatoire + "\n(int) (Math.random() * 1000)"); //Solution
		

		
	}
}
