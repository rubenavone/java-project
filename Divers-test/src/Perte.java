public class Perte {

	public static void main (String[] args) {

		System.out.println("Hello world");
		//Tentative de conversion d'un long vers un int 
		long number = 9223372036854775807L; //Il faut ajouter le L majuscule a la fin pour qu'il comprennent le Long
		//numberInt = (int)number; //Tentative de conversion vouée a l'échec ...
		//Tentative de conversion d'un double et float vers un int 
		float decimal = 1.233424F; // error incompatbile lossy conversion from double to float ??
		double decimalDouble = 1.234334;

		

		//Affichage des divers éléments (cast int long float etc)
		System.out.println(decimalDouble);
		System.out.println(decimal); 
		System.out.println(number);
		
		/* Deuxieme partie des conversion avec une classe valueOf 
		 *Ici la conversion est optionnelle dans le premier exemple 
		 * on ce rend compte que dans tout les cas le résultat de
		 * System.out est convertie en String (dumoins pour la partie prixHT * 1.196)
		 */

		double prixHT;

		prixHT = 1.123;
                String recap;

                System.out.println("Le montant de la commande est " + prixHT * 1.196);

		// cette fois ci on utilise valueOf pour convertir explicitement le System.out en string		
		
		System.out.println("Le montant de la commande est " + String.valueOf(prixHT * 1.196));


		/*************************
		 *Code a ne pa prendre en compte
		 *Même si ce n'est pas colorer c'est un commentaire ! 
		 *************************/

		//numberCast = (int)number; // La conversion ne fonctionnera pas, effectivement le integer ne peut contenir un nombre aussi grand

	}


}
