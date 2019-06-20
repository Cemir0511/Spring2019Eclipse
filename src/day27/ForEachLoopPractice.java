package day27;

public class ForEachLoopPractice {

	public static void main(String[] args) {
		
		 /*
	     * ask user a word turn that word into a charArray then print out using for each
	     * loop Cybertek --> C-y-b-e-r-t-e-k-
	     */
	    System.out.println("Please enter a word");

	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();

	    char[] characs = word.toCharArray();

	    for (char yes : characs) {
	      System.out.print(yes + "-");
	    }
	    System.out.println();
	    
	    
	    String[] splitted = word.split(""); 
	    for( String each :splitted ) {
	      System.out.print(each + "-");
	    }
	    System.out.println();
	//    
	//    
//	    String[] splitted = word.split(""); 
//	    for( String each :splitted ) {
//	      System.out.print(each + "-");
//	    }
	    
	      /*
	     * ask user for a sentence split it to get each word use for each loop to print
	     * out each word
	     */
	    System.out.println("Enter a sentence");
	    String sentence = scan.nextLine(); 
	    String[] words =  sentence.split(" "); 
	    
	    for(String eachWord : words) {
	      System.out.println(eachWord);
	    }
	    

	    /*
	     * Optional : use combine above two for each loop to finish our previous tasks
	     * 
	     */

	    
	      
	      /*
	     * ask user for a sentence split it to get each word use for each loop to print
	     * out each word
	     */

	    /*
	     * Optional : use combine above two for each loop to finish our previous tasks
	     * 
	     */
		

	}

}
