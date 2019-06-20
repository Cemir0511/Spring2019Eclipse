package day44;

public class HouseCompany {

	public static void main(String[] args) {
		
		
	    	 House h1 = new House("single house", 5, 120000); 
		     House h2 = new House("town house", 4, 20000); 
		     House h3 = new House("aparatment", 2, 10000); 
		     House h4 = new House("single house", 4, 110000); 
		  
		     
		    // immutable object means 
		      // once it's created , it can not be changed 
		      // so every object created form House class is immutable, can not change
             // but we can read it
		     // READ ONLY OBJECT 
		    
		    // non-resizable -- array 
		      // it can not change in size , cant shrink cant expand 
		    // can we change array? -- yes , arr[0] = new value 
		     //size ini degistiremeyiz, ama internal item den bisey degistirebiliriz item i
		    
		    
		    // WRITE ONLY OBJECT 

//		    h1.setBedroom(6);
//		    h3.setType("single house");  // single house a cevirdik
		    
		    System.out.println(h1);
		    System.out.println(h2);
		    System.out.println(h3);
		    System.out.println(h4);
		    
		    System.out.println(h1.getType());      // getter is an immutable type, readonly
		    System.out.println(h1.getBedroom());   // we jyust reacd it by get, but we can't change objects
		    System.out.println(h1.getPrice());
		    
		    
		    

	}

}
