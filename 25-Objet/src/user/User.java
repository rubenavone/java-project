package user;

import java.time.LocalDate;
import java.time.Month;


public class User {

	String id = "1";
	String nom = "Cataplan";
	String civilite = "MR";
	String prenom = "jose";
	String email = "jose_cataplan@mail.com";
	String tel = "0304030403";
	String portable = "0340394204";
	String login = "spanishPowa";
	String pw = "pw";
	LocalDate inscription = LocalDate.of(2007,Month.NOVEMBER,29);

	/*public this(String id , String nom, String civilite, 
				String prenom, String email,String tel,
				String portable,String login,String pw,String inscription) {
		this.id = id;
		this.nom = nom;
		this.civilite = civilite;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.portable = portable;
		this.login = login;
		this.pw = pw;
		this.inscription = inscription;

	}*/

	public String calculPw() {
		pw = nom.toLowerCase() + "pw";

		return pw;

	}
	public  void affichage() {
		/********************
		 ***Info relative****
		 ********************/
		System.out.println("Nous allons afficher l'utilisateur numero  " + this.id +"\n \n ");
		
		System.out.println("votre nom est " + this.nom);
		System.out.println("votre civilité est " + this.civilite);
		System.out.println("votre prenom est " + this.prenom);
		System.out.println("votre email est " + this.email);
		System.out.println("votre tel est " + this.tel);
		System.out.println("votre portable est " + this.portable);
		System.out.println("votre login est " + this.login);
		System.out.println("votre mot de passe est " + this.pw);
		System.out.println("La date a laquelle vous vous ete inscrit est " + this.inscription);
	}
}
