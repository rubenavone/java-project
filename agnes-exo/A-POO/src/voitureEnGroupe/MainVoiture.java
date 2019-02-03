
package voitureEnGroupe;


import java.util.Scanner;

/**
 * J'ai simplement relus et ajouter des commentaire pour décortiquer 
 * son code (fait en live coding) //Ruben//
 * @author eric
 */

public class MainVoiture {
	/**
	 * Placé en static le scanner est alors accessible dans mes 
	 * méthode sans pour autant etre obligé de l'instanciée
	 */
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Une autre fonction pour afficher des éléments 
	 * Comme elle n'est pas dans la classe voiture 
	 * Je suis obliger d'utiliser les getter.
	 * @param uneVoiture
	 */
	public static void affiche2(Voiture uneVoiture) {
		System.out.println(uneVoiture.getCouleur() + " " + uneVoiture.getMarque() + " " + uneVoiture.getPortieres());
	}
	
	public static void essaiBatmobile() {
		Voiture batmobile = new Voiture("WaynesInd");

		batmobile.setCouleur("noire");
		//batmobile.setMarque("Waynes");

		batmobile.affiche();
		affiche2(batmobile);
		Voiture.affiche3(batmobile);
	}
	/**
	 * Classe principale 
	 * @param args
	 */
	public static void main(String[] args) {

		// essaiBatmobile();
		
		//Définis le nombre de vehiculepour l'utilisateur//
		System.out.println("Combien de voiture voulez-vous ?");
		int usEnt = sc.nextInt();
		sc.nextLine(); //On appel donc le scan déclarer en static
		
		// Le parking est égale a un tableau d'objet[usEnt](taille du tableau)//
		Voiture[] parking = new Voiture[usEnt];

		//Pour i = 0, tant que i est inférieur a usEnt //
		for (int i = 0; i < usEnt; i++) {
			parking[i] = saisieVoiture();
		}
		
		//System.out.println(Arrays.toString(parking));
		
		//Pour chaque voiture dans le parking//
		for (Voiture voiture : parking) {
			voiture.affiche();
		}
		
		sc.close();
	}
	
	/**
	 * Permet aux utilisateur d'entrées les paramétres de 
	 * leur véhicule. 
	 * @return Marque, Couleur et le nombre de portières
	 */
	public static Voiture saisieVoiture() {

		System.out.println("Indiquez une marque.");
		String userEntry = sc.nextLine();
		
		Voiture maVoiture = new Voiture(userEntry);
		
		//maVoiture.setMarque(userEntry); //Erreur a cause du private 
		
		System.out.println("Indiquez une couleur.");
		userEntry = sc.nextLine();
		maVoiture.setCouleur(userEntry);

		System.out.println("Votre voiture a-t-elle 5 portieres ?");
		userEntry = sc.nextLine();
		if (userEntry.equals("oui")) {
			maVoiture.setPortieres(5);
		}

		return maVoiture;
	}

}


