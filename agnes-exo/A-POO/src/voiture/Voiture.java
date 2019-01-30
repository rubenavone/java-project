
//////////////////
//pack et import//
//////////////////

package voiture;

								//////////////////
								////énoncé///////
								////////////////
		
		
		/*1. Créer une classe Voiture, qui aura trois attributs :
		 *o Couleur
		 *o Nombre de portière
		 *o Marque
		 *2. Par une saisie clavier, l’utilisateur doit pouvoir saisir les informations de sa voiture.
		 *3. Imaginons un utilisateur qui possède plusieurs voitures, comment stocker les informations
		 *de toutes ses voitures ?
		 *4. Créer une fonction qui permet d’afficher les informations de la ou des voiture(s) d’un
		 *utilisateur.
		 *> “ Punto Orange 3 portes”
		 *5. Dans le parking du triangle de Montpellier, comment stocker les informations de tous les
		 *adhérents et de leur véhicule. Afficher les informations pour vérifier.
		*/


public class Voiture {
								////////////////
								///Attributs///
								///////////////
	
	private String couleur; //L'affectation n'est pas obligatoire dans ce cas précis//
	private int nbPorte;
	private String marque;
	
	//Voiture//
	
		//Accesseur//
		public String getCouleur() {
			return this.couleur;
		}	
		//Mutateur//
		public void setCouleur(String nouvelleCouleur) {
			this.couleur = nouvelleCouleur;
		}
		//Accesseur//
		public String getMarque() {
			return marque;
		}
		//Mutateur//
		public void setMarque(String marque) {
			this.marque = marque;
		}
		//Accesseur//
		public int getNbPorte() {
			return nbPorte;
		}
		//Mutateur//
		public void setNbPorte(int nbPorte) {
			this.nbPorte = nbPorte;
		}
		
		public void affichage() {
			//tounette//
			System.out.println("La couleur de votre voiture est " + getCouleur());
			System.out.println("La marque de votre vehicule est " + getMarque());
			System.out.println("Le nombre de porte est " + getNbPorte());
			
		}
}
