import java.util.Scanner;

public class MultibranchIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//gradebook 
		
		int score =84;
		//if the score is between 90 -100 A
		//                         80-89 B
		//                   70-79 C
		//Else          D and study harder
		
		
		Scanner scan =new Scanner(System.in);
		
		
		if (score>90) {
			System.out.println("a");
		}else if(score>=80 && score < 90) {
			System.out.println("B");
		}else {
			System.out.println("harder");
			
			
			
		}
		
		
	}

}
