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
 public class Personne {
    
     /****************/
    /*****Attribut****/
    /****************/
    private int id;
    private static int count = 0;
    private String nom;
    private String prenom;
    
     /****************/
    /**Constructeur**/
    /****************/
    public Personne(String nom, String prenom){
        count++;
        this.id++;
        this.nom = nom;
        this.prenom = prenom;
        System.out.print("id " + id + " count " + count);
    }

   
    public Personne(){
        count++;
        this.id = count;
        System.out.print("id " + id + " count " + count);

    }

     /****************/
    /*****Methode****/
    /****************/
    
    
    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    


public int getId() {
        return id;
    }
//
//    public static void setId(int id) {
//        Personne.id = id;
//    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
}