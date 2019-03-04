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
    
    protected int hp, mp, puissance, vieMax, niveau;
    protected String nom;
    protected float or;

    public Avatar(int hp, int mp, int puissance, int vieMax) {
        this.hp = hp;
        this.mp = mp;
        this.puissance = puissance;
        this.vieMax = vieMax;
       
    }
    
    
    
    public abstract void saluer();
    
    public abstract void attaquer(Avatar adverse);
    
    public void boirePotion(){
        this.hp += .3*vieMax;
    }
    
     
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
