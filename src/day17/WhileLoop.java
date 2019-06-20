package day17;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Task 2  print even numbers from 0-10 
		
				int x = 0 ; 
				
				// How many iteration do we have 6 
//				while(x <= 10) {
//					
//					System.out.println("value of x is " + x );
//					x += 2 ; // x = x+2 
//				}
				// How many iteration do we have 11 
				while(x < 11) {
					
					if( x%2==0 ) {
						System.out.println("value of x is " + x );
					}
					x++ ; 
				}
				
				//  TASK 3 : 
				// print out all the odd numbers within 50-100
				
				
				// OPTIONAL TASK : print only even number between 50-70
				// and odd number for the rest in one while loop 
				
				
				
				
				
				
				
				
				int odd =51;
				while (odd<+100) {
					System.out.println("odd is" +odd);
					odd +=1;
				}
				
				
				
				int z=50;
				while(z<100) {
					
				
					if (z%2==1) { // z%2!=0
						System.out.println("value of z is " + z);
					}
					z++;
				}
				
				
				
				
				// OPTIONAL TASK : print only even number between 50-70
				// and odd number for the rest in one while loop 
				
				
				int h = 50;
				while (h<70) {
					System.out.println("h is:  " +h);
					h +=2;
					System.out.println("");
				}
				h=49;
				while(h<70) {
					System.out.println(" h odd hali"+h);
					h+=2;
				}

	}

}
