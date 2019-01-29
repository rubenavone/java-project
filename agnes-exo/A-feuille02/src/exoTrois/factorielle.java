package exoTrois;
import java.util.Scanner;
import bin.exo7Rand.*;
public class factorielle {

	public static void main(String[] args) {
		  /*Écrire une fonction permettant de calculer le factoriel d’un entier saisi au clavier.
		   *Sachant que :
		   *N ! = N * (N – 1) !
		   *1! = 0! = 1
		   *Exemple d’exécution :
		   *Donnez la valeur de n :
		   *5
		   *Le factoriel de 5 est :120
		   */
			/*Un multiplicateur init a 1
			 * tan que multiplicateur est inferieur a facteur 
			 * 	alors on continue d'incrementer multiplicateur
			 * 	autrement 
			 * 	on affiche la ligne des multiplicateur et le résultat final
			 */
		
			//////////////////////////
			//////Initialisation//////
			/////////////////////////
		
		int facteur = 20; //Le nombre ou chiffre a factoriser
		int multiplicateur = 0; // Le multiplicateur qui change petit a petit
		
		//init et recuperation de la saisis de l'utilisateur//
		Scanner scan = new Scanner(System.in);		
		System.out.println("Merci d'entrer le chiffre ou nombre a factoriser !");
		//facteur = scan.nextInt();
		
		
		do {
			multiplicateur ++;
			int swap = multiplicateur;
			swap +=  multiplicateur;
			System.out.println((swap - 1) + " le multiplicateur actuel est " + multiplicateur);
			
		}while(facteur > multiplicateur);
		
		
		
		//Fermeure du scan//
		scan.close();
		
	}

}
