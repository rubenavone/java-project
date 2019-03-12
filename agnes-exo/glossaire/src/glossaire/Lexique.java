/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glossaire;

/**
 *
 * @author ruben
 */
public class Lexique {
    
    private int id;
    private String mot;
    private String definition;
    private String type;
     
    ///////SET & GET////////
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

