package randArray;

public class RandArray {

	public static void main(String[] args) {
		
		/*Déclarez une variable de type tableau de 5 entiers.
		Remplissez ce tableau avec des valeurs aléatoires comprises entre 0 et 10. [0,10[ entre 0 et 10 exclue donc 9 [0 , 9]
		Indiquez si la valeur 4 est dans le tableau, si oui indiquez sa position.*/

		int[] tableau = new int[5];
		boolean quatre = false;
		int position = 0;
		
		for(int i =0; i < tableau.length; i++) {
			
			tableau[i] = (int) (Math.random() * 11); //Approfondir la notion de caste ??????
			
			System.out.println(tableau[i]);

			if (tableau[i] == 4) { 
				quatre = true;
				position = i;
			}else {				
				
				
			}
		}
	
		if (quatre == true ) {
			System.out.println("il ya un quatre dans le tableau");
			System.out.println("il ce trouve a la position numero " + (position + 1) + " ce qui represente l'index " + position);
		}
		
	}

}
