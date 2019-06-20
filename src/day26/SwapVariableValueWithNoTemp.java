package day26;

public class SwapVariableValueWithNoTemp {

	public static void main(String[] args) {
int num1 = 100;
		
		System.out.println("num1 was: " + num1);
		
		int num2 = 200;
		
		System.out.println("num2 was: " + num2);
		
		num1 = num1 + num2;

		num2 = num1 - num2;
		
		System.out.println("num2 now is: "+num2);
		
		num1= num1-num2;
		System.out.println("num1 now is: "+num1);

		
		
		
		
		//
		int x = 10;
		int y = 12;
		
		x = x+y;	// x become 22
		y = x-y;	// y = 22 - 12 = 10  vola
		x = x-y;	// x = 22 - 10 = 12  second vola

	}

}
