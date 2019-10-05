package fr.dauphine.ja.fokouadiane.td00;

import java.util.Set;
import java.util.ArrayList;
import java.util.Random;


public class PrimeCollection 
{
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<Integer> number = new ArrayList<Integer>();
	
	public PrimeCollection() {
		
	}
	
	public void initRamdom(int n, int m){
	
	for(int i=0; i<n; i++) {
		
		int x= (int) (Math.random()*(m+1));
		
		this.numbers.add(x);
		
	    
	 }
	 System.out.println(this.numbers);
	}
	
	public boolean isPrime(int p){
		
		boolean isprime = false;
		double sqr = Math.sqrt(p);
		if (p <= 0){
			isprime = false;
		} 
		else if (p!= 1 && p!=0 ){
			for (int i =2 ; i <= sqr ; i++){
				if (p % i == 0){
					
				break; // OU RIEN 
					
				}
				isprime = true;
			}
			
		}
		
		return isprime ;	
		
	}
	
	//La boucle for
	//La boucle while ou do..while
	//La boucle Iterator
	
	public void printPrimes() {
		for(int i=0; i< (this.numbers).size(); i++) {
		 if(isPrime(this.numbers.get(i))) {
			 
			 this.number.add(this.numbers.get(i));
		   }
		  }
		  System.out.println(this.number);
		}
	
	
		
    public static void main( String[] args )
    {
        
    	PrimeCollection prime=new PrimeCollection();
    	
        prime.initRamdom(100,2000);
        
       // System.out.println(prime.isPrime(3));
        
        prime.printPrimes();
        
    }
}
