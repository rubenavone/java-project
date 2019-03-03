package lesson_1_4;

public class Lesson_1_4 {

	public static void main(String[] args) {
		/*
		 * Chapitre sur les condition ;
		 * Rappel sur les opérateur logiques 
		 * == teste l'égalité
		 * != teste l'inégalité 
		 * < Strictemente inférieur
		 * <= inférieur ou égal
		 * > Strictement supérieur
		 * >= Supérieur ou égal
		 * && opérateur et 
		 * || opérateur ou 
		 * ? opérateur ternaire 
		 */
		
		
		//Je declare des variable pour les test
		
		int numberOne = 3;
		int numberTwo = 5;
		int numberThree = 3;
		
		/*
		 * Dans ce cas bien précis on ce rend compte que if 
		 * n'entre que dans la premiere condition 
		 * effectivement cela ne sert pas a grand choses dans le sens 
		 * ou même si les autres condition sont respecter il ne rentrera que dans la première 
		 * pour rappel if = si
		 * else if = sinon si
		 * else = sinon
		 * Il teste l'expression et renvoie un booléen : true || false ; 
		 */
		
		if(numberOne != numberTwo ) {
			System.out.println("Numero un et deux sont diferent");
		}else if(numberOne == numberThree) {
			System.out.println("Numer un et trois sont égaux");
		}else if( numberTwo == numberThree) {
			System.out.println("Jamais je ne verrais ce message");
		}else {
			System.out.println("Ce Message sert a rien pour le coup");
		}
		
		/*
		 * On continue nos essaie avec d'autre exemple
		 * Dans ce cas on teste l'infériorité stricte
		 */
		
		if( numberOne < 3) {
			System.out.println("NumberOne est inférieur a trois");
		}else {
			System.out.println("NumberOne est supérieur a trois");
		}
		
		/*
		 * pour rappel on peut également faire des condition multiple
		 * avec des opérateur logique && et || ou
		 * Ci dessous je montre un exemple de switch case 
		 */
		
		switch (numberOne) {
		case 0:
			System.out.println("votre chiffre vaut 0");
			break;
		case 1:
			System.out.println("Il vaut un");
			break;
		case 2: 
			System.out.println("il vaut deux");
			break;
		case 3:
			System.out.println("il vaut trois");
			break;
		case 4:
			System.out.println("il vaut quatre");
			break;
		default:
			System.out.println("case par default");
			break;
		}
		
		/*
		 * La je vais montrer un cas particulier que je n'ai pas vus 
		 * autant de fois que je l'aurais voulus
		 * le ternaire
		 */
		//variable
		
		int x = 10, y =20;
		
		int max = (x < y) ? y : x; //maintenant max vaut 20
		
		
		
	}

}
