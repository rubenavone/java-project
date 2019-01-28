package train;

public class ClassTrain {
	/* 
	 * Etat(marche arret)
	 * vitesse
	 * accelerer()
	 * décelerer()
	 * stop()
	 * vous ete dans une gare , 
	 * Si le train est a l'arret 
	 * Anonce "les gens peuvent monter dans le train"
	 * sinon , stop()
	 * une fois l'annonce passer 
	 * le train accelere() 
	 * 10 - 20 - 30 - 40 - 50 - 60
	 * un obstacle ce presente 
	 * methode stop() qui arrete le train 
	 * le train accelere de nouveau 
	 * 10 - 20 - 30 - 60 (exponentielle a partir de 30 l'incrementation augmente)
	 * annonce arriver en gare 
	 * 60 - 40 - 20 - 10 ralentir()
	 * si le train est a l'arret 
	 * annonce merci de descendre du train 
	 */
	
	int vitesse = 0;
	boolean etat = false; // false = arret ; true marche
	boolean loop = true; //boucle pour recommencer si le train n'est pas a l'arret
	int qtx = 10; // Augmentation de la vitesse 
	
	/*
	 * @param qtx
	 */	
	public void accelerer() {
		while(vitesse < 100) {
				
		if(vitesse + qtx <= 100) {
			vitesse += qtx;
			System.out.println("Votre vitesse actuelle est de " + vitesse);
			etat = true;
		}else {	
			qtx = (100 - vitesse)/2;
			vitesse += qtx;
			System.out.println(qtx);
			System.out.println("ajustement de la vitesse ! Vitesse actuelle " + vitesse );
		}
		}
	}
	
	public void decelerer () {
		while(vitesse > 100) {
		if(vitesse + qtx != 0) {
			vitesse -= qtx;
			System.out.println("votre vitesse actuelle est de " + vitesse);
			etat = true;
		}else {
			System.out.println("impossible d'accelere plus !");
			
		}
		}
	}
	
	public void stop () {
		vitesse = 0;
		etat = false;
		System.out.println("Arret total du train !");
		
	}
	
	public void annonceMonte () {
		
		while(loop) {
		if(etat == false) {
			System.out.println("Le train va partir merci de monter dans le train !");
			loop = false;
		}else {
			System.out.println("Merci d'attendre l'arret total du train !");
			stop();
		}
		}	
	}
	
}
