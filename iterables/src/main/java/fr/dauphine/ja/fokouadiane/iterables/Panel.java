package fr.dauphine.ja.fokouadiane.iterables;


import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class Panel
{
	
	
	private static Iterator<Integer> panel1(final int i, final int j) {
		
    return new Iterator<Integer> () {
			
			int nextValue = i;
			
			@Override
			public boolean hasNext() {
				
				return nextValue <= j ;
				
                
			}
			@Override
			public Integer next() {
				
				 if (!hasNext()) {
				      throw new NoSuchElementException();
				    }
				return Integer.valueOf(nextValue++);
			}
		};	    
		
	}
	
	private static Iterable <Integer> panel2(final int i, final int j) {
	    	
		return new Iterable<Integer>(){
			
			public Iterator<Integer> iterator() {
				
				Iterator<Integer> it1 =panel1(i,j);
				
				return it1;
			}
		} ;
	}
	


	
	
	private static AbstractList <Integer> panel(final int i, final int j) {
    	
		return new AbstractList<Integer>(){

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return index+i;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return (j-i)+1;
			}
			
		
		} ;
	}
	
	
    public static void main( String[] args )
    {
    	Iterator<Integer> it=panel1(1,5);
        for(;it.hasNext();)
        	
    	System.out.println(it.next()); // affiche 1 2 3 4 5
        
        System.out.println("------------------------------------------------------------------------------");
        
        for(int i:panel2(1,5))
        	System.out.println(i); // affiche 1 2 3 4 5
        
        System.out.println("------------------------------------------------------------------------------");
        
        
        List<Integer> l = panel(3,6);
        
        for(int i:l) {
        System.out.println(i);    //affiche 3 4 5 6
        
        }
        
        System.out.println("------------------------------------------------------------------------------");
        
        System.out.println(l.get(1)); //affiche 4
        
    }

	








}
