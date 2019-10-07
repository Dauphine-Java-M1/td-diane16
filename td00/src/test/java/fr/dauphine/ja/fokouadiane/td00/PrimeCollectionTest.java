package fr.dauphine.ja.fokouadiane.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPimeCollection()
    {
        assertTrue( true );
    }
    
    public void test0IsPrime(){
    PrimeCollection t1 = new PrimeCollection();
     if(t1.isPrime(0)) {
    	  assertTrue( false );
     }	
    } 
    
    public void testTwoIsPrime(){
        PrimeCollection t2 = new PrimeCollection();
        if(t2.isPrime(2)) {
       	  assertTrue( false );
        }	
    } 
    
    public void test9IsNotPrime(){
        PrimeCollection t9 = new PrimeCollection();
        if(t9.isPrime(9)) {
       	  assertTrue( true );
        }	
    	
    }
}
