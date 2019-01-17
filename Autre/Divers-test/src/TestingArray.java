
public class TestingArray {
	/**
	 * Fonction qui affiche le tableau
	 * avec la gestion de la derniere virgule
	 * @param tab
	 */
	public static void affichage(int[] tab) {
		System.out.println("Nous allons afficher votre tableau");
		System.out.print("[");
		for (int i = 0; i < tab.length; i++) {
			if (i == tab.length-1) {
				System.out.print(tab[i] );
			}else {
				System.out.print(tab[i] +" ,");
			}
		}
		System.out.println("]");
		System.out.println();
	}
	/**
	 * Fonction qui affiche le tableau
	 * avec la gestion de la premiere virgule
	 * @param tab
	 */
	public static void affichage2(int[] tab) {
		System.out.println("Nous allons afficher votre tableau");
		System.out.print("[");
		for (int i = 0; i < tab.length; i++) {
			if (i != 0) {
				System.out.print(tab[i] +" ,");
				
			}
			System.out.print(tab[i] );
			
		}
		System.out.println("]");
		System.out.println("\0");
	}
	
	/**
	 * Foction qui crée un tableau. 
	 * @param tailleTableau (permet de gérer la taille du tableau)
	 * @param tailleRand (permet de changer la taille maximale du random)
	 * @return la variable tab qui qui est un tableau
	 */
	public static int[] tableauRandom( int tailleTableau ,int  tailleRand ) {
			
		int[] tab ;
		
		tab = new int[tailleTableau];
		
		for (int i = 0; i < tab.length; i++) {
			
			tab[i] = (int) (Math.random() * (tailleRand + 1));
			
		}
		return tab;
		
		
	}
	
	public static void main(String[] args) {
				
	affichage(tableauRandom(5,25));
	affichage(tableauRandom(52,1000));
	affichage2(tableauRandom(5,25));
	}

}
