package mail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MailMehdi {


	public static String affichage(String fournisseur, int compteur) {
		/**
		 * Fonction qui permet d'ajouter ou non un S a adresse 
		 * @param fournisseur
		 * @param compteur
		 */
		String s = " il y a " + compteur + " adresse";
		if (compteur > 1 ) {
			s += "s " + fournisseur;

		}
		else {
			s += " " + fournisseur;
		}
		return s;
	}

	public static void main(String[] args) {
		/* Creating ArrayList of type "String" which means
		 * we can only add "String" elements
		 */
		
		//declaration d'un tableau de 10 String//
		String[] email = new String[ 10 ];	 
	
		ArrayList<String> mail = new ArrayList<String>();
		
		//initialization des compteurs// 
		
		int comptGmail=0, comptOutlook=0, comptFree=0, comptOrange=0 , comptSfr=0,  comptHotmail=0;
		
		//Affectations des élément de la liste//
		mail.add("dede.gui@gmail.fr" );
		mail.add("jiji@gmail.fr");
		mail.add("guigui.dodo@outlook.fr");
		mail.add("popy@outlook.fr");
		mail.add("mike@gmail.fr");
		mail.add("hall@gmail.fr");
		mail.add("yoyo@free.fr");
		mail.add("fifa@orange.fr");
		mail.add("bigi@sfr.fr");
		mail.add("pac@hotmail.com");
		//end Affectation//
		
		//Collections.sort(mail.subList(mail.indexOf("@"), mail.indexOf(".")));
		
		//Affichage des éléménts//
		
		System.out.println("Affichage de la liste :");
		int k = 0;
		
		for(String str:mail) {
						
			str = str.substring(str.indexOf("@"));
			System.out.println(str);
			mail.set(k, str);
			k++;
			System.out.println(k);
			
		}
		Collections.sort(mail);
		
		System.out.println(mail);
		
		
		System.out.println("Fin de la liste");
		
		//End Affichage list
		
		
	
		// Tableau rempli 

		email [ 0 ] =  "dede.gui@gmail.fr" ;
		email [ 1 ] =  "jiji@gmail.fr" ;
		email [ 2 ] =  "guigui.dodo@outlook.fr" ;
		email [ 3 ] =  "popy@outlook.fr" ;
		email [ 4 ] =  "mike@gmail.fr" ;
		email [ 5 ] =  "hall@gmail.fr" ;
		email [ 6 ] =  "yoyo@free.fr" ;
		email [ 7 ] =  "fifa@orange.fr" ;
		email [ 8 ] =  "bigi@sfr.fr" ;
		email [ 9 ] =  "pac@hotmail.com" ;

		for (int i = 0; i < email.length; i++) {

			int debutIndex = email[i].indexOf("@");
			int finIndex = email[i].lastIndexOf(".");
			String fournisseur = email[i].substring(debutIndex, finIndex);

			//System.out.println(fournisseur);

			switch (fournisseur ) {

			case "@gmail" :
				comptGmail++;
				break;
			case "@outlook" : 
				comptOutlook++;
				break;
			case "@free" : 
				comptFree++;
				break;
			case "@orange" : 
				comptOrange++;
				break;
			case "@sfr" : 
				comptSfr++;
				break;
			case "@hotmail" : 
				comptHotmail++;
				break;
			}
		}

		System.out.println(affichage("Gmail", comptGmail ));

		System.out.println(affichage("Sfr", comptSfr ));

		System.out.println(affichage( "Orange", comptOrange));

		System.out.println(affichage( "Free", comptFree));

		System.out.println(affichage( "Hotmail", comptHotmail));

		System.out.println(affichage( "Outlook", comptOutlook));

	}	
}

