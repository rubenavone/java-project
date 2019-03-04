/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseCompte;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class MainCompte {

    static String nomUtilisateur;
    static String saisisMdp;
    static String reponse;
    public static Scanner scan = new Scanner(System.in);
    
    /**
     * Methode pour la gestion 
     * des saisis
     */
    public static void saisis() {
        System.out.println("Merci d'entrée votre nom D'utilisateur");
        nomUtilisateur = scan.nextLine();

        System.out.println("Merci d'entrée votre mot de passe ");
        saisisMdp = scan.nextLine();
    }

    public static void main(String[] args) {
        /*******************/
        /*****Saisis*******/
        /*****************/
        saisis();
        Compte utilisateur1 = new Compte(1, nomUtilisateur, saisisMdp);

        saisis();
        Compte utilisateur2 = new Compte(2, nomUtilisateur, saisisMdp);
        
        saisis();
        Compte utilisateur3 = new Compte(3, nomUtilisateur, saisisMdp);
        
        System.out.println("Hello world !");
        
        /*******************/
        /****Affichage*****/
        /*****************/
        
        System.out.println(utilisateur1.toString());

        System.out.println(utilisateur2.toString());
        
        System.out.println(utilisateur3.toString());
        
        /*******************/
        /****Check pass****/
        /*****************/
        
        System.out.println(utilisateur1.checkPassword("123"));
        
        System.out.println(utilisateur2.checkPassword("456"));
        
        System.out.println(utilisateur3.checkPassword("789"));
        
        /***************/
        /*questionnaire*/
        /***************/
        
        System.out.println("Qu'il est pas bien mon programme ?");
        reponse = scan.nextLine();
        if(reponse != " ") {
            System.out.println("VIIIIIIIIIIII");
        }
        
    }

}
