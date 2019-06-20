package day26;

import java.util.Arrays;

public class SplittingTheNames {

	public static void main(String[] args) {
		
		
		String str="Java is fun";
		
		String [] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		String[] parts =  str.split("a"); 
	    System.out.println( Arrays.toString(parts) );
	    
	    String[] parts2 =  str.split("is"); 
	    System.out.println( Arrays.toString(parts2) );
	    
		

		// Task num 5 
		// create a string called groceries 
		// add items separated by comma 
		// split them and print them out 
		/// find out size of split 
		/// find out length of each items 

		
		
	    String groceries = "tomatoes, cucumber, pepper, onions";
		String[] arr = groceries.split(",");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
