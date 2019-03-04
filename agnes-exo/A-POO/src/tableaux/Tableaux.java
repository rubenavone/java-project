package tableaux;

/*
Correction de l'exercice 1 feuille 1 POO
 */
public class Tableaux {

    private int n; // par default 0
    private int[] tab; // = null
    private static int count;


    public Tableaux() {
        count++;
    }

    public Tableaux(int n, int[] tab) {
        this.n = n;
        this.tab = tab;
        count++;

    }

    public Tableaux(int n) {
        this.n = n;
        this.tab = new int[n];
        count++;
        for (int i = 0; i < n; i++) {
            this.tab[i] = i++;
        }
    }

    public void affiche() {
        System.out.println("Objet tableau de " + n + " élément");
        System.out.print("[");
        for (int entier : tab) {
            System.out.print(entier + ", ");
        }
        System.out.println("Le compteur est égale à" + Tableaux.getCount());
        
    }

    public static void main(String[] args) {
        Tableaux tab = new Tableaux(4);
        tab.affiche();
        
    }
    
    public void remplirRandom(){
        for (int i = 0; i < n; i++) {
            this.tab[i] = (int) (Math.random()*10);
        }
    }
    
    public int maximum(){
        int nbMax = 0;
        for (int i = 0; i < n; i++) {
            if(tab[i] >= nbMax){
                nbMax = tab[i];
            }        
        }
        return nbMax;
    }
    
    public void somme(){
        int somme = 0;
        
       /*
        for (int i = 0; i < n;i++) {
            somme += tab[i];
        }
        */
        
        for (int entier : tab) {
            somme += entier;
        }
    }
    
    public int egal(int p){
        int count = 0;
        for(int entier : tab){
            if(entier == p){
                count++;
            }
        }
        return count;
    }
    
    public int compris(int p, int q){
        int count = 0;
        
        for(int entier : tab){
            if(p <= entier && entier <= q){
               count++; 
            }
        }
        return count ;
    }
    
    public int premier(){
            
       return tab[0];
    }
    
    public int dernier(){
        return tab[n-1];       
    }
    
    public void inverse(){
        int temp;
        for (int i = n-1; i>= 0; i--) {
          temp = tab[i];
          tab[i] = tab[n-1 -i];
          tab[n-1 -i] = temp;
        }
    }
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int pCount) {
        count = pCount;
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }
}
