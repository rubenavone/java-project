/*
 * Be Happy
 */
package glossaire;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agnes extends ruben
 */
public class ModeleCategorie extends Modele {
    
    /**
     * Permet de regouper les éléments d'une requete 
     * dans une array liste qui sera traiter ulterieurement pour
     * l'affichage 
     * @return 
     */
    public static ArrayList<Lexique> afficheCategoriesOriginal() {
        
        ArrayList<Lexique> results = new ArrayList<>();

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
                row.setMot(resultat.getString("mot"));
//                {
//                    resultat.getInt("id"), 
//                    resultat.getString("mot"),
//                    resultat.getString("type"),
//                    resultat.getString("definition")
//                };
                //System.out.println(Arrays.toString(row));
                results.add(row);

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

   /**
    * Méthode permettant d'ajouter 
    * une entrée dans la base de donnée 
    * elle prend trois paramètre
    * @param mot
    * @param definition
    * @param type 
    */
    public static void ajouterMot(String mot , String definition, String type) {
        try {
            /* Création de la connexion */
            Connection co = startConnection();

            /* Création de l'objet gérant les requetes */
            Statement declaration = co.createStatement();

            /* Requete */
            String query = "INSERT INTO lexique (mot, definition, type) VALUES ("+'"'+ mot +'"'+","+'"'+ definition +'"'+ "," +'"'+ type +'"'+ ")";
            System.out.println(query);
            /* Execution d'une requete en écriture */
            int executeUpdate = declaration.executeUpdate(query);

            /* Traitement de l'insertion */
            if (executeUpdate == 1) {
                System.out.println("Insertion du mot effectuée ! ");
            } else {
                System.out.println("Insertion du mot non effectuée.");
            }

            /* Fermeture de la connexion */
            closeConnection(co);
        } catch (SQLException e) {
            System.err.println("Erreur d'insertion d'un mot " + e.getMessage());
        }
    }

    public static void updateMot(String originalMot ,String mot , String definition, String type) {
        try {
            /* Création de la connexion */
            Connection co = startConnection();

            /* Création de l'objet gérant les requetes */
            Statement declaration = co.createStatement();

            /* Requete */
            String query = "UPDATE lexique SET mot = "+'"'+ mot +'"'+", definition = "+'"'+ definition +'"'+", type = "+'"'+ type +'"'+" WHERE mot = "+'"'+ originalMot +'"';
              
            System.out.println(query);
            /* Execution d'une requete en écriture */
            int executeUpdate = declaration.executeUpdate(query);

            /* Traitement de l'insertion */
            if (executeUpdate == 1) {
                System.out.println("Mise à jour effectuée ! ");
            } else {
                System.out.println("Mise à jour non effectuée.");
            }

            /* Fermeture de la connexion */
            closeConnection(co);
        } catch (SQLException e) {
            System.err.println("Erreur de Mise à jour " + e.getMessage());
        }
    }

    
    /**
     * Supression d'une categorie avec un mot
     *
     * @param mot
     */
    public static void supprimerCategorie(String mot) {
        try {
            /* Création de la connexion */
            Connection co = startConnection();
            /* Création de l'objet gérant les requetes */
            Statement declaration = co.createStatement();

            /* Requete */
            String query = "DELETE FROM lexique WHERE mot = "+"'" + mot + "'" + "";
   
            /* Execution d'une requete en écriture */
            int executeUpdate = declaration.executeUpdate(query);
            
            /* Traitement de l'insertion */
            if (executeUpdate == 1) {
                System.out.println("Suppression du mot effectuée ! ");
            } else {
                System.out.println("Suppression du motnon effectuée.");
            }

            /* Fermeture de la connexion */
            closeConnection(co);
        } catch (SQLException e) {
            System.err.println("Erreur de suppression  " + e.getMessage());
        }
    }

}
