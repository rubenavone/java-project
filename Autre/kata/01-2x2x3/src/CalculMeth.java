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
public class CalculMeth {
    public static void expandedFirstForm(int result) {

        int facteur ; 
        String test = "";
        

        for (int i = 2; i <=result; i++) {
            

            if(result%i==0) {
                result/= i;
		facteur = i;
                i= 1;
                test  += facteur  + "*";
                

            } 
        }
        
        System.out.print(test.substring(1, test.lengt() -1);

    }


}


