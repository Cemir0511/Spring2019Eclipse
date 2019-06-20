package day33;

public class WarmUpOptional {

	public static void main(String[] args) {
		
		
		 String sentence = "Take a Break" ; //"Love java" ; 

		    
		    System.out.println(  getMyString(sentence)   );
		    


		  }
		  
		  public static String getMyString(String sentence) {
		    
		    String firstChar = sentence.substring(0,1) ; 
		    String[] allWords = sentence.split(" ") ; 
		    String lastWord = allWords[allWords.length-1] ; 
		    
		    String targetWord = firstChar + lastWord.substring(1) ; 
		    return targetWord; 
		  }
		  
		//  
		//   Optional : 
//		     * create a method that take one String parameter as sentence 
//		     * return first character for 
//		     * first word and all characters of last word except first char
//		     * example : Love Java --> Lava 
//		     *    Hold the door --? Hoor

		

		

	

}
