package day38;

import java.util.ArrayList;
import java.util.List;

public class ArrayListt {

	public static void main(String[] args) {
		
		// do not ever name ur class, scanner, system, ArrayList..
		
		
		ArrayList <String> myList = new ArrayList<>();
		List<String> lst2 = new ArrayList<>();   // List package ini import edince calisir
		// yada herseyi import.java.util .*; ile halledersin
		
		
		
		
		myList.add("Zuccini");
        myList.add("cucumber");
        myList.add("cabbage");
        myList.add("watermelon");
        myList.add("BlueBerry");
        myList.add("Apple");
        myList.add("Bananas");
        myList.add("Milk");
        System.out.println(myList);
		
		
	// update an item
        myList.set(0, "Tomato");
        System.out.println(myList);
        
    
        
    //insert an item
        myList.add(1,"raspberry");
        System.out.println(myList);
       
        
    //  check an item exists in the list 
        boolean haveMilkOrNot = myList.contains("milk");
        //myList.contains("milk");
        System.out.println("got milk?"+ haveMilkOrNot);
     // case matters, for loop la tekk tek alabiirsin, bulursin
        
        
    //check the location of certain items
        int indexOfCabbage = myList.indexOf(" ");
        System.out.println("index of cabbage is; "+indexOfCabbage);
        
   
        
     //  remove item;
         // when using remove (object) version of the method
          // if we don't have the item, it will remain the same
         // ama index yoksa, it will throw exception, olmayan indexi yazarsan
        //1. index ile
        myList.remove(4);
        System.out.println(myList); //watermelon removed
        
        //2. String object ile
        myList.remove("blueberry");
        System.out.println(myList);  //blueberry gone
        
        //3. try to remove an item you don't have:
        myList.remove("kiwi");
        System.out.println(myList);   // object type yazip o object yoksa, nothing happens, olmayan biseyi remove edemez
        
        //4. 
        
        
    // remove everytrhin, clearing everything from the list;
        //delete all from the list
        
       myList.clear();
       System.out.println(myList);
       
       
     // Checking the list is  empty or not :
       
       System.out.println(myList.isEmpty());
       
       for (int i = 0; i<myList.size();i++) {
    	   System.out.println(myList.get(i)+ " - " );     //  ***************************
       }
       
       for( String eachitem : myList) {
    	   System.out.println("Item : "+ eachitem);
       }
        
        
	}
		                                             

}
