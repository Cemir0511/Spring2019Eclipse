package day30;

public class NumberGame {

	public static void main(String[] args) {
		
	printThedoubleNumber(10);  //20
	printThedoubleNumber(6);   //2yle carpti 12
	checkForAge(21);  //adult///age 21 yani methodun icinde bunu check eder 
//yada int i = 21; dersin
//ve checkForAge(i) dersin ...bu da ayni calisir bir ustteki gibi
//ama double falan olamaz
//checkForAge(12.5);compile etmez!! cunku double inte sigmaz, store edilemez
	checkForAge(17); //not an adult
		
	}
	
	public static void printThedoubleNumber(int i) {
		int i1 = i*2;
		
		System.out.println( i + " is doubled :" + i1);
		
	}
	     //int age is called method parameters//
	//!!YANI EXTERNAL DATA ALDI (INT AGE), HALA VOID YANI NO RETURN VALUE
	public static void checkForAge(int age) {
		                          //PARANTEZ ICI DOLUYSA EXTERNAL DATA ALDI
		
		if (age> 18) {
			System.out.println("adult");
		}else  {
			System.out.println("not an adult");
		
	}
	// Task 2 
    /* 2.1
     * create a static method with no return type
     * called printTheDoubledNumber
     * it takes 1 int as parameter
     * and it will print out doubled number on the console
     * 
     * 2.2 
     * create another static method with no return type
     * called checkForAge 
     * it takes 1 int age as parameter
     * inside body , check whether the age is more than 18 
     * if the age is more than 10 --> print adult 
     * if not print not an adult  
     * 
     * */
		
	}
}
