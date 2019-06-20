package day21LoopsPractice;

public class ContinueStatementPractice {

	public static void main(String[] args) { 		
			// TASK 2.1 
			    /*
			     * USING FOR LOOP
			     * from 1 to 50
			     * 1, print out all the odd numbers
			     * TASK 2.2
			     * 2, count all the number divisible by 4
			     * TASK 2.3
			     * OPTIONALLY : 
			     * 3, skip all numbers divisible by 3 and 5
			     *    at the same time 
			     * 4, get the sum of above numbers
			     * */
			// TASK 2.1:odd numbers:		    
        for (int i = 1; i < 50; i = i + 2) {
		System.out.print(i + " "); 
        }	    
//	ya da:   for (int i = 0; i < 50; i++) {
//		      
//		      if( i%2 ==1 )  
//		        System.out.print(i + " ");
//		    }
           //All even numbers:
        System.out.println();
		    for (int i = 0; i < 50; i++) {
		      
		      if( i%2 ==0 ) {
		        continue;
		      }    
		      System.out.print(i + " ");
		    } 
			    // TASK 2.2 4 e bolunenlerin adedi count la: 
			    int count = 0 ; 
			    for (int i1 = 1; i1 < 50; i1++) {			      
			      if(i1%4==0) {
			    	  count++; //count = count + 1 ; //adedin artisi
			      }
		      }
			    for (int i1 = 1; i1 <50; i1++) {
			      if( i1%4 != 0) {
			        continue ; 
			      }
			      count = count + 1 ; // count++ ; 
			    }
			    
			    System.out.println("count is : "+ count);
			    
			    
		    }

}
