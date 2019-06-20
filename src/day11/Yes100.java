package day11;

public class Yes100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;

		if (x != 100)
			System.out.println("Not a 100");
		else
			System.out.println("yes 100");

		if (x > 100)
			System.out.println("more than 100");
		System.out.println();

		
		
		
		if (x==100 | ++x <200) {
			System.out.println("both are true");
			
			System.out.println(x);
		}
	}

}
