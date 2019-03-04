/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage2;

/**
 *
 * @author ruben
 */
public class MainAnimal {

    public static void main(String[] args) {
        
        Loup crocBlanc = new Loup();
        crocBlanc.setAge(2);
        crocBlanc.setMechant(true);
        crocBlanc.setPelage("blanc");

        Chat garfield = new Chat();

        garfield.setAge(8);
        garfield.setPelage("roux");

        Chat tom = new Chat("gris", 4, false);
        
        System.out.println(tom.toString());
        
        Chien pif = new Chien("marron" , 150, false);
        
        System.out.println(pif.toString());
        
        crocBlanc.hurler();
        crocBlanc.manger();
        crocBlanc.chasser();
        
        
        garfield.hurler();
        garfield.manger();
        garfield.chasser();
        
        pif.hurler();
        pif.manger();
        pif.chasser();
    }
}
