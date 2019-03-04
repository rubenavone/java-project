/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public lambda saisisEmployee() {
        int id = sc.nextInt();
        String nom = sc.nextLine();
        String prenom = sc.nextLine();
        int salaire = sc.nextInt();

        Employee lambda = new Employee(id, nom, prenom, salaire);
        
        return lambda;
    }

    public static void main(String[] args) {
       /**
        * Begin
        */

        Etudiant romain = new Etudiant(23, "van-damne", "Romain", "123442");

        System.out.println(romain.toString());

        Employee kevin = new Employee(2, "SanMartino", "Kevin", 5000);
        System.out.println(kevin.toString());

        for (String arg : args) {

        }

    }
}
