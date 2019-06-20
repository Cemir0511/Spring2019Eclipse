package day21LoopsPractice;
public class LoopControlStatement {
	public static void main(String[] args) {		
	//break;break out the loop
	//continue: skip current iteration, it will jump to next one
		//while do while la da kullanabilirsin continiu yu da.
		for (int i=0;i<10;i++) {
			if(i==5){
				break;//GET OUT OF THE LOOP
				      //BREAK THE CHAIN
			}
			System.out.println("GOT SMART WATER?"); 	
		}
	   for (int i=0;i<10;i++) {
			if(i==5){
				continue;//basa doner..iteration is done actually
			  //continue is for skipping the mean neighbour
			//SKIP THIS ITERATION AND GO TO THE NEXT
			//IT WILL SKIP NM. 5 IN ITERATION BEC OF CONTINUE!	
			}
			//break;
			System.out.println("GOT SMART WATER?"+1); 
			break;//burda olursa it will just get out of the loop
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
