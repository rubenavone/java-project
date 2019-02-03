package voilier;

public class VoilierDansLeVent {
	 

		public static void main(String[] args){
			String prenom = "Enter your name";
			int nbLettre = prenom.length();
			boolean flag = true;
			if(nbLettre == 0 | nbLettre == 1){
				flag = false;
			}

			System.out.print("Votre prénom comporte " + nbLettre);
			System.out.println((flag)?" lettres" : " letrre");
		}
	

}
