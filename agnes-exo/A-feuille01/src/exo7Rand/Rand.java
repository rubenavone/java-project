package exo7Rand;

/*Comment définir si un nombre est pair ou non 
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
 *Si c'est le cas on recommence une boucle qui génére a nouveau trois 
 *nombre aléatoire 
 */

public class  Rand {
	/**
	 * Une methode qui genere et renvoie un nombre aléatoire
	 * @return
	 */
	public static int randomNumber(int max) {
		
		int randomNumber = (int) (Math.random() * max) ;
		
		return randomNumber;
	}
	
}
