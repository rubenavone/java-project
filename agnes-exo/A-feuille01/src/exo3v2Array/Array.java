package exo3v2Array;

	public class Array {
	
		public static void main(String[] args){
			/*
			1.Déclarer les deux tableaux ci-dessus:
			2.Créer une fonction permettant d’afficher les éléments de chaque tableau ligne par ligne.
			3.Créer un programme de Test (main).
			*/

			System.out.println("HelloWorld!");

			int [][] tableau1 = {{2 , 4 , 5}, {3 , 33, 32}};
			//int [][] tableau2 = {{3}, {3 , 4 , 5}, {3 , 5}, {3 , 1 , 0}};

				
			for(int i = 0; i < tableau1.length; i++){

			  for(int j = 0; j < tableau1[i].length; j++){

				System.out.print(tableau1[i][j] + " ");	

			  }	
				System.out.println("");
			}

		}

	}
