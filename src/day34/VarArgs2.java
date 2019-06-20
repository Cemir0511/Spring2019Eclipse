package day34;

public class VarArgs2 {

	public static void main(String[] args) {
		
		
		
		 String dog = null ; 
		    //System.out.println( dog.length() );
		    
		    printNames("Zukhra", "Fidan", "Alina","Odiljan"
		       ,"Sharif", "Ahmad","Bayram" ,"Firdevers", "Ansar"); 
		  
		    printNames("Maryam","Ameria","Hadice");
		    printNames();
		    // we can pass as many argument as possible for varArgs
		    // including null for any reference type 
		    printNames(null,"not empty", "");
		    
		    
		    

		  }
		  
		  public static void printNames(String... names ) {
		    
		    // String[] names = {null,"not empty", ""}; 
		    
		    
		    
		    
		    // names are treated as String[] that have 
		    // whatever variable numbers of arguments from method call 
		    //System.out.println(names[0]);
		    //System.out.println(names[3]);
		    System.out.println("You passed "+ names.length + " arguments");
		    
		    
		  }
		  // Task 4 
		  // create a static method sentenceBuilder 
		  // take string vararg words as parameter 
		  // return the concatenation of all the arguments user passed 
		  // call this method to see your result 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

		


	

}
