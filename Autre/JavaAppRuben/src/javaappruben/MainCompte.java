/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappruben;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class MainCompte {

    static ArrayList<Compte> liste = new ArrayList<>();
    static String reponse;
    public static Scanner scan = new Scanner(System.in);

    /**
     * Methode pour la gestion des saisis
     */
    public static void saisis() {
        String nomUtilisateur;
        String saisisMdp;
        System.out.println("Merci d'entrée votre nom D'utilisateur");
        nomUtilisateur = scan.nextLine();

        System.out.println("Merci d'entrée votre mot de passe ");
        saisisMdp = scan.nextLine();
        // instancie un compte
        Compte utilisateur = new Compte(1, nomUtilisateur, saisisMdp);
        liste.add(utilisateur);
    }

    public static void main(String[] args) {
        /**
         * ****************
         */
        /**
         * ***Saisis******
         */
        /**
         * **************
         */

        //Compte u = saisis();
        for (int i = 0; i < 3; i++) {
            saisis();
        }

        System.out.println("Hello world !");

        /**
         * ****************
         */
        /**
         * **Affichage****
         */
        /**
         * **************
         */
        for (Compte utilisateur : liste) {
            System.out.println(utilisateur.toString());
        }

        /**
         * ****************
         */
        /**
         * **Check pass***
         */
        /**
         * **************
         */
        String[] tab = {"123", "456", "789"};
        
        for (int i = 0; i < liste.size(); i++) {
            Compte utilisateur1 = liste.get(i);
            utilisateur1.checkPassword(tab[i]);
        }

       
//        utilisateur2.checkPassword("456");
//
//        utilisateur3.checkPassword("789");


        /**
         * ************
         */
        /*questionnaire*/
        /**
         * ************
         */
        System.out.println("Qu'il est pas bien mon programme ?");
        reponse = scan.nextLine();
        if (!reponse.equals("oui")) {
            System.out.println("VIIIIIIIIIIII");
        }

    }

}
