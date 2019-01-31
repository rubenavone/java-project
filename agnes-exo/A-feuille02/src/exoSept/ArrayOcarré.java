package exoSept;

import java.util.Scanner;

public class ArrayOcarré {
		/*Écrire un programme qui crée un tableau comportant les valeurs des carrés des n
			premiers nombres impairs, la valeur de n étant lue au clavier et qui en affiche les valeurs
			sous la forme suivante :
			Exemple d’exécution :
			Combien de valeurs : 5
			1 a pour carre 1
			3 a pour carre 9
			5 a pour carre 25
			7 a pour carre 49
			9 a pour carre 81
			*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Merci de saisir la valeur a mettre au carrée");
		
		int n = scan.nextInt();
		
		/*for (int i = 1; i <= n; i+=2) {
			
			System.out.println(i * i);
		}*/
		
		for (int i = 0; i < n * 2; i++) {
			i++;
			System.out.println(i * i);
		}
		
			scan.close();
	}

}
