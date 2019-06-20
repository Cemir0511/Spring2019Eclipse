package day27;

public class ForEachfirsttask {

	public static void main(String[] args) {
		
		 /*
	     * create an arrays of String and use for each loop to iterate over them 
	     * create an arrays of double and use for each loop to iterate over them 
	     * 
	     * */
	    
	    String[] names = {"Aliya", "Rayan", "Ainur", "Halida", "Aidar"};
	        for (String eachStr: names)
	        {
	            System.out.println(eachStr);
	        }
	        
	        
	        double[] dbl = { 12.3, 15.8, 20 };
	    for (double eachDbl : dbl) {
	      System.out.println(eachDbl);
	    }
	    
	}

}
