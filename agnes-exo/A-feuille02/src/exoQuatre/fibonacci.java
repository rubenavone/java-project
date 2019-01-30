package exoQuatre;

public class fibonacci {

	public static void main(String[] args) {
			/*  
			 *La suite de Fibonacci est définie par :
			 *f1 = 1,
			 *f2 = 1 et fn+2 = fn+1 + fn
			 *Ecrire une fonction calculant le Nième élément de la suite.
			 *Exemple d’exécution :
			 *Donnez la valeur de n :
			 *5
			 *le 5ième élément de la suite est : 8
			 *fonction fibo(n): 
				// entrée : un nombre entier n
				// sortie : le terme de rang n de la suite de Fibonacci
				//
				// deux premiers cas : fibo(0) est égal à 0 et fibo(1) est égal à 1
				si (n ≤ 1)
				  renvoyer n 
				// récurrence à partir du terme de rang 2  
				sinon 
				  renvoyer fibo(n - 1) + fibo(n - 2)
				fin de la fonction
			 */
		
		int n = 5;
		
		int f0 = 0;
		int f1 = 1;
		int f2 = 0;
		
		for(int i = 0; i < n; i++) {
			
			f1 += f0;
			f0 ++;
			
			System.out.println(f1);
			
		}
				 
		
	}

}
