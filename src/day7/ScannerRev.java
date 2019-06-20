package day7;
import java.util.Scanner;
public class ScannerRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your name");
		String name = input.nextLine();
		
		System.out.println("I work At the work place:");
		String company = input.nextLine();
		
		System.out.println("Enter your age plase ");
		int age = input.nextInt();
		
		System.out.println("byte ");
		byte b = input.nextByte();
		System.out.println("short ");
		short s = input.nextShort();
		System.out.println("long ");
		long l = input.nextLong();
		System.out.println("float ");
		float f= input.nextFloat();
		System.out.println("double ");
		double d=input.nextDouble();
		
		//char c=No charNext
		System.out.println("u hungry? ");
		boolean isHungry = input.nextBoolean();
				
		System.out.println("Hello fellow coder, your name is"+name + " your company is" +company + "your age is " +age);
		
		
		
		
		
	}
	

}
