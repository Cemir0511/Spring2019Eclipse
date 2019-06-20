package day37;

import java.util.ArrayList;

public class RemoveFromIntegerList {

	public static void main(String[] args) {
		
		
		/*
	     * 
	     * */
	    
	    ArrayList<Integer> lst = new ArrayList<>(); 
	    lst.add(1); 
	    lst.add(2); 
	    lst.add(3); 
	    lst.add(4); 
	    
	    lst.remove(2); // bu index 2 yi remove eder
	             //diger sekli: remove etmenin valuo olarak, yani object olarak:
	    //1. lst.remove( new Integer(2));
	    //2. lst.remove( Integer.valueOf(2));
	    
	    System.out.println(lst);
	    


	}

}
