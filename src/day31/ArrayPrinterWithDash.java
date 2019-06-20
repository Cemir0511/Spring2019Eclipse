package day31;

import java.util.Arrays;

public class ArrayPrinterWithDash {

	public static void main(String[] args) {
		// // create a static void method called reportBiggerArray
		// it will take 2 int arrays as parameters 
		// inside body with will compare the size of array 
		// and print out array with bigger size 
		// for example {1,2,3}  {1,2,3,5} 
		    //--> second array is bigger and print [1,2,3,5]

		int[] myarr1 = {1,2,3,4};
		int[] myarr2 = {3,4,5,6,7,8};
		reportBiggerArray(myarr1, myarr2);
		System.out.println(Arrays.toString(myarr1));
		


	}
	public static void reportBiggerArray(int [] arr1, int[] arr2) {

		if(arr1.length>arr2.length) {
			System.out.println(Arrays.toString(arr1)+" is longer");
		}else if (arr1.length==arr2.length){
			System.out.println("Equal arrays");
		}else {
			System.out.println(Arrays.toString(arr2)+ "is longer");
		}
			
	}
}
