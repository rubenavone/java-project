package exo4Mail;

import java.util.ArrayList;

public class MailSabrina {

    public static void main(String[] args) {
    	//Arriver a fournir une methode qui compte le nombre//
    	
        String[] tab = new String [10];// Déclaration d'un tableau de 10 String
        
       
       ArrayList list = new ArrayList();
        
        int comptGmail = 0, comptOrange = 0,comptHotmail= 0, comptFree = 0; //Initialisation des compteurs de comptes mails
        
        String mailPartEnd = "";
        String mailPartBegin = "";
        
        tab[0] = "jaune@gmail.com";    
        tab[1] = "bleu@orange.com";
        tab[2] = "vert@gmail.com";
        tab[3] = "violet@hotmail.com";
        tab[4] = "rouge@gmail.com";                        //Tableau rempli 
        tab[5] = "noir@free.com";
        tab[6] = "oran.ge@hotmail.com";
        tab[7] = "bla.nc@orange.com";
        tab[8] = "rose@gmail.com";
        tab[9] = "gr.is@free.com";

        //System.out.println(tab[1].substring(tab[1].indexOf("@")));
        
        
        
        for (int i = 0; i < tab.length; i++) {
        	
        	mailPartEnd = tab[i].substring(tab[i].indexOf("@"));
        	
        	mailPartBegin = tab[i].substring(0 , tab[i].indexOf("@"));
        	
        	System.out.println(mailPartBegin);
        	
        	System.out.println(mailPartEnd);
        	
        	tab[i] = mailPartEnd;
        	
            //System.out.println(tab[i].substring(tab[i].indexOf("@")));

            switch (tab[i].substring(tab[i].indexOf("@"), tab[i].indexOf("."))) {
            case "@gmail":comptGmail++;
            break;
            case"@orange":comptOrange++;
            break;
            case "@hotmail":comptHotmail++;
            break;
            case"@free":comptFree++;
            break;
            }
        }
        
        System.out.println("Il y a " + comptGmail + " comptes Gmail ");
        System.out.println("Il y a " + comptOrange + " comptes Orange");
        System.out.println("Il y a " + comptHotmail + " comptes Hotmail");
        System.out.println("Il y a " + comptFree + " comptes Free");
    }
}