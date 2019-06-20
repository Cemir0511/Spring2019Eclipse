package day49;

public class AudioBook extends Book {
	
	public int audioLength;
	  /*
	   * protected int pageCount;
	    String author;
	    int chapterCount;
	    double price;
	   * */  
	  public void play() {
	    // we are playing <author>'s book 
	    // and it's <audioLength> hour long
	    System.out.println("we are playing Book of " 
	        + author + " it is " 
	        + audioLength + " hour long" );
	  }
	  

	  
	  /*
	   * public void printAuthor() {
	    System.out.println("name "+ author);
	    }
	   * */
	
	
}
