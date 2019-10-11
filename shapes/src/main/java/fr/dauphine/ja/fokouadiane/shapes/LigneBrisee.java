package fr.dauphine.ja.fokouadiane.shapes;

import java.util.ArrayList;


public class LigneBrisee {
	
	
	private int nombreMax;
	public ArrayList<Point> points = new ArrayList<Point>();
	
	
	public LigneBrisee(int nbreMax) {
	
	 this.nombreMax = nbreMax;	
		
	}
	
	
	public void setNombreMax(int nombreMax) {
		this.nombreMax = nombreMax;
	}


	public void add(Point p) {	
	
	 if(points.size() < this.nombreMax) {
	
		 points.add(p);
		 System.out.println(p);
	 }	
	 
	}
	
	public int pointCapacity() {
		
		return this.nombreMax;
			
	}
	
	public int nbPoints() {
		
		return points.size();
			
	}
	
	public boolean contains(Point p) {
		
		for(Point pt : points) {
		
		if(pt.equals(p)){
			
			return true;
		 }
		 
		}
		
		return false;
		
	}
	
	
	

}
