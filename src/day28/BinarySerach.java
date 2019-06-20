package day28;

import java.util.Arrays;

public class BinarySerach {

	public static void main(String[] args) {
		

		// 
	    int[] nums =  {11,20,4,6,54,19,5} ; 
	    
	    Arrays.sort(nums);
	    System.out.println( Arrays.toString(nums) );
	    // ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
	    
	    int index = Arrays.binarySearch(nums, 5) ;
	    System.out.println(index);
	    
	    int idx20 = Arrays.binarySearch(nums, 20) ;
	    System.out.println(idx20);
	    
	    
	 // IF WE DONT HAVE THE ITEM IN THE ARRAY 
	    // We will get minues number to point the insertion point of the array 
	    // to keep this array sorted 
	    
	    //  {4, 5, 6, 11, 19, 20, 54} ; 
	    ////////////////////////////////  {4, 5, 6, 10 , 11, 19, 20, 54} ; 
	    //  {4, 5, 6, 11, 19, 20, 54 , 100} ; 
	    
	    int idx10 = Arrays.binarySearch(nums, 10) ;
	    System.out.println(idx10);
	    
	    int idx100 = Arrays.binarySearch(nums, 100) ;
	    System.out.println(idx100);
	    
	  //  {4, 5, 6, 11, 19, 20, 54} ; 
	    int idx3 = Arrays.binarySearch(nums, 3) ;
	    System.out.println(idx3);
	    
	    
	    
	  //  {4, 5, 6, 11, 19, 20, 54} ; 
	    
	  //  {4, 5, 6, 10 , 11, 19, 20, 54} ; 
	    
	    
	    
	}

}
