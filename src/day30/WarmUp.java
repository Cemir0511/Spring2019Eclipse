package day30;

public class WarmUp {
	
	/*WARM UP
	1, Create a static method called  sayHello :
	this method return nothing and does not take any parameter
	and it will greeting spartan
	
	2, Create a static method called  sayGoodBye :
	this method return nothing and does not take any parameter
	and it will good bye spartan

	3, Create a static method called  sayHelloTo :
	this method return nothing and take 1 String name as parameter
	and it will greeting --the Name You passed
	*/
	public static void sayHellos() {
	System.out.println("hey spartan");	
	}
	
	public static void sayGoodbyes() {
		System.out.println("goodbye spartan");
	}
	public static void sayHelloTos(String names) {
		System.out.println("Say hi to: " + names);
	}
	
	public static void main(String[] args) {
	//main metodda yazilan siraya gore print edilecek ve adette ona gore
		sayHello(); //order matters
		sayGoodbye();
		sayHelloTo(); //classname optional WarmUp.sayHelloTo();
		
		
		sayHellos();
		sayGoodbyes();
		sayHelloTos ("Cemal");
		
	}
	
	public static void sayHello() {
		System.out.println("Greeting ");
	}
		
		
		public static void sayGoodbye() {
			System.out.println("Goodbye Spartan");	
		}
		
	
	
	public static void sayHelloTo () {
		String name= "Oglum";
		System.out.println("Say hello to " + name);
		
		
		//Does it need an object?    Static or not
		//Does it return a value?    Void or not
		//Does it take data or not?    Has parameter or not
	}

}
