package day25;

import day24.Arrays;

public class WarmUpArray {

	public static void main(String[] args) {
		
		// create an array of int with capacity of 50 
	    // store 1-50 inside 
	    // print them out 
	    int[] nums = new int [50];
	    
//	    nums[0] = 1; 
//	    nums[1] = 2; 
//	    nums[2] = 3; 
//	    nums[3] = 4; 
//	    nums[4] = 5;
	// .....
//	    nums[49] = 50;

	    for (int i = 0; i < 50; i++) {
	      nums[i] = i+1; 
	    }
	    System.out.println( Arrays.toString(nums)  ); 

//	    nums[0] = 0; 
//	    nums[1] = 2; 
//	    nums[2] = 4; 
//	    nums[3] = 6; 
//	    nums[4] = 8;
	// .....
//	    nums[50] = 100;

	   
	    
	    // create another array of int with capacity of 50 
	    // store even numbers from 0-100 inside
	    // print them out 
	    
	    
	    int[] evenNumbers = new int[51] ; 
	    for (int i = 0; i <=50 ; i++) {
	      evenNumbers[i] = i * 2 ; 
	    }
	    System.out.println( Arrays.toString(evenNumbers)  );
	    
	    
		
	}

}
