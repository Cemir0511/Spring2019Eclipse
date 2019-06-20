package day23;

public class ExtractLowerCaseFromString {

	public static void main(String[] args) {
		//char eachChar='H';
//Ascii	code yani her karaktere ansil gidecegiz..
//lowercase old nerden bilirim?: a-z arasiysa bilirim.
//Sout.char c='h' , c>='a' ise ascii code da value bilirim
//Sout..yada eachChar<= 'z' ise de true ise lowercase tir 
//her iki condition da
		
//bir soru geldiginde, ilk dusnecegin single one la ne yapacagin, sonra
		//tumuyle dusun
//ve metod dusun, condition var mi dusun, 
		
//bir charakteri lowercase mi bulabiliyorsan ayni matikla milyo bulabilirsin
//charAt ... each= str.charAt(i)
//storing each character inside	variable each
//each iteration will store that char
		
//then checj wheter this character at this iteration
//is within the rage of a-z..if condition..
	//allLowerCaseStr+= each; add on top of each other
	//Sout ("its lowercase; " +each);
	
		
		String str = "5 Little Monkey Jumping on The Bed"; 
	    
//	    char eachChar = 'H' ; 
//	    System.out.println( eachChar >= 'a' );
//	    System.out.println( eachChar <= 'z' );
	//    
//	    if( eachChar >= 'a' && eachChar <= 'z')  {
//	      System.out.println("IT'S lowercase");
//	    }
//	    System.out.println("THE END");
	    
	    String allLowercaseStr = ""; 
	    for (int i = 0; i < str.length(); i++) {
	      /// storing each character inside variable each
	      // each iteration it will store that char 
	      char each = str.charAt(i); 
	      // checking whether this character at this iteration 
	      // is within the range of a-z
	      if( each >= 'a' && each <= 'z')  {
	        allLowercaseStr += each ;  // add on top of each other
	        //System.out.println("IT'S lowercase : " + each );
	      }
	    }
	    System.out.println( allLowercaseStr);
	    
		
		
		
	}

}
