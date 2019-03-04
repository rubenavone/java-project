/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

/**
 *
 * @author ruben
 */
public class Professeur extends Employee {
    
     /****************/
    /*****Attribut****/
    /****************/
    private String specialite;

    
    
     /****************/
    /**Constructeur**/
    /****************/
    public Professeur(String nom, String prenom, double salaire,String specialite){
        super(nom, prenom, salaire);
        this.specialite = specialite;
    }
    public Professeur(){
        super();
    }
     /****************/
    /*****Methode****/
    /****************/
     public static Professeur addProf() {
        
        Professeur lambda = new Professeur();

        System.out.println("Merci de saisir le nom");
        lambda.setNom(sc.nextLine());
        
        System.out.println("Merci de saisir le prenom");
        lambda.setPrenom(sc.nextLine());
        
        System.out.println("Merci de saisir le salaire ");
        lambda.setSalaire(sc.nextDouble());
        
        sc.nextLine();
        
        System.out.println("Merci d'entrée la spécialité du professeur");
        lambda.specialite = sc.nextLine();
        
        
        return lambda;
    }

    @Override
    public String toString() {
        return "Professeur{" + "specialite=" + specialite + '}';
    }
    
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
