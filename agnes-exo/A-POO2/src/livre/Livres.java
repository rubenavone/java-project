/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livre;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Livres {

    public static Scanner sc = new Scanner(System.in);
    private int id = 0;
    private static int count = 0;
   
    private String titre;
    private String auteur;
    private double prix;
    private static int bonus;
    private int essaie;

    public void saisir() {
        
        System.out.println("Faut essayer de rentrer l'album secret !");
        
        System.out.println("Merci d'entrée le nom du livre");
        titre = sc.nextLine();

        System.out.println("Merci de saisir l'auteur ");
        auteur = sc.nextLine();

        System.out.println("et Enfin le prix ");
        prix = sc.nextDouble();

        System.out.println(martinePetiteMaligne());
    }
    public void saisir2(Scanner sc){
         System.out.println("Faut essayer de rentrer l'album secret !");
        
        System.out.println("Merci d'entrée le nom du livre");
        titre = sc.nextLine();

        System.out.println("Merci de saisir l'auteur ");
        auteur = sc.nextLine();

        System.out.println("et Enfin le prix ");
        prix = sc.nextDouble();

        System.out.println(martinePetiteMaligne());
    }
    public String martinePetiteMaligne() {

        String indice = "";
        switch (titre) {
            case "Martine":
                indice = "Well played ta trouver";
                bonus = bonus + 200;
                break;
            case "Martine fait du poney":
                indice = "Well played ta trouver";
                bonus = bonus + 50;
                break;
            case "Martine fait du poney Le retour":
                indice = "Well played ta trouver";
                bonus = bonus + 400;
                break;
            case "Martine aime l'acrobranche":
                indice = "Well played ta trouver";
                bonus = bonus + 706;
                break;
            case "Martine joue a la play":
                indice = "Well played ta trouver";
                bonus = bonus + 1203;
                break;
            default:
                switch (essaie) {
                    case 0:
                        essaie++;
                        indice = "Dans martinique y a martine ???";
                        break;
                    case 1:
                        essaie++;
                        indice = "bon si tu met un nom d'album de martine tu gagne des points";
                        break;
                    case 2:
                        essaie++;
                        indice = "Essaie au moins de marquer juste Martine";
                        break;
                }
                break;

        }
        return indice;
    }

    public Livres() {
       this.id  = ++count;      
    }

    /**
     * **Get&Set***
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public static int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getEssaie() {
        return essaie;
    }

    public void setEssaie(int essaie) {
        this.essaie = essaie;
    }
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Livres.count = count;
    }
    /**
     * **************
     */
    /**
     * **************
     */
    /**
     * **************
     */
    @Override
    public String toString() {
        return "Livres{" + "id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + '}';
    }
}
