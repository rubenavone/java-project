package deuxEntier;

public class DeuxEntier {

	public static void main(String[] args) {
		/* Écrire un programme qui récupère deux entiers sur la "ligne de commande" et qui en
			affiche la somme en fenêtre console, comme dans cet exemple :
			23 + 25 = 48
			On vérifiera que les arguments fournis sont formés uniquement de chiffres, dans le cas
			contraire, le programme s’interrompra.
			*/
		
		
		int somme = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		
		System.out.println("la somme des deux argument est égale à : " + somme);
	}

}
