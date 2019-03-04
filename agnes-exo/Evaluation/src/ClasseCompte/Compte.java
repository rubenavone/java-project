/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseCompte;

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
    boolean checkPass;
    public String crypted = "*********";
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
    public String checkPassword(String pPassword){
        String checked = "";
        
        if (pPassword.equals(password)){
            checkPass = true;
        }else {
            checkPass = false;
        }
        
        if(checkPass == true){
            checked = "Mot de passe correct !";
        }else {
            System.out.println("Mot de passe incorecte !");
        }
        
        return checked;
    }
    
    @Override
    public String toString() {
        return "Compte{" + "id = " + id + ", login = " + login + ", password = " + crypted + '}';
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
