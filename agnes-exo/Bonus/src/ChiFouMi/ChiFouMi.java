package ChiFouMi;

/* Faire un jeux de chifoumi*/

public class ChiFouMi {
	public static void main(String[] args) {
		/**
		 * Objectif réaliser un chifoumi
		 * pierre feuille papier ciseau
		 * 
		 */
		
		
		
		
		 String prenom = "Ru";
		 
		 //la méthode length permet de récupérer la longeur en int de la chaîne//
		 int nbLettre = prenom.length();
		 
		 //Flag nom commun pour une boléenne// 
		 boolean flag = true;
		
		 System.out.println(nbLettre);
		 
		 if (nbLettre == 0 | nbLettre ==1) {
			 flag = false;
		 }else {
			 
		 }
		 
		  
		  //Ici je montre une ternaire ou l'on peut voir la ((condition)? "réultat(true)" : "résultat(false)"// 
		 System.out.print("Votre prénom comporte " /* + nbLettre + ((flag)?" lettres" : " lettre" )*/);
		 System.out.println(((flag)?"lettres" : "lettre" ));
	}
	
}
