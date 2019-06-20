import java.util.Scanner;

public class SimpleIfWithoutCurlyBraces {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		/*
		 * boolean b=false; () isnide here you can put boolean literal:true false
		 * boolean variable:b boolean expression :any operation that result in bollena*?
		 */
		// curly braces or if else block are optioanl only when we have a single
		// statemnt
		/*
		 * if(x!=10) Sout("no it is 10"): else Sout (yes it is 10);
		 */

		if (x != 10) {
			System.out.println("Not 10!");
		} else {
			System.out.println("yes it is 10");
		}

	}

}
