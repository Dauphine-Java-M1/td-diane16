package fr.dauphine.ja.fokouadiane.shapes;


public class Circle {
	
	private Point centre;
	private int rayon;
	private double surface;
	
	public Circle(Point centre, int rayon) {
		
		this.centre = centre;
		this.rayon = rayon;
		
	}

	@Override
	public String toString() {
		return "Circle [centre=" + centre + ", rayon=" + rayon + ", surface=" + surface() + "]";
	}
	
    
    public void translate(int dx, int dy) {   //vecteur de translation
    
      
      this.centre = this.centre.translate(dx, dy); 	
     
    }

	public Point getCentre() {
		return centre;
	}
	
	public double surface() {
		
		return surface = ((Math.pow(this.rayon,2))* Math.PI);
		
	}
	
	public boolean contains(Point p) {
		
	    if(contains(p)) {
	   
	    	return true;
	    }
		
		return false;
		
	 }
    	
	

}
