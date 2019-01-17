
import java.util.Scanner;

/**
 * Rédigez une fonction expandedFirstForm qui développe un nombre en un produit de facteurs premiers.
 * 
   Exemple :

   expandedFirstForm(12); // Should return '2*2*3'
   expandedFirstForm(42); // Should return '2*3*7'
   expandedFirstForm(240); // Should return '2*2*2*2*3*5'

 * @author simoccjavmonp14
 */
public class Calcul{

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); // recuperer saisie 
        int num1 = num.nextInt();
       CalculMeth.expandedFirstForm(num1);
    }

}


