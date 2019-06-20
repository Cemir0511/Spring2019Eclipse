package day28;

import java.util.Arrays;

public class WarupReverse {

	public static void main(String[] args) {
		
		
		String str = "Sunday Perfect Day to start coding" ; 
		//reverse abpve sentence to generate below:
	    // coding start to Day Perfect Sunday
		
		String[] strArr = str.split(" "); 
	    
	    for (int i = strArr.length-1 ; i >= 0 ; i--) {
	    
	      //System.out.print(strArr[i] + "-");
	    
	    }
	    
	    String strRev = "" ; 
	    int lastIndex = strArr.length-1 ; 
	    
	    for (int i = 0; i < strArr.length/2; i++) {
	      //System.out.print(strArr[i] );
	      String temp = strArr[i] ;
	      strArr[i] = strArr[lastIndex - i] ; 
	      strArr[lastIndex - i] = temp ;      
	    }
	    System.out.println(  Arrays.toString(strArr));
	    
	  //Shariyorun:
        //String [] words = str.split(" ");
		
		//for (int i =words.length-1  ; i >= 0 ; i-- ) {
			
		//	System.out.print(words [i]+" ");
		
		/*
		Esranin:
			
			String str = "Sunday Perfect Day to Start Coding";
        String arr[]=str.split(" ");
            
                
                String reversed="";
                for(int i=0; i<arr.length;i++) {
                    for(int j=arr[i].length()-1; j>=0;j--) {
                        reversed=""+arr[i].charAt(j);
                        System.out.print(reversed);
                    }
                System.out.println();
                
                }
                */
	
		//Optional: reverse word+reverse each char of the words

	    
	    /*Hurmanin optional:
	     * / 2. Optional: reverse word + reverse each char of the word
         String str = "Sunday Perfect Day to start coding" ;
         String [] strArr= str.split(" ");
         for (int i=strArr.length-1; i>=0; i--) {
             String reverse = "";
             for (int j=strArr[i].length()-1; j>=0; j--) {
                 reverse +=strArr[i].charAt(j)+"";
             }
             System.out.print(reverse+" ");
         }
	     */
	    
	    
		
		
                
		}
		
		
		
		
		
	

}
