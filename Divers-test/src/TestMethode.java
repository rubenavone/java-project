import java.util.Date;


public class TestMethode {

	public static void main(String[] args) {
		/*
		 * Test des methode, je met en commentaire ce que chaque methode fait 
		 * succeptile d'etre modifier 
		 */
		
		String testingThings = "Hello My name is ruben";
		
		int valeur = Integer.valueOf("54").intValue(); //convertie une chaine de caractere en int 
		
		System.out.println(valeur);
		
		
		System.out.println(testingThings.toLowerCase()); //convertie la chaine de caractere en minuscule
		System.out.println(testingThings.toUpperCase()); // convertie la chaine de caractere en majuscule
		System.out.println(testingThings.substring(3, 5)); // Selectionne une partie de la chaine de caractere la "lo"
		System.out.println(testingThings.toLowerCase().substring(7, 9)); // Utilisation de deux methode en une fois 
		
		//diver test sur les argument de la methode printf 
		//Date est recuperer avec la package java.util.date
		
		System.out.printf("%d \n"                     ,13);		
		System.out.printf("%4d \n"                    ,13);		
		System.out.printf("%04d \n"                   ,13);		
		System.out.printf("%f \n"                     ,3.14116);		
		System.out.printf("%.2f \n"                   ,3.14116);		
		System.out.printf("%s \n"                     ,"Test");		
		System.out.printf("%10s \n"                   ,"Test");		
		System.out.printf("%-10s \n"              ,"Test");		
		System.out.printf("%tD \n"                    , new Date());		
		System.out.printf("%tF \n"                    , new Date());		
		System.out.printf("%1$te %1$tb %1$ty \n"       , new Date());		
		System.out.printf("%1$tA %1$te %1$tB %1$tY \n", new Date());		
		System.out.printf("%1$tr \n"                  , new Date());
	}

}
