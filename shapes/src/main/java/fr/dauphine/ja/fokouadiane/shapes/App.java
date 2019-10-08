package fr.dauphine.ja.fokouadiane.shapes;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
        Point p = new Point(2, 10);
        Point point = new Point(p);
        //System.out.println(p1.count);
        System.out.println(point);   // la variable tostring aprés etre declarer s'affiche directement meme sans etre appelé pas objet.
        
        System.out.println("----------------------------------------------------------------------------------------");
        
        Point p1=new Point(1,2);
        Point p2=p1;
        Point p3=new Point(1,2);
        
        System.out.println(p1==p2);
        System.out.println(p1==p3);
    }
   
}
