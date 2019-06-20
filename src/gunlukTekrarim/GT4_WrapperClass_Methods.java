package gunlukTekrarim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import day24.Arrays;

public class GT4_WrapperClass_Methods {

	public static void main(String[] args) {
	
/*
                           Wrapper Class
                           
     
		primitive wrapper class is the classes that is provided in JDK
		  for creating an Object that needs to represent primitive types.
		
        -- yani we use wrapper class to create an object that represents primitive types.

   classes         vs     Primitives
Classes: // blueprint..cookie cutter
- objects can be created from classes
- class can have field and method to represent property and behaviour of object
- need bigger memory space


Primitives:
- No object can be created
- No fields or methods
- light-weight, require less space

** Each primitive types have one corresponding Wrapper Class to create an object

** Primitive wrapper classes are used to create an Object that needs to 
   represent primitive types in Collection class.


Primitive Types      Wrapper Class (primitive Wrapper class object)


boolean              Boolean       

char                 Character

byte                 Byte

short                Short

int                  Integer

long                 Long

float                Float

double               Double


**  Just like creating any other object, we use a new keyword for creating wrapper class object

    Example of creating wrapper class object:
    
    int i = 5;                     //   bu primitive type, bu value sadece
    Integer ii = new Integer(5);    // bu ii reference, object from class
                                   // u store 5 indie an object, not a primitive variable
                                  // ve burdaki Integer a wrapper class deniyor, tum capitalla baslayan siniflar wrapper class
    
    Integer ii = new Integer(i); Boxing - Wrapping ayni sey
    
    int j = ii.intValue();  // unboxing-unwrapping
    
    Integer value
    
    
    
    
    Boolean b = new Boolean (true);       ya direk new ile
    Boolean b = new Boolean ("false");    ya da new ile String kullanarak
           
            bu b , bt1 ler falan primitive variable degil reference, cunku sol taraftakiler class 

    Character c = new Character ('c');
    
    Byte bt1 = new Byte (byte) 123);
    Byte bt2 = new Byte ("123");
    
    Short s1 = new Short ((short) 1200);
    Short s2 = new Short ("1200");
     
    Integer i1 = new Integer (1202);
    Integer i2 = new Integer ("1202");
    
    Long l1 = new Long (200000);
    Long l2 = new Long ("200000");
    
    
    Float f1 = new Float (12.2f);
    Float f2 + new Float ("12.2");
    
    Double d1 = new Double (3.1432334463);
    Double d2 = new Double ("3.143233463");



** --> Sometimes we need to convert between primitive type and reference type. 
       This is called boxing!
       You are boxing a primitive value into a reference type.
        Boxing:
        Primitive type --->>> Wrapper Reference type
        
                   int ---->>> Integer 
         Ex:
          you change in to Integer  -->boxing  

  Ya da tam tersi:
     
 ----> You need to get primitive type out of the reference type. Bu da unboxing
     Unboxing:
     
     Wrapper Reference Type --->> Primitive Type
                     
                     Integer --> int




---------->>>


If you create a reference variable Integer i1 , and directly assign to primitive type, 12, 
it will box up the primitive type and change it to the wrapper type. 
This is called auto-boxing.

Auto-boxing: 

Integer i1 = 12;



If you create a wrapper object and assign to primitive type, it will just auto-unbox the value
to make it correspond to primitive type.

Auto-unboxing:

int i1 = new Integer ("12");



Auto boxing and auto-unboxing examples:

Integer i1 = new Integer (12);      //wrapping
Integer i2 =12; // int 12 is auto boxed to Integer i2.
int i3 = i1 = Integer i1 is auto-unboxed to int 12.



Double d1 = 3.14;  // double 3.14 is auto=boxed to d1.
double d2 = new Double (12.5);  // Double 12.5 is auto-unboxed to double.
double d3 = d1; // d1 with reference type Double auto-unboxed to double. 



---------------->>>>>>>>

   Converting from String Object
   
   
   
   
   Converting String to Primitive          we use   X.parseX(str)
   
   
   Converting String to wrapper class   or          X.valueOf(str)

                                                    X here is corresponding wrapper type



        Converting from String Object
        
       X.parseX(str)
       
Coverting String to Primitive


Boolean.parseBoolean("true");

Character- NONE

Byte.parseByte("1"):

Short.parseShort("1");

Integer.parseInteger("1");

Long.parseLong("1");

Float.parseFloat("1");

Double.parseDouble("1");


         Converting String to Wrapper Class
         
         X.valueOf(str)
         
Boolean.valueOf("FALSE");

Character = None

Byte.valueOf("1");

Short.valueOf("1");

Integer.valuOf("1");

Long.valueOf("1");

Float.valueOf("1");

Double.valueOf("1");




 //   String leri primitive e cevirme, .parse ile:
    	  
     System.out.println(Boolean.parseBoolean("true")); // true verdi
     System.out.println(Integer.parseInt("1"));        // 1 verdi
     System.out.println(Long.parseLong("1"));         //1
     System.out.println(Float.parseFloat("1"));        //1.0 verdi
     System.out.println(Double.parseDouble("1"));      // 1.0 
	 System.out.println(Byte.parseByte("1"));     // 1
	 System.out.println(Short.parseShort("1"));   //1
	 // chararcter de yok
	
	
	 //    Stringleri   wrapper class object e cevirme  .valueOf() ile:
	 
	 System.out.println(Boolean.valueOf("False"));  // false
	 // char // none
	 
	 System.out.println(Byte.valueOf("1")); //1
	 // ve digerleri hep valueOf lu..
	

     /*
 * From string to primitives
 * parseX method will take String
 * and return -->primitive value  primitive boolean yani
 */
/*
		
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
/*
String d = "3.14";
Double d1 = Double.valueOf(d);
System.out.println(d1.toString());
double d2 = d1 ;//--> auto Un boxing

// valueOf ile da String i wrap edersin, boxing, (primitive leri de valuOf la object yaparsin zaten.)

// invalid conversion*****
	
	// System.out.println(Double.parseDouble("3.14abc")); olmadi bu
	
System.out.println(Integer.valueOf("3"));  // 3 verdi, integer old 3 yazdik 3.14 yerine


              Benefit of Primitive Wrapper Classes:

-Use primitive type as object
-Value can be set to null, which is not the case for primitives
   Integer i = null;
   
- It has fields and methods like other classes
    Long.MIN_VALUE; Integer.compare(x,y);
    
    doubleVar.isNaN(); Character.isDigit(ch); and more....




         
         
              Comparing Wrapper Class Object
          
         
***  Like any other object, in order for two wrapper class reference variable to be equal, 
     they need to point to exact same object in memory.

      Stack   Heap   
      r1 ==> object

      r2 ==> same object i gostermeli ki equal olsn

**   Like String class , .equals method will check the value is equal or not instead of reference 
*    to same object.
*    
*    
*    i1.equals(i2)  // true or false
*    
*    -------->>>>   .equals() sadece value check eder:
*    
*    Integer i1 = new Integer(150);       i1.equals(i2);   // true
*    Integer i2 = new Integer(150); 
*    
*    Integer i1 = 150;                    i1.equals(i2);   // true
*    Integer i2 = 150;
*    
*    Integer i1 = new Integer (150);      i1.equals(i2);   // true
*    Integer i2 = i1;                  
    
*    
*     
*    
*   
*    ------->>>>  ama == tam equality, tam esitlik icin 
     Like any other object, in order fro two wrapper class reference variables to be equal using == double equal operator, 
     they need to point to exact same object in memory:


     Integer i1 = 128;                    i1==i2  // false  // bu niye false oldu
                                                    asagida anlatiyorum..
     Integer i2 = 128;

     
     Integer i1 = 127;
     Integer i2 = 127;                    i1==i2   //true
     
     
     Integer i1 = new Integer (127);      i1==i2   / false 
     Integer i2 = 127;                    false because rule apply when we use literal 127. 
                                          when using new keyword, it will create a new object no matter what, and it's not the same one as 127.




 These auto-boxing conversion will always return same instance of wrapper class.
 Primitive                    Value range
 
 int                            -128 to 127
 
 short                          -128 to 127
 
 byte                           -128 to 127

 char                         corresponding ascii value 0-256
 
 boolean                      true, flase
 
  



Mesela asagida; we created 8 REEFERENCE VARIABLE in here, but we created only 4 object , 
they will all be i1==i2   true, 1 Byte, 1 Short, 1 Character, 1 Boolean, because they fall into the same range as stated in above chart.

Byte b1 = 127;               i1==i2; hepsinde true burda
Byte b2 = 127;

Short s1 = 127;
Short s2 = 127;

Character c1 = 'c';
Character c2 = 'c';

Boolean b1 = true;
Boolean b2 = true;


AUTO BOXING CONVERSION RETURN SAME INSTANCE OF WRAPPER CLASS AS PREVIOUS TABLE CONDITION MET SO THEY ARE ALL EQUAL.

** IF WE CREATE AN OBJECT USING A LITERAL VALUE, IT WILL AUTOBOX TO THE REFERENCE TYPE, 
*IF THEY ARE IN THE RANGE, RTHEN IT WILL CREATE ONLY ONE OBJECT AS THE VALUE IS THE SAME.






/// Akbar's day 36 notes;
 
 creating wrapper class (bunlar ayni zamanda constructor overloading):
 
            Boolean b =  new Boolean(true) ; 
		    Boolean b1 = new Boolean("false"); 
		    Boolean b2 = Boolean.valueOf(true); 
		    Boolean b3 = Boolean.valueOf("true"); 
 
                          bunlarin hepsi ways to create Boolean object instead of bollean value.
                                  

Boolean.valueOf("true");
className.methodName yani valueOf method ,//biraz sacmaladi burda.. Boolean class...static method, cnku its static, and happen to take object out of it



dipnot yani direk: 
Boolean b = new Boolean (true)  veya ("true") seklinde yaparsin
Boolean b1 = Boolean.valueOf(true)  veya yine ("true") seklindeyaparsin

Integer i = new Integer (123);
Integer ii = new Integer("123");

Integer i3 = Integer.valueOf(123);      burda same name different paramenters valueOf da //overloading yani
Integer i4=  Integer.valueOf("123");    static method valueOf
                      bu bir oject, can take action

burda new Integer da Integer.valueOf() da creating new object

Sout(i1.equals(123)); // true   .equals sdece content check etti, true
                                 u are taking action Integer object old icin.


MeselA:

int i = 10;    bunlar primitive mesela, they don't take action
j.equals(10);


Ama iste wrapper class methodlariyla you create new object and take action, int i Integer object yapiyorsun


Character c1 = new Characyer ('c');
Character c2 = Character.valueOf('c');

Sout(c1);              // c
Sout(c2.toString()):  // c



Whatever is not primitive, it's a wrapper reference type.

Boxing:
Integer  >> to int  (ama yani int i integer a ceviriyorsun)

Unboxing:
int >> Integer   (ama yani Integer to int olmus oluyor)



Ama bu islem otomatik olarak oluyor:

Instead of using 4 different way to create new object , if you just say

Integer i1=12;   12 bir primitive, u take 12 and wrap it, autobox it into a reference type called Integer.
                  yani 12 object type a , reference type a store edildi. i1 a Integer reference variable a.
                 
ve Instead of storing 
              
              int i1 = new Integer ("12"); you are saying that I have an object of primitive type
                                                       
  
   
           ** object can not be stored in primitive type 
           *
           *o yuzden it will just unbox it and turn it into a primitive type. 



ve sonra :

               int i1 = new Integer ("12");
               Integer i2= i1;




Automatic conversion between primitives and wrapper class ta bioyle oluyor yani yukarda


























///////////////////////////////
 
                    Method Overloading
                    
                    
                    
                    
     In a class, we can define multiple version of constructor and methods wth different method signatures.
                
             Method Signature:
        
                    . Name
                    
                    . Number of parameters
                     
                    . Type of each parameters
                    
                  XX return type is not part of method signature
                  
                    
                    
      So constructor overloading:
      
                    Name is fixed, as a class name.
                    
                    Different number of parameters
                            Or
                    Different type of each parameters.
                    
                      will overload a constructor
                

     Constructor Overloading example:

public class Student {     *8we have Student class here, and 3 different overloaded version of the constructor.
String ame;
String school;
int age; 
                                                When we try to create object with different parameters:
public Student (){ // takes no argument         Student s1 = new Student (); 
}

public Student (String name, int age){   two argument   //Student s2= new Student ("bob", 28);

}

public Student (String name, int age, String school){  three argument //Student s3 = new Student("bob", 29,"Cybertek");

}



        
        
        
        Method Overloading is pretty much same way:
        
        Same method name
        
        Different number of parameters
        Or
        Different Type of Each Parameters
        
        XX we can not have a method or constructor with same name and same parameter list in the same class
        

 ------>>>>  Method overloading example
 
     System.out.println();bu method pek cok farkli argument alanilir 10 tane falan cikar hoveroverda
                          this is an example of overlaoding method
                          it has same name, but different number of parameters, different type of paramenetrs, different order of parameters/argumenst
                          the advantage is we don't have to create many methods like print boolean, priunt char, etc...
                          we can just use the same method name to pass different parameters/arguments
 
  
  
  
  
  
  ------>>>>> Creating and calling overloaded method:
  
  method overloading example:
  
  public class Student{
  
  String name;
  String school;
  int age;
                                                       When we create object:
                                                       Student s1 = new Student();
                                                       
  
  public void study() {    // firts method        --->      s1.study();
  }
  
  public void study (String topic){   // overloaded method  ---> s2.study("java");
  }
  
  public void study (String topic, int hour, String school){  //overloading again ---> s3.study("java", 4, "Cybertek");
  }
  



------------------> Static Method Overloading Example:

class DataArtist{

public static void draw (String s){
}

public static String draw (int i){  we overloaded with int parameter
}
public static Float draw (double f ){  //draw method that take one double
}
public static int draw (int i, double f){  // draw method that take 2 parameters
}



----------------->> Auto boxing and Auto Unboxing in overloading
 
 
 While calling methods, type conversion between wrapper class and primitives will happen automatically whenever needed.


Autoboxing and auto unboxing in overloading:


public class Student {
String name;
String school;
int age;

public void study (Integer hour){ study method that takes one integer

}

public void study (boolean is Effective){  and we overloaded study method that takes one boolean
}

}  

Student s1 = new Student();

So when we try to call the method, I have two methods here s1.study(5); this is int, but my method calss Integer,


             

so it will automatically aoutobox int to Integer like new Integer("5")


          5--> new Integer ("5");


 and second call method:  and s1.study (new Boolean("true"));  
        method takes primitive boolean, but I call/pass a wrapper reference type Boolean true so, 
          
    again, it will just automatically auto unbox the primitove type to wrapper 


       newBoolean("true")  --> true




///// another example






















































 ////////////////////////            Array List




       Array  :
      -  is represented by square brackets [] on declaration
      -  can hold multiple value of same time: Primitives or reference types
      -  array is fixed size, can not add more items or take out items.
      -  Array object can not be printed out directly to display all the lements
      -  Array is ordered and can be accessed by index   (*** order, ascii order demek, sort index sirasi demek, farkli seyler)
      -  Array allows duplicate
      

        
        
 ---->      Collection Framework
 
      It is a unified architecture for representing and manipulating collection.
      It helps to build high level functionality.
      
      Collection Framework Shipped with JDK
      It provide many built in feature to work with data
      Provide different type of data structure like :
          List: order collection
          
          Set: collection of unique element
          
          Map: 
          
          Queue:




---->         ArrayList Class
  
  
       - Built into language, can be used after importing 1 of the below:
       
       - ArrayList stores ONLY OBJECTS. It doesn't store primitives, but u use wrapper class reference types.
       
       
       import java.util.ArrayList;
       import jav.util.*;
       
       
       
       - Unlike Array, its resizable.
       - Can only hold objects, can not store primitives.
       - ordered collection and allow duplicat
       - Storing any type is possible but recommended to store only 1 type.


------->> Creating ArrayList Object

 // prior to java 5
  ArrayList list1 = new Array();


// prior to java 7
  ArrayList<Type> list1 = new ArrayList<> ();
  
  
  
  
// java 7 and later
   ArrayList<Type> list1=new ArrayList<>();

ve bu da mumkun:

//Using list as reference Type:
  List<Type> list1 = new ArrayList<>();






..... Creating ArrayList Object Before Java 5 :
 
 // creating with no arg constructor
    ArrayList list1 = new ArrayList();
  

//  creating with modifiable predefined size
    ArrayList list2 = new ArrayList(10);
    
//  creating with another ArrayList
    ArrayList list3 = new ArrayList(list2);



.....Creating ArrayList Object After Java 5:

//   creating with no arg constructor
     ArrayList<String> list1 = new ArrayList<String>();
     
//   creating with modifiable predefined size
     ArrayList<Integer> list2 = new ArrayList<> (10);          // After java 7
 
//   craeting with another ArrayList
     ArrayList<Integer> list3 = new ArrayList<> (List2);
 
     
     ----->>>   ArrayList:
     Can store only objects 
     Can be resized
     Can be printed directly to display elements
     
     
     ----->>>  Array
     Can store primitives and objects
     Has defined size and cannot be changed
     Can not be printed directly to display elements ..Need Arrays.toString() method
      


    ---------->>>>>>    Common ArrayList Methods
    
    
    add (Type element) -- adds the element to the end of the list
    
    get(int index)  -- returns the elemet at the specified position
    
    contains (Object element) --- Returns true if element is in this list; otherwise returns false
    
    indexOf(Object element) --- first occurance of the element in the lsit
    
    clear() -- removes all elements in the list
    
    size() -- returns the number of elements in the list
    
    remove (int index) -- removes the element at the sepcified index in the list

    isEmpty() -- returns true if this list empty, yoksa false olur
    
    set(int index, Object element)-- overwrite the value at the given index
   
    
    
    
    ------------->>>>>>>   ArrayList Demo
    
    
    // creating an ArrayList object
     ArrayList<String> lst -= new ArrayList<>();
          List<String> lst1 = new ArrayList<>();       //2. yol
     
     
   //adding elements
     lst.add("Apple"); lst.add("orange");    lst.add("banana");
     System.out.println(lst); ... u can directly print the list of objects [apple, orgage, banana]
     for loop da kullanabilirsin
    
    //getting elements
     System.out.println("first element" +     lst.get(0)); // first element apple
     System.out.println ("second element: " + lst.get(1));  // second element orange
     for loop da kullanabilirsin
   
   
    //check if items exist in the list,     lst.contains(item)
      System.out.println(lst.contains("Apple");  // case senstive.. true
      System.out.println(lst.contains("Pears"); // false
      
        
      
    // getting the index of item by value .. specifically checks the index of the certain item
       System.out.println(lst.indexOf("Apple")); //0
       System.out.println(lst.indexOf("orange")); // 1
    
    
    // checking how many item in the list        lst.size();how many items, 4 mesela
       System.out.println("item count" + lst.size());
       System.out.println(lst.size());
       
     
    // checking if the list is empty             lst.isEmpty();
       System.out.println("list is empty?" + lst.isEmpty());  // false
       
       
       
    // setting the value for certain index        lst.set(2, 400); 3. indexi 400 yapar
       if u want to change item in certain index: (updates, overwrites the value)
       lst.set(0, "pear")  // apple yerine pear yazilacak
       lst.set(index of the item u want to change, and new itme u want to put instead)
    
    
    // remove item by index
       lst.remove(0);
       System.out.println("new list items after deleting" + lst); // pear 1. idi, pear  silindi, 0. indexte
    
    
    // remove item by value
        lst.remove("banana");
        System.out.println("new list after deleting item by value"+lst): // banana da silindi
    
       //     eger item wrapper clss tan ise (ex. Integer) object olsaydi.. o zaman soyle remove ederdik:
       
        lst.remove (new Integer(300));      300 remove olur
        lst.remove (Integer.valueOf(300));  300 remove olur listeden
     
    
     // removing all items in the list
       lst.clear();
       System.out.println("new list after removing all items by lst.clear()" + lst); // hepsi silindi
   
   
   
      // check if the list is empty or not
         System.out.println("list is empty" + lst.isEmpty()); // list is empty true



//Akbar day 36 ArrayList intro:
/*
 * // do not name your class as ArrayList to prevent colliding with JDK
		// u need to import java.ytil.ArrayList;
	
		
		
		
  //order duyunca bil ki index 
   //collction type olarak en iyisi array list
		
  //Unlike array, it is resizeable
		
  //	can only hold objects, can not store primitives..args bu yuzden primitive wrapper class a ihtiyacimiz var
	
		 
		int i = 10;                                     // 10   bir containerda, i container
		Scanner sxan = new Scanner (System.in);         // scan container, pointer, address
		Double d = new Double ("2.14");                // Double d .args.object yani, 2.14 e point ediyor
		float f = 1.4f;
	
		// an ArrayList variable lst1 is created 
		// and ArrayList object (new Arraylist olan yani) is created and assigned to lst1
		//it did not specify what we can store in this ArrayList
		ArrayList lst1 = new ArrayList(); // this is suggesting us to store a specific type when u creating an array list
		              
		          //lst1 ne?   lst1 is a variable, its a container
		          // ArraylList de type oluyor, just like String, uppercase le basliyorsa, class
		          // new ArrayList de yeni object with multiple slots, you can add whatever u want, diomond la specify edilmedigi icin
		
		lst1.add("abc");        // lst1 bir container, I wanna add ....
		lst1.add("efg");        // string ekledik
		lst1.add(new Integer(10));   // integer object ekledik
		lst1.add( Character.valueOf('A'));  // yani character object ekledik
		                                  //** bunlari cesitli type ekleyebiliriz AMA
		                                //***
		                                // Ama one type / same type add etme recommended always
		                                // while u get it will be chaos, o yuzden same type store suggested
		                               // ve store only one type da soyle olur:
		                              //ArrayList<String> lst = new ArrayLisy<>();
		
		System.out.println(lst1);     // ArrayList te direk print olur, hashcode vermez
		                            // [abc, efg, 10, A] verdi
		
/////////////////	 ArrayList with type:
		
		ArrayList<String> lst2 = new ArrayList<>();   // diamond oprator  a specific type yazinca , it means I'm gonna sotore only string
	
		  // NO PRIMITIVE TYPES ALLOWED AS TYPE to store in ArrayList
		    // ArrayList<int> numList ; THIS IS BAD 
		    
		    // arraylist that store only Integer !!
		    ArrayList<Integer> numList = new ArrayList<>(); // Integer yani only whole number store edecek demek
		    //numList.add("ABC");                          // we don't care about capacity, only care about type
		    
		    Integer i = 100 ; // autoboxing to Integer Object 
		    
		    // ADDING ITEM 
		    // WE call add method from Arraylist class 
		        
		    numList.add(i); 
		    numList.add(200) ; 
		    numList.add(300) ; 
		     
                      //      GETTING SINGLE ITEM FROM ARRAYLIST 
		    
		    System.out.println( numList  );  // 100 cikti, sonra 200 ekletince , autobox yapip, 200 de print etti
		                                     // [100,200,300] cikti
		  
		  *** we call get(index) of ArrayList:
		  *Integer i1 =numList.get(0);
		  *int i2= numList.get(1);     // autounboxing happen here
		  *
		  *Sout(i1); //100
		  *Sout(i2)l // 200
		  *Sout(numList.get(2)); // 300   .....
		  *
		  *
		  *  And we can directly print to see what is inside:
		  *
		  *Sout(numList); //  [100.200,300]
		
		
		
		
		
		
		
		// CREATE ARRAYLIST OF DOUBLE 
	    // CALL IT priceList 
	    // Add 5 prices  
	    // try to get 3rd items 
	    // iterate over arraylist using both loops 
	    // and print out 
	    
	    // in another loop 
	    // only print out price more than 10 ; 
		
	 
	 ArrayList<Double> pricelist = new ArrayList<> ();
	 pricelist.add(1.1);
	 pricelist.add(2.1);
	 pricelist.add(3.1);
	 pricelist.add(4.1);
	 pricelist.add(5.1);
	 
	 System.out.println("third item: " + pricelist.get(2));
	 
	 for (int i = 0; i< pricelist.size(); i++) {
		 if (pricelist.get(i)>10.0) {
			 System.out.println(pricelist.get(i));
		 }
		 
		// System.out.println(pricelist.get(i));
	 }
	 System.out.println();
	 for(Double each: pricelist){
		 
		 
		 System.out.println(each);
		
		
		
		// in another loop
    //                     GET THE SUM OF ALL PRICES ;
    
    //   Sum bulmak icin double sum = 0; gerekir hep, container
    System.out.println("PRINT SUM ");
    
    
    // arithmatic operation only happens for primitives 
    // if you try to add wrapper objects it will be unboxed   !!autounboxed
     *  
     *   wrapper object lerde matematiksel islem yapamazsim, toplama gibi cikarma gibi,
     *   o yuzden kucuk double, int falan yazarsin, onlar da aoutounboxed olmuslardir zaten
     
   
    
    double sum = 0 ; 
    for (double each : priceList) {
      sum += each ; 
    }
    System.out.println(   sum);
        
    
		////////////   more array list methods, get, set, clear...
		
		// add just adds by index or value,
		// set just changes value/updating what is already in there 

		ArrayList<Integer> numlst = new ArrayList<>(); 
		
	    
	    numlst.add(100); 
	    numlst.add(200); 
	    numlst.add(300); 
	    numlst.add(400); 
	    
	    System.out.println( numlst );
	    
	    // if you try to access index does not exist 
	    // indexoutofbound exception
	    // System.out.println( numlst.get(7) );    // yani 7 yoksa index out of bound exception veriri
	                                               // sadece 5 item var
	    // inserting items at certain location 
	    
	    // insert 500 as second item 
	    
	    // when inseting a value , the index shift to the next location 
	    // add (index , value) 
	    numlst.add(1, 500) ;    /// 2. item a 500 ekle, once index i yaz sonra ekleyecegin value yu
	    System.out.println( numlst );
	    
	    // it should be within range or exception occur
	    //numlst.add(10, 500) ; 
	    
	    
	    // Updating a value inside ArrayList item 
	    // set(index, newValue)                    // degerini degistirmek icin nem.set(2 ye, 200 yaz gibi))
	    numlst.set(2, 1000) ; 
	    System.out.println(numlst);
	    
	  
	    
	    // deleting everything from the list 
	    
	    numlst.clear();
	    System.out.println(numlst);
	    
	    // checking wheter an itme exists:    list.contains(item);
	     
	      
	     Sout  (numlist.contains(1000) ) ;  false
	     Sout  (numlist.contains(300)  ) ; true
	     
	     
	     
	     ////  isEmpty();      list.IsEmptyOrNot();
	      
	      boolean isEmptyOrNot = numlist.isEmtyOrNot();
	      Sout   (isEMptyOrNot) ;                        false
	     
	     
	     
	     
	     /// counting items:  list.size();
	    Sout  ("size of the list is " + list.size()  );
	    
		
		
		
		
		  // removing items from arrayList 
	    // remove(ItemValue)
	    // remove(index)
	    // THIS WILL WAIT 
	    
	    ** remove 2 sekilde olur:
	    *
	    1. direk index ile... list.remove(2); 3. item remove olur
	    
	    2. value ile: 
	         
	         -  object seklini yazarak:
	           
	            list.remove( new Integer(100) );     // 100 remove olur
	         
	          
	          
	         - valueOf methodu ile , value ile yani 
	         
	            list.remove(Integer.valueOf(100) );     100 remove olur
	    
		
		
		/////                    ve remove method:  !!
		 * 
		 * 
		  ArrayList<Integer> lst = new ArrayList<>(); 
	    lst.add(1); 
	    lst.add(2); 
	    lst.add(3); 
	    lst.add(4); 
	    
	    lst.remove(2); // bu index 2 yi remove eder
	             //diger sekli: remove etmenin valuo olarak, yani object olarak:
	    //1. lst.remove( new Integer(2));
	    //2. lst.remove( Integer.valueOf(2));
	    
	    System.out.println(lst);
	    

		 
		 
		 
	//////                Arrays.asList(3,4,5,);   methodu:
	 
	 
	 
	 //bu asList methodu, arrayden geliyor, var arg alir, ve integer veya string verir
	   
	    // do not ever name ur class, scanner, system, ArrayList  
	     
	    
	     
	     
		// Arrays.asList(var arg) can be used to 
	    // add items while object is being created 
	    
	    // However , 
	    // 1 , The variable type MUST BE A LIST 
	    // because the method return List not ArrayList 
	    // 2 , It will generate an unmodifiable list 
	      // can not add or remove item 
		
		// add or remove operation is forbidden 
	    // update will work by using set 
	    List<Integer> lst = Arrays.asList(3,5,6,7,5,4,3);   
	    //lst.add(100) ;   // does not work 
	    //lst.remove(0);   // does not work 
	    //lst.set(0, 100); // works 
	    System.out.println(  lst );
	    
	    // Since we can not add or remove item from above list 
	    // we want to copy everything from the list 
	    // into the new list that we can modify 
	    
	    ArrayList<Integer> myCoolList = new ArrayList<>( lst ); 
	    myCoolList.add(100); 
	    myCoolList.remove( Integer.valueOf(3) ); 
	    System.out.println(myCoolList);
	    
	    
	    
	    
//	    List<String> JLA = Arrays.asList("Superman","Batman","Wonder Woman"); 
//	    System.out.println(  JLA );
	    
	    
	   
	    //Arrays.asList(var arg) can be used to add items while object is 
	    //being created
	    
	    //However, the variable type must be a LIST!
	    //because the method return list, not ArrayList
	    ArrayList<String> JLA=
	     new ArrayList<>( Arrays.asList("Superman","Batman","Wonder Woman") ); 
	        
	    JLA.add("Flash"); 
	    JLA.add("Thanos") ; 
	    JLA.remove("Thanos") ; 
	    System.out.println(JLA);
	    
	    

	 
		 
	/// more examples ;
	 
	 	ArrayList <String> myList = new ArrayList<>();
		List<String> lst2 = new ArrayList<>();   // List package ini import edince calisir
		// yada herseyi import.java.util .*; ile halledersin
		
		
		
		
		myList.add("Zuccini");
        myList.add("cucumber");
        myList.add("cabbage");
        myList.add("watermelon");
        myList.add("BlueBerry");
        myList.add("Apple");
        myList.add("Bananas");
        myList.add("Milk");
        System.out.println(myList);
		
		
	// update an item
        myList.set(0, "Tomato");
        System.out.println(myList);
        
    
        
    //insert an item
        myList.add(1,"raspberry");
        System.out.println(myList);
       
        
    //  check an item exists in the list 
        boolean haveMilkOrNot = myList.contains("milk");
        //myList.contains("milk");
        System.out.println("got milk?"+ haveMilkOrNot);
     // case matters, for loop la tekk tek alabiirsin, bulursin
        
        
    //check the location of certain items
        int indexOfCabbage = myList.indexOf(" ");
        System.out.println("index of cabbage is; "+indexOfCabbage);
        
   
        
     //  remove item;
         // when using remove (object) version of the method
          // if we don't have the item, it will remain the same
         // ama index yoksa, it will throw exception, olmayan indexi yazarsan
        //1. index ile
        myList.remove(4);
        System.out.println(myList); //watermelon removed
        
        //2. String object ile
        myList.remove("blueberry");
        System.out.println(myList);  //blueberry gone
        
        //3. try to remove an item you don't have:
        myList.remove("kiwi");
        System.out.println(myList);   // object type yazip o object yoksa, nothing happens, olmayan biseyi remove edemez
        
        //4. 
        
        
    // remove everytrhin, clearing everything from the list;
        //delete all from the list
        
       myList.clear();
       System.out.println(myList);
       
       
     // Checking the list is  empty or not :
       
       System.out.println(myList.isEmpty());
       
       for (int i = 0; i<myList.size();i++) {
    	   System.out.println(myList.get(i)+ " - " );     //  ***************************
       }
       
       for( String eachitem : myList) {
    	   System.out.println("Item : "+ eachitem);
       }
        
        
	}
		                                             
	  
	  
	   ///////////////          addAll (2, list2); methodu:
	    *                       ve
	    *                       list.toString(); methodu:    / ayni listeyi print eder
	    * 
	    
	   * 
	   * ArrayList<String> lst1 = new ArrayList<> ();
		lst1.add("Superman");
		lst1.add("BAtman");
		lst1.add("Aquaman");
		
		ArrayList<String> lst2 = new ArrayList<> ();
		lst2.add("Wonder Woman");
		lst2.add("Cyberg");
		lst2.add("Flash");
		
		lst1.addAll(lst2);       //1. listeye tum 2. liste eklendi
		System.out.println(lst2);
		
		lst1.addAll(2, lst2);
		System.out.println("Justice league: "+ lst1);
		
		
		
		
		//creating arrayList with all the items from another list:
		
		ArrayList<String> lst3 = new ArrayList<> (lst1);
		
		System.out.println(lst3);
		
		
		//How to get String representation out of arrayList objetc?
		String lst3AsString = lst1.toString();
		System.out.println((lst3AsString));
		
		// whenever u print out a reference variable that point to an object; 
		//it will automatically call toString() method implicitly
		
		System.out.println(lst1);              // ayni seyi print ederler, tum listeyi yani
		System.out.println(lst1.toString());   //ayni seyi print eder
		
		
		
		
		
		 ArrayList<String> lst1 = new ArrayList<>();
		    lst1.add("Superman"); 
		    lst1.add("Batman"); 
		    lst1.add("Aquaman"); 
		    
		    // How to get String representation out of arraylist object 
		    String lst3AsString =  lst1.toString(); 
		    System.out.println( lst3AsString );
		    
		    // whenever you print out a reference variable 
		    // that point to an obejct , 
		    // it will automatically call toString() method implicitly 
		    System.out.println(  lst1 );
		    System.out.println(  lst1.toString() );
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
/////////         collection utility class
 *		          yani, sort icin:
 *                 
 *                  Collections.sort(lst);
 *                  Sout(lst);
 *
 *
        // Arrays class is a class that have a lot of 
	    // static methods to perform common array operation 
	    // Arrays.sort(arrayObject)
	    
	    // Collections is a class under java.util package 
	    // to perform common collection object related operation 
	    
	    ArrayList<String> lst = new ArrayList<String>(); 
	    lst.add("Etka") ;
	    lst.add("Umut") ;
	    lst.add("Aygul") ;
	    lst.add("Izdar") ;
	    lst.add("Amir") ;
	    lst.add("Mehmet") ;
	    
	    System.out.println(lst);
	    // sorting arraylist using sort method of Collections class 
	    Collections.sort(lst);    
	    System.out.println(lst);
	    
	    // looking for the index of an item in the sorted list    
	    int amirLocation = Collections.binarySearch(lst, "Amir") ; 
	    System.out.println("index is : "+ amirLocation);
	    
	    int talmuratLocation = Collections.binarySearch(lst, "talmurat") ; 
	    System.out.println("index is : "+ talmuratLocation);
	    
	    // reversing collection 
	    Collections.reverse(lst);
	    System.out.println(lst);
	    
	    // shuffle items inside the list 
	    Collections.shuffle(lst);
	    System.out.println(lst);
	    
	    
	    
	    
	    
	    // sort method from ArrayList excect an object called Comparator we did not learn
	    // However even we don`t know this type of object
	    // we do know that any reference variable can be set to null 
	    // so we can just pass null to this method 
	    // and it will just work 
	    //lst.sort(null); 
	    
		    
		    
	
		
		    
		    
		    
		    //////     method overloading sirasi:
		     * 
		     	
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
	
	
		//  compiler will always look at the most specific one, closest one as value to match.
	
	
	
	
	
	
	
	 
		     
		    
		    
		
	}

	   *
	   
		 
		==^_^==>>> See the example methods; you can directly add them to compare.
		Don't forget these;
		
		-- import java.util.*;
		
		-- create an arrayList object ; see that I have Integer type
		-- now you can assign values
		-- finally, you can now manipulate the following methods;
		--->>> add, remove, update, valueOf, indexOf, size, get, 

		ArrayList<Integer> numList = new ArrayList<>();

				numList.add(49);
				numList.add(200);
				numList.add(300);
				numList.add(400);
				numList.add(500);

				// find certain index value
				System.out.println("index of value 500: " + numList.indexOf(500));

				// add a number at index 1; add(index, value);
				numList.add(1, 99);
				System.out.println(numList);

				// update a value
				numList.set(2, 23);
				System.out.println("Changed at index 2" + numList);

				// remove a message, 1000 will be gone
				numList.remove(1);
				System.out.println("Index 1 removed: " + numList);

				// counting items
				System.out.println("size of list: " + numList.size());

				// remove using valueOf
				numList.remove(Integer.valueOf(300));
				System.out.println("valueOf method: if 300 is removed: " + numList);

				// remove using indexOf
				numList.remove(numList.indexOf(49));
				System.out.println("indexOf methd: if 49 is removed: " + numList);

				// remove using valueOf
				numList.remove(new Integer(23));
				System.out.println("new Integer method: if 23 is removed: " + numList);
				
				//remove using get method
				numList.remove(numList.get(0));
				System.out.println("get method index 0 is removed: "+ numList);
				
				// clear all contents in the template
				numList.clear();
				System.out.println("all data cleared: " + numList);

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 ///////////                    Creating Custom Classes 
		  
		  
		  JDK offers classes but sometimes we need to create our own custom classes.
		  
		  In java everything has to be object..
		  
		  
		  java short 5 te var calss vs object
		  
		
		
		  Example of Person class:
		  
		   
		  public class Person {
		  
		  String name;                         Name
		  int age;                             Age
		  char gender;                         Gender
		  String job;                          Job
		  
		  }
		  
		  instance variable ( field)       Instance field
		  
		  Instance variable belongs to the instance of the class, which means object created out of this class
		  
		  We create an object using a new keyword and its called instantiation !!
		 
***		 Then we call the class constructor to initialize this value
		  
		  
	
		  For example Person object:
		  
		  (instance variable, instance method)
		  
		  
		  we create 4 differnet Person object form Person class.
		       or we can also say , we created  4 instance of the class.
		  
		 ikiside ayni anlamda.
		 
		 Instance is an object created out of the class.  
		 
		 (YAni objecte  instance deniyor custom class da)
		 
		 
		 Each object has their own unique identity and the state of the object are defining instance variable.
		 
		
		So changing the state of any object, or changing the value of instance variable in one object will not affect the other.
		
		So all of them(objects, instances ) re independent from each other.
		
		Person object 1:
		
		Bob
		25
		M
		SDET
		
		
		Person p1 = new Person();      3 instance daha var
		                                ve bunlar 4 instance of the class.
		
		(bunlar instance variable):
		p1.name="Bob";
		p1.age=25;
		p1.gender='M';
		p1.job = "SDET";
		
		
		
		So we created the object using new keyword, and by calling it's constructor.
		
        And we give value for all the instance variable to initialize its value.
        
		initialization boyle oluyor yani...constuctor class ta  
		
		
		
		yani bunlar, attribute of the object.
		
		bir de behaviour  lar var:
		
		(bunlar instance method.. behaviour, action): 
		
		run()
		swim()
		bike()
		
		
		public void run(){
		
		}
		
		
		public void swim(){     // sadece "swimming" yaz
		
		}
		
		public void bike(){
		
		}
		
		1.    method that take no argument and return nothing
		
		public void run(){                this run method will only print out running on the console.
		System.out.print("running");
		}
		
		
		
		public   -->   access modifier ( 4 type of acces modifier var in java)
		
		void  --->  return type (void means it will not return anything)
		
		run()  ---> is the method name and after the method we use parameters/arguments yani parantezler
		
		
		
		
		
		Instance method have direct access to instance variables. that means for example inside instance method, for ex in run, u have access 
		to all instance variable that are defined in Person class, name, age, gender, job.
		
		Hmmmmm,yani Sout("running" ) dersen, kimin kostugu da yazaiyor.
		
		
	
		2.... method that take 1 argument and return nothing:
		
		public void runMiles(int mileCount){                       // 1 int argument var yani
		Sout print(name + "is running" + mileCount + "mile");       // will print this person is running how many miles
		
		}
		
		
		
		
		3.... Method that take NO argument and return int:
		
		
		public int burnCalory(){                    // access modifier public, return type int, method name burCalory, parameter/argument Non
		Sout.print(name + "is  running 1 mile");
		
		       return 10;                              if u reun 1 mile u will burn 10 clories
		}
		
		
		
		** eger return value yu yazmayi unutursan compile etmez.
		
		
		
		
		
		4....method that take 1 argument and return  1 int value;
		
		
		
		public int burnCaloryWithMile(int mileCount){
		
		Sout.print(name + "is running" + mileCount + "mile");
		     
		     return 10* mileCount;             // it will count your mile and calculate ur claories.
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//creating arrayList with all the items from another list:
		 ---->>> tum listeyi baska listeye kopyalamak:
		 
		
		ArrayList<String> lst3 = new ArrayList<> (lst1);
		
		System.out.println(lst3);
		
		
		//How to get String representation out of arrayList objetc?
		String lst3AsString = lst1.toString();
		System.out.println((lst3AsString));
		
		// whenever u print out a reference variable that point to an object; 
		//it will automatically call toString() method implicitly
		
		System.out.println(lst1);
		System.out.println(lst1.toString());
		
		
		
		
		
 */





	}

}
