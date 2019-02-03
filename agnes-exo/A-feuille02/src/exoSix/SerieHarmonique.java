package exoSix;

import java.util.Scanner;

/*Exercice 6
Question 1 :
Écrire un programme JAVA calculant la somme des n premiers termes de la "série
harmonique", c’est-à-dire la somme :
1 + 1/2 + 1/3 + 1/4 + ..... + 1/n
La valeur de n sera lue en donnée.
Exemple d’exécution :
Donnez un entier :2
La somme est : 1.5
Question 2 :
Améliorer le programme précédant afin de lire l'entier n, lors de l'exécution du programme.
Exemple d’exécution :
C:\>java Serie 2
La somme est : 1.5 */


public class SerieHarmonique {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre un nombre ");
		
		double n = scan.nextDouble();
		
		double e = 1;
		
		double f ;
	
		
		for (double i = 2; i <= n; i++) {
			f = e + 1/i;
			e = f;
			System.out.println("le résultat est " + (Math.round(f * 10.0))/10.0);
			
		}
		scan.close();
	}
	
}
