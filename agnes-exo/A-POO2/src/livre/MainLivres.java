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
       
       ArrayList<Livres> arr = new ArrayList<>();
       
        for (int i = 0; i < 3; i++) {
            Livres book = new Livres();
            book.saisir();
            arr.add(book);
        }
       
      for (int i = 0; i < 3; i++) {
            Livres book1 = new Livres();
            book1.saisir2(sc);
            arr.add(book1);
        }
       
        for (Iterator<Livres> iterator = arr.iterator(); iterator.hasNext();) {
            Livres next = iterator.next();
            
        }
       
        System.out.println(Livres.getBonus());
        
    }
}
