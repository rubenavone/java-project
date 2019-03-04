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
public class Employee extends Personne{
    
    static Scanner sc = new Scanner(System.in);
     /****************/
    /*****Attribut****/
    /****************/
   private double salaire;

 
   
    /****************/
    /**Constructeur**/
    /****************/
    public Employee(String nom, String prenom, double salaire) {
       super(nom, prenom);
       this.salaire = salaire;
    }

    public Employee() {
        super();
    }
    
    /****************/
    /*****Methode****/
    /****************/
        public static Employee addEmployee() { 
        Employee lambda = new Employee();
          
        System.out.println("Merci de saisir le nom");
        lambda.setNom(sc.nextLine()); 
        
        System.out.println("Merci de saisir le prenom");
        lambda.setPrenom(sc.nextLine());
        
        System.out.println("Merci de saisir le salaire (int)");
        lambda.setSalaire(sc.nextDouble());
        sc.nextLine();
        
        return lambda;
    }

    @Override
    public String toString() {
      return "Personne{" + "id=" + getId() + ", nom=" + getNom() + ", prenom=" + getPrenom() + " salaire=" + salaire + '}';

    }
    
       public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
}
