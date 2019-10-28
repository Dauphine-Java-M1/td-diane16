package fr.dauphine.ja.fokouadiane.controller;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;

import fr.dauphine.ja.fokouadiane.model.Circle;
import fr.dauphine.ja.fokouadiane.model.LigneBrisee;
import fr.dauphine.ja.fokouadiane.model.Point;
import fr.dauphine.ja.fokouadiane.model.Ring;
import fr.dauphine.ja.fokouadiane.model.Shape;
import fr.dauphine.ja.fokouadiane.model.World;
import fr.dauphine.ja.fokouadiane.view.CircleDrawer;
import fr.dauphine.ja.fokouadiane.view.MyDisplay;

public class App 
{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame(" Graphic Display"); 
		frame.setSize(new Dimension(700,600)); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBackground(Color.green);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
		World world = new World();
		world.addObserver(d);
		MouseController mc = new MouseController(world);
		frame.addMouseMotionListener(mc);
		
		Point p=new Point(300,200);
		Circle cercle1 = new Circle(p,150);
		world.add(cercle1);
		
		for (Shape shape : world.listeShape){
			
			d.drawers.add(new CircleDrawer((Circle) shape));
			d.addNotify();
			
		}
		
		
		

		

	}
   
}
