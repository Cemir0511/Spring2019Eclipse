package day21LoopsPractice;

public class Task2$2 {

	public static void main(String[] args) {
		
		
		// TASK 2.1 
	    /*
	     * USING FOR LOOP 
	     * 
	     * from 1 to 50 
	     * 
	     * 1, print out all the odd numbers
	     * 
	     * TASK 2.2
	     * 
	     * 2, count all the number divisible by 4
	     * 
	     * TASK 2.3
	     * OPTIONALLY : 
	     * 3, skip all numbers divisible by 3 and 5
	     *    at the same time 
	     * 4, get the sum of above numbers 
	     * 
	     * */
	    
		for ( int l = 0 ; l<=50;l++) {
			if(l%2==1) {
				
			
			System.out.print("l is: "+ l);
			System.out.println();
			}
		}
		
		int countolan= 0;
		for(int h=0; h<=50;h++) {
			if (h%4==0) {
			System.out.println("h is " + h);	
			countolan++;
			
			
			}
			
		}	
		
		
		
		
		
	    
	    // TASK 2.2
	    int count = 0 ; 
//	    for (int i = 1; i < 50; i++) {
//	      
//	      if(i%4==0) {
//	        count = count + 1 ; // count ++ ; 
	    
//	      }
//	      
//	    }
	    for (int i = 1; i <50; i++) {
	      
	      if( i%4 != 0) {
	        continue ; //12 adet 4le bolunebilen var yine
	      //break veya continue dan sonra ki yere gitmez.!!
	      
	      }
	      
	      count = count + 1 ; // count++ ; 
	    }
	    
	    System.out.println("count is : "+ count);	

		
		
		
		
		
	}

}
