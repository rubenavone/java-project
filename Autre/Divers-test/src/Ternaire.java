
public class Ternaire {

	public static void main(String[] args) {
		// Déclaration des variable 
		int x = 10, y = 20;
		
		//SI x est inferieur a y (x > y)
		//alors Cas 1 max vaut y ;
		int max = (x < y) ? y : x ;
		//SI x est superieur a y 
		//alors  min vaut x
		int min = (x > y) ? y : x ;
		
		System.out.println(max); //Maintenant, max vaut 20
		System.out.println(min); //Maintenant, min vaut 10
		
	}

}
