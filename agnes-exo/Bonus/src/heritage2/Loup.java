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
public class Loup extends Animals {

    public void hurler() {
        System.out.println("Ahouuuuuuuuu");
    }

    public void manger() {
        System.out.println("Il mange du mouton");
    }

    public void chasser() {
        System.out.println("le loup chasse");
    }

    @Override
    public String toString() {
        return "loup{" + "pelage=" + pelage + ", age=" + age + ", mechant=" + mechant + '}';
    }
    

}
