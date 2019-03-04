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
    String specialite;
    
     /****************/
    /**Constructeur**/
    /****************/
    public Professeur(int id, String nom, String prenom, int salaire,String specialite){
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }
    
     /****************/
    /*****Methode****/
    /****************/
    @Override
    public void insert() {
        
    }

    @Override
    public String toString() {
        return "Professeur{" + "specialite=" + specialite + '}';
    }
    
    
}
