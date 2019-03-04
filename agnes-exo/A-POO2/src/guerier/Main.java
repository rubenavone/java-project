/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerier;

import guerier.classe.*;

/**
 *
 * @author ruben
 */
public class Main {
    public static void main(String[] args){
    	System.out.println("La naissance de votre groupe !\n"
    			+ "une fête de plus au royaume d'EnderHast");
    	
    	System.out.println("Née pour ce battre une guerier est née !");
        Guerier g = new Guerier();
        g.saluer();
        
        System.out.println("Sous le chapeau ce cache l'homme sombre et souvent en proie \n"
        		+ "au démons. Les siens ? Surement !");
        Mage m = new Mage();
        m.saluer();
        
        System.out.println("l'air frivole il lève trop bien les guiboles.\n"
        		+ "Ranger vos bourse !");
        Voleur v = new Voleur();
        v.saluer();
    }
}
