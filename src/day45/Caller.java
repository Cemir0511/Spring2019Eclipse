package day45;

public class Caller {

	
	public Caller() {
		
		this(100);   // recursive constructor invocation  old NOT ALLOWED
		System.out.println("calling no arg");
	}
	
	public Caller (int x) {
		
		this();
		System.out.println("calling 1 arg");
	}
	
}


// this is me calling u, u calling me 
// we never erach each other
//recursive constriuctor...