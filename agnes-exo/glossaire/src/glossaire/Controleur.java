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
             boolean flag = ModeleLexique.ajouterMot(mot, definition, type);
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
             boolean flag = ModeleLexique.updateMot(originalMot, mot, definition, type);
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
    
    public  void controlDelete(String mot , int id, JFrame frame){
        
        if(!mot.isEmpty()){
             boolean flag = ModeleLexique.supprimerCategorie(id);
                     
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
    
    public static void controlSearchDelete(Vue frame){
        ///remplis un tableau avec les éléménts récuperer via la recherche///
        frame.lexique = ModeleLexique.rechercheGlossaire(frame.deleteSearchField.getText());
        int id = frame.lexique.getId();

        if (id == 0) {
            JOptionPane.showMessageDialog(frame, "L'entrée n'existe pas");
        } else {

            ///setLineWrap force le retour à la ligne///
            frame.deleteDefiArea.setLineWrap(true);
            ///Remplis les champs avec les éléments du tableau///
            frame.deleteMotField.setText(frame.lexique.getMot());
            frame.deleteDefiArea.setText(frame.lexique.getDefinition());
            frame.deleteCatField.setText(frame.lexique.getType());
        }
    }
}
