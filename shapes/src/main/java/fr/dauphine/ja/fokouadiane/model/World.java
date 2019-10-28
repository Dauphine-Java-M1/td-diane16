package fr.dauphine.ja.fokouadiane.model;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;

import fr.dauphine.ja.fokouadiane.view.MyDisplay;

public class World  extends Observable {
	
	public ArrayList<Shape> listeShape;

	public World() {
		// TODO Auto-generated constructor stub
		listeShape = new ArrayList<Shape>();
	}
	public void add(Shape shape){
		 listeShape.add(shape);
		 setChanged();
	    notifyObservers();
	}
	
	public void deplacer (int x, int y){
		for (Shape shape : listeShape){
			Point point = new Point(shape.position.getX(),shape.position.getY());
			if (point.equals(new Point(x,y))){
				System.out.println("ok c'est bon");
			  shape.translate(x,y);
			  //md.update(world, shape);
			  System.out.println("("+x+","+y+")");}
			setChanged();
			notifyObservers();
		  }
	}


}
