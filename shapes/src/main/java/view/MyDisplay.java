package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel {
	
	
	
	 @Override
	protected void paintComponent(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paintComponent(arg0);
	    // Largeur et hauteur du panneau
	    int width = getWidth();	
	    int height = getHeight(); 
	    // Dessin d'une ligne en diagonal
	    arg0.drawLine(width/4, width/4, height/7, height/7);
	}
	 

	public static void main(String []args){
		
		JFrame frame = new JFrame("Java Avancé - Graphic Display"); //Création d'une instance en précisant le titre
		frame.setSize(new Dimension(500,500)); // dimension de ma fenetre longueur, largeur
		frame.setVisible(true);    // accepter sa visibilité direct aprés compilation 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // la fermeture du frame cause celle de l'application.
		
	    
	    JPanel jp = new MyDisplay();
	    frame.getContentPane().add(jp);  // fonction d'affichage
	    
	    
		
	 }

}
