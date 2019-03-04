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
abstract public class Personne {
    
     /****************/
    /*****Attribut****/
    /****************/
    int id;
    String nom;
    String prenom;
    
     /****************/
    /**Constructeur**/
    /****************/
    public Personne(int id , String nom, String prenom){
        
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        
    }

     /****************/
    /*****Methode****/
    /****************/
    abstract public void insert();
    
    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}
