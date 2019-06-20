package day36;

import java.util.ArrayList;

public class ArrayListWithType {

	public static void main(String[] args) {
		
		

		

		    
		    // NO PRIMITIVE TYPES ALLOWED AS TYPE to store in ArrayList
		    // ArrayList<int> numList ; THIS IS BAD 
		    
		    // arraylist that store only Integer !!
		    ArrayList<Integer> numList = new ArrayList<>(); // Integer yani only whole number store edecek demek
		    //numList.add("ABC");                          // we don't care about capacity, only care about type
		    
		    Integer i = 100 ; // autoboxing to Integer Object 
		    
		    // ADDING ITEM 
		    // WE call add method from Arraylist class 
		        
		    numList.add(i); 
		    numList.add(200) ; 
		    numList.add(300) ; 
		     
		    //GETTING SINGLE ITEM FROM ARRAYLIST 
		    
		    System.out.println( numList  );  // 100 cikti, sonra 200 ekletince , autobox yapip, 200 de print etti
		                                     // [100,200,300] cikti
		 
		    /*
		     ArrayList<Integer> numList = new ArrayList<Integer>();
		
		//Autobox the value i
		Integer i = 100;
		//Adding items
		numList.add(i);
		numList.add(i+50);
		numList.add(i+150);
		numList.add(i+200);
		System.out.println(numList);
		
		//Getting single item from ArrayList
		numList.get(0);
		System.out.println(numList.get(0));
		
		int i2 = numList.get(1); // auto unboxed 
		Integer i3 =numList.get(1); //auto boxed
		
		System.out.println(i2);
		System.out.println(i3);
		     
		     
		     */

	}

}
