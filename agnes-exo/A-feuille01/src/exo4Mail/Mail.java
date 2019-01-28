package exo4Mail;

		/* Exercice 4
		Créer un tableau de dix chaînes de caractères puis remplir ce tableau avec des adresses
		e-mail. Calculer ensuite, à partir des informations présentes dans le tableau, la part de
		marché de chacun des fournisseurs d’accès.
		Indice : dans une adresse e-mail, le nom du fournisseur d’accès est la partie située après
		le caractère @ de l’adresse e-mail. */


public class Mail {

	public static void main(String[] args) {
		
		//Declaration du  tableau//
		String [] tabMail = {"kevin@gmail.com","willem@hotmail.fr","adolfe@msn.com"};
		
		//Compter le nombre de mail//
		int comptGmail = 0;
		int comptHotmail = 0;
		int comptMsn = 0;
		String lettreMot = "";
		//Boucler pour afficher les tableaux//
		
		for (int i = 0; i < tabMail.length; i++) {
			
			
			String mot = tabMail[i];
			System.out.println(mot);
			
			//On cherche a trouve la position de l'arobase//
			int position = tabMail[i].indexOf("@");
			System.out.println(position);
			
			 for (int j = position; j < mot.length(); j++) {
				 
				lettreMot += mot.charAt(j);
				
				//Affichage de chaque lettre//
				System.out.println(lettreMot);
				
			}
			//Affichage pour test //
			//System.out.println(tabMail[i]);
		}
		
		
		
		//Affichage pour tester//
		
		System.out.println(comptGmail);
		System.out.println(comptHotmail);
		System.out.println(comptMsn);
	}

}
