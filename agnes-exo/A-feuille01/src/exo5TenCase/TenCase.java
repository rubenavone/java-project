package exo5TenCase;

import java.util.Scanner;

public class TenCase {

	public static void main(String[] args) {
		/*
		 * Exercice 4	
			Créer un tableau de dix chaînes de caractères puis remplir ce tableau avec des adresses
			e-mail. Calculer ensuite, à partir des informations présentes dans le tableau, la part de
			marché de chacun des fournisseurs d’accès.
			Indice : dans une adresse e-mail, le nom du fournisseur d’accès est la partie située après
			le caractère @ de l’adresse e-mail.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int hotmail = 0;
		int free = 0;
		int wanadoo = 0;
		String email1 = "@wanadoo.fr";
		String email2 = "@free.fr";
		String email3 = "@hotmail.fr";
				
		String[] email = new String[20];
		
		/*for (int i = 0; i < email.length; i++) {
			email[i] = sc.nextLine();	
			}*/
	    for(int i=0; i<email.length; i++) 
        {
            int rand = (int)(Math.random() * 3+1);
        
            if (rand == 1)
            {
                email[i] = "jean-michel" + (int)(Math.random() * 2123) + email1;
            }    
            else if (rand == 2) 
            {
                email[i] = "jmdoudoux" + (int)(Math.random() * 2123) + email2;
            }    
            else /*jamais de condition dans un else, elle même est une condition */
            {
                email[i] = "richardoudoux" + (int)(Math.random() * 2123) + email3;
            }
            
            System.out.println(email[i]);
        }
		for (int j = 0; j < email.length; j++) {
			if (email[j].contains("@hotmail")  ) {
					hotmail++;
			}else if (email[j].contains("@free")) {
				free++;
			}else {
				wanadoo++;
			}
			
		}
		
		System.out.println("hotmail : " + hotmail );
		System.out.println("wanadoo : " + wanadoo );
		System.out.println("free : " + free);
		
		sc.close();				
	}

}
