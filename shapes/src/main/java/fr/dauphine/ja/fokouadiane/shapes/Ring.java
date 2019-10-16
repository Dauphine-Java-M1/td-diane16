package fr.dauphine.ja.fokouadiane.shapes;

public class Ring extends Circle {
	
	private int rayonInt;
	private double newRayon;
	
	public Ring (Point centre, int rayon, int rayonInt){
	
	 	super(centre, rayon);
	 	this.rayonInt = rayonInt;
		
	}
	

	@Override
	public String toString() {
		return "Ring [centre=" + super.getCentre() + ", rayon=" + super.getRayon() + ", rayonInterne=" + rayonInt + "]";
	}

	@Override
	public boolean contains(Point p) {
		
		this.newRayon = Math.sqrt((Math.pow((super.getCentre().getX() - p.getX()),2))+(Math.pow((super.getCentre().getY() - p.getY()),2)));
		
	    if(this.newRayon > this.rayonInt && super.contains(p) ){
	   
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
