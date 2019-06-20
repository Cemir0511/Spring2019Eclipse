package day18;

public class WhileLoopAkbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DRy principle: DO NOT REPEAT YOURSELF
		
		int x = 10;
		if (x>5) {
			System.out.println("do this");
		}else {
			System.out.println("do that");
			
		}
		
		int y=10;
		if (y>5) {
			System.out.println("do this" +y--);
		}
		
		// DRY Principle 
	    // DO NOT REPEAT YOURSELF 
	    
	    /*
	     * */
	    
	    int z = 10 ; 
	    if(z>5) {
	      System.out.println("DO THIS");
	    }else {
	      System.out.println("DO THAT");
	    }
	    
	    /*
	     * while(as long as some condition is true){
	     *   
	     *   repeat this action 
	     *   
	     * 
	     * }
	     * 
	     * 
	     * */
	    
	      System.out.println(" do this " + y-- );
	      //y -- ; 
	      /*
	      / DRY Principle 
			// DO NOT REPEAT YOURSELF 
			
			/*
			 * */
			
			/*
			 * while(as long as some condition is true){
			 * 	
			 * 	repeat this action 
			 * 
			 * }
			 * 
			 * 
			 * */
			int p = 10 ;  
			while( p > 5) {
				
				System.out.println(" do this p: " + p-- );
			 
	    }
	    
			
	    

	  }

	
	

}
