package day14;

public class StringReviewDay14 {

	public static void main(String[] args) {
		
		/*
		 * String class method 
		 * 	
		 * 	1, length() 
		 *  2, 
		 * */
		String name = "Mamatjan" ;  
		System.out.println( name );
		System.out.println( "Mamatjan" );
//		
//								// 8 
        System.out.println( name.length());
//		
        System.out.println( name.toUpperCase() );
//		
		System.out.println( name.toLowerCase() );
		
		char secondChar = name.charAt(1) ; 
		System.out.println(  name.charAt(1) );		
		System.out.println(secondChar);
		
		
//SON HARF PRINT ETME: lastIndex  ...name.length()-1 ...charAt(lastIndex)
		
		int lastIndex	= name.length()-1 ; 
		System.out.println(   name.charAt(lastIndex)    );
		
		/*
		 *  length()  taking no external data 
		 *  		and returning a number 
		 *  
		 *  first character index is alwasys 0 
		 *  last character index is always one less than 
		 *  	actual count of character 
		 *  int lastIndex	= str.length()-1
		 *  
		 *  
		 *  charAt(1)  taking 1 extenal data / argument
		 *  	 and returning a character 
		 *  
		 *  str.charAt(lastIndex) ; 
		 *  
		 * */
		// IKI ISIM __STRING ESITLIGU:equality 
		
		
		System.out.println(  name.equals("Mamatjan")   );
		System.out.println(  name.equalsIgnoreCase("Mamatjan")   );
		
		// CONTAINS--contains 
		
		String name2 = "Mamatjan" ; 
		boolean containsOrNot = name2.contains("aam") ; 
		System.out.println(containsOrNot);
		
		// indexOf 
		// return the index of first occurance of the string given 
		// if it does not exist it will return - 1
		System.out.println( name2.indexOf("am")   );
		System.out.println( name2.indexOf("t")   );
		System.out.println( name2.indexOf("samatjan")   );
		System.out.println( name2.indexOf("Mamatjan")   );
		System.out.println( name2.indexOf("mamatjan")   );
		
		String uName = name.toUpperCase() ; 
		System.out.println( uName.indexOf("MAMATJAN")   );
		
		// optional 
		System.out.println( name.toUpperCase().indexOf("MA") )  ; 
		
		//System.out.println( name.length().indexOf("MA") )  ; 
	
		
		
	}



		
	}


