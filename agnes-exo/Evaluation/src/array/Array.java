/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ruben
 */
public class Array {
    public static void main(String[] args){
        String[] login = {"toto", "titi", "tata"};
        String[] password = {"123", "456", "789"};
        
        for (int i = 0; i< login.length; i++){
            System.out.println("Le mot de passe de " + login[i] + " est " + password[i]);
        }
        
    }
}
