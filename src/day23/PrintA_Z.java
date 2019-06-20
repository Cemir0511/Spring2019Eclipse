package day23;

public class PrintA_Z {

	public static void main(String[] args) {
//how do i print from a to z?
//loop bilmeden once:
/*		
char a= 'a';
		
//char next = a+1;//okumaz cunku we cant add a char to number
System.out.println(a+1);//bu ascii code veriri cuncku //98 asccii
        ///character number a donusturur hep
      //char next = a+1; we need to cast them
 
char next = (char) (a+1); //casting
System.out.println(next);// b verir casting sonrasi

//**for loop kullanicaz, ascii code ve char conversion nasil kullanilir beraber:

int asciiCode = 'a'; 
System.out.println(asciiCode); //97 print olur  ascii cikar


//!!!if u treat a character as a number, you get ascii code alwaysss.
for (int i = 'a'; i<='z';i++) {

char eachChar = (char) i ;//donwcasting
System.out.print(eachChar); //a to z printed
			
}	
	*/	
	
//Akbar's:

//upcasting==type widening
//converting smaller data type to bigger
//ex. int to long


//char a = 'a' ; 

//System.out.println( a+1 );
//char next =  (char) (a + 1) ; 
//System.out.println(next );
//
//int asciiCode = 'a' ; 
//System.out.println(asciiCode);


//for(int i = 'a' ; i<= 'z' ; i++ ) {

//char eachChar = (char) i ; 
//System.out.print( eachChar);

//Akbar's
// upcasting -- type widening -->>
// converting smaller data type to bigger data type
// for example : int to long , int - double 
//          char to int 
// upcasting happen implicitly (automatically by compiler)

/*
* downcasting -- type narrowing --> 
*   converting from bigger data type to smaller 
*   for example : double to int , long to short 
*          int to char 
*  // downcasting must happen explicitly (by programmer)
*   or it will not compile  
*   
* */


char a = 'a' ; 

System.out.println( a+1 );
char next =  (char) (a + 1) ; 
System.out.println(next );

int asciiCode = 'a' ; 
System.out.println(asciiCode);


for(int i = 'a' ; i<= 'z' ; i++ ) {

char eachChar = (char) i ; 
System.out.print( eachChar);

}

// write a program to print all the char from beginning char 
// to ending char 
// if beginning character is before ending character 
// just print in low to high order 
// if ending character is before beginning char 
// then print in high to low order





}


}
