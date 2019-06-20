package day43;

public class CourseAction {

	public static void main(String[] args) {
		
		
		Course java = new Course ();  // her yeni bir object olusturuldugunda new ile, 
		 System.out.println(java.name);   // give null                               //it goes to constructor(either explicit, or implicit constructor)
		Course selenium = new Course();
		
		Course softskill = new Course();

		Course sql = new Course ("sql"); // how do we know which method to call??
		                                 // we look at the arguments
		
		System.out.println(sql.name); // sql cikti, it's calling 1 argumentli constructor  this.name = name 
		
		Course javascript = new Course ("interview", 3);  // 2 parameters old icin 2 parameters li olan constructor u call eder
		
		System.out.println(javascript.name);
		System.out.println(javascript.courseID);
		// So how many ways of creating object exists in my programming right now?
		// we have 3 constructor , 3 ways to create object we have
		
		
//		String s = new String();  // it reminds method overloading
		                          // u can create overloaded constructor
		
//		String s1 = new String ("abc");  
		
		
//		Integer i = new Integer (123);
		Integer i1= new Integer ("123");
//		
				
		
		
		//So why do we need a constructor??
		// its giving initial state of an object.
		// person p = new Person dersen daha bos, yeni object, initial value, pure value...
		//So constructor sets the value of your object
		
		// so this is not an empty object, initialized --> String s1 = new String();
		
		
		
		//diger tarafta tum constructor lari comment out yapsan, burda tek en usttekini biraksan, nolur?
		// still u get one by compiler, cause its dfeault constructor, but it has nothing, so when u run, nothing happens
		
		
	}

}
