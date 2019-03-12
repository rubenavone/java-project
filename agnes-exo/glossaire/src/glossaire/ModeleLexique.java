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
    public static String afficheDefinition(String mot) {

        String results = "";

        try {

            /* Création de la connexion*/
            Connection connexion = startConnection();

            /* Création de l'objet gérant les requêtes */
            Statement declaration = connexion.createStatement();

            /* Requete */
            String query = "SELECT definition FROM lexique WHERE mot = '" + mot + "';";

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

    public static String[] rechercheGlossaire(String mot) {

        String[] results = new String[3];

        try {

            /* Création de la connexion*/
            Connection connexion = startConnection();

            /* Création de l'objet gérant les requêtes */
            Statement declaration = connexion.createStatement();

            /* Requete */
            String query = "SELECT mot, definition, type FROM lexique WHERE mot = '" + mot + "';";

            /* Exécution d'une requête de lecture */
            ResultSet resultat = declaration.executeQuery(query);

            /* Récupération des données */
            while (resultat.next()) {
                results[0] = resultat.getString("mot") + "\n";
                results[1] = resultat.getString("definition") + "\n";
                results[2] = resultat.getString("type") + "\n";
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
    public static ArrayList<Modele> afficheEnsemble() {

        ArrayList<Modele> tab = new ArrayList<Modele>();

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
            while (resultat.next()) {
                Modele lexique = new Modele();

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
