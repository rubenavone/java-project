package exoCinq;

import java.util.Scanner;

public class Array {
	/*Exercice 5
	Écrire un programme permettant de remplir un tableau de 5 éléments, ensuite calcule et
	affiche la somme des éléments de ce tableau.*/

	public static void main(String[] args) {
		/*On crée un tableau
		 * ensuite il faut que l'utilisateur entre les 5 éléménts
		 * 	pour chaque éléments saisis
		 *il faut ensuite que chaque élément du tableau s'additione
		 */

		//Init de notre tableau et variable//
		int[] tableauDeNombre = new int[5];
		
		//Variable pour la sommeTotal des éléments du tableau//
		int sommeTotal = 0;

		//Init du scanner//
		Scanner scan = new Scanner(System.in);


		//Pour chaque éléments du tableau ...//

		for (int i = 0; i < tableauDeNombre.length; i++) {
			//Demande de saisis pour chacune des case//
			System.out.println("Merci de saisir un entrée pour la case " + i );
			tableauDeNombre[i] = scan.nextInt();
			
			//j'ajoute l'élément actuel i a la sommeTotal chaque tour ainsi j'ai l'addition de tout mes élément a la fin//
			sommeTotal += tableauDeNombre[i];

		}

		for (int i = 0; i < tableauDeNombre.length; i++) {
			System.out.print(tableauDeNombre[i] + " ");
		}
		
		System.out.println("La somme de tous les éléments du tableau est égale à " + sommeTotal);
		scan.close();
	}
}
