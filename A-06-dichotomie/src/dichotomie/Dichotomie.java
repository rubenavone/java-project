package dichotomie;

//Importation des diverses classe//
//Il est possible d'importer toutes les classe d'un package d'un coup avec l'etoile (import java.util.*)
import java.util.Random;
import java.util.Scanner;

public class Dichotomie {

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
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		//Declaration des variable//
			//Divers façon de randomiser//
			int nbAleatoire;
			int nbAleatoire2;
			double nbAleatoire3;
			int nbAleatoire4;
		int saisis;
		boolean verif = true;
		int count = 0;
		
		//Etape 01// 
		nbAleatoire = (int) (Math.random() * 1000); // Casting solution simple
		nbAleatoire2 = (int) Math.floor(Math.random() * 1001);
		nbAleatoire3 = Math.random() * 1001;
		nbAleatoire4 = rand.nextInt(1001);


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
					System.out.println("Bravo vous avez trouver le bon nombre : " + nbAleatoire + c);
					verif = false;
				}

			}else {
				System.out.println("Votre saisis est incorecte !");
			}
			count++;
			//Fin etape 06//
		}

		//Testing things Affichage//
		System.out.println("Nombre aléatoire 1" + nbAleatoire + "\n(int) (Math.random() * 1000)"); //Solution
		System.out.println("Nombre aléatoire 2" + nbAleatoire2 + "\n(int) Math.floor(Math.random() * 1001)"); //solution 2
		System.out.println("Nombre aléatoire 3" + nbAleatoire3 + "\nMath.random() * 1001;"); //solution 3
		System.out.println("Nombre aléatoire 4" + nbAleatoire4 + "\nrand.nextInt(1001);"); //solution 4

	}

}
