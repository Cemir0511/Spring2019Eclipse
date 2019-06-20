package day31;

import java.util.Arrays;

public class MEthodThatTakeArrayAsParameter {

	public static void main(String[] args) {
		 /*
	     * methods : reusable code, maintainable code , write once and use it whenever needed
	     * 
*** 3 questions to ask while creating a method :
  * does this method needs an object or not when being called -->> if not we use static keyword 
  * does this method take external data or not -->> if it doesn't we just end method name with empty () 
                                               -->> if yes put data type and name: parameters seperated by comma
  * does this method return a value after being called --if not use void --if yes put the data type of the variable it return
	     * 
	     */

	    String s = "abc";
	    // System.out.println( s.charAt(0) );

	    int[] arrObject = { 1, 2, 5, 6 };
	    // Arrays.sort(arr);

	    // create a static method with no return type
	    // take one int array as parameter and print them out in one line
	    // with - in between

//	    arrayPrinterWithDash(new int[] { 1, 2, 3, 6, 5, 5, 65 });
//	    arrayPrinterWithDash(arrObject);

	    // arrayPrinterWithDash(arrObject) ;
	    int[] arr1 = {1,45,6}; 
	    int[] arr2 = {1,45,6,6}; 
	    
	    reportBiggerArray( arr1 , arr2  ); 
	    reportBiggerArray( new int[] {1,5,4} ,  new int[] {2,4} ); 
	    
	    
	    

	  }

	  public static void arrayPrinterWithDash(int[] manyItems) {

	    for (int each : manyItems) {
	      System.out.print(each + "-");
	    }
	    System.out.println();

	  }

	  // create a static void method called reportBiggerArray
	  // it will take 2 parameters and both of them have type of int arrays
	  // inside body : it will compare the items count of 2 arrays
	  // and print out array with bigger size
	  // for example : given first array is {1,2,3} second array is {1,2,3,5}
	  // --> second array is bigger and print [1,2,3,5]

	  public static void reportBiggerArray(int[] a1, int[] a2) {

	    if (a1.length > a2.length) {
	      System.out.println(Arrays.toString(a1));
	    } else
	      System.out.println(Arrays.toString(a2));
	}

}
