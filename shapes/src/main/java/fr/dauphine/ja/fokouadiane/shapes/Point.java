package fr.dauphine.ja.fokouadiane.shapes;

public class Point {
	
	private int x;
	private int y;
	public static int t=0;
	public int count;
	
    public Point(int x, int y) {
    	
    	this.x = x;
    	this.y = y;
        this.count=t;
	    this.count = this.count + 1;
    }
    
    public Point(Point p) {
    	
    	this.x = p.x;
    	this.y = p.y;
        this.count=t;
	    this.count = this.count + 1;
	  
	   
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}




    
    
    
    

}
