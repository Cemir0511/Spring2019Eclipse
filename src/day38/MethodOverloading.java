package day38;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
		
	doSomething(); //first will be called
	
	doSomething(100);  // 100 by default int old icin, it will be aoutomatically int,scond one
	
	doSomething(100L); //
	
	doSomething(123d);
	
		
   //  long mylong = 100; // burda upcasting var otomatik, 100 long a sigar otomatik
   //    int x= 100L; olmaz
	
	
		
		
		
	}

	public static void doSomething() {
		System.out.println("doSomething()");
	}
	
	public static void doSomething(int x) {      // bunu comment out yaparsak, yukardaki 100 int autocasting olur
		System.out.println("doSomething(int x)");
	
	}
	
	public static void doSomething(long x) {    //eger bunu comment out edersem , compiler error verir, cunku long yukarda,int metoda  sigmaz
		System.out.println("doSomething(long x)");
	
	}
	
	public static void doSomething(double x) {
		System.out.println("doSomething(double x)");
	
	
		//  compiler will always look at the most sepcific one, closest one as value to match.
	
	
	
	
	
	
	
}
