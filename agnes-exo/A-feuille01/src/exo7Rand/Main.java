package exo7Rand;

import java.util.Scanner;
/**
 * La classe main qui fera appel au diverse methode pour
 * résoudre notre probleme.
 *** Le problème :
 *Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier si vous avez deux
 *nombres pairs suivis par un nombre impair. Si ce n’est pas le cas, recommencer jusqu’à
 *ce vous ayez la combinaison pair, pair, impair. Afficher ensuite le nombre d’essais
 *nécessaires pour obtenir cette combinaison.
 *Indice : la classe Math propose la méthode statique random qui génère un nombre
 *aléatoire compris entre 0 et 1.
 *Exemple : double nb=Math.random();
 * 
 *## Comment définir si un nombre est pair ou non 
 * 0, 2, 4, 6, 8
 *donc on verifie seulement le dernier chiffre de notre nombreAVerifier
 *si dernierChiffre == 0,2,4,6,8 
 *	Alors renvoie dans Résultat + pair 
 *Sinon
 *	Renvoie dans Résultat + impair 
 *
 *on peut imaginer une codification booléen 
 *pair = 0;
 *impair = 1;
 *Pour que la sequence soit valide on doit obtenir la serie 001
 *Dans les cas ou la sequence est differente alors c'est un echec
 *
 *
 * @author Ruben navone
 */

public class Main {

	public static void main(String[] args) {
		// Init des variable //

		boolean flag = false;
		int count = 0;
		int nbMaxRand = 0;
		Scanner sc = new Scanner(System.in);

		//Le nombre max est récuperer//

		// Mises en place d'une boucle pour eviter les erreur //
		while(flag == false) {
			System.out.println("Merci de saisir la valeur maximale de votre randomisation");	

			nbMaxRand = sc.nextInt();

				if (nbMaxRand <= 1) {
					System.out.println("Vous ne pouvez pas saisir un chiffre impossible a résoudre");
				}else {
					flag = true;
				}
			
		}

		flag = false;

		// Tant que la sequence est fausse le drapeau est couché le programme essaye a nouveau //

		while(flag == false) { 

			// Compteur pour savoir le nombre d'essaie avant reussite //	
			count++; 

			// Génération des nombres via la méthode Rand.java //
			int rand1 = Rand.randomNumber(nbMaxRand);
			int rand2 = Rand.randomNumber(nbMaxRand);
			int rand3 = Rand.randomNumber(nbMaxRand);

			// Test pour obtenir un résultat valable //

			System.out.println("Nombre aléatoire 1 :  \n" + rand1 +"\n" + "Nombre aléatoire 2 :  \n" + rand2 + "\n" + "Nombre aléatoire 3 : \n"  + rand3);

			sc.close();

			// Génération de la sequence de chiffre via un modulo //
			// Si le chiffre est pair renvoie 0 //
			// Sinon renvoie 1 //

			rand1 %= 2;
			rand2 %= 2;
			rand3 %= 2;

			// J'affiche la suquence //

			System.out.println("Chiffre 1 :  \n" + rand1 +"\n" + "Chiffre 2 :  \n" + rand2 + "\n" + "Chiffre 3 : \n"  + rand3);

			// Traitement de la sequence via la méthode verifPairImpair //
			// Pour rappel la seul sequence correcte est 0 , 0 , 1 //

			flag = PairImpair.verifPairImpair(rand1, rand2, rand3);

		}
		System.out.println("Il aura fallu " + count + " coup a votre programme , pour trouver la bonne sequence" );

	}

}
