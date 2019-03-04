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
    static Personne[] humansIndustries = new Personne[4];
    
    public static void select(){
        
        int select;
      
        for (int i = 0; i < humansIndustries.length; i++) {
                    
            System.out.println("Quel est le status de la personne que vous souahitez ajouter"
                    + "\n1 - Etudiant"
                    + "\n2 - Employee"
                    + "\n3 - Professeur");

            select = sc.nextInt();

            if(select == 1){
                humansIndustries[i] = Etudiant.addEtudiant();
            }else if(select == 2){
                humansIndustries[i] = Employee.addEmployee();
            }else if(select == 3){
                humansIndustries[i] = Professeur.addProf();
            }else {
                System.out.println("Erreur de saisis");
            }
         }
        
    }
    
    public static void main(String[] args) {
       
        
        
        select();
        
        Etudiant romain = new Etudiant("van-damne", "Romain", 123442);
        System.out.println(romain.toString());
        
        Employee kevin = new Employee("SanMartino", "Kevin", 5000);
        System.out.println(kevin.toString());

        for (Object humansIndustrie : humansIndustries) {
            System.out.println(humansIndustrie);
        }
        
        

    }
}
