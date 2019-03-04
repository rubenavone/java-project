/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerier;

import guerier.classe.*;

/**
 *
 * @author ruben
 */
public class Main {
    public static void main(String[] args){
        Guerier g = new Guerier();
        g.saluer();
        
        Mage m = new Mage();
        m.saluer();
        
        Voleur v = new Voleur();
        v.saluer();
    }
}
