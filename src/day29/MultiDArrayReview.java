package day29;

import java.util.Arrays;

public class MultiDArrayReview {

	public static void main(String[] args) {
		/*
	     * Array : 
	     *   is an object to store multiple element of same type
	     * 
	     * Multi D Array: 
	     * Array object that store multiple array object 
	     *  of same type 
	     * */  
	    
	    int[] numbers = new int[2] ; //2 adet elemnt declare etme, size 2
	    
	    int[] nums1 = {1,45,32,10} ; //1.objectdeki baska elementler
	    int[] nums2 = {2,5,31} ; //2.objectdeki baska elementler
	    
	    int[] numsOfNum[]  = new int[2][]; //multidimensional array
	    System.out.println( Arrays.deepToString(numsOfNum)  ); //multidimensionalarray print etme ,metodu
	    
	    numsOfNum[0] = nums1 ; 
	    numsOfNum[1] = nums2 ; 
	    
	    System.out.println( Arrays.deepToString(numsOfNum)  );
	    
	    
	    	
		

	}

}
