package classa;

public class Application {

	public static void main (String[] args) {
		ClassA classA = new ClassA();  // Instanciation de la class ClassA en utilisant le constructeur par default 
		
		int cylindre = classA.cylindre;
		
		String couleurA = classA.couleur;
		
		couleurA = "jaune";
		
		System.out.println(couleurA);
		
		System.out.println(cylindre);
		
		ClassA.nbRouesMotrice = "5";
	}
	
}
