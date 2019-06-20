package day27;

import java.util.Arrays;

public class ArraySortMethod {

	public static void main(String[] args) {
		
		
		//Array is mutable, items inside can change
		//it is not resizable, we can nlt increase r decraese the capasity
		//Arrays sort method will internally shuffle the items around to make
		///it sorted order, low-to-high
		int [] nums= {1,4,5,2,77,45};
		
		System.out.println(Arrays.toString(nums));
		
		//sort Method from Array class
		
		// it take array object and sort it's items in ascending order 
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		

	}

}
