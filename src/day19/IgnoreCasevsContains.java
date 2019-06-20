package day19;

public class IgnoreCasevsContains {

	public static void main(String[] args) {
		

		String str = "While Loop" ; 
	    
		  System.out.println(  str.equalsIgnoreCase("while loop") );//true
		  System.out.println(  str.equalsIgnoreCase("while") );//false
		  System.out.println(  str.contains("While") ); //true
		  System.out.println(  str.contains("while") ); //false
		  
		  System.out.println(  str.toLowerCase().contains("while") );//false
		  System.out.println(str.contains("Loop"));//false
		  System.out.println(str.toUpperCase().contains("L")); //true
		    System.out.println(str.contains("z")); // false
		    System.out.println(str.contains("er")); //false
		    System.out.println(str.contains("oop")); //true
		    
   System.out.println(str.equalsIgnoreCase("while loop")); //true
		
	}

}
