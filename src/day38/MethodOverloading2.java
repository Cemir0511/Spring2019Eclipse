package day38;

public class MethodOverloading2 {

	public static void main(String[] args) {
		
		Integer num = new Integer(100);
		
		doSomething (new Integer (100));
		
		doSomething (100);
		doSomething (Integer.valueOf(100));  // u get an object out of Integer valuoof 100
		
//		Integer x = 100; // bu calisirsa, alttaki de calisir yani mantik olarak
//		doSomething (x);    bu da calisir
		
		doSomething(100);  // bu da calsiti, nenedn, autoboxing oldu..wrapper class..
		
		
		doSomething(Integer.parseInt("100"));  // parse return a primitive
		                                          // String to primitive
		                                       //we just turned a String into int here
		
		
		int  val = Integer.parseInt("100");   // burda sadece store ettik , and we can pass it, or directly pass it..                        
		doSomething(val);
		
		
		// can we set an Integer variable to null??
		//Answer yes!!
		Integer b = null; //bunu diyebiliriz, we are boxing a value into b, so then it can be object, so can be null
		doSomething(b);
		doSomething(null); // its working because I can't say int x= null, but I can say Integer b=null
		
		//any primitive can not be null
		//int x=null;  BAD IDEA!! OLMAZ BU   olmaz!!!!!  yani bunlar object degil
	}
	
	
    public static void doSomething(int x) {
    System.out.println( "doSomething(int x)" );
    }

    public static void doSomething(Integer x) {
    System.out.println( "doSomething(Integer x)" );
    }


    
 /*  Console
 * doSomething(Integer x)
doSomething(int x)
doSomething(Integer x)
doSomething(int x)
doSomething(int x)
doSomething(int x)
doSomething(Integer x)
doSomething(Integer x)
IF THERE IS NO PRIMITIVE METHOD ,, IT WILL AUTOBOX AND PRINT WITH  MEHTHOD TAKES OBJECT


     */
	

}
