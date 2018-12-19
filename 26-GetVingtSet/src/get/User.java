package get;

public class User {

	private String id;
	private String nom;
	private String civilite;
	private String prenom;
	private String email;
	private String tel;
	private String portable;
	private String login;
	private String pw ;
	private String inscription;
	/****************
	 ******SET*******
	 ******GET*******
	 ****************/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}	
	public void setNom(String nom) {
		this.nom = nom;
	}	
	public String getCivilite() {
		return civilite;
	}
	
	
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPortable() {
		return portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getInscription() {
		return inscription;
	}
	public void setInscription(String inscription) {
		this.inscription = inscription;
	}
	
	public User(String id, String nom, String civilite, String prenom, String email, String tel, String portable, String login, String pw, String inscription) {
		this.setId(id);
		this.setNom(nom);
		this.setCivilite(civilite);
		this.setPrenom(prenom);
		this.setEmail(email);
		this.setTel(tel);
		this.setPortable(portable);
		this.setLogin(login);
		this.setPw(pw);
		this.setInscription(inscription);
	}
	public User() {
		
	}
	public void affichage() {
		
		/********************
		 ***Info relative****
		 ********************/
		
		System.out.println("Nous allons afficher l'utilisateur numero " + getId() +"\n \n ");		
		System.out.println("votre nom est " + getNom());
		System.out.println("votre civilité est " + getCivilite());
		System.out.println("votre prenom est " + getPrenom());
		System.out.println("votre email est " + getEmail());
		System.out.println("votre tel est " + getTel());
		System.out.println("votre portable est " + getPortable());
		System.out.println("votre login est " + getLogin());
		System.out.println("votre mot de passe est " + getPw());
		System.out.println("La date a laquelle vous vous ete inscrit est " + getInscription());
	}
	
	public void finalize() {
		System.out.println("Objet detruit !");
	}
}
