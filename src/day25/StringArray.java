package day25;

public class StringArray {

	public static void main(String[] args) {
	
		// create an string array of capacity 4
	    // put your favorite movie/show in

	    // 1,first use loop to print them out

	    // 2, print the length of all items

	    // 3 , get the max length movie title

	    String movies[] = new String[4];
	    movies[0] = "Life";
	    movies[1] = "without";
	    movies[2] = "love is";
	    movies[3] = "meaningless";
	    
	    System.out.println( Arrays.toString(movies)  );
	    
	    // getting the count of array 
	    // we are using length property of array object  
	    System.out.println( movies.length     );// notice this without the parenthesis
	    // getting the char count of String 
	    // we are using the length method with parenthesis
//	    int i = 0 ; 
//	    System.out.println( movies[i].length());// notice this with parenthesis
//	    i++ ; 
//	    System.out.println( movies[i].length());// notice this with parenthesis
//	    i++ ; 
//	    System.out.println( movies[i].length());// notice this with parenthesis
//	    i++ ; 
//	    System.out.println( movies[i].length());// notice this with parenthesis
	    for (int i = 0; i <= movies.length-1 ; i++) {
	      System.out.println( movies[i] + " char count is :  "+movies[i].length() ); 
	    }
	    
	    int max = movies[0].length(); 
	    for (int i = 1; i < movies.length; i++) {
	      
	      if( movies[i].length() > max ) {
	        max = movies[i].length() ; 
	      }
	      
	    }
	    System.out.println(max);
	    
	    
	    
	    


	}

}
