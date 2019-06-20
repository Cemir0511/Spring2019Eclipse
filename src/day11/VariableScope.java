package day11;

public class VariableScope {

	public static void main(String[] args) {
		

		
		//variable scope: it means you can access the piece of data
		//u declared only inside that block
		int x=10;
		//int y=5;
		
		if(x==10) {
			//x +=5;
			
			
			
			System.out.println("yes 10");
			
			int y=2;
			
			System.out.println(y);
			
			
	}
		
		// out of scope 
				// items created inside bedroom can not be accessed inside living room 
				//System.out.println(y);
				
				System.out.println(x);
		
		
	}

}
