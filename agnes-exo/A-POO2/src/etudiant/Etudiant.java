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
public class Etudiant extends Personne {
    
    /****************/
    /*****Attribut****/
    /****************/
    String cne;
    
     /****************/
    /**Constructeur**/
    /****************/
    public Etudiant(int id, String nom, String prenom, String cne){
        super(id, nom, prenom);
        this.cne = cne;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cne=" + cne + '}';

    }

    @Override
    public void insert() {
        
    }
   
}
