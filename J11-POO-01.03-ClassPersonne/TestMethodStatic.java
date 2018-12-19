
public class TestMethodStatic
{
	public TestMethodStatic ()
	{
		
		/*
		 * Appel d'une methode de classe
		 * Attention, une modification sur une variable de classe reste mémorié�e au niveau de la classe
		 * 
		 */

		//  p1.setNAgeMaxi(11);
		PersonneStatic.setNAgeMaxi(11);

		PersonneStatic p2 = new PersonneStatic (1);
		affiche(p2);
		
		// le constructeur personne() modifie la valeur de nAgeMaxi
		PersonneStatic p1 = new PersonneStatic ();
		affiche(p1);
		
		// la modification perdure
		PersonneStatic p3 = new PersonneStatic (1);
		affiche(p3);

	}
	
	public void affiche(PersonneStatic p) {
		System.out.println("PersonneStatic : " + p.strNom + " age : " + p.nAge + " age Max : " + PersonneStatic.nAgeMaxi);
	}
	
	public static void main (String[] args)
	{
		new TestMethodStatic();
	}
}