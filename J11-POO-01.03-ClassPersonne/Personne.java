
public class Personne {
	/**
	* Attributs d'un objet issu de la classe Personne
	* */
	String strNom;
	int age;
	
	/** Creates a new instance of Personne */
	public Personne ()
	{
		strNom= "Illustre inconnu aaa " ;
	}
	/** Creates a new instance of Personne */
	public Personne (String str1)
	{
		strNom = str1;
	}
//	public Personne (String nom)
//	{
//		strNom = nom;
//	}
	/** Creates a new instance of Personne */
	public Personne (String nom, int n)
	{
		strNom= nom;
		age = n;
	}
}