package animaux;

public abstract class Animal {
	private String nom = "Georges";
	private int nbPattes;
	private String pellage = "poils";
	
	public Animal(int nbPattes, String pellage) {
		this.nbPattes = nbPattes;
		this.pellage = pellage;
	}
	
	abstract public void listen();
	abstract public void deplacement();
	abstract public void manger();
	abstract public void popo();
	
	@Override
	public String toString() {
		return this.getClass().getName() + "[nom=" + nom + ", nbPattes=" + nbPattes + ", pellage=" + pellage + "]";
	}
	public String getPellage() {
		return pellage;
	}
	public void setPellage(String pellage) {
		this.pellage = pellage;
	}
	public int getNbPattes() {
		return nbPattes;
	}
	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
