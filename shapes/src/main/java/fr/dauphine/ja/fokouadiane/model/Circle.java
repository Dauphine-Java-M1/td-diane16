package fr.dauphine.ja.fokouadiane.model;

public class Circle extends Shape{
	
	private Point centre;
	private int rayon;
	private double newRayon;
	private double surface;

	
	public Circle(Point centre, int rayon) {
		
		this.centre = centre;
		this.rayon = rayon;
		
	}

	@Override
	public String toString() {
		return "Circle [centre=" + centre + ", rayon=" + rayon + ", surface=" + surface() + "]";
	}
	
    
    public Shape translate(int dx, int dy) {   //vecteur de translation
    
      
      this.centre = this.centre.translate(dx, dy); 	
      return new Circle (this.centre.translate(dx, dy),rayon);
	
      
     
    }

	public Point getCentre() {
		return this.centre;
	}
	
	
	
	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public double getNewRayon() {
		return newRayon;
	}

	public void setNewRayon(double newRayon) {
		this.newRayon = newRayon;
	}

	public double surface() {
		
		return surface = ((Math.pow(this.rayon,2))* Math.PI);
		
	}
	
	public boolean contains(Point p) {
		
		this.newRayon = Math.sqrt((Math.pow((this.centre.getX() - p.getX()),2))+(Math.pow((this.centre.getY() - p.getY()),2)));
		
	    if(this.newRayon < this.rayon) {
	   
	    	return true;
	    }
		
		return false;
		
	 }
	
	public static boolean contains(Point p, Circle...circles) {
		
		for(Circle c: circles) {
		if(c.contains(p)) {
			
			return true;
		 }
		
		}
		return false;
	}
    	
	

}
