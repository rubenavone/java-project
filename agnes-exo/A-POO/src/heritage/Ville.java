package heritage;

public class Ville{
	
		protected String nomDeVille; //accessible pour les enfant et dans le package
		private String nomPays; //private accessible uniquement dans la classe ou il est déclarer
		private int nbrHabitant;
		private char categorie;
		
		public Ville() {
			System.out.println("Creation d'une ville");
		}
		
		/**
		 *  Constructeur pour les villes 
		 * @param nomDeVille 	String
		 * @param nomPays		String	
		 * @param nbrHabitant	int
		 */
		public Ville(String nomDeVille, String nomPays, int nbrHabitant) {
			this.nomDeVille = nomDeVille;
			this.nomPays = nomPays;
			this.nbrHabitant = nbrHabitant;
			this.setNbrHabitant(nbrHabitant);
			this.setCategorie();
		}

		
		public String toString() {
			return "Ville [nomDeVille=" + nomDeVille + ", nomPays=" + nomPays + ", nbrHabitant=" + nbrHabitant + categorie + "]";
		}

		//Retourne la description de la ville
	    public String decrisToi() {
	        return "\t" + this.nomDeVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbrHabitant + " habitant(s) => elle est donc de catégorie : " + this.categorie;
	    }

	    //Retourne une chaîne de caractères selon le résultat de la comparaison
	    public String comparer(Ville v1) {
	        String str = new String();

	        if (v1.getNbrHabitant() > this.nbrHabitant) {
	            str = v1.getNomDeVille() + " est une ville plus peuplée que " + this.nomDeVille;
	        } else {
	            str = this.nomDeVille + " est une ville plus peuplée que " + v1.getNomDeVille();
	        }

	        return str;
	    }
	    
		////GETTER SETTER////
		public String getNomDeVille() {
			return nomDeVille;
		}
		public void setNomDeVille(String nomDeVille) {
			this.nomDeVille = nomDeVille;
		}
		public String getNomPays() {
			return nomPays;
		}
		public void setNomPays(String nomPays) {
			this.nomPays = nomPays;
		}
		public int getNbrHabitant() {
			return nbrHabitant;
		}
		public void setNbrHabitant(int nbrHabitant) {
			this.nbrHabitant = nbrHabitant;
		}
		public char getCategorie() {
			return categorie;
		}
		private void setCategorie() {	 
		    int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

		    int i = 0;
		    while (i < bornesSuperieures.length && this.nbrHabitant > bornesSuperieures[i])
		      i++;
		    this.categorie = categories[i];
		  }
			
		//////END//////
}
