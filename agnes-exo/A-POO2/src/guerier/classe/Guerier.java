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
public class Guerier extends Avatar{

    public Guerier() {
        super(350, 250, 25, 350);
    }

    @Override
    public void saluer() {
        System.out.println("kröm boira votre sang !");
    }

    @Override
    public void attaquer(Avatar adverse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

   
}
