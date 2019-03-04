/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage2;

/**
 *
 * @author ruben
 */
abstract public class Animals {
    
    protected String pelage;
    protected int age;
    protected boolean mechant;
    
    /****************/
    /*****Constru****/
    /****************/
    
    public Animals(){
        System.out.println("Creation d'un animal");
        
    }
    
    public Animals(String pelage, int age, boolean mechant){
        System.out.println("Creation d'un animal");
        
        this.pelage = pelage;
        this.age = age;
        this.mechant = mechant;
    }
    
    /**************/
    /****Methode***/
    /**************/
    public void manger(){
        System.out.println("mange comme tout les animaux !");
    }
    
    abstract public void chasser();
    
    @Override
    public String toString() {
        return "animals{" + "pelage=" + pelage + ", age=" + age + ", mechant=" + mechant + '}';
    }
    
    /***********/
    /**set&get**/
    /***********/
    
    public String getPelage() {
        return pelage;
    }

    public void setPelage(String pelage) {
        this.pelage = pelage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMechant() {
        return mechant;
    }

    public void setMechant(boolean mechant) {
        this.mechant = mechant;
    }
    
}
