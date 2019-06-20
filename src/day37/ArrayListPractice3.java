package day37;

import java.util.ArrayList;

public class ArrayListPractice3 {

	public static void main(String[] args) {
		
		
		
		// CREATE ARRAYLIST OF DOUBLE 
	    // CALL IT priceList 
	    // Add 5 prices  
	    // try to get 3rd items 
	    // iterate over arraylist using both loops 
	    // and print out 
	    
	    // in another loop 
	    // only print out price more than 10 ; 
		
		
		
		ArrayList <Double> pricelist = new ArrayList<> ();
		           //can't be double, cause it can not store primitive, it store only object
		    pricelist.add(3.25);
	        pricelist.add(5.25);
	        pricelist.add(75.25);
	        pricelist.add(89.25);
	        pricelist.add(100.25);

	        System.out.println(pricelist.get(2));
	        
	        for (int k=0 ; k<pricelist.size() ; k++){

	            System.out.println(pricelist.get(k));
	        }

	        for (Double eachdouble: pricelist){
	        	if (pricelist.get(k)>10.0){
	        		System.out.println(pricelist.get(k));
	        	}
	        

	           System.out.println(eachdouble);
	        }
	        
	        /*
	         *  // CREATE ARRAYLIST OF DOUBLE
    // CALL IT priceList
    // Add 5 prices
    // try to get 3rd items
    // iterate over arraylist using both loops
    // and print out
    ArrayList<Double> priceList = new ArrayList<>();
    priceList.add(1.2);
    priceList.add(10.12);
    priceList.add(1.4);
    priceList.add(1.5);
    priceList.add(1.6);

    System.out.println(priceList.get(2));

    for (int i = 0; i < priceList.size(); i++) {
      System.out.println(priceList.get(i));
    }
    
    for( Double eachDouble : priceList) {
      System.out.println(eachDouble);
    }
    // in another loop
    // only print out price more than 10 ;
	         */
	        
	        
	        
	        /*
	         * 
	         * // CREATE ARRAYLIST OF DOUBLE
    // CALL IT priceList
    // Add 5 prices
    // try to get 3rd items
    // iterate over arraylist using both loops
    // and print out
    ArrayList<Double> priceList = new ArrayList<>();
    priceList.add(1.2);
    priceList.add(10.12);
    priceList.add(1.4);
    priceList.add(1.5);
    priceList.add(1.6);

    System.out.println(priceList.get(2));

    System.out.println("PRINT USING FOR LOOP ");
    
    for (int i = 0; i < priceList.size(); i++) {
      System.out.println(priceList.get(i));
    }

    System.out.println("PRINT USING FOR EACH LOOP ");
    for( Double eachDouble : priceList) {
      System.out.println(eachDouble);
    }
    // in another loop
    // only print out price more than 10 ;
    System.out.println("PRINT ONLY PRICE MORE THAN 10 ");
    for( Double eachDouble : priceList) {
      
      if(eachDouble > 10) {
        System.out.println(eachDouble);
      }
      
    }
    
    //                      CREATE ARRAYLIST OF DOUBLE 
	    // CALL IT priceList 
	    // Add 5 prices             pricleist.add(1.1); ....
	    // try to get 3rd items     pricelist.get(2);
	    // iterate over arraylist using both loops 
	    // and print out 
	    
	    // in another loop 
	    // only print out price more than 10 ; 
		
	 
	 ArrayList<Double> pricelist = new ArrayList<> ();
	 pricelist.add(1.1);
	 pricelist.add(2.1);
	 pricelist.add(3.1);
	 pricelist.add(4.1);
	 pricelist.add(5.1);
	 
	 System.out.println("third item: " + pricelist.get(2));
	 
	 for (int i = 0; i< pricelist.size(); i++) {
		 if (pricelist.get(i)>10.0) {
			 System.out.println(i);
		 }else {
			 System.out.println("do not print");
		 }
		 
		// System.out.println(pricelist.get(i));
	 }
	 System.out.println();
	 for(Double each: pricelist){
		 
		 
		 System.out.println(each);
    
    // in another loop
     * 
     * 
    //                   GET THE SUM OF ALL PRICES ;
    
    System.out.println("PRINT SUM ");
    
    
    // arithmatic operation only happens for primitives 
    // if you try to add wrapper objects it will be unboxed 
    double sum = 0 ; 
    for (double each : priceList) {
      sum += each ; 
    }
    System.out.println(   sum);
        
    
  }

}


	         
	          
	          
	         */
	}

}
