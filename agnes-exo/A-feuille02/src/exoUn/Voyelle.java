package exoUn;

import java.util.Scanner;

public class Voyelle {
	public static void main(String[] args) {

		/*Écrire un programme qui lit un mot au clavier et qui indique combien de fois sont
		présentes chacune des voyelles a, e, i, o, u ou y, que celles-ci soient écrites en
		majuscules ou en minuscules, comme dans cet exemple :
		Exemple d’exécution :
		Donnez un mot : Anticonstitutionnellement
		il comporte
		1 fois la lettre a
		3 fois la lettre e
		3 fois la lettre i
		2 fois la lettre o
		1 fois la lettre u
		0 fois la lettre y*/

		//////////////////////////
		//////Initialisation//////
		/////////////////////////

		//La chaine de voyelles a verifier//
	

		//Init des compteur de lettre//
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int y = 0;
		int consonne = 0;
		
		//Ouverture du scanner//
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer le mot a comparé");
		String mot = scan.nextLine().toLowerCase();

		//Je parcours la chaine de voyelles//
		
		for (int k = 0; k < mot.length(); k++) {
			
			
			//Il faut que je compare la saisis de l'utilisateur a la chaine de voyelles//
	
			//Je garde la lettre de mon mot en mémoire//
			char lettre = mot.charAt(k);
			
			//Je compare dans un switch ma lettre au voyelles//
					switch(lettre) {
					case 'a':
						a++;
						break;
					case 'e':
						e++;
						break;
					case 'i':
						i++;
						break;
					case 'o':
						o++;
						break;
					case 'u':
						u++;
						break;
					case 'y':
						y++;
						break;
					default: 
						consonne++;						
			}
			
		}

		//Fermeture du scanner//
		scan.close();
		
		System.out.println("il ya " + a + " fois la lettre a");
		System.out.println("il ya " + e + " fois la lettre e");
		System.out.println("il ya " + i + " fois la lettre i");
		System.out.println("il ya " + o + " fois la lettre o");
		System.out.println("il ya " + u + " fois la lettre u");
		System.out.println("il ya " + y + " fois la lettre y");
		System.out.println("il ya " + consonne + " consonne");
		
	}

}
