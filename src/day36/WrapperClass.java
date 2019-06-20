package day36;

public class WrapperClass {

	public static void main(String[] args) {
		
		//class is a blueprint, or template, or cookie cutter

	//primitive types i uppercase gorurusen o, wrapper class.
		/*
		 boolean Boolean 
		 char  Character
		 byte   Byte
		 short Short
		 int Integer
		 long Long
		 float Float
		 double DOuble
		
		 // wrapper class create etme new yazarak ve capital yazark
		 
		 1. new yazarak
		 2. valueOf yazarak
		 3. String olarak
		 
		 bunlarin hepsi boolean object: litearl degil:
		 
		 we use new keywrd to create an object:
		 it gives u an object, u use as an object
		 one taking string, other taking actual boolean value
		 we use jeyword or valueof keyword
		 
		 sonra 
		 Integer object  gosteriyor
		 
		 Integer i1 = new Integer (123);
		 Integeri2 = new Integer ("123"); //integer object bu, string degil
		 amac; getting the object out of primitive
		 
		 Integer i3 = Integer.valueOf(123);
		 
		 Integer i3 = Integer.valueOf("123");
		 
		 Sout yaparsin hepsini (i1)  
		                       (i2);
		 
		 
		 //all the object stay in the heap
		  * 
		  
		  i1 .equals(123)  you are taking action, u cant do it whule using primitive but in wrapper class, concent bexaomes equal
		  
		  
--->  its a static method Integer.valuOf olur, ne ile valuof olmaz
		 
		 
		 
		 
		 
		 
		 */
	
		 public static void main(String[] args) {
			    // TODO Auto-generated method stub
			    int i = 10 ; 
			    
			    // boolean , char , byte, short , int , long 
			    // float , double
			    
			    /*
			     * Wrapper class --> 
			     * specifically designed to 
			     * store primitive value as object 
			     * 
			     * */
			    Boolean b =  new Boolean(true) ; 
			    Boolean b1 = new Boolean("false"); 
			    Boolean b2 = Boolean.valueOf(true); 
			    Boolean b3 = Boolean.valueOf("true"); 
			    
			    System.out.println(  b );
			    System.out.println(  b1 );
			    System.out.println(  b2 );
			    System.out.println(  b3 );
			    
			    Integer i1 = new Integer(123); 
			    Integer i2 = new Integer("123"); 
			    Integer i3 = Integer.valueOf(123); 
			    Integer i4 = Integer.valueOf("123"); 

			    System.out.println("equal? "+  i1.equals(123) );
			    System.out.println(  i2 );
			    System.out.println(  i3 );
			    System.out.println(  i4 );
			    
			    
			    
			    
			    //u can create an object in this ways, and take action with it..normalde primitivelerde boyle olmaz 
			    //ve bu string ve valuof neyi hatirlatir..method overload ile ayni
			    
			    
			    Character c1 = new Character('c');
			    Character c2 = Character.valueOf('c');
			    		
			    
			    
	
	
	
	
	}

}
