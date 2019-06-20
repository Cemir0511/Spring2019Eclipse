package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachAfternoonAkbarTasks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
	    
	    System.out.println("Enter 5 numbers ");
	    int [] numbers = {scan.nextInt(),scan.nextInt()
	            ,scan.nextInt(),scan.nextInt(),
	            scan.nextInt()
	            };
	    System.out.println(Arrays.toString(numbers));
	    int sum= 0;
	    
	    for( int each : numbers) {
	      
	      sum += each ; 
	      
	    }
	    System.out.println("sum is : "+ sum);
	    
	    
	    // assume first item is the max before comparing with all items 
	    int max = numbers[0] ; 
	    
	    for(int eachNum : numbers) {
	      
	      if(eachNum > max) {
	        max = eachNum ; 
	      }
	      
	    }
	    System.out.println("max is : "+ max);
	    
	    int min = numbers[0] ;
	    
	    for (int eachNumber : numbers) {
	      if(eachNumber<min) {
	        min = eachNumber ; 
	      }
	    }
	    System.out.println("min is : "+ min);
	    
	    	

	}

}
