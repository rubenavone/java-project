

class Array {

    public static void main(String[] args){
         /*
	     1.Déclarer les deux tableaux ci-dessus:
	     2.Créer une fonction permettant d’afficher les éléments de chaque tableau ligne par ligne.
	     3.Créer un programme de Test (main)*/


        
	System.out.println("Affichage des Tableaux via une classe tierse");

        int tableau1[][] = {{2 , 4 , 5}, {3 , 33, 32}};
	
        Affiche.afficheArray(tableau1);

        int tableau2[][] = {{3}, {3 , 4 , 5}, {3 , 5}, {3 , 1 , 0}};
	
	System.out.println("Affichage du second talbeau");

	Affiche.afficheArray(tableau2);

            

     }


}



