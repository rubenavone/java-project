package get;


public class Main {

	public static void main(String[] args) throws Exception {
		
		//USER 1
		User user1 = new User();
		
		user1.affichage();
		
		user1=null;
		
		System.gc(); //Garbage collector appel du finalize()
		//String id, String nom, String civilite, String prenom, String email, String tel, String portable, String login, String pw, String inscription
		
		//USER 1 END 
		//USER 2
		
		User user2 = new User("1" ,"Navone","Mr","Ruben","ruben@mail.fr","020302030","0230230230", "rouproup", "pass","12 septembre 2034" );
		
		
		
		user2.affichage(); //Affichage user2
		
		user2 = null; //Nullification de l'instance user2
		
		System.gc(); //Garbage collector appel du finalize()
		
		//USER 2 END
		//USER 3
		User user3 = new User();
		
		user3.setId("2");
		user3.setCivilite("MR");
		user3.setNom("Girag");
		user3.setPrenom("Paul");
		user3.setEmail("Girag_paul@mail.fr");
		user3.setTel("034030043040");
		user3.setPortable("0340304034");
		user3.setLogin("GIRAGONDIN");
		user3.setPw("adadad");
		user3.setInscription("12 juin 1943");
		
		user3.affichage();
		
		user3 = null;
		
		System.gc();
		
		//USER 3 END 
	}

}
