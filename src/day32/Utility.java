package day32;

public class Utility {

	public static void main(String[] args) {
		
		/*
		String name = "Emine";
        Sout (name.length());
        
		System.out.println(name.charAt(1)); //iki sekilde m yazdirabiliriz, direk 
		
		char c = name.charAt(1); // veya store ederek boyle /// tek bu bisey yazmaz, ise yaramaz
		
		System.out.println(c); //anca print ettirince c biise yarar
		*/
	/*	
	There are two ways to call statsic method
		we can just directly call the method by it's name 
		and passing the value it required
		2. or we can use calssName.staticmethodName(params)
	*/	
		
	giveMe5(); //tek bu bisey yazmaz/yapmaz..cunku hic action yuklemedin
		           ///print ettirmedin
		      
	            //call ettin sadece yukarda metodu
	            ///simdi print ettirmelisin to return 5./or sth
	
	//We can use directly staticMethod(params) to call the static methods
	System.out.println(  giveMe5()  ); //no need object cause static, napabilirim?
	
	//we can use className.staticMethod to call the static method
	System.out.println(Utility.giveMe5());     //ustteki ve bu ayni sey                                  //we use class name method
		
	int myNum = giveMe5(); //hep yazmamak icin store ederiz	
		                   //method um int old icin int myNum a store edebilirim
	System.out.println(myNum);
	
	giveMe6DigitSalary();
	giveMe6DigitSalary();
	}
	
	
	public static int giveMe5() {
		
		return 5; 
	}
	
	//Task 1: create a 
	
	
	public static long giveMe6DigitSalary() {
		long total =2 * giveMe6DigitSalary();
		return total; 
	}

}
