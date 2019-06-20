package day21LoopsPractice;
public class AkbarsTask2ve3 {
	public static void main(String[] args) {
		// TASK 2.1 
	    /*
	     * USING FOR LOOP
	     * from 1 to 50
	     * 1, print out all the odd numbers
	     * TASK 2.2
	     * 2, count all the number divisible by 4.
	     * TASK 2.3
	     * OPTIONALLY : 
	     * 3, skip all numbers divisible by 3 and 5
	     *    at the same time 
	     * 4, get the sum of above numbers 
	     */
	    // TASK 2.3 ve 2.4
	    int sum = 0 ; 
	    for (int i = 1; i < 50; i++) {
	      
	      if(i%5==0 && i%3==0) {
	        continue; // skip to next iteration if true
	      }
	      // if this line is reached 
	      // it means these are the numbers we wanted
	      System.out.print(i + " ");
	      sum = sum + i ; // accumulating the sum in each iteration
	    }
	    System.out.println();
	    System.out.println(sum);	
	}
}
