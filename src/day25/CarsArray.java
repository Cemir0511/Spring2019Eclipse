package day25;

public class CarsArray {

	public static void main(String[] args) {
		String[] cars = new String[] {"Toyota", "BMW", "Honda", "Nissan", "Xali"};
		
		cars [0] = "Toyota";
		cars [1] = "BMW";
		cars [2] = "Honda";
		cars [3] = "Nissan";
		cars [4] = "Xali";
		
		System.out.println(Arrays.toString(cars));
		System.out.println(cars[0]);
	}

}
