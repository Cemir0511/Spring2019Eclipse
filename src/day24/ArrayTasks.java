package day24;

public class ArrayTasks {

	public static void main(String[] args) {
		
		 // create an char array that contains your name characters
	    // create 3 array using the 3 different ways that you learned 
	    
	    // print out each items of your nameArray 
	    
	    char[] myNameChar = new char[6];
	    myNameChar[0] = 'M';
	    myNameChar[1] = 'E';
	    myNameChar[2] = 'H';
	    myNameChar[3] = 'M';
	    myNameChar[4] = 'E';
	    myNameChar[5] = 'T';
	    
	     System.out.print( myNameChar[0] );
	     System.out.print( myNameChar[1]);
	     System.out.print( myNameChar[2]);
	     System.out.print( myNameChar[3]);
	     System.out.print( myNameChar[4]);
	     System.out.print( myNameChar[5]) ; 
	     
	     System.out.println( );
	     for (int i = 0; i < 6; i++) {
	    System.out.print( myNameChar[i]  );
	     }
	     System.out.println( );
	     
	     char[] myNameChar2 = new char[] {'G', 'u', 'l','j','a','h','a','n'} ; 
	     
	     //for (int i = 0; i <= myNameChar2.length-1 ; i++) {
	     for (int i = 0; i < myNameChar2.length ; i++) {
	      System.out.print( myNameChar2[i] + " " );
	     }
	     System.out.println();
	                 // 0    1    2    3    4    5    6    7 
	     char[] myNameChar3 = { 'B', 'e', 'n', 'j', 'a', 'm', 'i', 'n'};
	     
	     /// how do we get last items 
	     int count = myNameChar3.length ; 
	     
	     System.out.println( "item in last index : " +  myNameChar3[count-1] );
	     // how do we get the one in the middle 
	     
	     int midIndex = count/2 ; 
	     
	     System.out.println( "item in mid index : " +  myNameChar3[midIndex] );
	     
	    
	     System.out.print( myNameChar3[7] + " " );
	     System.out.print( myNameChar3[6] + " " );
	     System.out.print( myNameChar3[5] + " " );
	     System.out.print( myNameChar3[4] + " " );
	     System.out.print( myNameChar3[3] + " " );
	     System.out.print( myNameChar3[2] + " " );
	     System.out.print( myNameChar3[1] + " " );
	     System.out.print( myNameChar3[0] + " " );
	     
	     System.out.println();
	     
	     for(int i=7 ; i>=0 ; i--) {
	       System.out.print( myNameChar3[i] + " "   );
	     }
	      
	    
	    
	    
	    







	    

		
		
		/*
		char [] myName1 = new char [4]; //Shah
		myName1 [0] = 'S';
		myName1 [1] = 'h';
		myName1 [2] = 'a';
		myName1 [3] = 'h';
		
		
		char [] myName2 = new char [] {'S', 'h', 'a', 'h'};
		
		char [] myName3 = {'S', 'h', 'a', 'h'};
		
		for (int i = 0 ; i < myName3.length ; i++) {
			
		System.out.print(myName3 [i]);
		
	     
	     ///
	     char [] name = {'S','u','l','e','y','m','a','n'};
			
			for (int i = name.length-1; i >= 0 ; i--) {
				System.out.print(name[i]);
			}
			
			System.out.println();
			
			*/
		}	
		
	

}
