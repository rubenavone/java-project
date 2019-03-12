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
        String mess = "Opération effectuer";
        String errMess = "Erreur lors de l'operation";
        String empty = "L'un des champ est vide";
        
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
    
    public void controlUpdate(String originalMot, String mot, String definition, String type , JFrame frame){
       
        if(!originalMot.isEmpty() || !mot.isEmpty() || !type.isEmpty() || !definition.isEmpty() ){
             boolean flag = ModeleCategorie.updateMot(originalMot, mot, definition, type);
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
    
    public void controlDelete(String mot, JFrame frame){
        
        if(!mot.isEmpty()){
             boolean flag = ModeleCategorie.supprimerCategorie(mot)
                     ;
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
    
}
