package user;

import java.time.LocalDate;
import java.time.Month;

public class UserMain {
	public static void main(String[] args) {

		/*  id
			civilite (Mr, Me ou Ml)
			nom
			prenom
			email
			tel (tel fixe)
			portable (tel portable)
			login
			pw (password)
			inscription (date d’inscription dans le système)*/


		User userOne = new User(); //instanciation de l'utilisateur numero 1
		User userTwo = new User(); //instanciation de l'utilisateur numero 2


		userOne.calculPw(); // Apllication de la methode de password qui ajoute nom + pw		
		userOne.affichage();

		userTwo.id = "2";
		userTwo.civilite = "Mme";
		userTwo.nom ="Girard";
		userTwo.prenom ="Jaqueline";
		userTwo.email = "Girard_Jaqueline@mail.com";
		userTwo.tel = "4342442424";
		userTwo.portable = "343434343434";
		userTwo.login = "Giridane";
		userTwo.pw = "";
		userTwo.inscription = LocalDate.of(2007,Month.NOVEMBER,29);

		userTwo.calculPw();
		userTwo.affichage();

	}


}
