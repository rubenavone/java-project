/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glossaire;

import static glossaire.Modele.closeConnection;
import static glossaire.Modele.startConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author ruben
 */
public class ModeleLexique {

    /*
     *Cette methode  affiche uniquement les definition
     *    
     */
    public static String afficheDefinition(int id) {

        String results = "";
  
        try {

            /* Création de la connexion*/
            Connection connexion = startConnection();

            /* Création de l'objet gérant les requêtes */
            Statement declaration = connexion.createStatement();

            /* Requete */
            String query = "SELECT definition FROM lexique WHERE id = " + id +";";

            /* Exécution d'une requête de lecture */
            ResultSet resultat = declaration.executeQuery(query);

            /* Récupération des données */
            while (resultat.next()) {
                results = "definition: \n" + resultat.getString("definition") + "\n";
            }

            /* fermeture du resultatSet */
            resultat.close();
            /* fermeture de la connexion */
            closeConnection(connexion);

        } catch (SQLException e) {
            System.err.println(
                    "Erreur d'affichage des catégories: " + e.getMessage()
            );
        }
        return results;
    }
    

    /*
     *Une autre façon de faire,
     *avec une array list pour afficher dans la table
     */
    public static ArrayList<Lexique> afficheEnsemble() {

        ArrayList<Lexique> tab = new ArrayList<Lexique>();
       
        try {
            /* Création de la connexion*/
            Connection connexion = startConnection();

            /* Création de l'objet gérant les requêtes */
            Statement declaration = connexion.createStatement();

            /* Requete */
            String query = "SELECT * FROM lexique ;";

            /* Exécution d'une requête de lecture */
            ResultSet resultat = declaration.executeQuery(query);
            
            /* Récupération des données */
            while(resultat.next()) {
                Lexique lexique = new Lexique();
             
                lexique.setId(resultat.getInt("id"));
                lexique.setMot(resultat.getString("mot"));
                lexique.setType(resultat.getString("type"));              
                tab.add(lexique);              
            }   
  
            
            /* fermeture du resultatSet */
            resultat.close();
            
            /* fermeture de la connexion */
            closeConnection(connexion);
            
        } catch (SQLException e) {
            System.err.println(
                    "Erreur d'affichage des catégories: " + e.getMessage()
            );
        }
        return tab;
    }
    
    
}
