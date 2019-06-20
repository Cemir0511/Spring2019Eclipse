package day23;

public class PrintFrom15_5NestedLoopTASK2 {

	public static void main(String[] args) {
		
		 for (int j = 0; j<4; j++) {
		
		for (int i = 15; i>=5; i--) {
			 
			System.out.print(i+" ");	 
			 }
			 System.out.println();
		
	
	}
		
		 for (int j = 0; j < 4; j++) {

			  System.out.println("Iteration " + (j+1) );
			  for(int i=15 ; i>=5 ; i--) {
			    System.out.print(i + " ");
			  }
			  System.out.println();
			  
			}

		
	}

}
