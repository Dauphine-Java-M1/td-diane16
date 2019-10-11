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

    public boolean isSameAs (Point p){
    	
    	if(this.x == p.x && this.y==p.y) {
    		
    	  return true;
    	}
    	
		return false;  
   }

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Point)) return false;
		Point point = (Point) obj;	
		return this.x==point.getX() && this.y==point.getY();
	}
    
    

}
