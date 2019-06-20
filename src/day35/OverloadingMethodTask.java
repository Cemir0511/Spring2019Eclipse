package day35;

public class OverloadingMethodTask {

	public static void main(String[] args) {
		
		addNums(10, 20);
		
		addNums(10,20,30);
		
		addNums ( 10,20,30,40);
		
		

	}

	public static void addNums (int n1, int n2) {
		int sum = n1+n2;
		System.out.println(sum);
	}
	
	public static int addNums (int n1, int n2, int n3) {
		
		int sum = n1 + n2 +n3;
		
		return sum;
		
	}
	
	public static void addNums (int n1, int n2, int n3, int n4) {
		System.out.println(n1 +"," +n2+ ","+n3+","+n4);
	}
}
