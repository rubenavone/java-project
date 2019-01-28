package exo7Rand;

public class PairImpair {
	/**
	 *Cette prend en entrée un nombre , elle verifie le derniere chiffre
	 *dans le cas ou le dernier chiffre est pair elle renvoie 0 
	 *dans le cas ou le dernier chiffre est impair elle renvoie 1
	 * @param nombreAVerifier1
	 */
	public static boolean verifPairImpair(int nombreAVerifier1 , int nombreAVerifier2, int nombreAVerifier3) {
		
		boolean flag = false;
		
		if (nombreAVerifier1 == 0 & nombreAVerifier2 == 0 & nombreAVerifier3 == 1 ) {
			flag = true;
		}
		
		return flag;
		
	}
}
