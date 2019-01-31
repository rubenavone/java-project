package exoTrois;
import java.util.Scanner;

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
		
		int facteur = 5; //Le nombre ou chiffre a factoriser
		int multiplicateur = 1; // Le multiplicateur qui change petit a petit
		
		//init et recuperation de la saisis de l'utilisateur//
		Scanner scan = new Scanner(System.in);		
		System.out.println("Merci d'entrer le chiffre ou nombre a factoriser !");
		
		facteur = scan.nextInt();
		
		
		for (int i = 1; i <= facteur; i++) {
			multiplicateur *= i;
			System.out.println(multiplicateur);
		}
		
		
		
		//Fermeure du scan//
		scan.close();
		
	}

}
