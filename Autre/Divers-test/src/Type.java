
public class Type {

	public static void main(String[] args) {
		/* 
		 * Divers test autour du cours fournis par agnes
		 */
		int distance;
		//distance = new integer(3000000000);//On nous signifie donc que le chiffre est 'out of range'
		
		distance = Integer.parseUnsignedInt("3000000000"); 
		
		System.out.println("Affichage en tant que int" + distance);
		System.out.println("Affichage en tant que int non signé : " + Integer.toUnsignedString(distance));
		
		//Teste divers pour les caractere d'echappement et placement d'unicode 
		//https://unicode-table.com/fr/#tai-tham
		System.out.println("\u20AC"); //signe dollar 
		System.out.println("\u0398"); // si le code est exprimer U+ il suffit de retirer le plus
		System.out.println("\'");
	}

}
