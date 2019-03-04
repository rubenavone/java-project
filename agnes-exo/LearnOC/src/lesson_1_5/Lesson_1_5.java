package lesson_1_5;

import java.util.Scanner;

public class Lesson_1_5 {

	public static void main(String[] args) {
		/*
		 * Les boucles 
		 */

		//While//
		/*
		 * Le but d'une boucle et de répéter un certain nombre de fois 
		 * une action, il faut évidement que celle-ci ai une condition d'arret
		 * autrement on ce retrouve dans une boucle infinis 
		 */

		int i = 0;

		while(i < 10 ) {
			i++;
			System.out.println("Bonjour !");
		}

		//Vous l'aurez compris cette boucle va ce répéter dix fois 

		/*
		 * L'exemple de Oc
		 */

		//variable vide
		String prenom;

		//On initialise celle-ci à 0 pour oui

		char reponse = 'O'; //Toujours des simple quote pour les char

		//Init de l'objet scanner , il faut importer java.util.Scanner

		Scanner sc = new Scanner(System.in);

		//Tant que la réponse donnée est égale à oui alors 
		while( reponse == 'O') {
			//On affiche une instruction 
			System.out.println("Donnez une prénom:");

			prenom = sc.nextLine();

			//On affiche notre phrase avec le prénom

			System.out.println("Bonjour " + prenom + " ,Comment va tu ?");
			
			reponse = ' ';

			while( reponse != 'O' && reponse != 'N') {
				// On demande si la personne veut faire un autre essaie 

				System.out.println("Voulez vous faire un autre essaie ? (O/N)");

				//On récupère la saisie de l'utilisateur 
				reponse = sc.nextLine().charAt(0); // Particularité on récupere la premiere lettre du sc

			}
		}

		System.out.println("Au revoir !");
		//Fin de la boucle 
	}

}
