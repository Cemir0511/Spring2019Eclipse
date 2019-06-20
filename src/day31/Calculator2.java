package day31;

public class Calculator2 {

	public static void main(String[] args) {
		calculator(100, 30);
		add(3,4);
		sub(3,4);
		mult(3,4);
		div(3,4);
		mod(3,4);
		
	}
	
	public static void calculator(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}
	public static void add(int a,int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	public static void sub(int a,int b) {
		System.out.println(a+" - "+b+" = "+(a-b));
	}
	public static void mult(int a,int b) {
		System.out.println(a+" * "+b+" = "+(a*b));
	}
	public static void div(int a,int b) {
		System.out.println(a+" / "+b+" = "+(a/b));
	}
	public static void mod(int a,int b) {
		System.out.println(a+" % "+b+" = "+(a%b));
	}
}
