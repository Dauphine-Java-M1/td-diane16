package fr.dauphine.ja.fokouadiane.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import fr.dauphine.ja.fokouadiane.model.Circle;

public class CircleDrawer extends JPanel  implements Drawer{
	
	private static final long serialVersionUID = 1L;
	Circle cercle;

	public CircleDrawer( Circle cercle) {
		// TODO Auto-generated constructor stub
		this.cercle = cercle;
	}

	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub
		super.paintComponent(graphics);
		graphics.drawOval(cercle.getCentre().getX(), cercle.getCentre().getY(), cercle.getRayon(), cercle.getRayon());
		
	}


}
