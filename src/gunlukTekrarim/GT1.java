package gunlukTekrarim;

import java.util.Scanner;

public class GT1 {

	public static void main(String[] args) {
		
		int n1 =20;
		int n2=10;
		
		int sum= n1+n2;
		int min = n1-n2;
		int division= n1/n2;
		int multip= n1*n2;
		int remainder= n1%n2;
		System.out.println(sum + ", "+ min + ", "+ division+ ", "+ multip+ ", "+ remainder);

		
		int num3= (4+3)*2+4/2;
		System.out.println(num3);
		////////
		////////                     TYPE CASTING
		
		//kucultme:explicit
		//int = double ise double a (int) ekle
		//byte = (byte) short
		//int = (int)long yapilir
		//int = (int)double getirilir
		//int = (int) float 
		int n = (int)3.0;//downcasting
		int y = (int)3.9;
		double d1=300; ///otomatik 300.0 olur
		
		//buyutme otomatik olur cunku zaten kucuk buyuge otomatik rahat sigar
		//long = int
		double d = 30;//otomatik 30.0 print olur cunku double intten buyuk ve int double a sigar
		int a = 3;
		System.out.println(d);
		
		System.out.println(d1);
		
		////////////////              IF STATEMENT
		
		if (9>2 ) {
			System.out.println("good job!");
		}
	
		
		if (100<200) {
			System.out.println("got it correct");
		}
		
		int apples = 10;
		int oranges = 5;
		if(apples>oranges) { //condition true, print etti
			System.out.println("I have more apples than oranges");
		}
		
		if(apples<oranges) {  ///condition false olunca print etmez
			System.out.println("I have more apples than oranges");

		}
		
		String userName= "abc";
		String inputUserName="abc";
		
		if (userName.equals("abc")) {
			// if (userName.equals(inputUserName)){
			System.out.println("Access granted!");
			System.out.println("Welcome agent!");
		}
		
		int books = 5;
		if (books<10) {
			//books= books +10;//true ise books will increase 10 more
			//books +=10; //shorthand operator books plus 10
			//books*=2; //books *2
			//books *=5; 
			//books %=3;
			//books /=3;
			books %=2;		
		System.out.println(books); //based on the true condition, we increase the value of books}
		}
		
		
		boolean hot = true; 
		if (hot==true) { //ya da if(hot){ dersin tek..true zaten
			System.out.println("can I have some ice?");
		}
		
		boolean beautiful=true;
		if (beautiful) {
			System.out.println("Can we be friends?");
		}
		
		int age =20; //false olsa bisey print etmez
		if (age >= 18) {
			System.out.println("Adult");
		}
        boolean hayvanGibi= true;
		
		if (hayvanGibi) {
			System.out.println("Nasil bir seysin?");
		}
		
		String susIt= "hayvan";
		if (susIt .equals("hayvan")) {
			System.out.println("Yuhhhhhhh!!!!!!!!");
		}
		
		String nedir = "budur";
		if(nedir.equals("budur")) {
			System.out.println(nedir);
			
		}
			
	///////////////////////////////       If ELSE
		
		boolean isWeatherNice=true;
		if(!isWeatherNice) {
			System.out.println("Let's go swimming");
		}else {
			System.out.println("Stay home \nwatch movie");//print olur
		}
		/*
		Scanner input = new Scanner (System.in);
		System.out.println("ENter username and password: ");
		String username= input.next();
		String password = input.next();
		
		String validUserName = "superuser";
		String validPwd= "abc123";
		
		if (userName.equals(validUserName)&& password.equals(validPwd)) {
			System.out.println("Welcome");
		}else {
			System.out.println("Access denied");
		}
		*/
		
		/*
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter ur current speed: ");
		int currentSpeed = scan.nextInt();
		
		if (currentSpeed>60) {
			System.out.println(("Slow down"));
			int diff = currentSpeed-60;
			currentSpeed-= diff;
			System.out.println("you are this much more over speed: "+ diff);
		}else {
			System.out.println("Keep driving good");		
		}
		*/
		
/////////////////////////////        If    Else if  Statements  Else  OR MultiBranch If statements
	//instead of having many different if statements, we can combine like if , else if, else
		
		/*
		char grade = 'F';
		
		if (grade =='A') {                   //sadece 1 if condition olur...bu dogruysa digerlerine gitmez, dogru bulunca print eder
			System.out.println("Excellent");
		}else if (grade =='B') {              //can be many else if conditions
			System.out.println("Good");
		}else if (grade == 'C') {
			System.out.println("Not bad");
		}else if (grade == 'D') {
		    System.out.println("could be better");
		}else {                                       //only one else condition and always at the end//mandatory degil, else atabilirsin de
			System.out.println("Work harder!");           //sondaki else optional olabilir... concrete condition varsa gerek yok
		}
		
		*/
		
		Scanner scan = new Scanner (System.in);
 	
		System.out.println("Enter ur shoe size: ");
		int size = scan.nextInt();
		
		if (size >40) {
			System.out.println("Sorry we dont have");
		}else if (size >=6 ) {
			System.out.println("Your shoe is  in stock");
		}else {
			System.out.println("We dont have smaller than size 6");
		}
		
		
		//boyle logical operatorlerle de if boldur:
		System.out.println("Enter a number");
		int number = scan.nextInt();
		
		if (number >= 0 && number <= 100) {  //bir condition olabilir
			System.out.println("Number is between 0-100");
		}else if (number  >100 && number < 100) { //many else if olabilir
			System.out.println("Number is between 100 and 1000");
		}else if (number >1000 && number <100000){
			System.out.println(" Number is between 10000 and 100000");
		}else {
			System.out.println("Either negative or Tooo big number");
		}
			
			//multi branch if lerde 1 if, ve bir else olur , many many else ifler olabilir
			
		
		
/////////////////////////    NESTED IF..   Nested If statements: (outer if, inner if...else..final else..)
		/*
		if (this outer condition is true.. goes to check inner if condition) {
		   (if this outer condition is false, goes to final else right away..doesn't check inner if condition even)
		    if ( a condition is true/false){ bu dogruysa burinci, yanlissa ikinci statement
		    Sout(do some action);
		    }else{
		    Sout(Do sth else);
		    }
		}else{
		    Sout(Do some other action); ///ilk condition false ise direk buraya atlar
		    
		    //////YADA diger sekli:
		 
		 if ( a codintiontrue/false){
		     Sout(Do some action);
		 }else{
		     if ( a condition is true /false);
		     Sout(Do some action);
		     }else{
		     Sout(Do something else);
		     }   	
			
		}
		
		*/
		
		int hourOfDay= 6;
		
		if (hourOfDay<12) {
			System.out.println("Say good morning");
		}else {
			if (hourOfDay<17) {
			System.out.println("Say good afternoon");
			}else {
			System.out.println("Good evening");
			}	
		}
		
		
		///another ex: vending machine
		int typeSelection= 3;
		int drinkSelection= 1;
		double price =0;
		String drink = "none";
		
		if (typeSelection ==1) {
			System.out.println("hot drink-1tea-2coffee");
			if (drinkSelection==1) {
				price = 2.0;
				drink = "tea";
			}else if (drinkSelection==2) {
				price = 4.0;
				drink = "coffee";
			}else {
				System.out.println("In valid cold drink selection");
				
			}
		}else if (typeSelection ==2) {
			System.out.println("cold drinks 1 iced coffee 2.lemonade ");
			if (drinkSelection ==1) {	
			price=3.5;
			drink ="iced tea";
			}else if (drinkSelection == 2) {
				price= 3.5;
				drink = "lemonade";
			}else {
				System.out.println("invalid hot drink slecetion");	
			}
		}else {
			System.out.println("Invalid drink type selection");
		}
		if (drink.equals("none")) //like default value, if nothing selected this runs
		//sedece bir if statement olursa curly braces omayabilir!
			System.out.println("Please try again");
		else 
			System.out.println("Your total for " +drink + "is $"+ price);
				
		
		 
////////////////////////////////      TERNARY CONDITIONAL STATEMENT/TERNARY OPERATOR >> ?        		
	//TERNARY: THREE PARTS.. WITH ? 
		
		// result =  condition ?  expression1  : expression2;
		                         //dogruysa bu : //yanlissa bu
		
		//condition dogruysa, 1 olur, yanlissa 2 olur.
		
		if (n1>n2) {
			int max=n1;
		}else {
			int max=n2;	
		}
		//
		int a1=4;
		int a2 = 7;
		int max;
		
		max =  (a1>a2) ? a1 : a2 ;
		
		System.out.println(max);  //7 is bigger printed
		
		int money = 100;
		int moneyremainder= 10;
		int buyuk;
		
		buyuk = (money>moneyremainder) ? money : moneyremainder;
		System.out.println(buyuk);   // 100 buyuk cikar ternary conditional operator ile
		
		//
		
		int a3= 5, a4=10;
		int maxi;
		
		if (a3>a4) {
			maxi= a3;
		}	else {
			maxi= a4;
		}	
			// now ternary conditional operator:
		
		maxi = (a3>a4) ? a3 : a4;
		System.out.println("maxi is: "+maxi);
		
		//
		boolean isGreen = true;
		String action;
		String go = "can drive";
		String stop = "can't drive";
		
	    action = (isGreen) ? go : stop ;
	    System.out.println(action);
		
	    //
	    
	    int bill = 2000; 
	    int discount;
	    
	    discount = (bill > 1000) ? 20 : 10;
	    
	    discount = ( bill < 2000) ? 20 : 10; 
	    System.out.println(discount);
	    
	    //
	    int finalprice = 100;
	    int total ;
	    
	    total = ( finalprice <110) ? 200 : 50 ;
	    System.out.println(total);
	    
///////////////////////        NESTED TERNARY CONDITIONAL OPERATOR  
	    
	    int bills = 2000; 
	    int quantity = 10; 
	    int discounts;
	    if (bill > 1000) {
	    	if (quantity > 11) {
	    		discount = 10;
	    	}else {
	    		discounts = 9;
	    	}
	    }else {
	    	discounts = 5;	
	    }
	    
	    
	    discounts = ( bills > 1500) ? (quantity > 7) ? 15 : 5 : 1;
	    // 1. de 2. de dogruysa a, 1. dogru 2. yanlissa b, 1 yanlissa otomatik c durumu olur
	    System.out.println(discounts);
	   
	    
	    if ( bill  > 100) {
	    	if (quantity > 11) {
	    		discount = 2;
	    	}else {
	    		discount = 1;
	    	}
	    }else {
	    	discount =0;
	    }
	    	
	    	discount = ( bill > 100)? ( quantity >11)? 10 : 9: 5;	
	    		
	    	
//////////////////////   SWITCH STATEMENT   .. IF ten farki; sadece equality gosterir 

	    	/*
	    	 restaurant rating:
	    	switch ( expression) {  //switch icine ne datatype koyduysan, case 1 onla match etmeli
	    	case 1 : 
	    		statement 1;
	    		break;
	    	case 2 :
	    		statement 2;
	    		break;
	    	case 3 :
	    		statement 3;
	    		break;
	    		
	    		*/
	  // default u basa, ortada veya sona koyabilirsin.. hicbisey match etmezse default u okur
	  // break .. dogruyu bulunca break varsa durur, break yoksa digerlerini chek etmeye devam eder
	  // char, byte, string, int, koyabilirsin switch statement a, boolean i if statement a koyarsin 
	  // switch de ne type varsa, case lerde o type olmak zorunda..
	    	int restaurantRating = 5; 
	    	switch (restaurantRating) {
	    	case 1:
	    		System.out.println("not my favorite");
	    		break;
	    	case 2 :
	    		System.out.println("good restaurant");
	    		break;
	    	case 3:
	    		System.out.println("best restaurant");
	    		break;
	    	default:
	    	    System.out.println(" never dined at this restaurant");
	    	    break;
	    	}
	//if there is no break statement, it keeps running all the way down, and prints all including default
    //break te durur
	   
	    	int rating =3;
	    	 switch (rating) {
	    	 case 1:
	    	 case 2:      
	    	 case 3:       ///yada boyle altaltta caseler de olabilir//3 print eder, dogru yu print eder
	    		 System.out.println("not good");
	    		 break;
	    	 case 4:
	    		 System.out.println("not bad");
	    	 case 5:
	    		 System.out.println("perfect");
	    		 break; 
	    	 
	    	 }
	    	 
	    	 
////////////////////CLASS AND OBJECT:
	 		
/*
PRIMITIVE DATA TYPES ARE BUILT INTO THE LANGUAGE
PRIMITIVE DATA TYPES are foundation for all other types
FOUR CATEGORIES OF PRIMITIVE TYPES:

-integer >> store non-fractional numbers
.byte  --1 
.short --2
.int  ---4
.long ---8

- floating Point >> store fractional numbers
.float __4
.double__8

- char >> store single char value, single quotes

-boolean >> true or false only

///Java is Object Oriented Language
* 
--Instead of writing long procedural code in one file, we split apart a large program into 
self contained object.

--Each object represent different application and 
--Each object contains its own data and its own logic and they communicate between themselves

/////  WAHT IS AN OBJECT?  
* In real life....:
* An object is an apple, horse, tree, book, tshirt etc.
* Each object has its own attribute, their own behaviour and their own different identity by its name.

* Each object is different from one another, they have their own attribute like color and size, red apple green apple.	     
* Also each object has behaviour ; horse can run, plane can fly	
That behaviour is specific to the type of that object. Apple doesn't run, book cant fly.  
But these 3 things identity, attribute and behaviour are the same 3 things that describe an object in an Object Oriented language

///////  WHAT IS AN OBJECT IN PROJRAMMING?
* 
* 	OBJECTS IN COMPUTER PROGRAMMING ARE SELF-CONTAINED SO THEY HAVE IDENTITY SEPERATE FORM OTHER OBJECTS, THEY ALSO HAVE THEIR OWN ATTRIBUTE 
* IN THEIR OWN STATE, AND THEY HAVE THEIR OWN BEHAVIOUR THAT THEY CAN DO.
* 
* In real world, we say object to the things we can touch, as concrete, but in programming, we take it further.
* We have objects that represent real life objects such as car, house, apple ...but we also have bank account, date, time,  that we cannot touch or hold in real life. 
* 

Ex: 4 different person objects:
person objects:   4 object behaviors ayni, name age gender farkli
name: Adem
age:25
gender:male
behaviour: run()
       walk()
       eat()
       sleep()
       
//////WHERE DID OBJECT COME FROM?	

*Object is created from CLASS.
*
///////WHAT IS CLASS?  ----->> BLUEPRINT, A DETAILED DESCRIPTION, DEFINITION 
*
*	Blueprint create etmeden u create a blueprint of the house, a good description of it, but it isn't a house yet.
*You use a blueprint to create a house, first blueprint, then house.

*For programming:
*
*write the class, then use a class to create an object.
*You can create many houses with one blueprint, likewise, you can define class once and create thousands of objects based on that class.
*But class comes first, you should always write the class first.
*  Ex: blueprint phone(class), many phones out of one blueprint (objects)        
*  Ex: cookie cutter(the class), many different cookies (the objects)
*  Ex: Dog (class)..same attributes, 4 different dogs(Objects)
*  Ex: Student has all identity, and attributes, behaviours (methods()), 
*  
*  Student icin: 
*  
*  attributes:               behaviours(methods)
*  String firstName;         void apply(){}
*  String lastname;          void doHomework(){}
*  String email:
*  int bacthNum;
*  int age;
*  
*  SO CLASS IS A BLUEPRINT, ACTUAL OBJECTS ARE CREATED FROM CLASS, LIKE CUOOKIE CUTTER(CLASS) AND MANY DIFFERNT COOKIES(OBJECTS)
*  
*  
*  
*/


//////////////////////////////    STRING CLASS

/* WHAT'S DIFFERENCE BETWEEN PRIMITIVE TYPES, AND OBJECT TYPES?
* 
*         PRIMITIVE types                           OBJECT types
DATA             Holds single data               Can hold multiple piece of data, and can contain behavoir which is called method 
		                              (Student has fname, lname, and can talk walk etc..

creation  *can be created directly just by         created using class with new keyword,creation of object is called instantiation
of value 	  *declaring and assigning value


creation  int num =10;                              Student b = new Student();
example  long num3=4524567L;                        String s1 = "My string";                                                   
                                        String s1 =new String ("myString");
*/                                    // String firstName = new String ("apple");

                               //className  ObjectName        value


//CLASS OBJECTS ARE CREATED FROM STRING CLASS.

// String firstName = "Barak" ;
// Class    	String object   value
// object types are stored in phisical memory	

/*
STRING METHODS

Advantages of String Class: many built in methods for String Manipulation

str.length();       get lengths of string
str.toLowerCase();    convert to lower case
str.toUpperCase();   convert to upper case
str.charAt(i);      what is at chararacter i?
str.contains(..)	String contains another string
str.startsWith(..)   String starts with some prefix
str.indexOf(..)      what position of a character?

String Methods more

"Belize".length(); //6
word.length:   //6

String country = new String(); //declared a String variable called country with an empty value
country = "Belize"; //assigned country 
country.toUpperCase();  //BELIZE

country. toLowerCase();   //belize

country.startsWith("B");   // true
country.endsWith("e");     //true

contains(String s)
country.contains("is");     //true

**Size / Lenghth = how many character?  "Java"----->> 4
** Index starts with 0!!!  tam indeksi verir
*

*/	
///////////////               STRING IS IMMUTABLE
	  
/*	    	 
** String objects are immutable, Once Created you can not change it!
** Each time you use operation that looks like changing but it is actually creating a new String object. 	    
	 
	__  String name = "Java";   // name ---> Java object
	  
	__  name.toUpperCAse();    // created a new object JAVA , another object, as there is no reference that points to it, **it will be garbage collected automatically by Java 
	    	 
	__  String name2 = name.toLowerCase();  //created new object called name2, pointing to java object 	 

    __  name = name.toUpperCase( ); new object JAVA created, ilk Java object artik reference olmadigi icin garbage collected

*/	 
	    	
}}
