package day45;

// Calling a Constructor:
/*Where: when object is being created
 * a constructor can only be called inside another constructor of same class
 *    RULE:
 *       this(args..)   use this keyword with parenthesis () and pass arguments if needed
 *       1. it has to be in first statement of constructor body
 *       2. ONLY ONE CALL (of any constructor) IS ALLOWED inside one constructor
 *       3. Recursive constructor  call is not allowed
 * 
 *   ex:
 *   public Caller() {
		
		this(100);   // recursive constructor invocation 
		System.out.println("calling no arg");
	}
	
	public Caller (int x) {
		
		this();
		System.out.println("calling 1 arg");
	}
	
	
	METHOD VS CONSTRUCTOR
	
	METHOD -- has return type can have any name and can take certain action
	          and can be called upon request
	
	CONSTRUCTOR -- has NO return type has same name as class name 
	              will be called each time an object is being created 
	              only a constructor can call another constructor of same class
	              using this(args..)
	
 *   A constructor can call another method in same class
 *   
 *  
 */


import java.util.Arrays;

public class Spartan {

	
	// Spartanchaining class a bak
	String name;
	int studyHour;
	int horsePower;
	boolean tired;
	String [] certificates;
	
	// this no arg constructor should set default value for name, studyHour, and tired
	public Spartan() {
		
		this("No Name", 5)  ;   //constructor chaining yapiyoruz burada
		
		
		System.out.println("no arg");   // default value lar
		
	//	this.name = "No Name";
	//	this.studyHour = 5;
		this.horsePower = 320;
		//this.certificates = new String [] {"OCA", "OCP"};  // bu da default certificates array liste dump edilmis
	}
	
	// dipnot: repetition oldugu her yerde bi method dusunulur, contruction da da ayni
	// this () methodu ile u call a constructor from another constructor in the same class.    
	
	
	
	public Spartan(String name, int studyHour) {
		this.name = name;
		this.studyHour = studyHour;
		
	}

	
	// TASK to Constructor Chaining:
	
	//Create a CONSTRUCTOR THAT TAKE ONE ARG BOOLEAN TIRED
	//INSIDE THIS CONSTRUCOR
	//CALL THE CONSTRUCTOR THAT TAKE 5 ARGS
	//TO SET ALL YOUR DEFAULT VALUE
	
	public Spartan (boolean tired) {
		this("Zeliha", 5, 900, tired, null);// ve burda diger methoddan aliyoruz 5 arg li olandan
		                                    // bu kadar basit , tek tusla, control psace le 5 arg li yi bulabilirsin ve doldurursun
		                                    //tum amac repetition yapmamak, kisa yoldan kullanmak mevcut seyleri
	}
	
	public Spartan(String name, int studyHour, int horsePower, boolean tired, String[] certificates) {
		this(name, studyHour); //yukardan cagirdik
		//this.name = name;
		//this.studyHour = studyHour;
		this.horsePower = horsePower;
		this.tired = tired;
		this.certificates = certificates;
		
		
	}

	
	public String toString() {
		return "Spartan [name=" + name + ", studyHour=" + studyHour + ", horsePower=" + horsePower + ", tired=" + tired
				+ ", certificates=" + Arrays.toString(certificates) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	                       // Arrays.toString bile hazir verdi... o yuzden main methodda ascode degil guel print oldu hersey
	
	
	
	
}
