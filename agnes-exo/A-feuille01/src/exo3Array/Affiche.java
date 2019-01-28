package exo3Array;


/*Methode qui affiche le tableau horizontalement*/

class Affiche {
    public static void afficheArray(int tableau[][]){
    	//Le double for permet de parcourir le tableau a 2 dimension
    	for(int i = 0; i < tableau.length; i++){

    	  for(int j = 0; j < tableau[i].length; j++){

	    System.out.print(tableau[i][j] + " ");//print affiche sur une ligne 

	     }	
		System.out.println(""); // Permet d'effectuer un saut de ligne entre les tableau
	}

    }
}
