package animaux;

public class Chien extends Animal {
	
	public Chien() {
		super(4, "long");
	}
	
	public void listen() {
		System.out.println("Le chien fait wouuuuuf !");
	}
	
	public void deplacement() {
		System.out.println("le chien court comme un bourin!");
	}
	
	public void manger() {
		System.out.println("Les chien sont omnivore !");
	}
	
	public void popo() {
		System.out.println("il font des gros popo");
	}
	
}

	

