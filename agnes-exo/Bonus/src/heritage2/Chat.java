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
public class Chat extends Animals{
    int nbpatte;
 
    
    Chat(){
        
    }
    
    public Chat(String pelage, int age, boolean mechant) {
        super(pelage, age, mechant); //Fait appel au constructeur du parent   
        System.out.println("creation d'un Chat");
        
    }


    @Override
    public String toString() {
        return "Chat{" + "pelage=" + pelage + ", age=" + age + '}';
    }

    @Override
    public void chasser() {
        
    }
    
    public void hurler(){
        
    }

}
