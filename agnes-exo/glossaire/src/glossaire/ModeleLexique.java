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

    public static Lexique rechercheGlossaire(String mot) {

      Lexique lexique = new Lexique();

        try {

            /* Création de la connexion*/
            Connection connexion = startConnection();

            /* Création de l'objet gérant les requêtes */
            Statement declaration = connexion.createStatement();

            /* Requete */
            String query = "SELECT id ,mot, definition, type FROM lexique WHERE mot = '" + mot + "' LIMIT 1;";
            //System.out.println("Query " + query);

            /* Exécution d'une requête de lecture */
            ResultSet resultat = declaration.executeQuery(query);

            /* Récupération des données */
            while (resultat.next()) {
                
                lexique.setId(resultat.getInt("id"));
                lexique.setMot(resultat.getString("mot"));
                lexique.setDefinition(resultat.getString("definition"));
                lexique.setType(resultat.getString("type"));  
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
        return lexique;
    }

    public static ArrayList<Lexique> afficheEnsemble() {

        ArrayList<Lexique> tab = new ArrayList<>();

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
   
        Lexique lexique = new Lexique();
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
    public static boolean ajouterMot(String mot , String definition, String type) {
        boolean flag = false;
        try {
            
            /* Création de la connexion */
            Connection co = startConnection();
            Statement declaration = co.createStatement();

            /* Requete */
            String query = "INSERT INTO lexique (mot, definition, type) VALUES ("+'"'+ mot +'"'+","+'"'+ definition +'"'+ "," +'"'+ type +'"'+ ")";
            
            
            /* Execution d'une requete en écriture */
            int executeUpdate = declaration.executeUpdate(query);
            
            /* Traitement de l'insertion */
            flag = (executeUpdate==1);

            /* Fermeture de la connexion */
            closeConnection(co);
        } catch (SQLException e) {
            System.err.println("Erreur d'insertion d'un mot " + e.getMessage());
            
        }
        return flag;
    }

    public static boolean updateMot(String originalMot ,String mot , String definition, String type) {
       boolean flag = false;
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
            flag = (executeUpdate == 1);

            /* Fermeture de la connexion */
            closeConnection(co);
        } catch (SQLException e) {
            System.err.println("Erreur de Mise à jour " + e.getMessage());
        }
        return flag;
    }
    
    /**
     * Supression d'une categorie avec un mot
     *
     * @param mot
     */
    public static boolean supprimerCategorie(int id) {
        boolean flag = false;
        try {
            /* Création de la connexion */
            Connection co = startConnection();
            /* Création de l'objet gérant les requetes */
            Statement declaration = co.createStatement();

            /* Requete */
            String query = "DELETE FROM lexique WHERE id = "+"'" + id + "'" + "";
   
            /* Execution d'une requete en écriture */
            int executeUpdate = declaration.executeUpdate(query);
            
            /* Traitement de l'insertion */
           flag = (executeUpdate == 1);

            /* Fermeture de la connexion */
            closeConnection(co);
        } catch (SQLException e) {
            System.err.println("Erreur de suppression  " + e.getMessage());
        }
        return flag;
    }
    
}
