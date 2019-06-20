package day37;

import java.util.ArrayList;

public class MoreArrayListMethods {

	public static void main(String[] args) {
		
		
		// add just adds by index or value,
		// set just changes value/updating what is already in there 

		ArrayList<Integer> numlst = new ArrayList<>(); 
		
	    
	    numlst.add(100); 
	    numlst.add(200); 
	    numlst.add(300); 
	    numlst.add(400); 
	    
	    System.out.println( numlst );
	    
	    // if you try to access index does not exist 
	    // indexoutofbound exception
	    // System.out.println( numlst.get(7) );    // yani 7 yoksa index out of bound exception veriri
	                                               // sadece 5 item var
	    // inserting items at certain location 
	    
	    // insert 500 as second item 
	    
	    // when inseting a value , the index shift to the next location 
	    // add (index , value) 
	    numlst.add(1, 500) ;    /// 2. item a 500 ekle, once index i yaz sonra ekleyecegin value yu
	    System.out.println( numlst );
	    
	    // it should be within range or exception occur
	    //numlst.add(10, 500) ; 
	    
	    
	    // Updating a value inside ArrayList item 
	    // set(index, newValue)                    // degerini degistirmek icin nem.set(2 ye, 200 yaz gibi))
	    numlst.set(2, 1000) ; 
	    System.out.println(numlst);
	    
	    // removing items from arrayList 
	    // remove(ItemValue)
	    // remove(index)
	    // THIS WILL WAIT 
	    
	    
	    // deleting everything from the list 
	    numlst.clear();
	    System.out.println(numlst);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /*
	     * Bunyo:
	     * ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(49);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);
		
		//add a number at index 1; add(index, value);
		numList.add(1, 99);
		System.out.println(numList);
		
		//update a value
		numList.set(2, 23);
		System.out.println("Changed at index 2"+ numList);
		
		
		//remove a message, 1000 will be gone
		numList.remove(1);
		System.out.println("Index 1 removed: "+ numList);
		
		//clear all contents in the template
		numList.clear();
		System.out.println("all data cleared: " + numList);
	}
	     */
		
	}

}
