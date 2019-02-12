package heritage;

public class Capitale extends Ville {
	
	private String monument = "Mcdo";
	
	public Capitale(String nomVille, String nomPays, int nbHab, String monument) {
		super(nomVille, nomPays, nbHab);
		
		this.monument = monument;
	}
	
	public Capitale(String nomVille, String nomPays, int nbHabitant) {
		super(nomVille, nomPays, nbHabitant); //constructeur de la ville
		System.out.println("Construction d'un capitale avec des paramètres");
	}

	public Capitale() {
		super(); //Constructeur de la ville sans paremètre
		System.out.println("Construction d'une capitale");
		
	}

	//Retourne la description de la ville
    public String decrisToi() {
    	return super.decrisToi() + " " + this.monument;
    }

    public void test() {
    	System.out.println("monument " + this.monument);
    }
    
	/////SETTER AND GETTER/////
	public String getMonument() {
		return monument;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	
	
}
