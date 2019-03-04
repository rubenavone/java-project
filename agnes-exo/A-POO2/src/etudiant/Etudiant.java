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
public class Etudiant extends Personne {
    
    /****************/
    /*****Attribut****/
    /****************/
    private int cne;

   
    static Scanner sc = new Scanner(System.in);
     /****************/
    /**Constructeur**/
    /****************/
    public Etudiant(String nom, String prenom, int cne){
        super(nom, prenom);
        this.cne = cne;
    }
    public Etudiant(){
        super();
        
    }
   public static Etudiant addEtudiant() { 
        
        Etudiant lambda = new Etudiant();
       
        System.out.println("Merci de saisir le nom");
        lambda.setNom(sc.nextLine());
        
        System.out.println("Merci de saisir le prenom");
        lambda.setPrenom(sc.nextLine());
        
        System.out.println("Merci de saisir le cne de l'etudiant");
        lambda.cne = sc.nextInt();
        sc.nextLine();
            
        return lambda;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + getId() + ", nom=" + getNom() + ", prenom=" + getPrenom() + ", cne=" + cne + '}';

    }
    
    public int getCne() {
        return cne;
    }

    public void setCne(int cne) {
        this.cne = cne;
    }
    
   
}
