package windowsBuild;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainSwing {

	private JFrame frame;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainSwing window = new mainSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame(); //Creation de la fenetre
		frame.setBounds(100, 100, 450, 300);//Largeur hauter de notre fenetre 
		frame.getContentPane().setLayout(null); // La frame n'a pas de layout 
		
		btnNewButton = new JButton("jean-regis"); //Instanciation du bouton, on peut changer le texte ici
		btnNewButton.addActionListener(new ActionListener() { //Il contient un écouteur d'évènement et attend le clique de l'utilisateur 
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("salut"); //notre action un fois que l'on clique sur le boutton 
			}
			
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
	
		btnNewButton.setBounds(274, 173, 154, 85); //Definis la largeur et la hauteur de notre btn
		frame.getContentPane().add(btnNewButton); //On attache notre boutton a la JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
