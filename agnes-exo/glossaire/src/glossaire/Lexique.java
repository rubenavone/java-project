
package glossaire;


import java.util.ArrayList;


/*
 * @author ruben
 */
public class Lexique extends Modele {

    private int id;
    private String mot;
    private String definition;
    private String type;

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
        return "Lexique{" + "id= \n" + id + ", nom= \n" + mot + "," + hashCode() +'}';
    }

    public String[] toArray(){
        String[] tab = {this.getMot(), this.getType()};
        return tab;
    }
}
