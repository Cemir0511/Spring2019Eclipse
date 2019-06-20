package day34;

public class WarmUp2 {

	public static void main(String[] args) {
		
		
		public static boolean isPalindrome(String target) {
		    
		    String reversed = "" ; 
		    target = target.replaceAll(" ","") ; 
		    
		    for (int i = target.length() - 1; i >= 0; i--) {

		      //System.out.println(target.charAt(i));
		      reversed += target.charAt(i) + "";
		    }
		    
//		    if(reversed.equals(target) ) {
//		      return true ; 
//		    }

		    return reversed.equals(target) ; 
		    
		  }
		  
		  
		  
		  
		  public static String reverseString(String target) {
		    
		    String reversed = "" ; 
		    
		    for (int i = target.length() - 1; i >= 0; i--) {

		      //System.out.println(target.charAt(i));
		      reversed += target.charAt(i) + "";
		    }
		    
		    return reversed ; 
		    
		  }
		  
		  
		  public static boolean isPalindrome2(String target) {
		    
		    String reversed = reverseString(target) ; 
		    target = target.replaceAll(" ","") ; 
		    reversed = reversed.replaceAll(" ","") ; 
		    
		    return reversed.equals(target) ; 
		    
		  }

		  public static void main(String[] args) {
		    
		    System.out.println(isPalindrome2("hannah"));
		        System.out.println(isPalindrome2("race car"));
		        System.out.println(isPalindrome2("was it a car or a cat  i saw"));
		        System.out.println(isPalindrome2("myname"));
		    
		    
		    // write a method to test a String is a palindrome 
		    
		    //  static method called isPalindrome
		    // it takes one String as a parameter 
		    // return boolean 
		      // for example : ana --> ana ,level 
		      //         race car --> 
		      // was it a car or a cat i saw
		      // space does not matter 
		    
		    
		    
		    
		    // OPTIONALLY : Use your existing method called reserveString
		        
		    
//		    public static String reverseString(String target) {
//		      
//		    }

		  }

		
		
	}

}
