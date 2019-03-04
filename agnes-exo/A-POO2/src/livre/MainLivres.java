/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class MainLivres {

    public static Scanner sc = new Scanner(System.in);

    static int id;
    static String titre;
    static String auteur;
    static int prix;
    static int entryNumber;
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       Livres book1 = new Livres();
       Livres book2 = new Livres();
       Livres book3 = new Livres();
       Livres book4 = new Livres();
       
       book1.saisir();
       book2.saisir();
       book3.saisir();
       book4.saisir();
       
       Livres book5 = new Livres();
       book5.saisir2(sc);
       
        System.out.println(Livres.getBonus());
        System.out.println(book1);
    }
}
