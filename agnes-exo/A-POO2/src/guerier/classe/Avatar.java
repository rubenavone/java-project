/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerier.classe;

/**
 *
 * @author ruben
 */

abstract class Avatar { //Par default c'est public
    
    protected int hp, mp, puissance, vieMax, niveau, mpMax;
    protected String nom;
    protected float or;

    public Avatar(int hp, int mp, int puissance, int vieMax, int mpMax) {
        this.hp = hp;
        this.mp = mp;
        this.puissance = puissance;
        this.vieMax = vieMax;
       
    }
   
    
    
    /*
     * ABSTRACT
     * Méthode d'attaque qui prend en paramètre un adversaire
     */
    public abstract void attaquer(Avatar adverse);
    
    public abstract void saluer();
    
    /*
     * Methode
     *  boire une potion
     */
    public void boirePotionVie(){
        this.hp += .3*vieMax;
    }
    public void boirePotionMana(){
        this.hp += .3*mpMax;
    }
    
    /*
     * set & get
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
