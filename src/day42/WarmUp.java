package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WarmUp {

	public static void main(String[] args) {
		/*
		Task 1 
		Create an ArrayList object and add 5 whole numbers

		try out adding one by one 
		and also try adding in one shot 

		update each number to doule of that number  1,3,5,6,7 --> 2 6 10 12 14

		// reverse this ArrayList using one of the utility method that we learned from Collections class

		OPTIONALLY Reverse this ArrayList not using above method 
		
		*/
		
		//  we import arrayis class becasue it needs to know which class its going
		ArrayList<Integer> lst = new ArrayList <> ();
		
		lst.add(1);
		lst.add(3);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		System.out.println(lst);
		
		
		
		Collections.addAll(lst, 1,3,5,6,7);
		System.out.println(lst);
		
		
		//updating first item to double of original value
		//getting first item
		Integer item1 = lst.get(0);  // by storing
		lst.set(0, item1*2);
		
		//doing above in one shot
		lst.set(0,  lst.get(0)*2);
		
		lst.set(0,2);
		lst.set(1,6);
		lst.set(2,10);
		lst.set(3,12);
		lst.set(4,14);
		System.out.println(lst);
		
		
		Collections.reverse(lst);
		System.out.println(lst);
		
		
		
		//Arrays.asList return a fixed size list and return type is List
		//So it has to be stored in list variable
		
		List<Integer> nums2 = Arrays.asList(10,2,33,24,15);
		
		//creating an ArrayList object with another list object
		ArrayList(Integer) list3 = new ArrayList <Integer>(nums2);	
		
		// creating an ArrayList object with another list object in one shot
		ArrayList<Integre> list4= new ArrayLsit<Integer>(nums2);
		
		
		
		
		
		
		
		//for (int i =0; i < lst.size(); i++) {
		//	lst.set(i, (lst.get(i));
		//}
		
		
		
		
		
		///Akbar's:
		ArrayList<Integer> list1 = new ArrayList<>();

	    list1.add(6); // --> list1.add( new Integer(6)) ; 
	    list1.add(12);
	    list1.add(65);
	    list1.add(9);
	    list1.add(73);
	    
	    // updating first item to double of original value 
	    // getting first item 
	    Integer item1 = list1.get(0); 
	    Integer updated1stItem =  item1 * 2 ; 
	    // updating first item with doubled value 
	    list1.set(0, updated1stItem ) ; 
	    
	    
	    
	    System.out.println(list1);
	    
	    // doing above in one shot 
//	    list1.set(0,  list1.get(0) * 2 ) ; 
//	    list1.set(1,  list1.get(1) * 2 ) ; 
//	    list1.set(2,  list1.get(2) * 2 ) ; 
	    for (int i = 0; i < list1.size(); i++) {
	      
	      list1.set(i,  list1.get(i) * 2 ) ; 
	      
	    }
	    
	    System.out.println(list1);
	    
	    
	    
	    
	    
	    
	    // Arrays.asList return a fixed size list and return type is List 
	    // so it has to be stored in List variable 
	    
	    List <Integer> nums2 = Arrays.asList(10,2,33,24,15);
	    
	    // creating an ArrayList object with another list object
	    ArrayList<Integer> list3 = new ArrayList<Integer>(nums2) ; 
	    
	    // creating an ArrayList object with another list object in one shot
	    ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10,2,33,24,15)  ) ; 
	    
	    
	    
	    
	    
	    

	  

	

	/*
	 * Day 42

	Task 1 
	Create an ArrayList object and add 5 whole numbers

	try out adding one by one 
	and also try adding in one shot 

	update each number to doule of that number  1,3,5,6,7 --> 2 6 10 12 14

	// reverse this ArrayList using one of the utility method that we learned from Collections class

	OPTIONALLY Reverse this ArrayList not using above method 

	OPTIONALLY use random class to randomly assign value to your arraylist object 




	*/

		
	}

}
