package day36;

public class StringToPrimitivesObject {

	public static void main(String[] args) {
		
		

		
		


/* bu birinin:
	
	String str1 = "True";
        Boolean b1=Boolean.parseBoolean(str1); //true
        Boolean b2=Boolean.parseBoolean("ABC"); //false
        Boolean b3=Boolean.parseBoolean("TrUe");  // not case sensitive
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        String d = "3.14";
        Double d1 = Double.valueOf(d);
        Double d2 = 6.28;
        
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d1.equals("3.14")); // false
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        
        //invalid conversions
        
        System.out.println( Double.parseDouble("3.14abc")); // does not complie
        //Exception in thread "main" java.lang.NumberFormatException
        
        
        // ftam:
         * String s="100";
		int i=Integer.parseInt(s);
		System.out.println(s+100);//100100 because + is string concatenation operator
		System.out.println(i+100);//200 because + is binary plus operator
         */
       

//Akbar's:
		
		
/*
 * From string to primitives
 * parseX method will take String
 * and return -->primitive value  primitive boolean yani
 */

String str1 = "True" ;

boolean	b1 = Boolean.parseBoolean(str1); // true
boolean b2 = Boolean.parseBoolean("ABC"); //false
boolean b3 = Boolean.parseBoolean("TRUE"); // true verdi  //("False")  yazsak false olurdu

System.out.println(b1);
System.out.println(b2);	
System.out.println(b3);

// parse neymis yani, String i primitive value ya cevirmek icin kullanilan method

/*
* From String to wrapper Class object
* valueOf method will take String
* and return-->Wrapper class object
* 
*/

String d = "3.14";
Double d1 = Double.valueOf(d);
System.out.println(d1.toString());
double d2 = d1 ;//--> auto Un boxing

// valueOf ile da String i wrap edersin, boxing, (primitive leri de valuOf la object yaparsin zaten.)

// invalid conversion*****
	
	// System.out.println(Double.parseDouble("3.14abc")); olmadi bu
	
System.out.println(Integer.valueOf("3"));  // 3 verdi, integer old 3 yazdik 3.14 yerine
	}
	
	
	
	
	*/