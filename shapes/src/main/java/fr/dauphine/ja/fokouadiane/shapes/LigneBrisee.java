package fr.dauphine.ja.fokouadiane.shapes;

import java.util.ArrayList;
import java.util.LinkedList;


public class LigneBrisee {
	
	
	private int nombreMax;
	//public ArrayList<Point> points = new ArrayList<Point>();
	public LinkedList<Point> points = new LinkedList<Point>();
	
	public LigneBrisee(int nbreMax) {
	
	 this.nombreMax = nbreMax;	
		
	}
	
	
	public void setNombreMax(int nombreMax) {
		this.nombreMax = nombreMax;
	}


	public void add(Point p) {	
	
	/* if(points.size() < this.nombreMax) {
	
		 points.add(p);
		 System.out.println(p);
	 }*/
		
	 points.add(p);
	 
	}
	
	public void add(int i,Point p) {	
		
	 points.add(i,p);
	 
	}
	
	public int pointCapacity() {
		
		//return this.nombreMax;
		return points.size();
			
	}
	
	public int nbPoints() {
		
		return points.size();
			
	}
	
	public boolean contains(Point p) {
		
	    if(points.contains(p)) {
	   
	    	return true;
	    }
	    
		
		/*for(Point pt : points) {
		
		if(pt.equals(p)){
			
			return true;
		 }
	
		}*/
		
		return false;
		
	}
	

}
