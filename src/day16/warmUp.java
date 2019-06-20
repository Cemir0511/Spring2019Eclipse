package day16;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Akbar:
		
		/*
		 * create a String variable str
		 * 
		 * assign value of -> Sunday is Java Day
		 * 
		 * 1, make it all upper case 
		 * 2, get last two characters 
		 * 3, get the position of is 
		 * 4, check whether word Java exists in this Str OPTIONAL : 5, get the index
		 * of 3rd word(without knowing)
		 */
					// string literal 
        
           
		//String str = "Sunday is Java Day" ; 
		String str = new String("Sunday is Java Day"); 
		String up = str.toUpperCase();
		System.out.println( up );
		
		int count = str.length(); 
		// using charAt 
		System.out.println(count);
		
		char last = str.charAt(count-1); 
		char beforeLast = str.charAt(count-2); 
		
		
		System.out.println(beforeLast +""+ last ); 
		System.out.println( str.substring(count-2,count)   );
		//System.out.println( str.substring(count-2)   );
		System.out.println( str.substring(16,18 )   );
		
		
		
		int positionOfIs = str.indexOf("is") ; 
		System.out.println("position Of Is : " + positionOfIs );
		
//		int x = str.indexOf(97) ; 
//		System.out.println( x );
		
		System.out.println( str.contains("Java")  );
		
		System.out.println( str.indexOf("Java")  );
		System.out.println( str.indexOf("Java")>-1  );
		
		
		
		
		
		
		
		
		
		
		



		
		
//birinin:	/*
        /* 
         * String str = "Sunday is java Day";
		
		
		System.out.println(str.toLowerCase());			
		System.out.println(str.toUpperCase());	
		
		System.out.println(str.substring(str.length()-2,str.length()));
		System.out.println(str.indexOf('i'));				
		System.out.println(str.contains("Java"));	
		
		System.out.println(str.contains("Java"));
		System.out.println(str.indexOf(' '));
		String st = str.substring(7,str.length());
		
		System.out.println(st.indexOf(' '));
		String s = st.substring(3,st.length());
		System.out.println(s.indexOf(' '));
		System.out.println(s.substring(0,5));
		*/
		
		
//Get 3th word (small change}
    /*    
        System.out.println(str.indexOf(' '));                // 6
        String st = str.substring(7,str.length());            // 7 =6+1
        
        System.out.println(st.indexOf(' '));                // 2
        String s = st.substring(3,st.length());                // 3 =2+1
        
        System.out.println(s.indexOf(' '));                    // 4
        System.out.println(s.substring(0,5));  // 5 = 4+1
*/
  //erdem's word indexi bulma:  
/*
        
int firstSpace = str.indexOf(" ");
		
		int secondSpace = str.indexOf(" ", firstSpace+1);
		
		int thirdSpace = str.indexOf(" ", secondSpace+1);
		
		String thirdWord = str.substring(secondSpace+1, thirdSpace);
		
		System.out.println(thirdWord);
        
*/		
		
		
		//Akbar final:
			/*
		 * create a String variable str
		 * 
		 * assign value of -> Sunday is Java Day
		 * 
		 * 1, make it all upper case 
		 * 2, get last two characters 
		 * 3, get the position of is 
		 * 4, check whether word Java exists in this Str 
		 * OPTIONAL : 5, get the index
		 * of 3rd word(without knowing)
		 */
		/*
					// string literal 
		//String str = "Sunday is Java Day" ; 
		String str = new String("Sunday is Java Day"); 
		String up = str.toUpperCase();
		System.out.println( up );
		
		int count = str.length(); 
		// using charAt 
		System.out.println(count);
		
		char last = str.charAt(count-1); 
		char beforeLast = str.charAt(count-2); 
		
		
		System.out.println(beforeLast +""+ last ); 
		System.out.println( str.substring(count-2,count)   );
		//System.out.println( str.substring(count-2)   );
		System.out.println( str.substring(16,18 )   );
		
		
		
		int positionOfIs = str.indexOf("is") ; 
		System.out.println("position Of Is : " + positionOfIs );
		
//		int x = str.indexOf(97) ; 
//		System.out.println( x );
		
		System.out.println( str.contains("Java")  );
		
		System.out.println( str.indexOf("Java")  );
		System.out.println( str.indexOf("Java")>-1  );
		
							//SUNDAY IS JAVA DAY 
		//System.out.println(str.toLowerCase().contains("java") );
		String low = str.toLowerCase(); 
		System.out.println(  low.contains("java")  );
		
		
		/*
		 * OPTIONAL : 5, get the index
		 * of 2nd word(without knowing)
		 * "Sunday is Java Day"
		 * */
		int indexOfFirstSpace = str.indexOf(" "); 
		System.out.println( indexOfFirstSpace);
		
		// str.substring(6+1, 6+3)
		String word21 = str.substring(indexOfFirstSpace+1, 
											indexOfFirstSpace+3); 
		
		
		
		
		
		//
String text = "Sunday is Java Day";		
		
		int l = text.length();
				
		int first= text.indexOf(" ");									
			String word1= text.substring(0, first);		
			System.out.println("First word is: " +word1);
		String text2 = text.substring (first+1, l);
		int second= text2.indexOf(" ");	
		String word211= text2.substring(0, second);
			System.out.println("Second word is: " + word211); 		
			
			
			
			
		
		
		
	}

}
