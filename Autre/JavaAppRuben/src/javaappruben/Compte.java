/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappruben;

/**
 *
 * @author ruben
 */
public class Compte {
    
    /***************/
    /****ATRIBUTS***/
    /***************/
    private int id;
    private String login;
    private String password;

    /**
     *
     * @param id
     * @param login
     * @param password
     */
    public Compte(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }
    /**
     * Méthode de traitement du mot de passe
     * Check si les mot de passe corresponde
     * renvoie true or false selon;
     * @param pPassword
     * @return 
     */
    public boolean checkPassword(String pPassword){
        String checked = " incorecte !";
        boolean checkPass = false;
        if (pPassword.equals(password)){
            checkPass = true;
            checked = " correct !";
        }
        System.out.println("Mot de passe " + checked);
        return checkPass;
    }
    
    @Override
    public String toString() {
        return "Compte{" + "id = " + id + ", login = " + login + ", password = ****** }";
    }

    /******************/
    /*****GET & SET****/
    /******************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
