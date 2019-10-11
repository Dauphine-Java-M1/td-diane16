package fr.dauphine.ja.fokouadiane.shapes;

import java.util.ArrayList;

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
        System.out.println(p1.isSameAs(p3));
        
        ArrayList<Point> list = new ArrayList<>();
        list.add(p1);
        p1.equals(p3);    
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
        
        System.out.println("---------------------------------------------------------------------------");
        
        LigneBrisee l = new LigneBrisee(2);
        Point p4=new Point(5,2);
        //l.add(null);
        l.add(p);
        l.add(p4);
        l.add(p4);
        
        
        System.out.println(l.contains(p));
        
        
        
       
        
    }
   
}
