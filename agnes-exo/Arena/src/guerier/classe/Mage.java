/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerier.classe;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Mage extends Avatar {
	
	static Scanner sc = new Scanner(System.in);
	
    public Mage() {
        super(150, 400, 150, 150, 400);
    }

    @Override
    public void saluer() {
        System.out.println("Sagesse s'en suis petit serpent !");
    }

    /*
     * 
     * @see guerier.classe.Avatar#attaquer(guerier.classe.Avatar)
     */
    @Override
    public void attaquer(Avatar adverse) {

        if (mp > 0) {

            System.out.println("Quelle attaque voulez vous faire");
            System.out.println("1: feu \n 2: eclair \n 3: baton");

            int saisie = sc.nextInt();

            switch (saisie) {
                case 1:
                    this.bouleDeFeu();
                    break;
                case 2:
                    this.eclair();
                    break;
                default:
                    this.attaqueBaton();
                    break;
            }

        } else {
        	System.out.println("plus de mana ! Vous attaquer au baton");
            this.attaqueBaton();
        }

    }

    
    
    
    /*
     * Les attaques
     */
    private int bouleDeFeu() {
        this.mp -= 40;
        return 50;
    }

    private int eclair() {
        this.mp -= 20;
        return 100;
    }

    private int attaqueBaton() {
        return 10;
    }
}
