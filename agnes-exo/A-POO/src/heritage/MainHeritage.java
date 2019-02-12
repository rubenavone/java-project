package heritage;

public class MainHeritage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ville maVille = new Ville();
		Ville taVille = new Ville("Montpellier","France", 34000);
		Ville saVille = new Ville("Sète", "France", 34000);
		
		System.out.println(taVille);
		System.out.println(taVille.hashCode());
		System.out.println(taVille.getClass());
		System.out.println(taVille.getClass().getName());
		
		taVille.setNomDeVille("Regis-Land");*/
		
		Capitale capi = new Capitale();
		Capitale capitaine = new Capitale("Amsterdam", "Hollande" , 34000);
		
		capitaine.setMonument("Le quartier rouge");
		System.out.println(capitaine.decrisToi());
	}

}
