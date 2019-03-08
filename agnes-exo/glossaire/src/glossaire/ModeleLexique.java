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
    public static String afficheDefinition() {

        String results = "";
        String resultsSwap = "";

        try {

            /* Création de la connexion*/
            Connection connexion = startConnection();

            /* Création de l'objet gérant les requêtes */
            Statement declaration = connexion.createStatement();

            /* Requete */
            String query = "SELECT id, mot, type , definition FROM lexique;";

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
     *
     */
    public static ArrayList afficheEnsemble() {

        ArrayList<Lexique> tab = new ArrayList<>();

        try {
            /* Création de la connexion*/
            Connection connexion = startConnection();

            /* Création de l'objet gérant les requêtes */
            Statement declaration = connexion.createStatement();

            /* Requete */
            String query = "SELECT id, mot, type , definition FROM lexique;";

            /* Exécution d'une requête de lecture */
            ResultSet resultat = declaration.executeQuery(query);

            /* Récupération des données */
            while (resultat.next()) {
                Lexique row = new Lexique();
                row.setId(resultat.getInt("id"));
                row.setMot(resultat.getString("mot"));
                row.setType(resultat.getString("type"));
                row.setDefinition(resultat.getString("definition"));

                //System.out.println(row);
                tab.add(row);
            }

            System.out.println(tab);
            
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
