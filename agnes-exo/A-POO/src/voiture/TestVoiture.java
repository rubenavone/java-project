package voiture;

import java.util.Scanner;

public class TestVoiture {
			//MAIN//
			public static void main (String[] args) {
				
				//Instanciation du scanner//
				Scanner scan = new Scanner(System.in);
				
				//Instanciation des voiture//
				Voiture titine = new Voiture();
				Voiture tounette = new Voiture();
				Voiture titounette = new Voiture();
				
				//Affectation sur l'objet titine//
				titine.setCouleur("mauve");
				
				//Affectation sur l'objet tounette//
				System.out.println("Merci d'entrée la couleur de votre vehicule");
				tounette.setCouleur(scan.nextLine());
				
				System.out.println("Merci d'entrée la marque de votre vehicule");
				tounette.setMarque(scan.nextLine());
				
				System.out.println("Merci d'entrée le nombre de porte de votre vehicule");
				tounette.setNbPorte(scan.nextInt());
				
				//Affectation sur l'objet titounette//
				//System.out.println("Merci d'entrée la couleur de votre vehicule");
				titounette.setCouleur("rouge");
				
				//System.out.println("Merci d'entrée la marque de votre vehicule");
				titounette.setMarque("opel");
				
				//System.out.println("Merci d'entrée le nombre de porte de votre vehicule");
				titounette.setNbPorte(5);
				
				//Affichage//
				tounette.affichage();
				titounette.affichage();
				
				String utilisateur = "l'utilisateur possede " + titounette.getMarque() + "et" + tounette.getMarque();
				
				//titine//
				//System.out.println("Ici titine je suis de la couleur " + titine.getCouleur());//Couleur de la premiere voiture titine//
				
				//Fermeture du scan//
				scan.close();
			}
}
