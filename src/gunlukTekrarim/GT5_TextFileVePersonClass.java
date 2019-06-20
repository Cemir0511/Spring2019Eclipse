package gunlukTekrarim;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GT5_TextFileVePersonClass {

	public static void main(String[] args) {
		
		
		
		/////////              Text file to List: 
		
		//go to ur project , open a text file and write stuff, and save with name.txt
		// arraylist methodlariyla manipulate yaparsin
		List<String> lineLst = getTextFileAsList("randonFileNames.txt");
	    //List<String> lineLst2 = getTextFileAsList("");
	    System.out.println(lineLst.size()  );
	    
	    List<String> linlst = getTextFileAsList ("hero.txt");
	    System.out.println(linlst);
	    System.out.println(linlst.size());
	    
	    // xls  doc  ppt  pdf
	    String s = "erat_quisque_erat.xls";
	    // how do we just get file extention
	    String fileExtention = s.substring(s.indexOf(".") + 1);
	    System.out.println(fileExtention);
	    
	    //  pdfdocpptxls.pdf
	    
	    int count = 0 ; 
	    for (String each : lineLst) {
	      if(each.endsWith(".xls")) {
	        count++ ; 
	      }
	        
	    }
	    System.out.println("excel file count is : " + count);
	    
	    // TASK 2 , find out the longest file Name
	    String longest = lineLst.get(0); 
	    
	    for (String each : lineLst) {
	      
	      if(each.length() > longest.length()) {
	        longest = each ; 
	      }
	      
	    }
	    System.out.println("Longest file name : "+  longest );
	    
	    // TASK 3 : FIND OUT LONGEST EXCEL FILE 
	    String longestExcel = ""; //lineLst.get(0); 
	    
	    for (String each : lineLst) {
	      
	      if(each.endsWith(".xls") && (each.length() > longestExcel.length()) ) {
	        longestExcel = each ; 
	      }
	      
	    }
	    System.out.println("Longest Excel file name : "+  longestExcel );
	    
	    
	    
	  }
	  /*
	   * DO NOT MODIFY AND JUST USE IT
	   * Method name : getTextFileAsList2
	   * @parameter  location of text file as String
	   *   if your file is at root path (right under project folder)
	   *  you may directly path your filename.txt
	   *  if not pass /your/own/folder/name/filename.txt as String to method
	   * 
	   * @return List of String that contain each line as per element

	   */
	  public static List<String> getTextFileAsList(String filePath) {

	    List<String> allLines = null;
	    try {
	      allLines = Files.readAllLines(Paths.get(filePath));
	    } catch (Exception e) {
	      System.out.println("Wrong file path probably");
	    }
	    return allLines;

	  }
		
	  
	  
	  
	  
	  
	 ///   Object Oriented Programming 
	 //     Principles
	  //     1.Encapsulation
	  
	  
	  
	  /*
	  
	  /////////    Encapsulation
		
	  Capsule, or like a space capsule, surrounds the the content, keeps and protects the content.
	  We wrap up the attribute in OOP.. 
	  We restrict access 
	  
	  ** Restricting access to the inner working of that class or any objects based on that class
	  
	  ** It is also refreed as inofmration hiding or data hiding.
	  
	  ** An object should not reveal anything about itself except what is absolutely 
	  necessary for other parts of the application to work.
	  
	  
	  
	  ** Access modifiers determine whether other classes can use a particular field or invoke a particular method.
	  
	  4 access modifiers in java:
	  
	  Access
	  modifiers       same class  | same package  |  sub-class, outside package   |   the rest of the world 
	  
	  public              Y            Y                      Y                          Y
	  
	  protected           Y            y                      y                           n
	 
	  default
	 (no modifier)         Y           Y                      N                          N             
	 (Package private)
	  
	  
	  private
	 ( only in same class) Y           N                      N                                N
	  
	  
	  
	  Protecting Data:
	  
	  Good Encapsulation practice is:
	  
	 * Making instance fields private
	 * Provide public methods to access data  or modify it.
	  
	  Those methods are called, getters and setters
	  Or                        accessor, and mutator
	  
	  
	  By convention: 
	  named as getXxx
	            setXxx
	                                 getter(accessor), setter(mutator)
	  
	  
	  
	  Public class Person{
	  private String name;
	  private int age;
	  
	  public Person(String name, int age){
	  this.name = name ;
	  this.age=age;
	  }
	  
	  public String getName(){
	  return name ;
	  }
	  
	  public void setName(String name){
	  this.name=name;
	  }
	  
	  public int getAge(){
	  return age;
	  }
	  public void setAge(int age){
	  this.age = age;
	  }
	  
	 ** Attributes of Person class objects can only be accessed or modified by getters and setters.
	  
	  
	  
	  In another cals in main method:
	  
	  public static void main(String [] args){
	  
	  Person p1 = new Person("John", 25);                first create an object, and give the initial value
	  p1.setAge(27);                                     then change the value by ssetValue();
	  p1.setName("Adam");                 
	  System.out.println(p1.getName() + p1.getAge()):    then get the value by p1.getValue()//p1.getName()+p1.getAge()
	  
	  
	  }
	  
	  
	  
	  Sometimes,you want to put even more restriction:
	  Once we set the data we don't want it to be changed.
	  
	  So we call it immutable class.  What is immutable class?
	  
	  
	  Whatever you created form that class is an read-only Person Object. HOW we do this?
	  
	 by providing only getter in a class to make the class immutable. So we don't have a setter and our fields are private
	  
	 
	 
	////// Immutable class example:  (Another level of protecting data)
	 
	  public class Person{
	  
	  private String name;
	  private int age;
	  
	  public Person(String name, int age){
	  this.name= name;
	  this.age=age;
	 
	  }
	  public String getName(){
	  return name;
	  }
	  
	  public int getAge(){
	  return age;
	  }
	  
	  //in another class in main method:
	   
	     public static void main(String [] args){
	     
	     Person p1 = new Person ("John", 25);
	     Sout(p1.getName() + p1.getAge() );     yani artik set edilemez, degistirilemez, sadece get edilir
	    
	                                           
	 ///////  * And sometimes we need a write-only object
	  * So we can provide only setter in a class to make the class attribute write-only.
	    Once we set, we can not read the data. we can only set the data, which is used in some situations.
	  
	  
	  Write-only example:
	  
	   public static void main(String [] args){
	  
	  Person p1 = new Person ("John", 25);
	  
	  p1.setAge(27);                 we can set and change the value, but we can not read the value!
	  p1.setNAme("Adam");
	  
	  
	  
	  
	  */
	  
	  
	  
	  
	  /*
	   
	  //////      Constructors
	   
	   
	   
	   
	   A special method that is invoked every time an object  is created.
	   
	   .It has same name as class
	   .It doesn't have a return type.
	   .It can have any access modifier.
	   
	   EX;
	   
	   public class Student{
	   
	     public Student{          It has same name as class, and can have any access modifiers  
	     
	     }
	     }
	   
	   
	   
	   ///      Creating and calling Constructors
	    * 
	   
	   When Java sees the new keyword, it allocates memory for the new object. 
	   Java also looks for a constructor and calls it.
	   
	   public class Student{
	   
	   public Student(){
	   Sout("Constructor");
	   }
	   }
	   
	   diger class:
	   public class ClassRoom {
	    public static void main(String[] args){
	    
	    Student s1 = new Student();
	   }
	   }
	   
	   Constructor calls examples:
	   
	   Student s1 = new Student();
	   Scanner scan = new Scanner (System.in);
	   Integer i1 = new Integer ("123");
	   String str1 = new String ();
	   String str2 = new String ("My String");
	   Person p1 = new Person ("John", 28);
	   
	   
	   ////     Constructors Overloading
	    * 
	    * A class can have multiple constructor with different method signature
	      (parameters lis)
	    
	    * It is called Constructor overloading.
	   
	   
	   Ex;
	   
	   public class STudent{
	   public Student(){        one constructor that have no argument
	   
	   }
	   
	   public Student(String sName){   one constuctor that have one argument
	   
	   }                                 ...constructor overloading yani bu above
	   {
	   
	   
	   
	   
	   /////     Default Constructor
	    *
	    * 
	    A constructor provided by compiler is called default constructor.
	   
	   public class Studnet{              ---->>  if there is no constructor, compiler gives one default constructor
	   }
	     (invisible; public Student(){    ---> default constructor
	     }
	                                      ---->> if there is already a constructor written, then there is no default constructor
	   
	   * A default constructor is invisible and has empty body.
	   
	     
	   
	   ///   Constructor with no arguments
	    
	     public class Student{
	     
	      String name ;                   
	      String school;
	      int age;
	      
	      public Student(){ 
	                                            Student s1 = new Student();..whenever a Student object is created 
	      Sout("no arg Constructor")                                            this constructor will be called.
	      }
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      /////          Constructor with arguments
	      
	      
	      public class Student{
	     
	      String name ;                   
	      String school;
	      int age;
	      
	      
	      public Student(String sName){
	      Sout("2 args constructor");
	      
	    }
	   */
	  
	    
	   /* 
	    Constructor class examples:
	    
	    
	    
	    
	    
	    
	    
	    
	        Burda : Student s1 = new Student ("John");  //bu ikisi yukardan constructor class cagirir
	                Student s2 = new Studnet("Adam");
	            
	                Student s1 = new Student();    XXX bunun icin argument constructor yok, cunku tanimlanmis yukarda, 
	                                                   o zaman default olmaz, yok
                                                        so it will not compile
	  
	   
	   public Student(){ 
	  
	   Sout("no args Constructor");            Student s1 = new Student();
	   }
	   
	   
	   public Student (String name){           Student s1 = new Student ("John");   
	   Sout("1 arg constructor");          ve  Student s2 = new Student ("Adam");
	   
	   }
	   
	   
	   
	   
	  ////////////////        Initial State of Object
	   
	  public class Studnet {
	   String name;
	   String school;
	   int age;
	   
	   
	   public Studnet();     Student s1 = new Student();  // empty student object.
	   
	   s1.name= "Bob";
	   s1.school = "Cybertek";
	   s1.age = 18;
	   
	   
	  ////////          Setting initial state of an object using Constructor:
	   
	   
	   ** Most common usage of constructors is giving initial state to the object
	   
	  ** All instance variable values can be set along with object creation using new keyword by calling corresponding constructor
	   
	   
	   
	   
	   
	   
	   public class Student {
	   String name;
	   String school;
	   int age;
	  
	   
	   public Student(String sName, int age);             **Constructor that take 2 arguments and it will set the value of 
	                                                         name and age to the value that I pass to create an objct
	   name = sName;
	   age = sAge;
	   Sout(2 args constructor);
	   
	   
	   
	   Student with name and age defined :
	   Student s1 = new Student ("Bob",28);    this object has already initial value/state (yukardan from 2 args constructordan dolayi
	                             name   age         o yuzden I don't have to 
	                        object stateleri        go to next line and 
	                                                say s1.age   s1.name
	   
	   We have an object that have initial state (parantez icindekiler)
	   ( **  Yani demek ki initial state constructur daki argumnetlarla direk initilized oluyor)
	   
	   
	   
	   ///////////////      Using <this> keyword to refer instance variable
	    
	    
	    public class Student{        In some cases like this one, we have same name for instance variable and for constructor parameter
	                                 In order to differentiate the method parameter and instance variable, we use this. keyword
	    String name ;
	    String school;               This keyword is used to refer to current instance of an object.
	    int age;
	                                 Ex;
	                                 this.name       always points to instance variable
	                                 
	                                 this.    can be used inside the constructor, and in any instance method
	    
	    
	    
	    
	    
	    ////////////            Chaining Constructors       this(args)
	     
	    
	    Only a constructor can call other constructor in same class  by using    this()   (in the first line of second construtor .
	    
	    It can be achieved using this keyword with parenthesis to pass argumets :    this(arguments..)
	     
	    
	    
	   public class Student {
	   String name;
	   String school;
	   int age;
	    
	    
	    public Student () {
	    Sout.println( "nor arg Consrtuctor");	   
	    
	    }
	    
	    public Student (String name, int age) {
	    this();                                      //here , we make a call to the first constructor with no arg.
	    Sout.println("2 arg constructor");
	    
	    }
	    
	    }
	    
	    
	    
	    
******	   Whenever an object is created second constructor,  in the first line of second constructor, (this()), will go to first constuctor with no arg, 
	            and then print out the statement
	   
	   
	   
	   
	   // ve burda da 3. constructor, ikinciyi call ediyor this()methodu ile:
	    
	    
	   public class Student (String name, int age, String school) {
	   this (name, age);
	   this.school=school;
	   
	   
	   ** Which constructor to be called depends on the arguments passed in paranthesis
	   
	   
	   
	 
//////////////////     ve Calling constructor in another Constructor:
 
  
  
       public class Student (){
	   String name;
	   String school;
	   int age;
	   
	   
	   
	   public Student(){
	   this("NoName", 18);                             Whenever I create an object , it will go to the first line, second constructor, and 
	                                                   it will create an object with initial state, which has a name as "NoName", and  age as 18.
	   Sout("no arg constructor"){
	   }
	   
	   
	   public Student (String name, int age){
	   nme = sName;
	   age = sAge;
	   Sout("2 arg Constructor");
	   }
 	   
	   
	   
	   
	   
	   ///  Ozetle:
	    
	   You can have a (hic bis constructor yoksa) :
	   
	     
	     Default constructor
	     
	     
	     Constuctor with no arguments
	     
	     
	     Constructor with arguments
	      
	    
	    (And you can chain them by using:  
	    
	    this(arguments);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   */
		
	  
	  
	  
	  
	  
	  
	  /*
	  
	  Class : 
			it's a blueprint or template for an object 

		 things we can do : 
		 	We can use it as a Type 
		 	we can create object out of it 
		 	or we can create instance of this class 


		 	create a reference variable 
		 	method paramters 
		 	method return type 
		 	type for the Collection objects : ArrayList 
		 	or can be type of Array 

		 	local varible VS instance variable 
		 		 local variable is variable inside a method 

		 What we can have inside a class 


		 	instance variable/field
		 		-- to define properties|attribute|state of object
		 		How can we access these fields 
		 			in same class 
		 				any instance method can directly access 
		 			outside of class 
		 				create an instance/object to access obj.fieldName

		 	instance method 
		 		-- add behavior of objects 
		 		-- to manipulate the attribute| state of obejct 
		 		How can we call this method 
		 			in same class 
		 				any instance method can directly access 
		 			outside of class 
		 				create an instance/object to access obj.methodName(arguments)

		 	static method
		 		-- add behavior to the class 
		 		How to call static method : 

		 		in the same class 
		 			any static method can access another static method directly 
		 			by calling methodName(arguments);
		 			Or Optionally 
		 			ClassName.methodName(arguments ) ; 
		 		outside the class 
		 			ClassName.methodName(arguments ) ; 

		 	 what about static and non-static accessing each other ?  stay tuned 

		 	----------- things we did not learn yet --------
		 	static variable field
		 	Constructor ---- a special method being called when 				object is being created 
		 	instance initilizer block and static initilizer block 

	  
	  
	  
	  */
	  
	  
	  
	  /*
	   * let's do some quick review:

Objcet - it's an instance of class.
Class - is a blueprint/template for object. 
	fields/variables
	- instance variables
	- define properties of object
	- static variable (variable that belongs to the class)
	we will talk tomorrow about static

public, protected, default (no name!), private --> they are access modifiers!
	
	class Student{
		// instance variable (must be non-static!)
		//since this variable is private
		//we cannot access it outside of this class
		private String name;

		//this is instance method
		public void setName(String name){
			this.name = name // this is how we define property
		}
		//when we don't have any access modifier, that means this method/variable has default access modifer.
		
		//this is instance method
		String getName(){
			return name;
		}

	}

	class StudentTester{
		public static void main(String[] args){
			Student student1 = new Student();
			student1.setName("Ali");

		}
	}
we call setter method "mutator". That means we use this method in order to modify instane variable.

 methods
 	instance methods (they are non-static)
 	For example: 
 		//this is instance method
		public String getName(){
			return name;
		}
		Same methods in terms of functionality. 
		Why? because they return name.
		Only thing is that they have different access level.
		String getName(){
			return name;
		}

//Object -> it's a class. Root class of all classes.
	we use instance method in order to manipulate with instance variables.
private - visible only inside a class.
default(there is no keyword, no access modifier) - visible only in the package
protected - same as default, unless inherited.
public - visible everywhere! 

one more thing about instance methods: we can use the obly if we will create an object.

Class object = new Class();
object.method();

str.trim(); -> instance method that is coming from String.

Class.method() --> illegal for instance methods, but works for static methods.

static methods/variables - we can access with class name (this action is not possible with instance memebers(non-static variables or methods.))

Class.staticMethod();
for example:
Arrays.toString(arr);

//can we do String.trim() ??
		//Answer: no.
		//trim is an instance method, not static.
		String name = "Yasin";

Constructor:
	this is special kind of method
	or special block of code
	that runs automatically whenever
	new object gets created.

	How to create a constructor?

	class Person{

		//default constructor
		//it has the same name as current class
		//it cannot have a return type.
		//only access modifiers
		//we can have multiple version of constructor.
		//it calls overloading
		rules??? diferrent parameters.
		//rules of constructor overloading are the same as for method overloading

		//valid constructor, same as class name
		Person(){

		}
		//no void, no return type, no nothing
		//valid constructor
		Person(String name){

		}

		//not any more constructor, since it has a name
		//it's a method with return type.
		public Person createAPerson(String name){

		}	

	}
constructor given by default with no arguments.
you can make constructor private.
it will prevent object creation.
It's user for singleton design.

contructor calls automaticlly, when we need to create an object.

//BREAK 12 minutes! 8:10 EST.  

















	   */
	  
	     //////    
	   
	   
	   
	  
	 /*
	  Constructor :
	  
	--  this is a special block of code that run automatically each time an object is being created
	--   it has same name as class
	-- it doesn't have return type
	-- It can have any type of access modifier
	
	We have multiple version of constructor:
	-- overloading ==same rule apply as methods
	--same name, different parameters
	
	  
	  
	  
	  Ac ac1 = new Ac();
	  
	     public AC{
	       
	         boolean on ; 
	         
	  same class name but must not have return type
	  THIS IS NOT A CONSTRUCTOR
	  IT IS JUST A METHOD HAPPEN TO HAVE SAME NAME AS  CLASS NAME and return type is VOID     
	         public void AC () {     // we don't have constructor, cause it can't have return type, but therie is void here return typr
	         Sout("boom!);
	     
	   in main method :
	   AC ac1 = new AC();
	   
	  */
	  
	  
		
	

}
