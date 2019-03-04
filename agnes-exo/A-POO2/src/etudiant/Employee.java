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
public class Employee extends Personne{
    
     /****************/
    /*****Attribut****/
    /****************/
    double salaire;
    
    
    
    /****************/
    /**Constructeur**/
    /****************/
    public Employee(int id, String nom, String prenom,double salaire) {
       super(id, nom, prenom);
       this.salaire = salaire;
    }

    
    /****************/
    /*****Methode****/
    /****************/
    @Override
    public void insert() {
        
    }

    @Override
    public String toString() {
      return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + " salaire=" + salaire + '}';

    }
    
    
}
