package day27;

import java.util.Arrays;

public class Task2WarmUp {

	public static void main(String[] args) {
		//Task 2 :
		/*given : 
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";

		use the method your learned to get each words
		and store it into String array: 

		loop through each items -- 
		  in each iteratrion loop : 
		  	 turn each word into char array 
		  	 print each char out with seperated by -
		output : 
			C-y-b-e-r-t-e-k-
			B-a-t-c-h-
			S-p-a-r-t-a-n-
			i-s-
			m-o-s-t-
			h-a-r-d-w-o-r-k-i-n-g-
			h-c-t-a-B
			e-v-e-r-

		// Optional : Reverse each word in sentence
		your output should be 
		ketrebyC hctaB natrapS si tsom gnikrowdrah hctaB reve 
		Collapse
			*/
		//String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//we use split method
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	    String[] words = str.split(" "); 
	    System.out.println( Arrays.toString(words)  );
	    
	    for (int i = 0; i < words.length; i++) {
	        //System.out.println(words[i]);
	      
	        String one = words[i] ; //"Cybertek" ;  //C-y-b-e-r-t-e-k-
	        char[] cyberChars = one.toCharArray() ; 
	        
	        for(int j = 0 ; j < cyberChars.length ; j++) {
	          System.out.print(cyberChars[j] + "-");
	        }
	        System.out.println();
	      
	        
	        
	        // TODO Auto-generated method stub
	        /*
	         * String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	          ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 
	         * */
	        
	        
	        
//	        String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//	        String[] cyberTek = str.split(" ");  
	        
	        String one = "Cybertek" ; 
	        char[] wordChars = one.toCharArray();
	        int lastIndex = wordChars.length-1 ; 
	        
	        for (int i = 0; i < wordChars.length/2; i++) {
	          
	           char temp = wordChars[i]; 
	           wordChars[i] =  wordChars[lastIndex-i] ; 
	           wordChars[lastIndex-i] = temp ; 
	        }
	        //System.out.println( Arrays.toString(wordChars) );
	        // how to change char array to a String 
	        String reversed = new String(wordChars);
	        //System.out.println(reversed);
	        
	        
	        
	        
	        
	    //    
//	        String revString="";
	    //    
//	        for(int k=0;k<cyberTek.length;k++)
//	        {
//	          String word=cyberTek[k];
//	          
//	          String revWord="";
//	          for(int l=word.length()-1;l>=0;l--)
//	          {
//	            revWord=revWord+word.charAt(l);
//	          }
//	          revString=revString+revWord+" ";
//	        }
//	        System.out.println();
//	        System.out.println(revString);
	    //
	        
	      }
	      
	      

	}

}
