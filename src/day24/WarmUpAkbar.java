package day24;

public class WarmUpAkbar {

	public static void main(String[] args) {
		// WARM UP TASKS
	    /*
	     * 1, print java 5 times in one row java java java java java 
	     * print total of 5 rows of above message *
	     */
	    for (int i = 1; i <= 5; i++) {
	    
	      for (int j = 1; j <= 5; j++) {
	        System.out.print("java ");
	      }
	      System.out.println();
	      
	    }
	    
	   /* * 2, print 1-5 in one line print above line 5 more times as we did in class NOW
	     * : modify this code to print 
	     * 1 
	     * 12 
	     * 123 
	     * 1234 
	     * 12345
	     */
	    
	    for (int i = 1; i <= 5; i++) {
	      for (int j = 1; j <= i; j++) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	    
	    
	    for (int j = 1; j <= 1; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
//	    for (int j = 1; j <= 2; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
//	    for (int j = 1; j <= 3; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
//	    for (int j = 1; j <= 4; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
//	    for (int j = 1; j <= 5; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
	    
	    
	    
//	    for (int i = 1; i <= 5; i++) {
	//
//	      for (int j = 1; j <= 5; j++) {
//	        System.out.print(j + " ");
//	      }
//	      
//	      System.out.println();
//	    }
	  }
	    //3. task
	    for (int i = 0; i < 26; i++) {
			for (int j = 'A'; j <= 'Z'; j++) {
				System.out.print((char)j + " ");
			}
			 System.out.println();  
			 
			 /*
			  *  for (int counter = 'A' ; counter <='Z' ; counter++ ) {

            for (int letter = 'A'; letter <= counter; letter++) {

                System.out.print((char) letter + "");
            }
            System.out.println();
        }
			  */
			 
			 /*
	             *  3, Print A-Z  26 times in 26 rows
	             *    NOW :
	             *     Modify the code to print as below
	             *     A
	             *     AB
	             *     ABC
	             *     ABCD
	             *     ABCDE
	             *     ...
	             *     ...
	             *     ALL THE WAY TILL Z
	             * */
////	    for (int i = 1; i <= 26; i++) {
////	    for (int i = 65; i <= 91; i++) {
	    for (int i = 'A'; i <= 'Z'; i++) {

	      for (int c = 'A'; c <= i; c++) {
	        System.out.print( (char)c + " ");
	      }
	      System.out.println();
	      
	    }
	    
//	    for (int c = 'A'; c <= 'A'; c++) {
//	      System.out.print( (char)c + " ");
//	    }
//	    System.out.println();
	//    
//	    for (int c = 'A'; c <= 'B'; c++) {
//	      System.out.print( (char)c + " ");
//	    }
//	    System.out.println();
	//    
//	    for (int c = 'A'; c <= 'C'; c++) {
//	      System.out.print( (char)c + " ");
//	    }
//	    System.out.println();
	    
	    


	}

	}

}
