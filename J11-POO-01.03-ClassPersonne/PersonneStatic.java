
public class PersonneStatic{

	String strNom;
	int age;
	
	static int ageMaxi;
	
	/** Creates a new instance of Personne */
	public Personne ()
	{
		strNom= "Illustre inconnu " ;
		ageMaxi = 100;
	}
	/** Creates a new instance of Personne */
	public Personne (String str1)
	{
		strNom= str1;
	}
	/** Creates a new instance of Personne */
	public Personne (String strNom, int n)
	{
		this.strNom= strNom;
		age = n;
	}
}