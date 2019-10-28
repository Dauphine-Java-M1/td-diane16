package fr.dauphine.ja.fokouadiane.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel implements Observer {
	

	private static final long serialVersionUID = 1L;
	public List<Drawer> drawers = new LinkedList<Drawer>();

	public MyDisplay() {
		// TODO Auto-generated constructor stub
		
		//drawers = new LinkedList<Drawer>();	
		
	}

	@Override
	public void paintComponent(Graphics g ) {
		// TODO Auto-generated method stub
		for (Drawer drawer :drawers){
			drawer.draw(g);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
	
		repaint();
		revalidate();
	}

	

}
