
package voitureEnGroupe;


import java.util.Scanner;

/**
 *
 * @author eric
 */

public class MainVoiture {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Une autre fonction pour afficher des éléments 
	 * la grosse difference est que pour la modifier il faut 
	 * ajouter les getter.
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

	public static void main(String[] args) {

		// essaiBatmobile();
		System.out.println("Combien de voiture voulez-vous ?");
		int usEnt = sc.nextInt();
		sc.nextLine();

		Voiture[] parking = new Voiture[usEnt];

		for (int i = 0; i < usEnt; i++) {
			parking[i] = saisieVoiture();
		}
		//System.out.println(Arrays.toString(parking));

		for (Voiture voiture : parking) {
			voiture.affiche();
		}
		sc.close();
	}

	public static Voiture saisieVoiture() {

		System.out.println("Indiquez une marque.");
		String userEntry = sc.nextLine();

		Voiture maVoiture = new Voiture(userEntry);

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


