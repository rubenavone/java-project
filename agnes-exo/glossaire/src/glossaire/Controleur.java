/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glossaire;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class Controleur extends Modele {
    /**
     * Mises en place du fichier de control 
     * Celui ci verifira avant d'executer les 
     * méthode si les champ ne sont pas vide 
     * etc
     */
        String mess = "insertion effectuer";
        String errMess = " Erreur dans l'insertion";
        String empty = "Le champ est vide";
        
    public void controlCreate(String mot, String definition, String type, JFrame frame){
            
        if(!mot.isEmpty() || !type.isEmpty() || !definition.isEmpty() ){
             boolean flag = ModeleCategorie.ajouterMot(mot, definition, type);
             if(flag != false){
                 //popup qui apparais si la condition est correcte
                 JOptionPane.showMessageDialog(frame, mess,mess, JOptionPane.INFORMATION_MESSAGE);
             }else{
                 JOptionPane.showMessageDialog(frame, errMess,errMess, JOptionPane.INFORMATION_MESSAGE);
             }
        }else {
            JOptionPane.showMessageDialog(frame, empty,empty, JOptionPane.INFORMATION_MESSAGE);
        }
            
    }
    public void controlUpdate(){
        
    }
    public void controlDelete(){
    
    }
    
}
