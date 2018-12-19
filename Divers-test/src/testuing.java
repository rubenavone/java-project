
public class testuing {

	public static void main(String[] args) {
		
		/*
			float valeur=10f;		
			double resultat = valeur / 0;
			
			System.out.println("index = " + resultat);
			System.out.println("Hello world !");
			
		
			// test d'incrementation 
			// declaration de la variable n1
			int n1=0; 
			int n2=0;
			
			System.out.println("n1 = " + n1 + " n2 = " + n2);	// N1 = 0 n2 = 0		
			n1=n2++;        			
			System.out.println("n1 = " + n1 + " n2 = " + n2); 	//N1 = 1 N2 = 2		
			n1=++n2;       			
			System.out.println("n1 = " + n1 + " n2 = " + n2);	//N1 = 1 N2 = 2	
			n1=n1++;        //attention
			System.out.println("n1 = " + n1 + " n2 = " + n2); //N1 = 1 N2 = 2
			*/
			
			//Test numero 2
			/*
			int variableDeTest = 0;
			
			//table de multiplication par deux
			for(int i=0; i<10; i++) {
				variableDeTest += 2;
				System.out.println(variableDeTest);
			}
			variableDeTest = 0;
			
			//table de multiplication par 3
			for(int i=0; i<10; i++) {
				variableDeTest += 3;
				System.out.println(variableDeTest);
			}
			*/
		
			// nombre d'eleve 
		/*int nbEleve [] = new int [15];
		
		System.out.println(nbEleve);*/
		
			// Test numero 3
			/* boolean infinis = false;
			int varDeLinfinis = 0;
			int nbTour = 0;
			
			while(infinis = false) {
				
				System.out.println("n° de boucle:" + nbTour);
				nbTour ++;
				
				if (varDeLinfinis > 100) {
				varDeLinfinis ++;
				
				System.out.println("la valeur de votre variable est :" + varDeLinfinis);
				
				}else {
					System.out.println("fin de l'execution du programme");
				}
			} */
		
		String phrases = ("Hello les enfants");	
		String lettre = ("n");	
		int compteur = 0;
		
		for(int i = 0; i < phrases.length(); i++) {
			if (phrases.charAt(i) == lettre.charAt(0)) {
				compteur++;
				System.out.println("ajout d'une lettre dans le compteur");
			}
		}		
		System.out.println(compteur + " lettre " + lettre);
	}	
}