package day20WHileDoWhileForLoops;

public class WhileTrue {

	public static void main(String[] args) {
		
		int x=0;
		
		while(true) {
			//System.out.println("Action");
			
			x++;
			System.out.println(x);
			if(x==10) {   //how u get out of loop with break statement
				break;
			}
		}
		
	}

}
