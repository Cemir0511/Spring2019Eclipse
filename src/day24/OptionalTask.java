package day24;
public class OptionalTask {
	public static void main(String[] args) {
	
		// print them out using the loop 
		  
	      // OPTIONALLY SWAP the value of first and last items --> {9,.....,1}
	      
	      
	      // get the sum of all numbers 
	      // get the max number 
	      
	 
	    
	    int nums []= {1,4,6,8,9};
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    System.out.println();
	    
	    int temp = nums[nums.length-1]; //bu any length of array i swap yapar
	    nums[nums.length-1] = nums[0] ; 
	    nums[0] = temp ; 
	    
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    
	    
	    int temp = nums[4]; 
	    nums[4] = nums[0] ; 
	    nums[0] = temp ; 

	    // print them out using the loop 
	      // get the sum of all numbers 
	      // get the max number 
	      
	 //print them out using loop:
	    
	    int nums []= {1,4,6,8,9};
	    
	    int sum = 0 ; 
//	    for (int i = 0; i < nums.length; i++) {
//	      
//	      sum = sum + nums[i] ; 
//	      
//	    }
//	    int j = 0 ; 
//	    do {
//	      sum = sum + nums[j] ; 
//	      j++ ; 
//	    } while (j<nums.length);
	//    
	    int z = 0 ; 
	    while (z<nums.length) {
	      sum = sum + nums[z];
	      z++ ; 
	    }
	    
	    System.out.println(sum);
	    
	    
	    
	    
	    
	    
	    
	    	
		
		
		
	}

}
