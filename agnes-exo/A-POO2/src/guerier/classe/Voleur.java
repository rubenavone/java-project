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
public class Voleur extends Avatar {

    public Voleur() {
        super(125, 20, 100, 125);
    }

    @Override
    public void saluer() {
        System.out.println("L'oeil vif proche des poches");
        this.or++;
    }

    @Override
    public void attaquer(Avatar adverse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

 
    
}
