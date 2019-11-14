package fr.dauphine.ja.fokouadiane.iterables;

import java.util.AbstractList;

public class Mult {
	
	public Mult(int a, int b) {
		
		
	}
	
  static AbstractList <Integer> mult(final int i, final AbstractList <Integer> l) {
    	
		return new AbstractList<Integer>(){

			@Override
			public Integer get(int index) {
				
				return (index+l.get(0))* l.get(0);
			}

			@Override
			public int size() {
				
				return l.size();
			}

			
		
		} ;
	}
  
  

}
