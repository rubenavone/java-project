package animaux;

public class Chat extends Animal {
	
	public void listen() {
		System.out.println("Le chat fait MIAAAAAAAAOU !");
	}
	
	public void deplacement() {
		System.out.println("la graçe du chat en mouvement !");
	}
	
	public void manger() {
		System.out.println("Les chat sont carnivore !");
	}
	
	public void popo() {
		System.out.println("il font des mini popo");
	}

	public Chat() {
		super(4, "long");
	}
	
}
