
import java.util.Scanner;

public class toUpLow {

	 public static void main(String[] args) {
       
		/*Écrire un programme permettant de lire le nom et le prénom d'un étudiant, ensuite
	     *transforme le nom en majuscule, la première lettre du prénom en majuscule et le reste en
		 *minuscule.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Merci d'entrée votre prenom");
		
		String firstName= sc.nextLine();

		System.out.println("Entre ton nom");
		
		String name = sc.nextLine();
		
		name = name.toUpperCase(); // Transformation du nom en majuscule
		
		System.out.println("Votre prenom en majuscule est : " + name) ;

		//Conversion de la premier lettre en majuscule

		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(); //Transformation de la premiere lettre du prenom en MAJ
		
		System.out.println("Votre prénom avec la premiere lettre en majuscule seulement est : " + firstName + " "+ name);
		
		/* 
		int a = 3;
		int b = 2;

		System.out.println(a);
		System.out.println(b);
		
		//Comment faire en sorte que b prennent la valeur de a
		//sans avoir de variable d'echange (swap)
		
		a = b + a ; // a = 5
		b = a - b ; // b = 3 
		a -= b;

		System.out.println(a);
		System.out.println(b);
	        */

	}
}

