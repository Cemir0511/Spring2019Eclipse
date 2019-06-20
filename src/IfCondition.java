import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int score=59;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("what is your score?");
		
		int score = input.nextInt();
		
		System.out.println("current score is")+score);
		
		if (score > 70) {
			System.out.println("Yousahll pass");
		
			
		}else {
 
		System.out.println("You shall not pass");	
			
			
	}

}
}
