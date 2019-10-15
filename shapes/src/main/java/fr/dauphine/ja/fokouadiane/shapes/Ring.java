package fr.dauphine.ja.fokouadiane.shapes;

public class Ring extends Circle {
	
	private int rayonInt;
	private Point centre;
	private double newRayon;
	private int rayon;
	
	public Ring (Point centre, int rayon, int rayonInt){
	
	 	super(centre, rayon);
	 	this.centre= centre;
	 	this.rayon= rayon;
	 	this.rayonInt = rayonInt;
		
	}
	

	@Override
	public String toString() {
		return "Ring [centre=" + centre + ", rayon=" + rayon + ", rayonInterne=" + rayonInt + "]";
	}

	@Override
	public boolean contains(Point p) {
		
		this.newRayon = Math.sqrt((Math.pow((this.centre.getX() - p.getX()),2))+(Math.pow((this.centre.getY() - p.getY()),2)));
		
	    if(this.newRayon > (this.rayon - this.rayonInt) && this.newRayon < this.rayon ){
	   
	    	return true;
	    }
		
		return false;
		
	 }
	
	
   public static boolean contains(Point p, Ring...rings) {
		
		for(Ring r: rings) {
		if(r.contains(p)) {
			
			return true;
		 }
		
		}
		return false;
	}
	
	
	

}
