package point;

public class Point { //// classe d'objet o

		   public static double dimension = 2 ;
		   //Variable de classe

		   private double x ;
		   private double y ;
		   //Variables d'instance

		   public Point(){
		      this(0,0) ;
		   }
		   //Constructeur par défaut

		   public Point(double x , double y){
		      this.setX(x) ;
		      this.setY(y) ;
		   }
		   //Constructeur avec argument

		   public double getX(){
		      return this.x ;
		   }
		   
		   public void setX(double x){
		      this.x = x ;
		   }
		   //Accesseurs correspondant à la variable x.
		   
		   public double getY(){
		      return this.y ;
		   }
		   
		   public void setY(double y){
		      this.y = y ;
		   }
		   //Accesseurs correspondant à la variable y.

		   public void symetrieSelonX(){
		      this.y = -this.y;
		   }

		   public void symetrieSelonY(){
		      this.x = -this.x;
		   }

		   public static double quelleDimension(){
		      return dimension ;
		   }
		   
		   public static void main(String[] args) {
			 Point monPoint = new Point(4,6) ;
			 //On crée un Point

			 monPoint.symetrieSelonX() ;
			 //On appelle la méthode symetrieSelonX() sur l'instance monPoint de Point.

			 System.out.println("L'abscisse de monPoint est : " + monPoint.getX()) ;
			 System.out.println("Oracle : L'abscisse de monPoint est : 4") ;
			 //On remarque que les accesseurs sont appelés comme des méthodes d'instance normales, et 
			 //en effet, c'en sont.

			 System.out.println("L'ordonnée de monPoint est : " + monPoint.getY()) ;
			 System.out.println("Oracle : L'ordonnée de monPoint est : -6") ;
			 
			 System.out.println(quelleDimension());
		   }
	}

