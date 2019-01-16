
public class TestingArray {
	
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
	
	}

}
