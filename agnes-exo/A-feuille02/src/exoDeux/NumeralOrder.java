package exoDeux;

import java.util.Scanner;

public class NumeralOrder {

	public static void main(String[] args) {
		/*Écrire un programme qui lit un entier au clavier et qui l’affiche verticalement comme dans
		 *cet exemple :
		 *Exemple d’exécution :
		 *Donnez un nombre entier : 785412
		 *7
		 *8
		 *5
		 *4
		 *1
		 *2
		 *
		 *Donc dans l'ordre je vais stocker dans une variable mon nombre entier
		 *Ensuite afin de l'afficher un a un je vais executer la boucle pour
		 *et afficher les nombre un a un. 
		 *Etant donné qu'il n'est pas possible de parcourir un int dans un for 
		 *il m'a alors fallu convertir mon int en string
		 *
		 **/
		
		
		//Init et demande de saisie a l'utilisateur//
		Scanner scan = new Scanner(System.in);
		
		//Demande de saisis a l'utilisateur//
		System.out.println("Merci de saisir un nombre entier , si vous entrez des lettre cela produira une erreur");
		
		//je stocke un nombre entier dans une variable//
		int nombreEntier = scan.nextInt();
		
		String nombreConvertie =  Integer.toString(nombreEntier);
				
		System.err.println("Le nombre Entier une fois convertie en string est : " + nombreEntier);
		
		for (int i = 0; i < nombreConvertie.length(); i++) {
			
			System.out.println(nombreConvertie.charAt(i));
			
		}
		
		//Fermeture du scan//
		scan.close();
	}

	
}
