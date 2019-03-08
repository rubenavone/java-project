/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glossaire;

import static glossaire.Modele.closeConnection;
import static glossaire.Modele.startConnection;
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @author ruben
 */
public class Lexique {

    private static int id;
    private static String mot;
    private static String definition;
    private static String type;

    

    public static String afficheArray(ArrayList object) {
        String results = " ";
        String resultsSwap = " ";

        for (Object object1 : object) {
            resultsSwap = object1.toString();

            results += resultsSwap;
        }

        return results;
    }

    public static Object[] convertArrayList(ArrayList object) {
        Object[] o = object.toArray();
        return o;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Lexique{" + "id= \n" + id + ", nom= \n" + mot + ", definition= \n" + definition + ", type= \n" + type + '}';
    }

    
    public String[] toArray(){
        String[] tab = {this.getMot(), this.getDefinition()};
        return tab;
    }
}
