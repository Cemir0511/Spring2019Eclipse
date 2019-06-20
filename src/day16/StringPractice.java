package day16;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		 * 
		 *  0123456789
		 * "Sunday is Java Day"
		 * */
		int index = str.indexOf(" "); 
		System.out.println( index);
		
		String word2 = str.substring(index+1, index+3) ; 
		
		
		
//		String word2 = str.substring(indexOfFirstSpace+1, 
//											indexOfFirstSpace+3); 
//		
		
		System.out.println(  word2  );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
