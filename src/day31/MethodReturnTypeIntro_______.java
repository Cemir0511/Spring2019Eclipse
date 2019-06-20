package day31;

public class MethodReturnTypeIntro_______ {

	public static void main(String[] args) {
		
		
		String str="You know nothing about Java John Snow";
		int count = str.length();
		System.out.println(count);
		System.out.println( str.length() );
	    
	    
	    //String arrStr = Arrays.toString(str.toCharArray()) ; 
	    
	    int five = giveMeFive() ; 
	    System.out.println(  five );
	    System.out.println( giveMeFive()  );
	    
	    //////
	    
	    String name = giveMeMyName(); 
	    System.out.println( name );
	    
	    System.out.println(  name.substring(0,2)   );
	    
	    /////
	    
	    tellMyName();
	    System.out.println(tellMyName());
	    String myName = tellMyName();
	    
	    System.out.println(myName.charAt(0));
	    System.out.println(myName.substring(0,3));
	    System.out.println(myName.substring(1, 4));
	    
	   
	  }
	    
	  public static String giveMeMyName() {
	    
	    return "Akbar" ; 
	    
	  }
	  
	  
	  public static int giveMeFive() {
	    
	    return 5 ; 
	}
	  
	  public static String tellMyName () {
		  String myName = "Zeliha";
		  return myName;
		  
	  }

}
