package day23;

import java.util.Scanner;

public class ArrayCreationTask {

	public static void main(String[] args) {

		// TASk 4
	    // create an array of double with size 4
	    // assign 4 value 
	    // then print them all out 
	    
	    // dataType[] variableName = new dataType[4] ; 
	    // dataType variableName[] = new dataType[4] ; 
	    int i ; 
	    i = 10 ; 
	    
	    double[] prices1 ; 
	    prices1 = new double[4] ; 
	    
	    prices1[0] = 1.5 ; 
	    prices1[3] = 2.12 ; 
	    prices1[2] = 23.99 ; 
	    prices1[1] = 12.32 ; 
	    
	   System.out.println(prices1[2] );//23.99 printed
	  
	    //double prices2[] ; 
	    // Task 5 : 
	    /*
	     * declare boolean array variable that point to array of size 5 
	     * declare short variable 
	     * declare String array variable 
	     * declare Scanner array variable
	     * */
	    //// the number in [] is the capacity of array object
	   
	   boolean [] bul= new boolean [5];
	   short [] sh= new short [5];
	   String [] str= new String [5];
	   Scanner [] scans=new Scanner [5];
	   
	    
	    boolean[] onOffs = new boolean[5] ; 
	    short[] shortNum = new short[2]; 
	    String[] strs  = new String[20]; 
	    Scanner[] manyScan = new Scanner[15]; 

		boolean[] isTrue =new boolean [5];
		
		short [] sh = new short [6];
		String [] str = new String [7];
		
		Scanner [] scan= new Scanner [4];
		
		boolean [] dogruYanlis= new boolean[4];
		short [] kisa= new short[9];
		int [ ] indi= new int[8];
		long [ ] uzunSayi= new long [9];
		double [] cift= new double [8];
		
		String [] strems= new String [8];
		Scanner [] yazici = new Scanner [3];
		
		System.out.println(yazici);
		System.out.println(strems);
		
		
	
		
		
	}

}
