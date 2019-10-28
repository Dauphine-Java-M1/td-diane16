package fr.dauphine.ja.fokouadiane.controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.fokouadiane.model.World;

public class MouseController implements MouseMotionListener  {

private World world ;
	

	public MouseController(World world)  {
		// TODO Auto-generated constructor stub
		this.world = world;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	 public void mouseMoved(MouseEvent e) 
	 { 
	 System.out.println("j ecoute");
	 world.deplacer(e.getX(), e.getY());
	 
	 
	  
	 }
	

}
