package train;

public class TrainMain {
	public static void main(String[] args) {
		
		ClassTrain train = new ClassTrain();
		
		train.annonceMonte();
		
		System.out.println("Le train va partir !");
		
		train.accelerer();
		
		System.out.println("Un obstacle ce trouve sur la route !");
		
		train.stop();
		
		System.out.println("Le train va repartir !");
		
		train.accelerer();
		
		System.out.println("Le train va arriver en gare ");
		
		train.decelerer();
		
	}


}
